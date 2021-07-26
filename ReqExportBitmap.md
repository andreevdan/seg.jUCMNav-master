It seems JPEG, GIF, PNG, ICO, BMP are supported in the same way. Hard to
find anything related to SVG though...

\-- Main.DanielAmyot - 13 Feb 2005


Currently this doesn't save the connection edit parts. Further research
is needed to understand the mechanism that is used to display the edit
parts in the editor.

I've tried this on the NetworkEditor and I can get a jpeg that contains
the nodes.

## Code for saving an image from a Draw2D figure

    try {
       IFigure f = getFigure(); //The content EditPart's getFigure() method
       Image image = new Image(Display.getCurrent(), f.getSize().width, f.getSize().height);
       GC gc = new GC(image);
       SWTGraphics graphics = new SWTGraphics(gc);
       f.paint(graphics);
    
       FileOutputStream fos = new FileOutputStream("in.jpg"); //This will save the image directly on the c: drive
       ImageLoader loader = new ImageLoader();
       loader.data = new ImageData[] { image.getImageData() };
       loader.save(fos, SWT.IMAGE_JPEG); //Several image formats are supported, including bitmap
    } catch(NullPointerException n) {
       System.out.println(n); //Probably not needed, but I was getting some errors before I got it working
    } catch(IOException e) {
       System.out.println(e);
    }


\-- Main.JordanMcManus - 04 Feb 2005

\-- Main.DanielAmyot - 30 Jan 2005

When testing, must export a diagram with a very complex diagram and
verify that everything appears.

Simply missing current and submaps but putting completed anyways. --
Main.JasonKealey - 10 Jun 2005

[[img/ReqExportBitmap.PNG]]
