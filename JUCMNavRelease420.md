# jUCMNav v4.2.0

<img align ="right" src="img/LogoFinal.gif">

<span class="twiki-macro TOC"></span>

----

## Enhancements Highlights\!

  - <span class="twiki-macro N"></span> Advanced UI mode
  - <span class="twiki-macro N"></span> Support for new types of UCM
    constructs (notation only, no analysis)
      - Blocking and Synchronizing stubs from Z.151
      - Failure points and Failure/Abort start points (new extension)
      - Aspect-oriented UCM (local start/end points, replacement stub,
        anything pointcut, and aspect markers)
  - Improved copy/cut/paste for UCM models
  - <span class="twiki-macro N"></span> UCM stub refactoring
  - <span class="twiki-macro N"></span> UCM responsibility binding
  - <span class="twiki-macro N"></span> Contextual menu for setting GRL
    contribution levels
  - <span class="twiki-macro N"></span> Export / Import of models in
    URN's standardized format (Z.151 schema)
  - <span class="twiki-macro N"></span> New and improved GRL propagation
    algorithms
  - <span class="twiki-macro N"></span> Sorting diagrams in large models
  - <span class="twiki-macro N"></span> Diagram anti-aliasing
  - <span class="twiki-macro N"></span> Support for 'else' in UCM
    conditions
  - 39 new OCL semantic rules and metrics\!
  - Major performance improvements for large models
  - Many UCM and GRL user interface improvements
  - Updated French translation of all features
  - and much more\!

## Video and Image Overviews

Some of the following items are animations. Click on the **green
arrows** to continue playing them.

