
# jUCMNav v5.2.0
<img align = "right" src="img/LogoFinal.gif">

<span class="twiki-macro TOC"></span>

-----

## Enhancements Highlights\!

  - <span class="twiki-macro N"></span> Release 5.2.0 is a minor release
    focusing on a few new features for AoURN.
  - <span class="twiki-macro N"></span> AoURN matching in UCM models now
    supports regular expressions, components, and metadata.
  - <span class="twiki-macro N"></span> AoURN matching in UCM models now
    allows several pointcut maps to be plugged into a pointcut stub.
  - <span class="twiki-macro N"></span> This release is coordinated with
    [AoURNtoRAM v1.0.1](AoUrnToRamWebsite).

## Video and Image Overviews

**IMPORTANT**: If you have not yet looked at the enhancements of
versions 4.x, please visit these video overviews of [version
4.0.0](JUCMNavRelease400#Video_Overviews), [version
4.1.0](JUCMNavRelease410#Video_Overviews), [version
4.2.0](JUCMNavRelease420#Video_and_Image_Overviews), [version
4.4.0](JUCMNavRelease440#Video_and_Image_Overviews), and the
[description of AoURN](AoURN) .

## Requirements and Installation

Please visit DownloadingAndInstallation and the animated
InstallationDemo. Note that this version requires Eclipse 3.7 and above
(and preferably Eclipse Modeling Tools 3.7.x)

## Thanks\!

[Contributors](http://www.ohloh.net/p/11712/contributors) to this
release included Gunter Mussbacher.

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

### Enhancements / Fixes since 5.1.0

The added AoURN features do not have bug numbers.

For enhancements and fixes since previous releases, please refer to the
release notes of the PreviousReleases.

### Known Issues in 5.2.0

  - Reports generated, MSC Viewer, and user documentation only available
    in English.
  - When changing a few of the preferences, one must sometimes close &
    re-open a model for the change to have an impact on the editor.
  - The UCM traversal mechanism does not take into consideration
    advanced stubs, failures, aspect-oriented extensions, and some other
    attributes.
  - Aspect-oriented GRL is not yet supported.
  - Generated reports could be more complete

\-- Main.GunterMussbacher - 12 Sep 2012
