# jUCMNav v1.0.0

<img align="right" src="img/LogoFinal.gif">

## Download

Get the user v1.0.0 release
[here](http://www.softwareengineering.ca/jucmnav/seg.jUCMNav_1.0.0.jar)
(jar).

  - Several fixes are added in the [latest
    build](http://jkealey.shade.ca:82/jucmnav-builds/seg.jucmnav/latest/)

  
[Changelog](%ATTACHURL%/log_beta2_to_v100.txt) since beta2.

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
      - jUCMNav was developed for E3.0.1
      - Eclipse 3.1 has been tested and seems to work fine.
      - Older/newer builds might work, but have not tested.
      - <http://download.eclipse.org/eclipse/downloads/drops/R-3.0.1-200409161125/index.php>
      - We recommend you download the Eclipse SDK.
  - The Graphical Editing Framework
      - jUCMNav was developed for GEF 3.0.1
      - <http://download.eclipse.org/tools/gef/downloads/drops/R-3.0.1-200408311615/index.php>
      - We recommend you download the SDK or runtime.
      - This can be installed through the Eclipse update function,
        select the "Eclipse.org" update site already listed.
  - The Eclipse Modeling Framework (EMF and SDO)
      - jUCMNav was developed for EMF 2.0.1 (yes, 2.0.1 accompanies
        Eclipse 3.0.1)
      - <http://download.eclipse.org/tools/emf/scripts/downloads-viewer.php?s=2.0.1/R200409171617>
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
seg.jUCMNav\_1.0.0.jar into your /eclipse/plugins/ directory. Restart
Eclipse.

Building the source (for developers):  

  - Get the latest source archive from
    <http://jkealey.shade.ca:82/jucmnav-builds/seg.jucmnav/latest/>
  - Get all prerequisites mentioned above.
  - Create an environment variable called 'ECLIPSE\_HOME' and set its
    value to the path of your Eclipse 3.0 installation (ex:
    /opt/eclipse).
  - Extract the source archive to a new directory, chdir to it in a
    shell and type 'ant' to build the plugin.

### Help

End-user documentation is integrated with the Eclipse help system.
`Access Help > Help Contents` from the Eclipse workbench, then select
topic `jUCMNav Online Help`.

### Reporting Bugs / Usability Requests

  - Send your bug reports to \<a
    href="[mailto:seg4910@softwareengineering.ca](mailto:seg4910@softwareengineering.ca)"\><seg4910@softwareengineering.ca>\</a\>.
  - Include reproduction steps, sample .jucm files and, if applicable,
    copy-paste the error log messages.
  - If you're zealous enough, we'll create a BugZilla account for you :)

### Known Issues

  - Certain interactions should indirectly remove plugin bindings but
    currently do not, corrupting files. Be very careful when working
    with plugin bindings until the code is patched.
  - Bug concerning component reference color properties was introduced
    before release
      - <span class="twiki-macro N"></span> These issues (along with
        others) should be resolved in the [latest
        build](http://jkealey.shade.ca:82/jucmnav-builds/seg.jucmnav/latest/).

\-- Main.JeanPhilippeDaigle - 18 Jul 2005
