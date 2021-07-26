# jUCMNav v2.3.0

<img align = "right" src="img/LogoFinal.gif">



## Download

### Update site

  - In Eclipse: Help, Software Updates, Find and Install, Search for new
    features to install, New remote site:
      - Name: jUCMNav
      - URL: <http://jucmnav.softwareengineering.ca/jucmnav/updatesite/>
      - **Note:** Using the update site is required if you want the MSC
        Viewer plugin to be installed properly. Afterwards, the jUCMNav
        and MSC Viewer plugins can be updated manually from binaries.

### From binaries

  - [Download v2.3.0
    here](http://jucmnav.softwareengineering.ca/jucmnav/artifacts/seg.jUCMNav/2.3.0/seg.jUCMNav_2.3.0.jar)
    (jar).
      - \<font color=red\>Make sure your browser doesn't rename the .jar
        file to .zip or anything else.\</font\>
  - [Other files (src,
    javadoc)](http://jucmnav.softwareengineering.ca/jucmnav/artifacts/seg.jUCMNav/2.3.0/)

## Requirements

### Operating Systems

  - Windows XP (tested) :check:
  - Linux (tested) :check:
  - MacOS X (tested) :check:
  - Any other O/S on which you can run [Eclipse](http://www.eclipse.org)
    (currently untested - please report your success)

### JDK

  - [J2SE 5.0 (1.5)](http://java.sun.com/j2se/1.5.0/index.jsp)

### Prerequisites

  - For more in-depth information and a guide about installation of
    prerequisites, see DevDocDeployment.
  - Eclipse
      - jUCMNav 2.3 requires Eclipse 3.2
      - We recommend you download the Eclipse SDK.
          - [Eclipse 3.2](http://www.eclipse.org/downloads/download.php?file=/eclipse/downloads/drops/R-3.2-200606291905/eclipse-SDK-3.2-win32.zip)
  - The Graphical Editing Framework
      - jUCMNav 2.3 requires GEF 3.2
      - We recommend you download the SDK or runtime.
          - [GEF 3.2](http://www.eclipse.org/downloads/download.php?file=/tools/gef/downloads/drops/R-3.2-200606270816/GEF-ALL-3.2.zip)
      - This can be installed through the Eclipse update function,
        select the "Callisto discovery site" update site already listed.
  - The Eclipse Modeling Framework (EMF and SDO)
      - jUCMNav 2.3 requires EMF/SDO 2.2
          - [EMF 2.2.0](http://www.eclipse.org/downloads/download.php?file=/tools/emf/downloads/drops/2.2.0/R200606271057/emf-sdo-xsd-SDK-2.2.0.zip)
      - We recommend you download the SDK or runtime, but make sure you
        get EMF and SDO; the plugin will not work otherwise.
      - This can be installed through the Eclipse update function,
        select the "Callisto discovery site" update site already listed.
  - \[Optional\] GraphViz dot
      - For autolayout purposes, you may want to download GraphViz dot.
      - <http://graphviz.org/Download.php>

## Release Notes

### Installation

From update site:  

  - In Eclipse: Help, Software Updates, Find and Install, Search for new
    features to install, New remote site:
      - Name: jUCMNav
      - URL: <http://jucmnav.softwareengineering.ca/jucmnav/updatesite/>

From binaries:  

  - Download and install all prerequisites, then copy the jar file into
    your /eclipse/plugins/ directory. Restart Eclipse.
  - If you've installed jUCMNav from a latest build instead of an
    official release, make sure you remove the latest builds.

### Help

  - End-user documentation is integrated with the Eclipse help system.
    `Access Help > Help Contents` from the Eclipse workbench, then
    select topic `jUCMNav Online Help`.

### Reporting Bugs / Usability Requests

  - Send your bug reports to \<a
    href="[mailto:jucmnav-dev@softwareengineering.ca](mailto:jucmnav-dev@softwareengineering.ca)"\><jucmnav-dev@softwareengineering.ca>\</a\>.
  - Include reproduction steps, sample .jucm files and, if applicable,
    copy-paste the error log messages.
  - If you're zealous enough, we'll create a BugZilla account for you :)

### Enhancements / Fixes since 2.2.2

  - Metadata on all URN model elements (see the URNMetaModel)
      - You can define your own metadata on any path node, intentional
        element, etc. These string / value pairs are intended to be used
        when writing your own custom plug-in to jUCMNav that needs extra
        information to do its job. An example would be a test case
        exporter which would require a few setup parameters to drive the
        output.
      - Many thanks to Pengfei Chen for this addition\!
  - Scenarios
      - Traversal algorithm is now more robust, supports multiple
        threads, knows about the component context in which a path node
        is being run.
      - Hit count no longer algorithm dependant.
      - Created infrastructure to support:
          - Scenario Traversal Listeners
          - Other scenario traversal algorithms (strategy design
            pattern)
  - Added export to MSC plug-in to jUCMNav.
      - Based on the work done by Daniel Amyot and [Ali
        Echihabi](http://www.site.uottawa.ca/~damyot/students/index.shtml)
        for UCMNav.
      - Actually exports to \*.jucmscenarios, the XML serialization of
        an [EMF-based
        meta-model](http://jucmnav.softwareengineering.ca/twiki/bin/view/ProjetSEG/URNMetaModel#UCM_Scenarios_Metamodel)
        which clean-ups up the XSLT-related elements required by
        UCMExporter
      - It can also export its intermediate steps as a \*.jucm file
        representing a flattened UCM and another \*.jucm file
        representing the well-formed (in terms of concurrency) linear
        representation.
  - Now packaged with an MSC Viewer (written by [Alex Boyko, Tolik
    Boyko, Max Kovalenkov, and Tafiqul Abumohammad, CSI 4900
    (Winter 2005)](http://www.site.uottawa.ca/~damyot/students/index.shtml))
      - Plus a few bug fixes and a new import layer to support
        \*.jucmscenarios.
  - New feature: run all scenarios in group. You can now check the
    coverage of a group of scenarios with a simple click.
  - Duplicate UCM / GRL diagrams.
  - Connects were not always properly deleted, preventing files from
    being re-opened (Thank you Mathieu Bertrand, Gabriel Craig Lanoix,
    and Daniel Amyot for the lenghty debugging).
  - Visibility of GRL contribution icons and text now can be set via
    jUCMNav's main preference page. (partial resolution) (Thank you
    Daniel Amyot)
  - Misc bug fixes, usability enhancements, code cleanup.

### Known Issues in 2.3.0

  - Autolayout still a prototype
  - User documentation not translated yet.
  - User documentation only partially reflects integration of GRL and
    scenarios.
  - Duplicate map / grl diagram does not set IDs for the new elements.
  - There are no extension points to give your own scenario/stategy
    algorithms and no UI to choose them.
  - Visibility of GRL contribution icons and text now can be set via
    jUCMNav's main preference page, but open editors are not
    automatically updated. You need to reload the model.
  - Bug in export to MSC: If none of your scenario elements are not
    contained inside a component reference, the exported MSC will fail
    to open. Workaround: associate at least one of your responsibilities
    to a component reference.
      - The generated "Environment" component dissapeared if it did not
        communicate with another component, even if it contained
        elements such as responsibilities.

\-- Main.JasonKealey - 26 Jan 2007
