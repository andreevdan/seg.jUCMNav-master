# EMF Notifications

## Overview

   -  All EMF objects implement the EObject interface, which extends
Notifier. 
   -  Thus, all EMF objects have a list of listeners which are
informed when a property or relationship changes. 
   -  These listeners
must implement the Adapter interface.

## EMF + GEF

  - As mentioned previously in [Dev Doc Edit Part Creation](DevDocEditPartCreation), edit parts are
    associated to model elements.
  - The seg.jUCMNav.editparts.ModelElementEditPart is the base class for
    most graphical edit parts. The same concepts apply to the tree edit
    parts.
  - This class implements the Adapter interface and hooks up with EMF in
    activate() and deactivate()

<!-- end list -->

``` 
    public void activate() {
        if (!isActive())
            ((EObject) getModel()).eAdapters().add(this);
        super.activate();
    }


    public void deactivate() {
        if (isActive())
            ((EObject) getModel()).eAdapters().remove(this);
        super.deactivate();
    }
```

  - The EditParts in JUCMNav are classes that extend
    org.eclipse.gef.editparts.AbstractGraphicalEditPart and implement
    org.eclipse.emf.common.notify.Adapter. This coupling is introduced
    to use the power of both frameworks. This is one place where our
    plugin differs from the GEF examples. In the examples, the
    developpers implemented their own notification mechanism. There is
    no other need for EMF (of course the model generation is useful but
    this happens outside JUCMNav) so the coupling is reduced to this.
    Through EMF, we can gain access to a great number of objects, but in
    order to limit the coupling, this practice should be avoided. Use
    only what the interfaces to the model provide you. If you need more
    than that, it is a probably a sign that the model needs to be
    modified.
      - For example, if you are tempted to use the function eContainer()
        to get the parent of an object because the children doesn't know
        its parent, maybe you should add a new relation in the model
        instead of using the functions EMF provide. This reduce
        coupling.

## EMF Notifications

  - The actual notifications sent to notifyChanged(Notification
    notification) themselves are pretty cool.
  - From the Notification object, you can extract the old/new values,
    the notifier, the event type (set, add/remove items in a list, etc)
    and the feature ID used byEMF reflection.
  - Therefore, you can be very selective on when you react to changes.
    This granularity is a powerful asset for performance improvements in
    jUCMNav. Right now, we refresh too often and this could be improved.

## jUCMNav Specifics

   - Typically, an editpart is responsible for refreshing itself when its
underlying model element changes. 
   - For example, a ComponentRef for
which the ComponentKind changes should invoke its refreshVisuals()
method. 
   - Either because of inexperience or because the framework was
not built with this kind of scenario in mind, some of our editparts
forward the notification to their parent. 
      - The scenario which first
introduced this problem is resizing components. Imagine two components,
the first, smaller, inside the other. Move and resize the larger
component so that it now becomes contained in the initially smaller one.
      - Because the ComponentRefEditParts are children of the
MapGraphEditPart, the children were ordered (and thus rendered) from
largest to smallest. This ensures that smaller components stay visible.
      - Therefore, when ComponentRefs are resized, their notifyChanged()
methods delegate the refreshing to the MapAndPathGraphEditPart which
refreshes all the components. 
      - Later, other features were introduced.
Labels were made children of the MapGraphEditPart instead of the
PathNodeEditPart or ComponentRefEditPart for a reason that is unknown to
me. This might have something to do with children figures must be inside
the bounds of their parents or else they are cropped off and hidden. 
         - Labels have to be children of MapGraphEditart since they have to be
drawn on the diagram and they can be moved anywhere. Their position is
relative to the PathNode, but they are not children of PathNode. In GEF,
if they would have been children of PathNode, their EditPart would have
been drawn INSIDE the PathNode figure and could not go out of thoses
bounds. So we could not move the EditPart outside of the PathNode
without it beeing cropped. 
      - We now have many editparts redirecting the
notification and I am not sure all of them need to be there, performance
enhancements are possible. 
  - Our connection router also listens to the
model elements to detect when the splines must be redrawn.

\-- Main.JasonKealey - 05 Jul 2005
