# Metamodel Documentation Update

Generating HTML documentation from a metamodel created with Rational
Rose Enterprise Edition requires some doing, especially if we want all
broswers to show them easily.

## 1\) Publish in HTML from Rose

First: **USE A 1024x768 SCREEN RESOLUTION FOR ROSE** (otherwise, the
fonts will be ugly).

From Rose, open the metamodel (`.mdl` file) and select Tools --\> Web
Publisher... The following interface will be shown. Use this
configuration and press Publish.

[[img/RoseWebpublisher.png]]

This will generate a folder with the HTML documentation (and many
subfolders). However, most browsers will not be able to show this
documentation, because the default `index.html` makes use of a Java
applet that is seen as unsecured by most browsers. There is a
workaround, but it is difficult to implement and does not always work
(see URNMetaModel\#WARNING).

## 2\) Install and Run Home-Made Java Index Generator

To solve the above problem, I have created a small Java program (with
two classes) that creates a static HTML index from a structure of Rose
Web Publisher content (`.cnt`) files. I have chosen to show only
packages and diagrams. The rest of the information can be obtained by
clicking on the diagrams (packages, classes and associations) and the
links on the various other details brought up on the web pages.

First, download and unzip
[GenerateIndexForRose.zip](att/GenerateIndexForRose.zip). This
file contains two Java classes with their source code, and one HTML
file.

Run the Generate program to produce a `menu.html` file. Use the
`content.cnt` file from the root directory of the metamodel published by
Rose as a parameter. Then, move this menu file to the Rose folder.
Finally, rename the original `index.html` file (in case you want it to
be available to people who can actually run the Rose Java applet), and
copy the provided `newindex.html` file into the folder as the new
`index.html` file. For example:

    java Generate "D:\Documents\work\jucmnav\URNMetamodelHTML\contents.cnt" > menu.html
    move menu.html D:\Documents\work\jucmnav\URNMetamodelHTML
    move  D:\Documents\work\jucmnav\URNMetamodelHTML\index.html  D:\Documents\work\jucmnav\URNMetamodelHTML\oldindex.html
    copy newindex.html D:\Documents\work\jucmnav\URNMetamodelHTML\index.html

This new `index.html` uses frames to include the previous `menu.html`
and another frame (labelled `contents_frame` by Rose Web Publisher) for
content visualization. You may want to test the index, and adjust the
width of the menu frame if not wide enough. By default, it is:

    <frameset COLS="250,*">

## 3\) Deployment

Zip this folder and upload it on the Web (to be accessed by Wiki).
Update the Wiki to create links to the two index files. For example, see
what is on URNMetaModel

``` 
   * In [[%ATTACHURL%/URN_27.mdl][Rational Rose (.mdl)]] format
   * [[http://www.site.uottawa.ca/~damyot/urn/URNMetamodelHTML/index.html][Documentation]] in HTML (for all browsers)
   * [[http://www.site.uottawa.ca/~damyot/urn/URNMetamodelHTML/oldindex.html][Documentation]] in HTML (original applet-based Rose index, see <a href ="#WARNING">WARNING</a>)
   * All documentation as a [[http://www.site.uottawa.ca/~damyot/urn/URNMetamodelHTML.zip][ZIP file]]
```

That's it\!

\-- Main.DanielAmyot - 03 Aug 2014
