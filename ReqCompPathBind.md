Binding should be automatic when a path element is moved into a component, but explicit menus would probably be useful too (see UCMNav).
-- Main.DanielAmyot - 30 Jan 2005

Just some behaviour checking:
To draw a path in the current version, you click n times and you get n-1 blank nodes. The first click puts the starting point and end point at the same place. If you change tools, the path will be deleted. The second click moves the end point to somewhere else and creates a blank node in the middle of the line.  All subsequent clicks move the end point to where you clicked and inserts a blank point in the old end point location.

All clicks inside a component bind those points to the component. **IN ADDITION, if the first blank node to be created (after your second click, in the middle of the segment) happens to land inside a component, it is bound to this component EVEN IF YOU DID NOT CLICK INSIDE THE COMPONENT**.
-- Main.JasonKealey - 03 Feb 2005

I was referring more to an existing UCMNav functionality. Right-click on a component, select "Unbind Enclosed Path Elements". You can then move the component while the path elements stay where they are (because they are not bound to the component anymore). You can then select "Bind Enclosed Path Elements" if desired (to re-bind the enclosed elements). The second functionaility is what I would like to have.

What you described is the automatic binding of new path elements in a component, which is also desired. The new empty point, if created (automatically) in a component, should probably be bound to it (I think this is easier to handle than doing complex checks of what was clicked where). 
-- Main.DanielAmyot - 13 Feb 2005


Completion: See [Test Bind Unbind](TestBindUnbind)

Completed.
-- Main.JasonKealey - 06 May 2005     


[[img/ReqCompPathBind.PNG]]