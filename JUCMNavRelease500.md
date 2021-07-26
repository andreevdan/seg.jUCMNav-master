# jUCMNav v5.0.0

<img align = "right" src="img/LogoFinal.gif">

<span class="twiki-macro TOC"></span>

-----

## Enhancements Highlights\!

  - <span class="twiki-macro N"></span> Building on the 4.4.0 release,
    much better and flexible support for managing and navigating URN
    links
  - <span class="twiki-macro N"></span> Support for bilingual models
  - <span class="twiki-macro N"></span> GRL: legal compliance profile
  - <span class="twiki-macro N"></span> GRL: Strategy difference
    visualization
  - <span class="twiki-macro N"></span> GRL: \[0,100\] evaluation scale
    mode
  - <span class="twiki-macro N"></span> GRL: Support for strategies
    including other strategies
  - <span class="twiki-macro N"></span> GRL: Support for contribution
    overrides
  - <span class="twiki-macro N"></span> GRL: Support for sensitivity
    analysis
  - <span class="twiki-macro N"></span> GRL: Support for CSV
    Import/Export of Strategies
  - <span class="twiki-macro N"></span> Integration with EMF Compare for
    visualizing model differences.
  - Many improvements (contribution label editing, element resizing,
    searching, reporting, etc.) and bug fixes

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
release included Jason Kealey, Andrew Miga, Etienne Tremblay, Daniel
Amyot, Azalia Shamsaei, Gunter Mussbacher, Hao Luo, Dominique Blouin and
Stéphane Leblanc.

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

### Enhancements / Fixes since 4.3.0

