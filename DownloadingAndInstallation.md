# Downloading and Installation

## Installation Through the Update Site (Recommended)

  - Make sure you have Java 7 or 8 installed (especially on MacOS; JDK 7
    is recommended)
  - First-time install in Eclipse:
      - Select Help -\> Install New Software... -\> Add
          - Name: jUCMNav
          - Location:
            <http://jucmnav.softwareengineering.ca/jucmnav/updatesite/>
      - See this [installation
        video](https://www.youtube.com/watch?v=9gqzsVT5B4Q) (for Eclipse
        Luna and above) 

<!-- end list -->

  - Update in Eclipse
      - Select Help -\> Check for Updates
      - Select the jUCMNav update site from your list

<!-- end list -->

  - **Important Notes**
      - Using the update site is required if you want the MSC Viewer
        plugin and CSM export plugin to be installed properly.
      - Afterwards, the jUCMNav plugin can be updated manually from our
        [Latest
        Build](http://jucmnav.softwareengineering.ca/ccbuilds/artifacts/seg.jUCMNav/latest/),
        if you feel adventurous\!
          - Save the .jar file to replace your
            eclipse/plugins/seg.jUCMNav_7.0.0.jar plug-in (or whatever
            last version you have installed)
      - Eclipse does not allow automatic upgrades between major
        revisions. jUCMNav v6.\* will need to be uninstalled before
        proceeding with the installation of jUCMNav v7.\*

-----

## Requirements

### Operating Systems

  - Windows 7 (tested) :check:
  - Linux (tested) :check:
  - MacOS X (tested) :check:
  - Any other O/S on which you can run [Eclipse](http://www.eclipse.org)
    (currently untested - please report your success)

### JDK

  - J2SE 7.0 (1.7) at
    <http://www.oracle.com/technetwork/java/javase/downloads/index.html>

### Eclipse

  - Versions
      - jUCMNav versions 5.5 and 6.x require **Eclipse 4.2 to 4.4**
        (previous versions of Eclipse are no longer supported)
          - We recommend the installation of **Eclipse Modeling Tools
            4.4.x** available at <http://www.eclipse.org/downloads/>
      - jUCMNav versions 4.4 to 5.4 require **Eclipse 3.5 to 3.7**
        (previous versions of Eclipse are no longer supported)
          - We recommend the installation of **Eclipse Modeling Tools
            3.7.x** available at <http://www.eclipse.org/downloads/>
  - Plug-ins required for running jUCMNav
      - jUCMNav 5.x and 6.x requires the Eclipse EMF, GEF, JDT, RPC,
        OCL, and Platform plugins.
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
  - <http://graphviz.org/Download.php> (use version 2.28 or 2.38;
    versions in between may not work well)
  - There is a report that this does not work properly on MacOS

\-- Main.DanielAmyot - 10 Nov 2014
