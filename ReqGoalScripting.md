Many software engineering tools support scripting, which is a way to enable tool tailoring as well as interworking with other tools. -- Daniel Amyot - 29 Jan 2005

I have no experience in ensuring an architecture will support scripting. Do you have any tips? Do you think this will be implicitely done because we will be using EMF and we shouldn't worry about it? -- Jason Kealey - 03 Feb 2005

I have never done it myself either. Tools like Rose, DOORS (and even Word) all have a scriptable way of accessing the commands. In fact, in DOORS, the GUI is essentially a big script program...! I guess this goal means that we should try to decouple the control part from the view part (or the commands from the GUI), to that a scripting language could be supported (and replace the GUI). -- Daniel Amyot - 13 Feb 2005

I'm pretty sure the explicit division between GEF and its model will ensure this property. -- Jason Kealey - 14 Feb 2005 


[[img/ReqGoalScripting.PNG]]