# jUCMNav v2.4.1

<img align="right" src="img/LogoFinal.gif">

<span class="twiki-macro TOC"></span>

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

  - [Download v2.4.1
    here](http://jucmnav.softwareengineering.ca/jucmnav/artifacts/seg.jUCMNav/2.4.1/seg.jUCMNav_2.4.1.jar)
    (jar).
      - \<font color=red\>Make sure your browser doesn't rename the .jar
        file to .zip or anything else.\</font\>
  - [Other files (src,
    javadoc)](http://jucmnav.softwareengineering.ca/jucmnav/artifacts/seg.jUCMNav/2.4.1/)

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
      - jUCMNav 2.4 requires Eclipse 3.2
          - jUCMNav 2.4 is the last version of jUCMNav to support
            Eclipse 3.2. jUCMNav 3.0 to be released later this summer
            will require Eclipse 3.3.
      - We recommend you download the Eclipse SDK.
          - [Eclipse 3.2](http://www.eclipse.org/downloads/download.php?file=/eclipse/downloads/drops/R-3.2-200606291905/eclipse-SDK-3.2-win32.zip)
  - The Graphical Editing Framework
      - jUCMNav 2.4 requires GEF 3.2
      - We recommend you download the SDK or runtime.
          - [GEF 3.2](http://www.eclipse.org/downloads/download.php?file=/tools/gef/downloads/drops/R-3.2-200606270816/GEF-ALL-3.2.zip)
      - This can be installed through the Eclipse update function,
        select the "Callisto discovery site" update site already listed.
  - The Eclipse Modeling Framework (EMF and SDO)
      - jUCMNav 2.4 requires EMF/SDO 2.2
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
  - Additional help for [DOORS
    Export](http://jucmnav.softwareengineering.ca/twiki/bin/view/ProjetSEG/DoorsExport)
    is available
  - Additional help for [CSM
    Export](http://jucmnav.softwareengineering.ca/twiki/bin/view/ProjetSEG/CsmExport)
    is available

### Reporting Bugs / Usability Requests

  - Send your bug reports to \<a
    href="[mailto:jucmnav-dev@softwareengineering.ca](mailto:jucmnav-dev@softwareengineering.ca)"\><jucmnav-dev@softwareengineering.ca>\</a\>.
  - Include reproduction steps, sample .jucm files and, if applicable,
    copy-paste the error log messages.
  - If you're zealous enough, we'll create a BugZilla account for you :)

### Enhancements / Fixes since 2.4.0

  - New icons for the Outline and Strategy/Scenario views\!
  - Fixed bug 459: Now possible to add a new UCM and/or GRL diagram in
    the New File wizard. If none is selected, a UCM diagram will be
    added anyway.
  - Fixed bug 532: Edit policies now prevent the deletion of the last
    (UCM or GRL) diagram.
  - Upgraded the French version of jUCMNav.

### Enhancements / Fixes since 2.3.0

  - [Core Scenario Model (CSM)
    Export](http://jucmnav.softwareengineering.ca/twiki/bin/view/ProjetSEG/CsmExport)
    and more performance annotations
  - Small issue where Scenario traversal complained about not having a
    valid parent.
  - Various bug fixes and enhancements in the MSC Export and MSC Viewer.
  - Duplicate map / grl diagram now sets IDs for the new elements.
  - Pointcut stubs and concern management for Aspect-Oriented URN. Work
    in progress.
  - New preference for enabling/disabling the automatic addition of
    existing links when dragging GRL intentional elements from the
    outline.
  - Major cleanup of SWT handles that were created and caused
    application to crash on Windows after intensive usage. (Sleak plugin
    was very useful)
  - New collapse default for outlines for improved scalability.

### Known Issues in 2.4.1

  - Autolayout still a prototype
  - User documentation not translated yet.
  - User documentation only partially reflects integration of GRL and
    scenarios.
  - There are no extension points to give your own scenario/strategy
    algorithms and no UI to choose them.
  - Visibility of GRL contribution icons and text now can be set via
    jUCMNav's main preference page, but open editors are not
    automatically updated. You need to reload the model.
  - Memory leak. With very large diagrams (30+ complex maps), you might
    only be able to open it half a dozen times before you run out of
    memory. Restart Eclipse to clean memory or increase JVM heap space
    until we find the memory leak source.
  - If you have anything other than a UCM selected in the new file
    wizard, the UCEd import and the MSC export will not function
    properly.

\-- Main.DanielAmyot - 24 Jul 2007
