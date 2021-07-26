# jUCMNav v4.0.0

<img align = "right" src="img/LogoFinal.gif">


## Enhancements\!

  - <span class="twiki-macro N"></span> Major usability enhancements.
      - **Copy-paste** support\! (intra-model, inter-model, and to
        graphic editors / word processors)
      - Palette: Added shortcut keys.
      - Properties; **Tabbed properties** - simplified editing for
        common scenarios
      - Outline: Customizable filter, sort
      - Improved definition management, with a new view
      - Search within model
      - Name completion
      - New icons
  - <span class="twiki-macro N"></span> **Metamodel changes**: Added
    support for a comment element, waiting place WaitKind, GRL XOR
    decomposition types, and Component Bindings

### Video Overviews

#### Copy Paste



#### Comment Boxes


#### Tabbed Properties


#### Model Search

#### New Outline View for Definitions (D)

[[img/OutlineNew.jpg]]


#### Outline Filtering/Sorting Peferences

[[img/Outline-Prefs.jpg]]

## Thanks!

[Contributors](http://www.ohloh.net/p/11712/contributors) to this
release included Jason Kealey, Jean-François Roy, Etienne Tremblay,
Anisur Rahman, Gunter Mussbacher and Daniel Amyot. Many thanks to
[HengSoft](http://www.hengsoft.net) and particularly Thomas Weigert for
funding part of this new relase. Additional funding was provided by
NSERC (Discovery and Postgraduate Scholarship grants) and by NSERC/CIHR
(Collaborative Health Research Project).

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

  - [Download v4.0.0
    here](http://jucmnav.softwareengineering.ca/jucmnav/artifacts/seg.jUCMNav/4.0.0/seg.jUCMNav_4.0.0.jar)
    (jar).
      - \<font color=red\>Make sure your browser does not rename the
        .jar file to .zip or anything else.\</font\>
  - [Source
    files](http://jucmnav.softwareengineering.ca/jucmnav/artifacts/seg.jUCMNav/4.0.0/)
  - Download and install all prerequisites, then copy the jar file into
    your /eclipse/plugins/ directory. Restart Eclipse.
  - If you've installed jUCMNav from a latest build instead of an
    official release, make sure you remove the latest builds.

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
      - jUCMNav 4.0 requires Eclipse 3.4 or Eclipse 3.5
  - Distributions
      - We recommend the installation of Eclipse Classic 3.5.x or
        Eclipse Modeling Tools available at
        <http://www.eclipse.org/downloads/>
  - Plug-ins required for running jUCMNav
      - jUCMNav 4.0 requires the Eclipse EMF, GEF, JDT, RPC, OCL, and
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

  - Send your bug reports to \<a
    href="[mailto:jucmnav-dev@softwareengineering.ca](mailto:jucmnav-dev@softwareengineering.ca)"\><jucmnav-dev@softwareengineering.ca>\</a\>.
  - Include reproduction steps, sample .jucm files and, if applicable,
    copy-paste the error log messages.
  - If you're zealous enough, we'll create a
    [BugZilla](http://jucmnav.softwareengineering.ca/bugzilla/) account
    for you :)

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
      - <span class="twiki-macro N"></span> **Added definition name
        auto-complete inside editors**
      - <span class="twiki-macro N"></span> **Added search within model
        menu item**
  - <span class="twiki-macro N"></span> **Metamodel changes: Added
    support for a comment element, waiting place WaitKind, GRL XOR
    decomposition types, and Component Bindings**

<!-- end list -->

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
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=553">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=553</a>"&gt;553&lt;/a&gt;</td>
<td style="text-align: right;">Deleting a map whose start point is referenced in a scenario definition causes saving the file to complain.</td>
</tr>
<tr class="even">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=654">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=654</a>"&gt;654&lt;/a&gt;</td>
<td style="text-align: right;">Change enumeration type problem</td>
</tr>
<tr class="odd">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=665">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=665</a>"&gt;665&lt;/a&gt;</td>
<td style="text-align: right;">Clicking on a label should edit it even when a palette item is selected</td>
</tr>
<tr class="even">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=348">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=348</a>"&gt;348&lt;/a&gt;</td>
<td style="text-align: right;">Description property should be a multiline textbox</td>
</tr>
<tr class="odd">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=684">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=684</a>"&gt;684&lt;/a&gt;</td>
<td style="text-align: right;">Move map when dragging from outline</td>
</tr>
<tr class="even">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=389">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=389</a>"&gt;389&lt;/a&gt;</td>
<td style="text-align: right;">Undo-redo in element view</td>
</tr>
<tr class="odd">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=693">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=693</a>"&gt;693&lt;/a&gt;</td>
<td style="text-align: right;">Could not add timeout-path to connected timer</td>
</tr>
<tr class="even">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=694">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=694</a>"&gt;694&lt;/a&gt;</td>
<td style="text-align: right;">Bug with shared UCM/GRL variables when GRL was not initialized</td>
</tr>
<tr class="odd">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=583">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=583</a>"&gt;583&lt;/a&gt;</td>
<td style="text-align: right;">Duplicate strategy now works for pre-3.1.0 .jucm files</td>
</tr>
<tr class="even">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=687">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=687</a>"&gt;687&lt;/a&gt;</td>
<td style="text-align: right;">Improved feedback in GRL strategies</td>
</tr>
<tr class="odd">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=664">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=664</a>"&gt;664&lt;/a&gt;</td>
<td style="text-align: right;">Default contribution value should be Help</td>
</tr>
<tr class="even">
<td style="text-align: right;">&lt;a href="<a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=636">http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=636</a>"&gt;636&lt;/a&gt;</td>
<td style="text-align: right;">Now able to drag-and-drop a direction arrow on an empty point</td>
</tr>
<tr class="odd">
<td style="text-align: right;">various</td>
<td style="text-align: right;">Bugs with deletion, unit test fixes, etc.</td>
</tr>
</tbody>
</table>

### Known Issues in 4.0.0

  - Reports generated, MSC Viewer, and user documentation only available
    in English.
  - User documentation not up to date.
  - Reports do not include information on GRL elements or UCM scenario
    definitions (and MSCs)
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

\-- Main.JasonKealey - 30 Sep 2009
