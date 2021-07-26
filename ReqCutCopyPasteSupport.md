   * One should be able to copy/cut in one map and paste in another.
   * One should be able to copy/cut in one map and paste in the same one.
   * Obviously, as with deletions, one should not be able to copy or cut incomplete path sequences, unless these are truncated with appropriate start/end points. 
   * If easily supported, copy-paste (as bitmap?) to other applications would be interesting as well.

-- Main.JasonKealey - 19 May 2005

Needs more discussion. Copy/paste appears relevant to me for: 
   * one or many component references (this is important)
   * a responsibility reference
   * an entire map
   * a stub (and its content)

This might be problematic for partial maps. Could perhaps be extended to copy/paste of a connected set of nodes from a given node (including everything to start points and end points). For instance, one could cut a path, copy/paste it elsewhere, and reconnect it afterwards (or delete it).

This may need to be refined into separate requirements.

-- Main.DanielAmyot - 20 May 2005

[[img/ReqCutCopyPasteSupport.PNG]]
