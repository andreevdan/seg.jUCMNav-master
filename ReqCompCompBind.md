Binding should be automatic when a component is moved into another, but explicit menus would probably be useful too (see UCMNav).

-- Main.DanielAmyot - 30 Jan 2005

An example in GEF of how this could be implemented:

   1. The user move a node in a container using the editor.
   1. The editor inform the editpart with a request that it wants to change the model.
   1. The right editpolicy for this particular request is called to know what to do.
   1. The editpolicy generate a command able to change the model.
   1. The command would then look for an intersection of the node new coordinate and an existing container.
   1. If the node's coordinates are IN a container, then the command would add this node as a "child" of this container.
   1. The link would be created in the model and would be used afterwards to handle moves of the parent container.
      1. A node can only be binded to one parent and a parent can have multiple children.
      1. A node can't have a circular binding.  This could create big recursive problems.  A circular binding would be for example a node that is binded to a parent and the parent is binded to the child.  This is not allowed.
   1. The model then notify the edit part that it was changed.
   1. The editpart refresh the visual representation of the model in the editor with the changes.


   1. Next time the user try to move a container, the !SetConstraint commands will KNOW that this container has child and will move those childs accordingly.

-- Main.EtienneTremblay - 03 Feb 2005

Completed.
-- Main.JasonKealey - 06 May 2005     

I want a confirmation from Daniel about the fact that an element's parent cannot be one of its children.  We're thinking of a tree like hierarchy. 

-- Main.JasonKealey - 03 Feb 2005

Conformed. No circular binding relationships.

-- Main.DanielAmyot - 13 Feb 2005



This requirement is said to be complete when:
   * can drag & drop a component inside another to bind it.
   * can select a component reference from a dropdown inside the properties view
      * must not allow circular binding relationships inside this dropdown.


See TestBindUnbind


--
Difference with UCMNav:
   * A component should only be bound to another if 100% of its area is included inside the other one. 
   * In UCMNav, this threshold used to be 50%.  
   * (To be reviewed with user acceptance tests; UCM validity)

-- Main.JasonKealey - 29 Mar 2005   

[[img/ReqCompCompBind.PNG]]