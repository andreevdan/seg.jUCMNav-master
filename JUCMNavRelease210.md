# jUCMNav v2.1.0

## Download

### Update site

  - In Eclipse: Help, Software Updates, Find and Install, Search for new
    features to install, New remote site:
      - Name: jUCMNav
      - URL: <http://jucmnav.softwareengineering.ca/jucmnav/updatesite/>

### From binaries

  - [Download v2.1.0
    here](http://jucmnav.softwareengineering.ca/jucmnav/artifacts/seg.jUCMNav/2.1.0/seg.jUCMNav_2.1.0.jar)
    (jar).
      - \<font color=red\>Make sure your browser doesn't rename the .jar
        file to .zip or anything else.\</font\>
  - [Other files (src,
    javadoc)](http://jucmnav.softwareengineering.ca/jucmnav/artifacts/seg.jUCMNav/2.1.0/)

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
    prerequisites, see [Dev Doc Deployment](DevDocDeployment).
  - Eclipse
      - jUCMNav 2.1 requires Eclipse 3.2
      - We recommend you download the Eclipse SDK.
          - [Eclipse 3.2](http://www.eclipse.org/downloads/download.php?file=/eclipse/downloads/drops/R-3.2-200606291905/eclipse-SDK-3.2-win32.zip)
  - The Graphical Editing Framework
      - jUCMNav 2.1 requires GEF 3.2
      - We recommend you download the SDK or runtime.
          - [GEF 3.2](http://www.eclipse.org/downloads/download.php?file=/tools/gef/downloads/drops/R-3.2-200606270816/GEF-ALL-3.2.zip)
      - This can be installed through the Eclipse update function,
        select the "Callisto discovery site" update site already listed.
  - The Eclipse Modeling Framework (EMF and SDO)
      - jUCMNav 2.1 requires EMF/SDO 2.2.0
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

### Enhancements / Fixes Since 2.0.1

\* Minor bug fixes relating to GRL \* Migration to Eclipse 3.2 \*
Packaged as an Eclipse feature with another plugin: \* [Import UCM from
UCEd Use Case](UCEdImport) v1.0.1 (For UCEd v1.6.0 and Eclipse 3.2) \*
Now offering an update site

### Known Issues in 2.1 \* Might not have found all issues with Eclipse 3.2

\* Autolayout still a prototype \* User documentation not translated
yet. \* User documentation does not reflect integration of GRL.

\-- Main.JasonKealey - 14 Sep 2006
