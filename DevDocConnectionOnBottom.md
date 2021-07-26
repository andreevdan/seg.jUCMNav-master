# Elements underneath PathNodes

## The problem

  - This page will explain how and why we had to draw components behind
    path nodes. A component is a big rectangle wich can be filled with a
    color. Without a filling color, we would not even have a problem
    here. But since components can be filled, this means that if the
    components are drawn after the path nodes and that the figure fill
    its interior with a certain color, the path nodes under the
    component will get covered with the color. So we had to find a way
    to draw the component first and then draw the path nodes.

<!-- end list -->

  - The other problem was that our connections where drawn on top of our
    path nodes. So this way when the user tried to select a path node,
    he would try to click on the path node, but then the connection
    could be on top of the path node, so the selection could not work if
    the user clicked on the connection... The user was trying to click
    on the path node, but the connection was selected instead. So we had
    to find a way to put the connections under the path nodes.

## Layers in GEF

[[img/layers.jpg]]

The preceding figure show the hiearchy of the layers in GEF. This is
really important to understand. Here is a quote from the RedBook:

*"Layers are used to separate and/or group figures of EditParts to
better control their overlapping. Actually, all figures are placed into
the primary layer. Figures representing connections are placed on the
connection layer and so they are always painted above the other figures.
Special figures (like drag or drop feedback or handles) are painted into
special layers above the scalable layers. **This is important because if
you ever want to paint something in the feedback or handle layers, you
must be aware that you need to scale this manually before painting.**"*

  - So now that you understand what is a layer and where it is used, we
    can now explain how to insert a new layer and change the order they
    are painted. First of all we have to know where in the framework we
    can insert a new layer and where we can change their order. This is
    usually done in the RootEditPart of your application.

## The solution

  - As mentionned in the last section, we can insert a new layer into
    our layer hiearchy using the RootEditPart for our application. In
    our case it is ConnectionOnBottomRootEditPart. Here is the method we
    need to change if we want to replace the order of the layers and add
    new ones. In our case we want to change the order of the printable
    layer, so we overwrite the following method:

\<div class=Code\> protected LayeredPane createPrintableLayers() {  
FreeformLayeredPane layeredPane = new FreeformLayeredPane();  
  

FreeformLayer comp = new FreeformLayer();  
comp.setLayoutManager(new FreeformLayout());  
  

layeredPane.add(comp, COMPONENT\_LAYER);  
layeredPane.add(new ConnectionLayer(), CONNECTION\_LAYER);  
layeredPane.add(new FreeformLayer(), PRIMARY\_LAYER);  
return layeredPane;  
}  
\</div\>

So as you can see, we create a new FreeformLayer with the id
COMPONENT\_LAYER and we add it first in the stack of layers. So it'll be
the bottom most layer. Then we add the connection layer and then the
primary layer where all the figures (including the path nodes) will get
drawned.

So now our layer hierarchy look more something like that:

  - PrintableLayer
      - Primary Layer
      - Connection Layer
      - Component Layer

Components at the bottom, then connection then all the other figures.
But it's not as simple as that...

### Problems with this solution

Now that we know GEF better with all the experience we gained with the
project, we know that this was probably not a good solution. The fact
that we wanted to draw our components figures to the component layer now
gave birth to a horde of problems. Normally, GEF draws every
non-connection figure to the primary layer. Now that we inserted a new
layer, we had to separate the components from the path nodes in two
different layers. Although this statement appears to be easy, it's not.

For doing this we had to rewrite a lot of functions from the EditPart
class. All the following methods had to be rewritten from the class
MapAndPathGraphEditPart to take into account that components were now in
a separate layer:

  - protected void addChild(EditPart child, int index)
  - protected void addChildVisual(EditPart childEditPart, int index)
  - **public void refreshChildren()**
  - protected void registerVisuals()
  - protected void removeChildVisual(EditPart childEditPart)
  - protected void reorderChild(EditPart child, int index)
  - public void setLayoutConstraint(EditPart child, IFigure childFigure,
    Object constraint)

In fact the most important method in this list is refreshChildren. The
problems arised from this method and all the other methods had to be
changed just to accomodate the refreshChildren method.

The main problem with the refreshChildren method was that now since we
had two separate layers for the components and our path nodes, the
figures were painted in two differnet layers instead of the same one as
before. This complicate the matters a lot since now you have to update
two place at a time. A single EditPart was not designed to update two
layers at a time. What happens when an EditPart is no longer used and
needs to get deleted?

The old refreshChildren keep a count of how many model elements it has
at a given time. But now for our purpose, we had to have two variable,
one for the count of components and one for the count of path nodes.
Thoses counts are used to insert of update the right component or path
node at the right place in arrays. Depending on the count, sometimes we
had to trash some elements, sometimes not etc. For each element we have
to trash, do we have to delete it from the component layer or the
primary layer? If you want to have a closer look to that kind of
problem, you can have a look at the code, it's pretty well documented
with lots of comments.

### Alternative Solution

We could we have done instead now that we know GEF better? At the
beginning of the project, we made a bad decision that made our life
harder for the rest of the project for the kind of things we talk in
this page. We put the Map and the PathGraph in the same EditPart. This
was an error because they are two distinct model elements and they
contains different things.

What should have we done? Make an EditPart for the Map and another for
the PathGraph. Both Map and PathGraph EditParts figure would have been a
FreeformLayer. Then since the Map is higher in the hiearchy than
PathGraph, the Map layer would have been under the path nodes and since
Maps contains components, the components would have been drawned under
path nodes. But then a problem remain, how do we draw the connections
under path nodes but not under components?

The answer I think is that we could have done a new layer in our
RootEditpart like mentionned in the solution section and then say to the
Map layer figure to draw in the component layer now. Now since Map and
PathGraph are now separated, we don't have anymore problems of having to
update two separate layers for the same EditPart. We just have to update
the component layer.

I think this could be done just by separating the
MapAndPathGraphEditPart into two class, MapEditPart and
PathGraphEditPart. This would require a LOT of testing though.

jkealey: I'm 100% for trying to implement this solution as it would
reduce our reimplementation of framework code tremendously and because
many bugs were caused by our implementation. What I would worry about is
which one of these editparts would receive create requests (by palette).
Having two edit parts that take up all the visible space and overlap
each other might be problematic. However, it might not be as we can
still select components even though they are behind the
MapAndPathGraphEditPart. Therefore, the framework might query the
underlying layer with the CreateRequest if the top layer says it can't
handle it.

\-- Main.EtienneTremblay - 13 Jul 2005
