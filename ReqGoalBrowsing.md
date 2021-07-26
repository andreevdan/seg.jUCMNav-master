Navigation capabilities of UCMNav are limited. Those in jUCMNav should provide a user experience similar to what a Web browser offers (and more...) -- Daniel Amyot - 29 Jan 2005

Since when did this go from a potential metaphor to a mandatory one? -- Jason Kealey - 31 Jan 2005

I don't like this goal. It is not precise. Back/Forward are mentionned in [Req Browse History](ReqBrowseHistory). Would this be sufficient? If so, this requirement is a duplicate. Do you mean [Req Browse History](ReqBrowseHistory) plus our view that shows all maps in a file?

This makes me think about how we handle plug-ins. Currently, we discussed showing all the linked plug-ins in the outline view in the mockup. By clicking on a map hooked up to a plug-in in the outline view, this map would be loaded. However, we have completely dropped the idea of a stack of plug-in layers that was originally in UCMNav. Is this a problem? From any map, you don't know who uses it. Your requirements and our mockup doesn't make use of a "root" map either. This whole logic of how maps are structure might still be nebulous. -- Jason Kealey - 15 Feb 2005

[Req Browse History](ReqBrowseHistory) goes in this direction. The current view in UCMNav is really a history, not a tree structure. Would be nice to have a tree view of maps and submaps (I don't see this in the current mockups), but I can live without it for now. -- Daniel Amyot - 15 Feb 2005 


[[img/ReqGoalBrowsing.PNG]]