Many of these already included in 4.4.0 but may have been improved since
that release

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
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=421">421</a></td>
<td style="text-align: left;">GRL contributions should use movable labels</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=506">506</a></td>
<td style="text-align: left;">Now support having enumeration value of same name as a variable</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=507">507</a></td>
<td style="text-align: left;">Improve selection of visibility of some GRL/UCM elements</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=631">631</a></td>
<td style="text-align: left;">Move scenarios from one group to another via drag&amp;drop</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=632">632</a></td>
<td style="text-align: left;">Move strategies from one group to another via drag&amp;drop</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=655">655</a></td>
<td style="text-align: left;">Partial work on deprecated Eclipse calls</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=662">662</a></td>
<td style="text-align: left;">Select All does not allow moving the bend points of GRL links.</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=666">666</a></td>
<td style="text-align: left;">GRL intentional elements should be resizable</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=666">666</a></td>
<td style="text-align: left;">Can now edit RespRef meta-data</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=688">688</a></td>
<td style="text-align: left;">URN links should be created à la Telelogic DOORS</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=696">696</a></td>
<td style="text-align: left;">Image Export now prompts before overwriting</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=700">700</a></td>
<td style="text-align: left;">Removed UCEd from jUCMNav feature.</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=717">717</a></td>
<td style="text-align: left;">Undoing a new GRL evaluation leaves it created, but with the previous value</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=729">729</a></td>
<td style="text-align: left;">Reports: Add actor evaluation and refactor</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=754">754</a></td>
<td style="text-align: left;">Export to CSV from GRL strategies is broken</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=756">756</a></td>
<td style="text-align: left;">Enumeration types should allow for elements with mixed case</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=757">757</a></td>
<td style="text-align: left;">The import/export of GRL catalogues, export of CSM/CSV...</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=759">759</a></td>
<td style="text-align: left;">Export to .dot for Graphvis produces 0 length file</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=760">760</a></td>
<td style="text-align: left;">Can set a GRL strategy of one model based on elements of another</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=762">762</a></td>
<td style="text-align: left;">Double click on bound start/end points now selects in-out path in addition to parent stub</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=763">763</a></td>
<td style="text-align: left;">Default fill color of comments is not #000000</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=764">764</a></td>
<td style="text-align: left;">Don't auto-delete responsibility definition if used in responsibility bindings</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=769">769</a></td>
<td style="text-align: left;">sub-menu icon problem</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=772">772</a></td>
<td style="text-align: left;">searching should be optionally restricted to the current</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=774">774</a></td>
<td style="text-align: left;">Problem with include order of scenarios</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=775">775</a></td>
<td style="text-align: left;">Multiline input for responsibilities+stubs</td>
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
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=780">780</a></td>
<td style="text-align: left;">Null pointer exception when deleting multiple intentional elements when a strategy is active</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=781">781</a></td>
<td style="text-align: left;">bug preventing us to export single URN diagrams</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=782">782</a></td>
<td style="text-align: left;">Gray coloring of GRL IEs with &lt;&lt;NO&gt;&gt; tag</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=783">783</a></td>
<td style="text-align: left;">Five additional OCL constraints for Azalia's Measured Compliance profile.</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=785">785</a></td>
<td style="text-align: left;">GRL Strategy Difference mode</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=786">786</a></td>
<td style="text-align: left;">Bilingual feature</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=787">787</a></td>
<td style="text-align: left;">Usability issue when renaming model elements to same name but with different case</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=789">789</a></td>
<td style="text-align: left;">The value of Contribution association</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=790">790</a></td>
<td style="text-align: left;">Sensitivity analysis</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=791">791</a></td>
<td style="text-align: left;">GRL scale: from 0 to 100 instead of -100 to 100</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=792">792</a></td>
<td style="text-align: left;">GRL input of strategy definitions from tables / CSV</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=795">795</a></td>
<td style="text-align: left;">Contribution override</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=797">797</a></td>
<td style="text-align: left;">GRL should support including strategies in another strategy.</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=798">798</a></td>
<td style="text-align: left;">Model diff via EMF Compare</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=799">799</a></td>
<td style="text-align: left;">Update Z.151 import/export for revised metamodel</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=800">800</a></td>
<td style="text-align: left;">Update Metamodel to support new GRL Indicators and Strate...</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=801">801</a></td>
<td style="text-align: left;">Bug with Outline in French locale</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=802">802</a></td>
<td style="text-align: left;">Fixed incorrect genmodel file specification</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=803">803</a></td>
<td style="text-align: left;">Package ucmscenarios.ecore does not validate</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=804">804</a></td>
<td style="text-align: left;">Gray coloring of GRL IEs with &lt;&lt;IgnoreNodeInEvaluation&gt;&gt; MEDATADA</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=805">805</a></td>
<td style="text-align: left;">Limit highlighting of IE to resources to certain metadata</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=806">806</a></td>
<td style="text-align: left;">Gray coloring of GRL contribution links</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=807">807</a></td>
<td style="text-align: left;">Popup menu to select class type for GRL IEs and Strategies</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=809">809</a></td>
<td style="text-align: left;">Strategies Treeview: expand all top level nodes, not just first one</td>
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
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=814">814</a></td>
<td style="text-align: left;">deletion of unneeded GUI source file URNLinksDialog.java</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=815">815</a></td>
<td style="text-align: left;">highlighting of URN link endpoints in Outline view involv...</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=818">818</a></td>
<td style="text-align: left;">Unitialized variable creates an exception when used in a ...</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=819">819</a></td>
<td style="text-align: left;">MSC Viewer broken in version 4.4.0</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=821">821</a></td>
<td style="text-align: left;">auto layout default settings not taken into account</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=822">822</a></td>
<td style="text-align: left;">copy/paste of GRL model does not include links if auto-ad...</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=823">823</a></td>
<td style="text-align: left;">turning highlighting on/off does not work</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=825">825</a></td>
<td style="text-align: left;">GRL variables not recognized even though they exist in th...</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=826">826</a></td>
<td style="text-align: left;">Remove the Default GRL evaluation algorithm</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=829">829</a></td>
<td style="text-align: left;">GRL contribution values are editable</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=830">830</a></td>
<td style="text-align: left;">automatic naming of AndJoin/Fork and OrJoin/Fork</td>
</tr>
</tbody>
</table>

For enhancements and fixes since previous releases, please refer to the
release notes of the PreviousReleases.

### Known Issues in 5.0.0

  - Reports generated, MSC Viewer, and user documentation only available
    in English.
  - User documentation not up to date.
  - Select All -\> Delete in GRL no longer works if a Contribution Label
    is selected.
  - Metadata indicators are missing
  - When changing a few of the preferences, one must sometimes close &
    re-open a model for the change to have an impact on the editor.
  - The UCM traversal mechanism does not take into consideration
    advanced stubs, failures, aspect-oriented extensions, and some other
    attributes.
  - Aspect-oriented GRL is not yet supported.
  - Generated reports could be more complete

\-- Main.JasonKealey - 06 Apr 2012
