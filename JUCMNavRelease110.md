# jUCMNav v1.1.0

<img align="right" src="img/LogoFinal.gif">

## Download

Get the user v1.1.0 release
[here](http://www.softwareengineering.ca/jucmnav/seg.jUCMNav_1.1.0.jar)
(jar).

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
      - jUCMNav 1.1 requires Eclipse 3.1
      - Older/newer builds might work, known issues with 3.0.1 but core
        works
      - We recommend you download the Eclipse SDK.
          - [Eclipse 3.1 SDK
            Win32](http://www.eclipse.org/downloads/download.php?file=/eclipse/downloads/drops/R-3.1-200506271435/eclipse-SDK-3.1-win32.zip)
  - The Graphical Editing Framework
      - jUCMNav 1.1 requires GEF 3.1.0
      - We recommend you download the SDK or runtime.
          - [GEF 3.1](http://www.eclipse.org/downloads/download.php?file=/tools/gef/downloads/drops/R-3.1-200507071758/GEF-ALL-3.1.zip)
      - This can be installed through the Eclipse update function,
        select the "Eclipse.org" update site already listed.
  - The Eclipse Modeling Framework (EMF and SDO)
      - jUCMNav 1.1 requires EMF/SDO 2.1
          - [EMF 2.1](http://www.eclipse.org/downloads/download.php?file=/tools/emf/downloads/drops/2.1.0/R200507070200/emf-sdo-xsd-SDK-2.1.0.zip)
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
Download and install all prerequisites, then copy the file
seg.jUCMNav\_1.1.0.jar into your /eclipse/plugins/ directory. Restart
Eclipse.

### Help

End-user documentation is integrated with the Eclipse help system.
`Access Help > Help Contents` from the Eclipse workbench, then select
topic `jUCMNav Online Help`.

### Reporting Bugs / Usability Requests

  - Send your bug reports to \<a
    href="[mailto:jucmnav-dev@softwareengineering.ca](mailto:jucmnav-dev@softwareengineering.ca)"\><jucmnav-dev@softwareengineering.ca>\</a\>.
  - Include reproduction steps, sample .jucm files and, if applicable,
    copy-paste the error log messages.
  - If you're zealous enough, we'll create a BugZilla account for you :)

### Known Issues

  - Autolayout still a prototype, import robustness issues (some
    components might not move during autolayout)
  - Does not load if -nl parameter is passed to Eclipse. (fixed in
    latest build)

\-- Main.JasonKealey - 26 Aug 2005
