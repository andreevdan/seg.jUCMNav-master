# jUCMNav v5.4.0 (including v5.3.0)

<img align="right" src="img/LogoFinal.gif">


-----

## Enhancements Highlights\!

  - <span class="twiki-macro N"></span> Releases 5.4.0 (including 5.3.0)
    focus on new features, bug fixes, usability enhancements, and other
    minor improvements from the previous 5.2.0 release.
  - <span class="twiki-macro N"></span> GRL: Support for the conversion
    of qualitative KPIs (qualitative real-world value to qualitative or
    quantitative model value)
  - <span class="twiki-macro N"></span> GRL: Support for the dynamic
    exploration of goal models
  - <span class="twiki-macro N"></span> GRL: Reporting of trends based
    on a series of strategies
  - <span class="twiki-macro N"></span> GRL: Conditional GRL Evaluation
    Algorithm that takes conditions and family members (types) into
    account
  - <span class="twiki-macro N"></span> URN: significant enhancements of
    [jUCMNav's report generation
    tool](JUCMNavTutorials#jUCMNav_s_Report_Generation_Tool)

**IMPORTANT**: Note that this release and all previous releases are not
compatible with Eclipse 4.2\\4.3 Juno. Please use Eclipse Indigo 3.7.
Video Overviews

**IMPORTANT**: New videos have been added recently to the release notes
of [version 5.1.0](JUCMNavRelease510#Video_and_Image_Overviews).

#### Qualitative KPIs

Indicators are a new concept in the second version of the URN standard.
jUCMNav has been supporting regular indicators (comparing a current
value with target, threshold, worst-case values) for many years.
*Qualitative indicators* are a new type of indicators that exploit a
mapping table converting user-defined qualitative values (e.g., very
bad, bad, good, very good) to GRL satisfaction values (on \[0..100\] or
\[-100..100\] scales). A model can include many such mapping tables, and
each qualitative indicator can be associated to one table.

#### Dynamic Exploration of GRL Models

jUCMNav now allows users of GRL models to expand (i.e., visualize
related intentional elements and their links) any goal model element to
a specified depth via the Show Linked Elements menu item. Predefined
depths are also available. An actor reference can be expanded to show
its included intentional elements, and the containing actor of an
intentional element can also be added to the diagram. This is very
useful for creating new GRL diagrams/views of a model dynamically.

#### Conditional Algorithm (Conditions)

In this GRL evaluation algorithm, conditions (tagged resources) can be
added as a means to filter out elements of a goal model not applicable
if some condition is not satisfied.


#### Conditional Algorithm (Types)

Similarly, types of intentional elements can be defined, allowing for
families of goal models to be specified (i.e., one GRL model for many
categories of target types). During the evaluation, a strategy can
target one or many types specifically (and the others will be ignired
from the model).


#### Trend

Trends can be computed for a group of GRL strategies (sorted by names).
Trends indicate for each intentional element and actor whether they are
improving or deteriorating from one strategy to the next. Trends by
default look at the last 3 strategies, but this can be changed through
preferences.


## Thanks\!

[Contributors](http://www.ohloh.net/p/11712/contributors) to this
release included Jason Kealey, Jean-François Séguin, Alexandre Hamel,
Rouzbahan Rashidi-Tabrizi, Daniel Amyot, Igor Nikiforov, and Etienne
Tremblay.

## Release Notes

### Help

  - End-user documentation is integrated with the Eclipse help system.
    `Access Help > Help Contents` from the Eclipse workbench, then
    select topic `jUCMNav Online Help`.
  - The latest user documentation can also be accessed via HelpOnLine

### Reporting Bugs / Usability Requests

  - Send your bug reports to jucmnav-dev@softwareengineering.ca.
  - Include reproduction steps, sample .jucm files and, if applicable,
    copy-paste the error log messages.
  - If you're zealous enough, we'll create a
    [BugZilla](http://jucmnav.softwareengineering.ca/bugzilla/) account
    for you :)

### Enhancements / Fixes since 5.2.0

| Bug                                                                       | Description                                                                               |
| :------------------------------------------------------------------------ | :---------------------------------------------------------------------------------------- |
| [563](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=563) | RTF export has small images (v5.3)                                                        |
| [777](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=777) | GRL visualization of trends (v5.4)                                                        |
| [808](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=808) | GUI for managing model tags (v5.4)                                                        |
| [813](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=813) | Extract translatable strings from HTMLReport (v5.3)                                       |
| [851](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=851) | Navigate to (other) references of a definition/reference (v5.4)                           |
| [872](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=872) | Satisfaction of an actor becomes hidden after "Delete Initial Evaluation" (v5.3)          |
| [875](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=875) | Add URN Model Name to Reports (v5.3)                                                      |
| [876](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=876) | Add Diagram Options in Report Preferences (v5.3)                                          |
| [877](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=877) | HTML report displays all of the report folder's content in Explorer (v5.3)                |
| [878](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=878) | Fix broken links in HTML report (v5.3)                                                    |
| [879](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=879) | Remove "Report prefix" option in the Report Gen. Wizard for HTML reports (v5.3)           |
| [881](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=881) | Standardize date-time strings in reports (v5.3)                                           |
| [882](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=882) | Enable/disable preferences depending on the preferences checked (v5.3)                    |
| [883](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=883) | GRL strategies in reports should be ordered alphabetically (v5.3)                         |
| [885](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=885) | Error generated when preference text box is left empty (v5.3)                             |
| [886](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=886) | Maps are not filtered when generating report in PDF (v5.3)                                |
| [887](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=887) | Display strategy description in the GRL strategy legend (v5.3)                            |
| [888](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=888) | Unnecessary blank pages generated in pdf/rtf reports (v5.3)                               |
| [889](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=889) | Add Scenario Description to Reports (v5.3)                                                |
| [890](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=890) | Warn user before overwriting a file (v5.3)                                                |
| [891](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=891) | Reporting scenario/strategy evaluation information (v5.3)                                 |
| [892](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=892) | UCM Scenario execution summary (v5.3)                                                     |
| [893](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=893) | Display variable initializations in tabular format (v5.3)                                 |
| [894](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=894) | Remove unnecessary subsections in Scenario Documentation section (v5.3)                   |
| [895](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=895) | Add ability to generate reports using all standard paper sizes (v5.3)                     |
| [896](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=896) | Display UCM menus properly in HTML reports when a multi-level hierarchy is present (v5.3) |
| [901](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=901) | Metadata indication symbol no longer shows up (v5.3)                                      |
| [902](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=902) | Show repetition count in responsibility label (v5.3)                                      |
| [903](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=903) | Update jUCMNav's help (v5.3)                                                              |
| [904](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=904) | Invalid Thread Access error when generating reports (v5.4)                                |
| [905](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=905) | bug with problems view clicking (v5.4)                                                    |

For enhancements and fixes since previous releases, please refer to the
release notes of the [Previous Releases](PreviousReleases).

### Known Issues in 5.4.0

  - MSC Viewer and user documentation only available in English (GUI,
    models and reports are however multi-lingual)
  - When changing a few of the preferences, one must sometimes close &
    re-open a model for the change to have an impact on the editor.
  - The UCM traversal mechanism does not take into consideration
    advanced stubs, failures, aspect-oriented extensions, and some other
    attributes.
  - Aspect-oriented GRL is not yet supported.
  - **Does not work on Eclipse 4.2 Juno**. The next release will (in a
    few days).
