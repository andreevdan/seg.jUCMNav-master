# jUCMNav v3.0.0

<img align = "right" src="img/LogoFinal.gif">




## Download

### Update site (recommended)

  - In Eclipse: Help, Software Updates, Find and Install, Search for new
    features to install, New remote site:
      - Name: jUCMNav
      - URL: <http://jucmnav.softwareengineering.ca/jucmnav/updatesite/>
      - **Note:** Using the update site is required if you want the MSC
        Viewer plugin to be installed properly. Afterwards, the jUCMNav
        and MSC Viewer plugins can be updated manually from binaries.
      - **Note 2:** Eclipse does not allow automatic upgrades between
        major revisions. jUCMNav v2.\* will need to be uninstalled
        before proceeding with the installation of jUCMNav v3.\*

### From binaries (not recommended)

  - [Download v3.0.0
    here](http://jucmnav.softwareengineering.ca/jucmnav/artifacts/seg.jUCMNav/3.0.0/seg.jUCMNav_3.0.0.jar)
    (jar).
      - \<font color=red\>Make sure your browser doesn't rename the .jar
        file to .zip or anything else.\</font\>
  - [Other files (src,
    javadoc)](http://jucmnav.softwareengineering.ca/jucmnav/artifacts/seg.jUCMNav/3.0.0/)

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
      - jUCMNav 3.0 requires Eclipse 3.3
          - jUCMNav 3.0.0 still functions properly on Eclipse 3.2, the
            only minor feature which does not work is PNG export.
      - We recommend you download the **Obeo** distribution of Eclipse;
        the [Europa Modelling
        bundle](http://www.obeo.fr/eclipse-download.php) already comes
        with GEF and EMF.
  - The Graphical Editing Framework
      - jUCMNav 3.0 requires GEF 3.3
      - We recommend you download the SDK or runtime.
          - [GEF 3.3](http://download.eclipse.org/tools/gef/downloads/)
      - This can be installed through the Eclipse update function,
        select the "Europa discovery site" update site already listed.
  - The Eclipse Modeling Framework (EMF and SDO)
      - jUCMNav 3.0 requires EMF/SDO 2.3
          - [EMF 2.3.0](http://www.eclipse.org/modeling/emf/downloads/?project=emf)
      - We recommend you download the SDK or runtime, but make sure you
        get EMF and SDO; the plugin will not work otherwise.
      - This can be installed through the Eclipse update function,
        select the "Europa discovery site" update site already listed.
  - The Web Tools Platform (WTP) <span class="twiki-macro N"></span>
      - jUCMNav 3.0 requires WTP 2.0 for use of the new Key Performance
        Indicator (KPI) features.
          - [WTP 2.0](http://download.eclipse.org/webtools/downloads/)
  - \[Optional\] GraphViz dot
      - For autolayout purposes, you may want to download GraphViz dot.
      - <http://graphviz.org/Download.php>

## Release Notes

### Installation

  - For complete notes and troubleshooting, see: JUCMNavDeployment

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

### Enhancements / Fixes since 2.4.1

\* Key Performance Indicator (KPI) modelling and monitoring support. \*
Strong improvements to generated MSC validity and robustness. \*
Enhancements to the MSC visualization engine. MSCs now more compact. \*
Fixed issue with MSC export not working depending on new jUCM file
wizard \* Various minor UI-related issues. \* Export diagrams to PNG
(finally) \* Prototype integration between GRL strategies and UCM
scenarios \* Upgraded the French version of jUCMNav.

### Known Issues in 3.0.0

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

\-- Main.JasonKealey - 22 Aug 2007
