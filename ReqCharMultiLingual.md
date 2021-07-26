At the very least, accuented characters in ISO Latin 1 should be supported, but ideally we should have Unicode. Maybe we can get this this for free with Eclipse...

-- Daniel Amyot - 30 Jan 2005

I just tested Etienne Tremblay's network editor and French characters seem to work fine. I pasted a chinese symbol and it showed a rectangle. Maybe there's a simple option somewhere for this.

-- Jason Kealey - 03 Feb 2005

Everything usually works with Unicode under the covers, but the display might pose issues... Latin-1 seems to work but a quick googling will reveal oriental charsets give everyone headaches:
http://www.google.com/search?hl=en&lr=&q=eclipse+chinese+characters&btnG=Search
-- Jean Philippe Daigle? - 03 Feb 2005

After further research, right-to-left language and complex script language (such as arabic, thai) might cause some problems as well. Chinese should work on Windows as long as the font used is not Arial Unicode MS (because it rotate chinese character for some reason). Asian, arabic and complex languages support on Linux might be limited because GTK doesn't have a good support.
-- Olivier Clift Noel? - 14 Feb 2005

ISO Latin1 --- implicit. -- Jason Kealey - 10 Jun 2005 

[[img/ReqCharMultiLingual.PNG]]