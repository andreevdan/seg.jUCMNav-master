# Connection Router

## Overview

  - Our path nodes are connected by connections.
  - GEF has a connection construct that is used to link nodes together.
  - GEF uses a connection router to layout a connection between two
    points. The built-in connection routers are things like direct
    lines, manhattan routers (vertical or horizontal lines), shortest
    path. They implement things such as bend points so that you can set
    intermediate points in the connections.
  - nodes have connection anchors to which the connections are connected
  - GEF automatically asks the connection router to route a connection
    when its source/target is moved.
  - We don't use all of this :)
      - We need a bspline that traverses multiple path elements.
      - We need to refresh an entire path when one of the elements
        moves, not only the connections directly associated with the
        moved elements.
      - We usually don't route until connection anchors, which are
        usually on the bounds of figures, we route through the path
        nodes, right in their centers.
      - Our connection router is located in seg.jUCMNav.figures.router

## UCMConnectionRouter 
### extends AbstractRouter

  - The framework invokes route(Connection) everytime it determines a
    connection must be routed.
  - For our purposes, this is both much too often and not widescale
    enough.
      - I don't know the specifications of when the router is called,
        but through experience, we see route() is called multiple times
        for the same connection, in some circumstances.
      - If you move a node, only the adjacent connections are routed, we
        need all of the connections on a spline to be routed.

### implements Adapter

  - We decided to drop the framework's imposed structure and have the
    connection router behave like an edit part.
  - The connection router listens to path nodes, node connections and
    the path graph
  - When a pathnode is moved or connections are added/removed or new
    nodes are added/removed, we are informed.

<!-- end list -->

``` 
    /**
     * If the PathGraph, PathNodes or NodeConnections that the router listens to is changed, the impact of the change is calculated and the connections HashMap
     * is updated.
     */
    public void notifyChanged(Notification notification) {
        int type = notification.getEventType();
        EObject notifier = (EObject) notification.getNotifier();

        if (notification.getFeature() instanceof EStructuralFeature) {
            EStructuralFeature feature = (EStructuralFeature) notification.getFeature();
            if (type == Notification.SET && notifier instanceof PathNode) {
                PathNode pn = (PathNode) notifier;
                if (feature.getName().equals("x") || feature.getName().equals("y")) { //$NON-NLS-1$ //$NON-NLS-2$
                    if (pn.getPathGraph() != null) {
                        //System.out.println("moved pathnode");
                        refreshConnections(pn);
                    }
                }
            } else if (type == Notification.SET && notifier instanceof NodeConnection) {
                NodeConnection nc = (NodeConnection) notifier;
                if (feature.getName().equals("source") || feature.getName().equals("target")) { //$NON-NLS-1$ //$NON-NLS-2$
                    if (nc.getPathGraph() != null && nc.getSource() != null && nc.getTarget() != null) {
                        //                        System.out.println("changed connections");
                        refreshConnections(nc);
                    }
                }
            } else if (notifier instanceof PathGraph) {
                PathGraph pg = (PathGraph) notifier;

                switch (type) {
                case Notification.ADD:
                    registerListeners(getPathgraph());
                case Notification.REMOVE:
                    refreshConnections();
                    break;
                }

            }
        }

    }
```

## Uses the query infrastructure

  - You might notice from the code above that we can either refresh a
    particular connection or all of them.
  - When refreshing a particular connection, we refresh all the
    connections on the same path.
  - We maintain a HashMap of connections and state whether or not they
    need to be refreshed.
  - refreshConnections(nc) will mark the connections as needed a refresh
  - How do we find these connections? We use the
    \[\[DevDocQueryInfrastructure\]\[query infrastructure\]'s
    ConnectionSplineFinder.
  - See [Dev Doc Query Infrastructure](DevDocQueryInfrastructure) for more info on how to use the
    infrastructure
  - refreshConnections(nc) only changes the HashMap, nothing is drawn.

## Visual refreshing

  - We decided to keep using the route() function.
  - We build an instance of BSpline using the points returned by
    ConnectionSplineFinder.
  - We draw this BSpline.
  - Performance could be improved if we didn't use the query
    infrastructure twice.

<!-- end list -->

``` 
    public void route(Connection connection) {
        SplineConnection spline = (SplineConnection) connection;
        if (connections.get(spline.getLink()).equals(Boolean.FALSE)) {
            drawSpline(spline);
        }
    }

    private void drawSpline(SplineConnection source) {
        // refresh spline
        QFindSpline qReachableConnections = new ConnectionSplineFinder().new QFindSpline(source.getLink());
        ConnectionSplineFinder.RSpline rReachableConnections = (ConnectionSplineFinder.RSpline) GraphExplorer.getInstance().run(qReachableConnections);
        Vector vReachable = rReachableConnections.getConnections();
        if (vReachable.size() > 0) {
            PointList pts = new PointList();
            NodeConnection nc;
            // this array is used to memorize the index of each node connection's left point in the pts PointList.
            // the reason we need to pass this is the BSpline class cannot differentiate between multiple occurrences of the same point, if loops occur.
            int[] iPositions = new int[vReachable.size()];
            int i = 0;

            // build point sequence
            for (Iterator iter = vReachable.iterator(); iter.hasNext();) {
                nc = (NodeConnection) iter.next();
                Point left = getLeftPoint(nc);
                Point right = getRightPoint(nc);
                // prevent double adding
                if (pts.size() == 0 || !pts.getLastPoint().equals(left))
                    pts.addPoint(left);
                pts.addPoint(right);
                // memorize left point position
                iPositions[i++] = pts.size() - 2;
            }

            // build a spline from the sequence
            BSpline bspline = new BSpline(pts);
            bspline.findCPoints();

            for (i = 0; i < vReachable.size(); i++) {
                nc = (NodeConnection) vReachable.get(i);
                drawConnection(nc, bspline, iPositions[i]);
            }
        }
    }
```

## BSpline

  - Pretty much found a BSpline class on the net and implemented our
    code on top of it.
  - Default precision has it draw 26 points per connection; increasing
    it doesn't change anything to the aspect of node connections in 400%
    zoom.

## Rotating elements

  - In drawConnection(), we notify the edit parts associated with this
    connection that the connection has been redrawn. Actually, we just
    ask them to refresh themselves.
  - When refreshing themselves, they look at the figures associated with
    their connections to infer the spline's orientation close to the
    path node.
  - This is horribly ugly code, but as we don't store the figure
    orientations anywhere (although we do have them in the model), we
    can't do better.
  - A proposed enhancement would make the connection router modify the
    model elements (hence it wouldn't need to know about any editparts)
    and set their orientation.
  - Since the editparts listen to model changes, they would be informed
    and could refresh themselves appropriately.
  - This would be a much cleaner solution, but we haven't implemented
    it.

## Warnings

  - Our first implementation of the connection router caused us many
    headaches.
  - We didn't have a uniform way to determine splines, so refreshing was
    bad performance wise.
  - When we started trying to rotate elements, we quickly discovered
    that sometimes editparts don't (yet) exist for model elements when
    we need them.
  - We also discovered that the splines might not have been routed by
    the time the path node edit part was created and hence, it could not
    be drawn properly; we had to force a refresh of the connection
    router to draw it correctly.
  - Sometimes, we forced refreshes too quickly, when the model was in an
    inconsistent state; and we ended up navigating through connections
    that didn't have any terminal path nodes.
  - The above proposed enhancement might help resolve this problem as
    well.

\-- Main.JasonKealey - 11 Jul 2005
