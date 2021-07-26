# jUCMNav v4.3.0

<img align = "right" src="img/LogoFinal.gif">

<span class="twiki-macro TOC"></span>



## Enhancements Highlights\!

  - <span class="twiki-macro N"></span> [Aspect-oriented User
    Requirements Notation](AoURN)

## Video and Image Overviews

The [description of AoURN](AoURN) contains animations. Click on the
**green arrows** to continue playing them.

**IMPORTANT**: If you have not yet looked at the enhancements of
previous versions 4..x, please visit these video overviews of [version
4.0.0](JUCMNavRelease400#Video_Overviews), [version
4.1.0](JUCMNavRelease410#Video_Overviews), and [version
4.2.0](JUCMNavRelease420#Video_and_Image_Overviews).

## Requirements and Installation

Please visit DownloadingAndInstallation and the animated
InstallationDemo. Note that this version now requires Eclipse 3.5 and
above.

## Thanks\!

[Contributors](http://www.ohloh.net/p/11712/contributors) to this
release included Gunter Mussbacher, Daniel Amyot, and Azalia Shamsaei.

## Release Notes

### Help

  - End-user documentation is integrated with the Eclipse help system.
    `Access Help > Help Contents` from the Eclipse workbench, then
    select topic `jUCMNav Online Help`.
  - The latest user documentation can also be accessed via HelpOnLine

### Reporting Bugs / Usability Requests

  - Send your bug reports to \<a
    href="[mailto:jucmnav-dev@softwareengineering.ca](mailto:jucmnav-dev@softwareengineering.ca)"\><jucmnav-dev@softwareengineering.ca>\</a\>.
  - Include reproduction steps, sample .jucm files and, if applicable,
    copy-paste the error log messages.
  - If you're zealous enough, we'll create a
    [BugZilla](http://jucmnav.softwareengineering.ca/bugzilla/) account
    for you :)

### Other Enhancements / Fixes since 4.2.1

| **Bug** | **Description** |
| --- | --- |
| <a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=773">773</a> | Fixed 'concern' in French translation |
| <a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=758">758</a> | GRL catalogues now support actors and containment of intentional elements |
| <a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=757">757</a> | Fixed escape characters in HTML, CSM, and GRL catalogue export mechanisms |
| - | Improved GRL formula-based evaluation and visualization |
| - | Changed the color of URN links to black |
| - | Fixed the display of diagram names in the export wizard | 
| - | Fixed two semantic checking rules for GRL consistency  | 

For enhancements and fixes since previous releases, please refer to the
release notes of the PreviousReleases.

### Known Issues in 4.3.0

  - Reports generated, MSC Viewer, and user documentation only available
    in English.
  - User documentation not up to date.
  - Changing the visibility of several UCM/GRL elements via jUCMNav's
    main preference page may require you to reload the model or refresh
    the diagrams with the Scenario and Strategy view.
  - The UCM traversal mechanism does not take into consideration
    advanced stubs, failures, aspect-oriented extensions, and some other
    attributes.
  - Aspect-oriented GRL is not yet supported.
  - Generated reports could be more complete
  - The UCEd import will not work with the latest version of UCEd.
  - There are no extension points to give your own scenario/strategy
    algorithms and no UI to choose them.
