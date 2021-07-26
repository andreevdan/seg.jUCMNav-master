# Updating the Online Help

At the moment, the online help is a monolithic TWiki/HTML document. We
use a scrit to convert it to XHTML and embed it in jUCMNav.

1.  Update the [Help On Line](HelpOnLine) on Twiki
      - Must be XHTML-compatible. "&" should be "\&amp;", "\>" should be
        "\&gt;", "\<br\>" should be "\<br /\>", etc.
      - When attaching an image, do not create a link at the bottom
        (hide it).
2.  Extract an HTML file with images
      - Run the /seg.jUCMNav/helpcontent/getlatest script (requires
        wget).
3.  Fix the helponline.html file
      - The \<LINK\> tag should be XHTML compatible (with /\> at its
        end)
4.  Update the /seg.jUCMNav/help.xml file
      - This is the Eclipse index. Synchronize with the table of
        contents found in the helponline.html file.
5.  Copy all the files to the /seg.jUCMNav/helpcontent/ directory
6.  Test locally in debug mode
      - The SAX parser may complain (quite picky). The console on the
        development Eclipse IDE provides the line number in the
        helponline.html file where the problem occurs, if any.
7.  Once this is working, commit /seg.jUCMNav/helpcontent/ and
    /seg.jUCMNav/help.xml

Voilà\!

\-- Main.DanielAmyot - 27 Apr 2008
