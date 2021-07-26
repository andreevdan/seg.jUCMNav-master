Many of the classes in the metamodel will have attributes irrelevant for the mandatory requirements, yet it would be nice to see if all can easily be accessed in some way. -- Daniel Amyot - 29 Jan 2005

I am a bit confused about this requirement. I would like to first see a draft of the meta model to discuss what you envision. -- Jason Kealey - 03 Feb 2005

Two examples:

    Components are associated with Devices, and a Device has several attributes (name, ID, type, description, operation time...). Now, devices do not have a visual representation (this element is used for performance annotations).
    a Responsibility could also have performance annotations (for using resources) or information for changing the value of path variables (used by scenario definitions). Again, such attributes won't contribute to the satisfaction of the mandatory requirements 

I would just want to make sure that eventually it will be easy for other people to add accesses to classes and attributes your team won't be handling (so if a generic mechanism can to this, then let's use it!). -- Daniel Amyot - 13 Feb 2005

Let's make good use of reflection or EMF's built-in mechanism. -- Jason Kealey - 14 Feb 2005

Automatique properties work for all basic types and enumerations. -- Jason Kealey - 10 Jun 2005 


[[img/ReqGoalAttributes.PNG]]