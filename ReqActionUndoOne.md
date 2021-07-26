This is an important feature that may impact how the model is maintained. Does EMF help here?

-- Daniel Amyot - 30 Jan 2005

When using GEF/EMF, every action performed creates a Command object. You create the Command and its inverse if you ever need to bring the model back to its original state. This command object is stored in some stack somewhere and the redo/undo functions are handled by the framework. Etienne's network editor already has this functionality. (I don't know how many commands are contained in the stack.

-- Jason Kealey - 03 Feb 2005

Will be complete when all commands have tests in [JUCMNav Command Tests](JUCMNavCommandTests)? -- Jason Kealey - 06 May 2005

All except documented exceptions tested. Marking as completed. -- Jason Kealey - 14 Jul 2005 

[[img/ReqActionUndoOne.PNG]]