In the current UCMNav, the Autosave is offered for 5, 10, ... minutes (could be user-defined). A different file extension is used (.uas). jUCMNav should probably reuse these ideas (e.g. .jucm.as) -- Daniel Amyot - 29 Jan 2005

If I am not mistaken, this seems to go against the Eclipse UI guidelines and it is mandatory? -- Jason Kealey - 31 Jan 2005

EG6.2: Modifications made in an editor follow an open-save-close lifecycle model. When an editor first opens, the editor contents should be unmodified (clean). If the contents are modified, the editor should communicate this change to the platform. In response, an asterisk will appear in the editor tab. The modifications should be buffered within the edit model, until such a time as the user explicitly saves them. At that point, the modifications should be committed to the model storage.
Jason is right.
-- Jean Philippe Daigle? - 31 Jan 2005

The autosave should target a different file name. Right now, UCMNav uses .uas (so a UCM document file.ucm is autosaved as file.uas). -- Daniel Amyot - 13 Feb 2005 

[[img/ReqSaveAuto.PNG]]