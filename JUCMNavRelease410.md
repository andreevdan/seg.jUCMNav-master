# jUCMNav v4.1.0

<img align = "right" src="img/LogoFinal.gif">

## Enhancements Highlights\!

  - <span class="twiki-macro N"></span> Menu/Keyboard driven selection
    of importance and satisfaction values for GRL intentional elements
  - <span class="twiki-macro N"></span> Major enhancements to the
    handling of user-defined [semantic rules and
    metrics](SemanticVerification)
  - <span class="twiki-macro N"></span> Default sets of [76
    rules](PredefinedSemanticsRulesOverview) and [29
    metrics](PredefinedMetricsOverview), with groups
  - Improved report generation, with unified preference page and wizard,
    and more complete reports

## Video Overviews

**IMPORTANT**: If you have not yet looked at the enhancements of version
4.0.0, please visit these [video
overviews](JUCMNavRelease400#Video_Overviews).

### Selection of GRL Importance/Evaluation Values

### Management and Usage of Semantic Rules and of Metrics

**Preference pages**

<OBJECT CLASSID="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000"
WIDTH="656" HEIGHT="496"
CODEBASE="<http://active.macromedia.com/flash5/cabs/swflash.cab#version=7,0,0,0>"\>
<PARAM NAME=movie VALUE="%ATTACHURL%/PreferencesRules.swf"\> <PARAM
NAME=play VALUE=true\> <PARAM NAME=loop VALUE=true\> <PARAM NAME=wmode
VALUE=transparent\> <PARAM NAME=quality VALUE=high\> <EMBED
src="%ATTACHURL%/PreferencesRules.swf" WIDTH=852 HEIGHT=557 quality=high
loop=true wmode=transparent TYPE="application/x-shockwave-flash"
PLUGINSPAGE="<http://www.macromedia.com/shockwave/download/index.cgi?P1_Prod_Version=ShockwaveFlash>"\>
</EMBED\></OBJECT\>

**Menu-driven evaluation, and Problems view**

<OBJECT CLASSID="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000"
WIDTH="656" HEIGHT="496"
CODEBASE="<http://active.macromedia.com/flash5/cabs/swflash.cab#version=7,0,0,0>"\>
<PARAM NAME=movie VALUE="%ATTACHURL%/RulesMetricsEvaluation.swf"\>
<PARAM NAME=play VALUE=true\> <PARAM NAME=loop VALUE=true\> <PARAM
NAME=wmode VALUE=transparent\> <PARAM NAME=quality VALUE=high\> <EMBED
src="%ATTACHURL%/RulesMetricsEvaluation.swf" WIDTH=688 HEIGHT=682
quality=high loop=true wmode=transparent
TYPE="application/x-shockwave-flash"
PLUGINSPAGE="<http://www.macromedia.com/shockwave/download/index.cgi?P1_Prod_Version=ShockwaveFlash>"\>
</EMBED\> </OBJECT\>

### Report Generation Preferences

[[img/ReportGenerationPreferences.png]]


## Thanks!

[Contributors](http://www.ohloh.net/p/11712/contributors) to this
release included Andrew Miga, Daniel Amyot, Alireza Pourshahid, Jason
Kealey and Gunter Mussbacher. Funding was provided by NSERC/CIHR
(Collaborative Health Research Project).

\----

## Download

### Update site (recommended)

  - In Eclipse: Help -\> Software Updates -\> Find and Install -\>
    Search for new features to install -\> New remote site:
      - Name: jUCMNav
      - URL: <http://jucmnav.softwareengineering.ca/jucmnav/updatesite/>
  - See the animated InstallationDemo (for Eclipse 3.5)
  - **Important Notes**
      - On Eclipse 3.4, select both the new *jUCMNav* update site
        **and** the *Europa Discovery Site*
      - Using the update site is needed if you want the MSC Viewer
        plugin to be installed properly. Afterwards, the jUCMNav and MSC
        Viewer plugins can be updated manually from binaries.
      - Eclipse does not allow automatic upgrades between major
        revisions. jUCMNav v3.\* will need to be uninstalled before
        proceeding with the installation of jUCMNav v4.\*

### From binaries (not recommended)

  - [Download v4.1.0
    here](http://jucmnav.softwareengineering.ca/jucmnav/artifacts/seg.jUCMNav/4.1.0/seg.jUCMNav_4.1.0.jar)
    (jar).
      - <font color=red\>Make sure your browser does not rename the
        .jar file to .zip or anything else.</font\>
  - [Source
    files](http://jucmnav.softwareengineering.ca/jucmnav/artifacts/seg.jUCMNav/4.1.0/)
  - Download and install all prerequisites, then copy the jar file into
    your /eclipse/plugins/ directory. Restart Eclipse.
  - If you've installed jUCMNav from a latest build instead of an
    official release, make sure you remove the latest builds.

\----

## Requirements

### Operating Systems

  - Windows XP (tested) :check:
  - Linux (tested) :check:
  - MacOS X (tested) :check:
  - Any other O/S on which you can run [Eclipse](http://www.eclipse.org)
    (currently untested - please report your success)

### JDK

  -  J2SE 5.0 (1.5) or 6.0 (1.6) at
    <http://java.sun.com/javase/downloads/index.jsp>

### Eclipse

  - Version
      - jUCMNav 4.1 requires Eclipse 3.4 or Eclipse 3.5
  - Distributions
      - We recommend the installation of Eclipse Classic 3.5.x or
        Eclipse Modeling Tools available at
        <http://www.eclipse.org/downloads/>
  - Plug-ins required for running jUCMNav
      - jUCMNav 4.1 requires the Eclipse EMF, GEF, JDT, RPC, OCL, and
        Platform plugins.
      - Users should use the jUCMNav update site to get these
        dependencies automatically.
      - Otherwise, they can be obtained from the Eclipse Projects Update
        Site or from their [respective
        projects](http://www.eclipse.org/projects/listofprojects.php)
  - \[Optional\] Additional plug-ins required for compiling jUCMNav
      - PDE and
        [WTP 2.0](http://download.eclipse.org/webtools/downloads/)

### GraphViz

  - GraphViz (dot) is required for the diagram autolayout feature.
  - <http://graphviz.org/Download.php>

\----

## Release Notes

### Installation

  - For more in-depth information and a guide about installation of
    prerequisites, see DevDocDeployment.
  - For complete notes and troubleshooting, see: JUCMNavDeployment

### Help

  - End-user documentation is integrated with the Eclipse help system.
    `Access Help > Help Contents` from the Eclipse workbench, then
    select topic `jUCMNav Online Help`.
  - The latest user documentation can also be accessed via HelpOnLine

### Reporting Bugs / Usability Requests

  - Send your bug reports to <a
    href="[mailto:jucmnav-dev@softwareengineering.ca](mailto:jucmnav-dev@softwareengineering.ca)"\><jucmnav-dev@softwareengineering.ca></a\>.
  - Include reproduction steps, sample .jucm files and, if applicable,
    copy-paste the error log messages.
  - If you're zealous enough, we'll create a
    [BugZilla](http://jucmnav.softwareengineering.ca/bugzilla/) account
    for you :)

### Enhancements / Fixes since 4.0.0

  - <span class="twiki-macro N"></span> Major **usability enhancements
    for GRL intentional elements**
      - Menu-driven selection of quantitative/qualitative importance
        values
      - Menu-driven selection of quantitative/qualitative initial
        satisfaction values in a selected strategy
      - Interactive, keyboard-driven increase/decrease of satisfaction
        values in a selected strategy
  - <span class="twiki-macro N"></span> Major enhancements to the
    handling of user-defined semantic rules and metrics
      - Improved GUI for rules/metrics management
          - Double-click support
          - Distinction between warnings and errors for rules
          - More robust checks during exports
      - <span class="twiki-macro N"></span> **[76 selectable rules for
        static semantics checking](PredefinedSemanticsRulesOverview)**
        in 8 groups
          - GRL Consistency Completeness
          - UCM Consistency Completeness
          - URN Features for Software Product Lines
          - URN iStar Profile
          - URN Layout and Overlaps
          - URN Styles for Names and Descriptions
          - URN Unused Elements
          - URN Value Ranges
      - <span class="twiki-macro N"></span> **[29 selectable
        size/complexity metrics for URN
        models](PredefinedMetricsOverview)** in 3 groups (GRL, UCM,
        Aspects)
      - <span class="twiki-macro N"></span> Library of **[119 predefined
        OCL
        functions](http://jucmnav.softwareengineering.ca/ucm/pub/ProjetSEG/SemanticVerification/library.ocl)**
        for querying URN models
  - Improved **report generation**
      - Unified preference page for reporting
      - Reports in PDF/RTF/HTML from the same Report Wizard
      - <span class="twiki-macro N"></span> More complete set of UCM/GRL
        elements in the reports
          - Including GRL elements, metadata and URN links
  - Clearer Export Wizard

<!-- end list -->

  - Various bugs and UI-related issues:

|                                                                                        Bug |                                                                          Description |
| -----------------------------------------------------------------------------------------: | -----------------------------------------------------------------------------------: |
| [695](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=695) | Undoing the deletion of a GRL diagram while evaluating strategies cause an exception |
| [698](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=698) |   UCM variable enumeration bug |
| [700](http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=700) |  GRL evaluation label not long enough |
| <a href="<http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=708>"\>708</a\> |  Add more default rules/metrics |
| <a href="<http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=709>"\>709</a\> |   Strategy/Scenario View not notified of file closed |
| <a href="<http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=710>"\>710</a\> |          Cannot rename groups rules/metrics, and exporting does not ask confirmation |
| <a href="<http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=711>"\>711</a\> |          Rules should be categorizable as errors or warnings, with appropriate icons |
| <a href="<http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=712>"\>712</a\> |                Metrics editor should not have a context String or a warning checkbox |
| <a href="<http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=713>"\>713</a\> |                                         Null Pointer Exceptions in tabbed properties |
| <a href="<http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=714>"\>714</a\> |               Null Pointer Exceptions when using intentional element with blank name |
| <a href="<http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=715>"\>715</a\> |                                           Event loop exception when adding a diagram |

### Enhancements / Fixes since 3.2.1

  - <span class="twiki-macro N"></span> Major usability enhancements.
      - <span class="twiki-macro N"></span> \*Copy-paste support\*
          - Copy-paste elements within the same model.
          - Copy-paste elements to another model.
          - Copy-paste elements to a graphic editor or word processor.
          - UCM Limitation: UCM path segments cannot be copied.
          - GRL Limitation: GRL links are only pasted when one node is
            pasted at a time.
      - <span class="twiki-macro N"></span> **Added palette shortcut
        keys**
      - Improved numerous icons
      - Improved numerous tool tips.
      - Improved numerous pop-ups, preference pages and wizards
      - Improved contextual help
      - Improved contextual menus (including new element insertions,
        changing colors, etc.)
      - <span class="twiki-macro N"></span> Property page improvements
          - **Tabbed property sheet - simplified editing for common
            scenarios**
      - <span class="twiki-macro N"></span> Outline improvements
          - Show/hide empty points, direction arrows, element ids.
          - Outline filtering by keyword
          - Customizable outline sort
      - <span class="twiki-macro N"></span> Improved definition
        management
          - Action to delete unreferenced definitions.
          - Preferences - automatically delete definition after deleting
            last reference?
      - <span class="twiki-macro N"></span> Added definition **name
        auto-complete** inside editors
      - <span class="twiki-macro N"></span> Added **search within
        model** menu item
  - <span class="twiki-macro N"></span> **Metamodel changes**: Added
    support for a comment element, waiting place WaitKind, GRL XOR
    decomposition types, and Component Bindings

<!-- end list -->

  - Various bugs and UI-related issues:

|                                                                                        Bug |                                                                                                 Description |
| -----------------------------------------------------------------------------------------: | ----------------------------------------------------------------------------------------------------------: |
| <a href="<http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=553>"\>553</a\> | Deleting a map whose start point is referenced in a scenario definition causes saving the file to complain. |
| <a href="<http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=654>"\>654</a\> |                                                                             Change enumeration type problem |
| <a href="<http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=665>"\>665</a\> |                                     Clicking on a label should edit it even when a palette item is selected |
| <a href="<http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=348>"\>348</a\> |                                                          Description property should be a multiline textbox |
| <a href="<http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=684>"\>684</a\> |                                                                         Move map when dragging from outline |
| <a href="<http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=389>"\>389</a\> |                                                                                   Undo-redo in element view |
| <a href="<http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=693>"\>693</a\> |                                                               Could not add timeout-path to connected timer |
| <a href="<http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=694>"\>694</a\> |                                              Bug with shared UCM/GRL variables when GRL was not initialized |
| <a href="<http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=583>"\>583</a\> |                                                      Duplicate strategy now works for pre-3.1.0 .jucm files |
| <a href="<http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=687>"\>687</a\> |                                                                         Improved feedback in GRL strategies |
| <a href="<http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=664>"\>664</a\> |                                                                   Default contribution value should be Help |
| <a href="<http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=636>"\>636</a\> |                                               Now able to drag-and-drop a direction arrow on an empty point |
|                                                                                    various |                                                                   Bugs with deletion, unit test fixes, etc. |

### Known Issues in 4.1.0

  - Reports generated, MSC Viewer, and user documentation only available
    in English.
  - User documentation not up to date.
  - Visibility of GRL contribution icons and text now can be set via
    jUCMNav's main preference page, but open editors are not
    automatically updated. You need to reload the model or refresh with
    the strategy view.
  - There are no extension points to give your own scenario/strategy
    algorithms and no UI to choose them.
  - Memory leak. With very large diagrams (30+ complex maps), you might
    only be able to open it half a dozen times before you run out of
    memory. Restart Eclipse to clean memory or increase JVM heap space
    until we find the memory leak source.

\-- Main.DanielAmyot - 14 Nov 2009
