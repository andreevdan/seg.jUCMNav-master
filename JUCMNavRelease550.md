# jUCMNav v5.5.0

<img align="right" src="img/LogoFinal.gif">

<span class="twiki-macro TOC"></span>

-----

## Important Note

This version requires Eclipse 4.x. For a version of jUCMNav that
supports Eclipse 3.x, please use JUCMNavRelease540

## Enhancements Highlights\!

  - <span class="twiki-macro N"></span> Releases 5.5.0 is now compatible
    with Eclipse 4.x
  - <span class="twiki-macro N"></span> Releases 5.5.0 has prototype
    alpha support for feature models.

## Thanks\!

[Contributors](http://www.ohloh.net/p/11712/contributors) to this
release included Dominique Blouin, Patrice Boulet, Nabil Cherchem,
Yasser Khan, Yanji Liu, Rouzbahan Rashidi-Tabrizi, Étienne Tremblay, and
Yin Xinshang.

## Release Notes

  - Minor changes to avoid exceptions thrown with Eclipse 4.x solved (D.
    Blouin)
  - Problem with run all evaluation in GRL strategy group (off by one
    index) solved (E. Tremblay)
  - Prototype support for feature models, with evaluation, based on GRL
    (Y. Xinshang, Y. Liu)
  - Small issue fixed with expansion of GRL intentional elements in
    actors (R. Rashidi-Tabrizi)

Also, many thanks to N. Cherchem, Y. Khan and P. Boulet for fixing our
Cruise Control server infrastructure for supporting Eclipse 4.x\!

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

### Enhancements / Fixes since 5.4.0

<table>
<thead>
<tr class="header">
<th style="text-align: left;">Bug</th>
<th style="text-align: left;">Description</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=910">910</a></td>
<td style="text-align: left;">Editor fails to launch : java.lang.NoSuchMethodError</td>
</tr>
</tbody>
</table>

For enhancements and fixes since previous releases, please refer to the
release notes of the PreviousReleases.

### Known Issues in 5.5.0

  - MSC Viewer and user documentation only available in English (GUI,
    models and reports are however multi-lingual)
  - When changing a few of the preferences, one must sometimes close &
    re-open a model for the change to have an impact on the editor.
  - The UCM traversal mechanism does not take into consideration
    advanced stubs, failures, aspect-oriented extensions, and some other
    attributes.
  - Aspect-oriented GRL is not yet supported.
  - [Open bugs on Buzilla
    server](http://jucmnav.softwareengineering.ca/bugzilla/buglist.cgi?query_format=specific&order=relevance+desc&bug_status=__open__&product=jUCMNav&content=)

\-- Patrice Boulet - 02 May 2014
