-- Daniel Amyot - 15 Feb 2005

Some pointers in this [presentation at slide 38](http://www.eclipsecon.org/2004/EclipseCon_2004_TechnicalTrackPresentations/47_Hudson.pdf).

-- Olivier Clift Noel? - 16 Feb 2005

Switched to future -- Jean Philippe Daigle? - 16 Feb 2005

Why future? Isn't this supported by GEF? Sasha Boyko seemed to imply this was easy to do. It should remain at least Mandatory (with Low priority if you want it out of the scope of your projet). -- Daniel Amyot - 17 Feb 2005

Restored to mandatory. -- Jason Kealey - 17 Feb 2005

The Zoom Manager? is the class that allows this: "A Zoom Manager? controls how zoom in and zoom out are performed. It also determines the list of choices the user sees in the drop-down Combo on the toolbar. The zoom manager controls a Scalable Figure?, which performs the actual zoom, and also a Viewport. The viewport is needed so that the scrolled location is preserved as the zoom level changes."

I haven't managed to find a concrete example of how the Scalable Figure? performs a zoom. Information on this subject seems quite limited...

-- Jordan Mc Manus? - 18 Feb 2005 


[[img/ReqAreaZoomScroll.PNG]]