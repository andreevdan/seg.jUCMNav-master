# jUCMNav v2.0 
<img align="right" src="img/LogoFinal.gif">

## Download

  - [Download v2.0
    here](http://jucmnav.softwareengineering.ca/ccbuilds/artifacts/seg.jUCMNav/2.0.1/seg.jUCMNav_2.0.1.jar)
    (jar).
      - \<font color=red\>Make sure your browser doesn't rename the .jar
        file to .zip or anything else.\</font\>
      - \<font color=red\>If you are using Eclipse/GEF 3.2, you might
        get better results with the [latest
        build](http://jucmnav.softwareengineering.ca/~ccbuilds/artifacts/seg.jUCMNav/latest/).\</font\>

<!-- end list -->

  - [Other files (src,
    javadoc)](http://jucmnav.softwareengineering.ca/ccbuilds/artifacts/seg.jUCMNav/2.0.1/)

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
      - jUCMNav 2.0 requires Eclipse 3.1
      - We recommend you download the Eclipse SDK.
          - [Eclipse 3.1.2 SDK
            Win32](http://www.eclipse.org/downloads/download.php?file=/eclipse/downloads/drops/R-3.1.2-200601181600/eclipse-SDK-3.1.2-win32.zip)
  - The Graphical Editing Framework
      - jUCMNav 2.0 requires GEF 3.1
      - We recommend you download the SDK or runtime.
          - [GEF 3.1.1](http://www.eclipse.org/downloads/download.php?file=/tools/gef/downloads/drops/R-3.1.1-200509301327/GEF-ALL-3.1.1.zip)
      - This can be installed through the Eclipse update function,
        select the "Eclipse.org" update site already listed.
  - The Eclipse Modeling Framework (EMF and SDO)
      - jUCMNav 2.0 requires EMF/SDO 2.1
          - [EMF 2.1.2](http://www.eclipse.org/downloads/download.php?file=/tools/emf/downloads/drops/2.1.2/R200601191349/emf-sdo-xsd-SDK-2.1.2.zip)
      - We recommend you download the SDK or runtime, but make sure you
        get EMF and SDO; the plugin will not work otherwise.
      - This can be installed through the Eclipse update function,
        select the "Eclipse.org" update site already listed.
  - \[Optional\] GraphViz dot
      - For autolayout purposes, you may want to download GraphViz dot.
      - <http://graphviz.org/Download.php>

## Release Notes

### Installation

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

### Enhancements / Fixes Since 1.1.1

  - Support for the GRL notation <span class="twiki-macro N"></span>
  - Support drag & drop from outline <span class="twiki-macro N"></span>
  - jUCMNav interface now available in French and English.
  - Connect was bound to parent component reference; disconnecting them
    implied the next save would crash.
  - Still had problems if -nl parameter is passed to Eclipse.
  - New import extension point, refined export extension points.
  - Export UCM/GRL to Telelogic DOORS DXL scripts.
  - GRL supported in import/export or autolayout.

### Known Issues in 2.0 \* Autolayout still a prototype

\* Import UCM from UCEd use case to be packaged as a jUCMNav plugin and
available here. \* User documentation not translated yet. \* User
documentation does not reflect integration of GRL.

\-- Main.JasonKealey - 30 May 2006
