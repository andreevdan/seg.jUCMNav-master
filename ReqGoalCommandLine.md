jUCMNAv should be usable with or without the GUI, and a command line interface would enable easy access to some functionalities (e.g., loading a specific file, model analysis, model exporting, model printing, model transformation, etc.) without the need to start the whole interface. Command line interfaces are also very useful when chaining tools and in batch files. -- Daniel Amyot - 29 Jan 2005

Therefore, we must try to seperate EMF and GEF as much as possible. We may have to add another layer in which our commands are self contained and not held strongly linked to GEF. Etienne Tremblay might have a better idea on how all of this should be architectured. -- Jason Kealey - 31 Jan 2005 

[[img/ReqGoalCommandLine.PNG]]