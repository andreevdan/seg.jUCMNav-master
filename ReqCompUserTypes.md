-- Daniel Amyot - 14 Feb 2005

I'm not very familiar with the SVG or EPS formats, but would this be a problem ? -- Jason Kealey - 15 Feb 2005

No, SVG and EPS can both embed bitmap objects. -- Daniel Amyot - 15 Feb 2005

Perfect. We could cheat our way through [Req Export EPS](ReqExportEPS) using this feature smile -- Jason Kealey - 15 Feb 2005

Ick. This means the user has to design components along with how they connect to others. Not easy to design this to support runtime definition of components. -- Jean Philippe Daigle? - 16 Feb 2005

Actually, components react alike in terms of how they connect to each other (and to how path elements connect to them). I'm just thinking of a bitmap (in a rectangle) instead of just a plain rectangle. -- Daniel Amyot - 17 Feb 2005

Reclassified as optional instead of future for uniformity. -- Jason Kealey - 17 Feb 2005 

[[img/ReqCompUserTypes.PNG]]