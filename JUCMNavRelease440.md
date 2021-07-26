# jUCMNav v4.4.0

<img align="right" src="img/LogoFinal.gif">

<span class="twiki-macro TOC"></span>

-----

## Enhancements Highlights\!

  - <span class="twiki-macro N"></span> Much better and flexible support
    for managing and navigating URN links
  - <span class="twiki-macro N"></span> Constraint-based propagation
    algorithm for GRL. See [online
    documentation](http://jucmnav.softwareengineering.ca/ucm/bin/view/ProjetSEG/HelpOnLine#Constraint_solver_based_evaluati)
    and this [recent
    publication](http://jucmnav.softwareengineering.ca/ucm/bin/view/UCM/VirLibiStar2011JaCoP).
  - Many enhancements (stereotype definitions, element tagging, element
    hiding, GRL propagation algorithm, and OCL rules) for a new GRL
    profile targeting measurable compliance assessments.
  - Improved interface for renaming model elements (including changing
    their case)
  - Dozens of bug fixes

## Video and Image Overviews

**IMPORTANT**: If you have not yet looked at the enhancements of
previous versions 4..x, please visit these video overviews of [version
4.0.0](JUCMNavRelease400#Video_Overviews), [version
4.1.0](JUCMNavRelease410#Video_Overviews), [version
4.2.0](JUCMNavRelease420#Video_and_Image_Overviews), and the
[description of AoURN](AoURN) .

### URN Link Management


## Requirements and Installation

Please visit DownloadingAndInstallation and the animated
InstallationDemo. Note that this version requires Eclipse 3.5 and above
(and preferably Eclipse Modeling Tools 3.7.x)

## Thanks!

[Contributors](http://www.ohloh.net/p/11712/contributors) to this
release included Andrew Miga, Gunter Mussbacher, Daniel Amyot, Hao Luo,
Azalia Shamsaei, Dominique Blouin, Etienne Tremblay and Jason Kealey.

## Release Notes

### Help

  - End-user documentation is integrated with the Eclipse help system.
    `Access Help > Help Contents` from the Eclipse workbench, then
    select topic `jUCMNav Online Help`.
  - The latest user documentation can also be accessed via [Help On Line](HelpOnLine)

### Reporting Bugs / Usability Requests

  - Send your bug reports to jucmnav-dev@softwareengineering.ca.
  - Include reproduction steps, sample .jucm files and, if applicable,
    copy-paste the error log messages.
  - If you're zealous enough, we'll create a
    [BugZilla](http://jucmnav.softwareengineering.ca/bugzilla/) account
    for you :)

### Other Enhancements / Fixes since 4.3.0

<table>
<thead>
<tr class="header">
<th style="text-align: left;">Bug</th>
<th style="text-align: left;">Description</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td style="text-align: left;">-</td>
<td style="text-align: left;">UCM: Improved spline resolution</td>
</tr>
<tr class="even">
<td style="text-align: left;">-</td>
<td style="text-align: left;">New constraint-based propagation algorithm for GRL. See <a href="http://jucmnav.softwareengineering.ca/ucm/bin/view/ProjetSEG/HelpOnLine#Constraint_solver_based_evaluati">this</a> and <a href="http://jucmnav.softwareengineering.ca/ucm/bin/view/UCM/VirLibiStar2011JaCoP">this</a>.</td>
</tr>
<tr class="odd">
<td style="text-align: left;">-</td>
<td style="text-align: left;">GRL Conditional Algorithm Used for Compliance</td>
</tr>
<tr class="even">
<td style="text-align: left;">-</td>
<td style="text-align: left;">Added ability to add Stereotype Definitions to URN models.</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=778">778</a></td>
<td style="text-align: left;">refresh issue with ResponsibilityPropertySource</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=779">779</a></td>
<td style="text-align: left;">bug with scenario paste</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=781">781</a></td>
<td style="text-align: left;">bug preventing us to export single URN diagrams</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=696">696</a></td>
<td style="text-align: left;">Image Export now prompts before overwriting</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=688">688</a></td>
<td style="text-align: left;">URN links should be created à la Telelogic DOORS</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=801">801</a></td>
<td style="text-align: left;">Bug with Outline in French locale</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=717">717</a></td>
<td style="text-align: left;">Undoing a new GRL evaluation leaves it created, but with the previous value</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=717">717</a></td>
<td style="text-align: left;">Undoing a new GRL evaluation leaves it created, but with the previous value</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=782">782</a></td>
<td style="text-align: left;">Gray coloring of GRL IEs with &lt;&lt;NO&gt;&gt; tag</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=802">802</a></td>
<td style="text-align: left;">Fixed incorrect genmodel file specification</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=804">804</a></td>
<td style="text-align: left;">Gray coloring of GRL IEs with &lt;&lt;IgnoreNodeInEvaluation&gt;&gt; MEDATADA</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=806">806</a></td>
<td style="text-align: left;">Gray coloring of GRL contribution links</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=655">655</a></td>
<td style="text-align: left;">Partial work on deprecated Eclipse calls</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=700">700</a></td>
<td style="text-align: left;">Removed UCEd from jUCMNav feature.</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=760">760</a></td>
<td style="text-align: left;">Can set a GRL strategy of one model based on elements of another</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=787">787</a></td>
<td style="text-align: left;">Usability issue when renaming model elements to same name but with different case</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=780">780</a></td>
<td style="text-align: left;">Null pointer exception when deleting multiple intentional elements when a strategy is active</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=764">764</a></td>
<td style="text-align: left;">Don't auto-delete responsibility definition if used in responsibility bindings</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=762">762</a></td>
<td style="text-align: left;">Double click on bound start/end points now selects in-out path in addition to parent stub</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=774">774</a></td>
<td style="text-align: left;">Problem with include order of scenarios</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=763">763</a></td>
<td style="text-align: left;">Default fill color of comments is not #000000</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=809">809</a></td>
<td style="text-align: left;">Strategies Treeview: expand all top level nodes, not just first one</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=805">805</a></td>
<td style="text-align: left;">Limit highlighting of IE to resources to certain metadata</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=807">807</a></td>
<td style="text-align: left;">Popup menu to select class type for GRL IEs and Strategies</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=662">662</a></td>
<td style="text-align: left;">Select All does not allow moving the bend points of GRL links.</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=506">506</a></td>
<td style="text-align: left;">Now support having enumeration value of same name as a variable</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=810">810</a></td>
<td style="text-align: left;">Improved auto-open scenario viewer feature</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=812">812</a></td>
<td style="text-align: left;">Prevent URN Links from being created across models</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=631">631</a></td>
<td style="text-align: left;">Move strategies/scenarios from one group to another via drag&amp;drop</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=814">814</a></td>
<td style="text-align: left;">deletion of unneeded GUI source file URNLinksDialog.java</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=783">783</a></td>
<td style="text-align: left;">Five additional OCL constraints for Azalia's Measured Compliance profile.</td>
</tr>
</tbody>
</table>

For enhancements and fixes since previous releases, please refer to the
release notes of the [Previous Releases](PreviousReleases).

### Known Issues in 4.4.0

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

\-- Main.JasonKealey - 28 Feb 2012
