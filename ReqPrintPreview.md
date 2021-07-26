-- Daniel Amyot - 30 Jan 2005

Hmmmm. Although this sounds obvious, I doesn't look like it is in Eclipse by default. Must investigate. -- Jason Kealey - 03 Feb 2005

Please read this, in particular comments #4 and #7.

Class GC is where all of the drawing capabilities that are supported by SWT are located. Instances are used to draw on either an Image, a Control, or directly on a Display.

We will have to implement our own print preview.

-- Jordan Mc Manus? - 13 Feb 2005

OK as optional (ie: not in this project) -- Jean Philippe Daigle? - 16 Feb 2005 

[[img/ReqPrintPreview.PNG]]