**IMPORTANT**: If you have not yet looked at the enhancements of
previous versions 4..x, please visit these video overviews of [version
4.0.0](JUCMNavRelease400#Video_Overviews) and [version
4.1.0](JUCMNavRelease410#Video_Overviews).

### Advanced User Interface Mode



### Support for Synchronizing and Blocking Stubs

[[img/SyncBlockingStubs.png]]

### Support for Failure Points and Failure/Abort Start Points


### Support for Aspect-oriented Use Case Maps

[[img/AoUCM.png]]

### Support for UCM Stub Refactoring

This feature is still in **beta**.


### Support for UCM Responsibility Binding

jUCMNav's improved *stub binding* dialog now contains 2 tabs, one to
bind start/end points to input/output segments, and the other to handle
component bindings and **responsibility bindings**
<span class="twiki-macro N"></span>.


[[img/RespBinding.png]]

### Support for Hyperlinks


### Contextual Menu for Setting GRL Contribution Levels

[[img/ContributionSetting.png]]

### Import/Export in Z.151 Format

jUCMNav can now import/export URN models in the standard XML format
specified in ITU-T Z.151:

[[img/exportZ151.png]]

See Z151ImportExport for the project's documentation and instructions.
See also [Yan Gao's Project Report](UCM.VirLibGaoMastersProject)

### New and Improved GRL Propagation Algorithms

An algorithm for **formula-based** <span class="twiki-macro N"></span>
contributions to indicators (to represent external drivers and compute
indicator values other than satisfaction levels, e.g., money, number of
items, time, etc.). These are shown in blue over the indicators.
Contributions between indicators are given names that can be used in
formulas attached as metadata to target indicators. This feature is
still in **beta**.

[[img/FormulaBasedAlgo.png]]

Also:

  - Support for XOR decomposition in all algorithms
  - Support for Legal Compliance profile in all algorithms

### Antialising and Metadata Indicators

In the general preference, it is now possible to select whether UCM/GRL
diagrams should be **anti-aliased** <span class="twiki-macro N"></span>.
Anti-aliasing is good when diagrams are displayed on screen, but not so
much for printed documents. It is also possible now to display/hide the
symbol used on elements and links to indicate the presence of metadata.

[[img/AntiAlias.png]]

### Sorting Diagrams in Large Models


### New OCL Rules and Metrics

  - <span class="twiki-macro N"></span> 1 additional [OCL
    metrics](PredefinedMetricsOverview) (UCM path node coverage)
  - <span class="twiki-macro N"></span> 38 additional [OCL semantic
    rules](PredefinedSemanticsRulesOverview), with updated OCL library
      - 20 rules for Legal model compliance (new group, for Legal
        profile)
      - 8 rules for Z.151 export and 5 more for jUCMNav deprecated
        elements (new group)
      - 2 rules for GRL consistency/completeness, 2 for UCM
        consistency/completeness, and 1 for unused element (UCM path
        nodes not covered by scenario definition, for test coverage)

### New Metamodel Additions

  - [Metamodel changes](URNMetaModel): Added support for Aspect-oriented
    UCM constructs, UCM failures, responsibility bindings, Z.151
    concerns, and UCM time units

----

## Thanks\!

[Contributors](http://www.ohloh.net/p/11712/contributors) to this
release included Etienne Tremblay and Jason Kealey (from [LavaBlast
Software](http://www.lavablast.com/), Yan Gao, Daniel Amyot, Alireza
Pourshahid, Sepideh Ghanavati, Andrew Miga, and Gunter Mussbacher. Many
thanks to HengSoft LLC and particularly to Thomas Weigert for funding
part of this new release. Additional funding was provided by NSERC
(Discovery and Postgraduate Scholarship grants) and by NSERC/CIHR
(Collaborative Health Research Project).

----

## Requirements and Installation

Please visit DownloadingAndInstallation and the animated
InstallationDemo. Note that this version now requires Eclipse 3.5 and
above.

----

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

### Other Enhancements / Fixes since 4.1.0

  - Various bugs and UI-related issues:

<table>
<thead>
<tr class="header">
<th style="text-align: right;">Bug</th>
<th style="text-align: right;">Description </th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=240">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=240</a>"&gt;240&lt;/a&gt;</td>
<td style="text-align: right;">SWT runs out of handles after a while with the outline</td>
</tr>
<tr class="even">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=346">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=346</a>"&gt;346&lt;/a&gt;</td>
<td style="text-align: right;">Moving/renaming a .jucm file does not delete the old copy of the file</td>
</tr>
<tr class="odd">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=467">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=467</a>"&gt;467&lt;/a&gt;</td>
<td style="text-align: right;">GRL: set values via contextual menu on item</td>
</tr>
<tr class="even">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=497">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=497</a>"&gt;497&lt;/a&gt;</td>
<td style="text-align: right;">Scenarios: add "negate all others" (else) to condition editor</td>
</tr>
<tr class="odd">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=531">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=531</a>"&gt;531&lt;/a&gt;</td>
<td style="text-align: right;">jUCMNav memory leak and heap space problem</td>
</tr>
<tr class="even">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=568">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=568</a>"&gt;568&lt;/a&gt;</td>
<td style="text-align: right;">Support "Cut Path" on any node connection/empty point/direction arrow</td>
</tr>
<tr class="odd">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=630">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=630</a>"&gt;630&lt;/a&gt;</td>
<td style="text-align: right;">Warn user when deleting a scenario definition that is included by another one</td>
</tr>
<tr class="even">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=647">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=647</a>"&gt;647&lt;/a&gt;</td>
<td style="text-align: right;">GRL "Change Decomposition Type" is now a contextual menu, seen only when decomposition links exist</td>
</tr>
<tr class="odd">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=663">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=663</a>"&gt;663&lt;/a&gt;</td>
<td style="text-align: right;">When inserting a GRL/UCM element in a diagram, the tool should highlight its name and allow to edit it right away</td>
</tr>
<tr class="even">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=667">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=667</a>"&gt;667&lt;/a&gt;</td>
<td style="text-align: right;">Component bindings bug with deletion</td>
</tr>
<tr class="odd">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=677">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=677</a>"&gt;677&lt;/a&gt;</td>
<td style="text-align: right;">Export to flat UCM makes jUCMNav crashes on large file</td>
</tr>
<tr class="even">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=678">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=678</a>"&gt;678&lt;/a&gt;</td>
<td style="text-align: right;">Problem with exporting scenarios</td>
</tr>
<tr class="odd">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=695">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=695</a>"&gt;695&lt;/a&gt;</td>
<td style="text-align: right;">Undoing the deletion of a GRL diagram while evaluating strategies causes an NPE</td>
</tr>
<tr class="even">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=706">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=706</a>"&gt;706&lt;/a&gt;</td>
<td style="text-align: right;">Improve cut/copy/paste of UCM segments</td>
</tr>
<tr class="odd">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=709">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=709</a>"&gt;709&lt;/a&gt;</td>
<td style="text-align: right;">Problems with views when switching to non-jUCMNav editors</td>
</tr>
<tr class="even">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=721">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=721</a>"&gt;721&lt;/a&gt;</td>
<td style="text-align: right;">Connect was not properly bound</td>
</tr>
<tr class="odd">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=722">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=722</a>"&gt;722&lt;/a&gt;</td>
<td style="text-align: right;">Stub binding window does not allow setting the replicationFactor</td>
</tr>
<tr class="even">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=724">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=724</a>"&gt;724&lt;/a&gt;</td>
<td style="text-align: right;">Metrics/Rules preferences on Linux: details take too much place</td>
</tr>
<tr class="odd">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=725">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=725</a>"&gt;725&lt;/a&gt;</td>
<td style="text-align: right;">Added access to GRL run-time evaluation values and UCM path node hit counts as metadata</td>
</tr>
<tr class="even">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=726">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=726</a>"&gt;726&lt;/a&gt;</td>
<td style="text-align: right;">Strategy/Scenario View becomes empty after looking at a Java file</td>
</tr>
<tr class="odd">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=727">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=727</a>"&gt;727&lt;/a&gt;</td>
<td style="text-align: right;">Invalid thread access when generating PDF/RTF reports</td>
</tr>
<tr class="even">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=728">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=728</a>"&gt;728&lt;/a&gt;</td>
<td style="text-align: right;">Generating a report with an empty diagram generates an error</td>
</tr>
<tr class="odd">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=730">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=730</a>"&gt;730&lt;/a&gt;</td>
<td style="text-align: right;">Cannot display stereotypes on GRL links</td>
</tr>
<tr class="even">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=731">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=731</a>"&gt;731&lt;/a&gt;</td>
<td style="text-align: right;">Cannot add metadata to GRL links</td>
</tr>
<tr class="odd">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=733">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=733</a>"&gt;733&lt;/a&gt;</td>
<td style="text-align: right;">Hoovering a responsibility with code should display code</td>
</tr>
<tr class="even">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=736">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=736</a>"&gt;736&lt;/a&gt;</td>
<td style="text-align: right;">KPI view creates a SWT Exception</td>
</tr>
<tr class="odd">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=737">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=737</a>"&gt;737&lt;/a&gt;</td>
<td style="text-align: right;">Concern view icon duplicated in Outline view</td>
</tr>
<tr class="even">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=738">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=738</a>"&gt;738&lt;/a&gt;</td>
<td style="text-align: right;">Copy/paste does not preserve responsibility-to-component links</td>
</tr>
<tr class="odd">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=746">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=746</a>"&gt;746&lt;/a&gt;</td>
<td style="text-align: right;">Add a preference to show/hide the metadata indicators</td>
</tr>
<tr class="even">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=747">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=747</a>"&gt;747&lt;/a&gt;</td>
<td style="text-align: right;">Unhandled Loop Exception in Scenario Execution Mode</td>
</tr>
</tbody>
</table>

For enhancements and fixes since previous releases, please refer to the
release notes of the PreviousReleases.

### Known Issues in 4.2.0

  - Reports generated, MSC Viewer, and user documentation only available
    in English.
  - User documentation not up to date.
  - Changing the visibility of several UCM/GRL elements via jUCMNav's
    main preference page may require you to reload the model or refresh
    the diagrams with the Scenario and Strategy view.
  - The UCM traversal mechanism does not take into consideration
    advanced stubs, failures, and some other attributes.
  - Generated reports could be more complete
  - The UCEd import will not work with the latest version of UCEd.
  - There are no extension points to give your own scenario/strategy
    algorithms and no UI to choose them.

\-- Main.DanielAmyot - 11 Jan 2010
