# Developer setup

## Overview

  - Setting up your Eclipse to start developing on jUCMNav is fairly
    straightforward but there are a few things to remember.
  - This guide was initially written for Eclipse 3.0.1 and upgraded,
    some aspects may have changed as Eclipse evolves...
  - We now need Eclipse 4.4 and above as a development environment.

## Installing Eclipse and required plug-ins

### Eclipse 4.4 Modeling Tools or more recent

  - Download [Eclipse
    Modeling Tools](https://www.eclipse.org/downloads/eclipse-packages)
  - Install "Web Tools Platform (WTP)" from an appropriate Eclipse
    update site (e.g.:
    [http://download.eclipse.org/webtools/repository/luna/](http://download.eclipse.org/webtools/repository/luna/)

>  **IMPORTANT**: Alternatively, you can unzip the attached [bundle
> zip file](att/WPTbundle.zip) to your eclipse/plugins
> folder. It does not contain what is required to run Web services for
> dynamically feeding data to KPI values, but it allows to compile and
> run the tool.

## Setup from Subversion Server (SVN)

### Install [Subclipse](https://github.com/subclipse/subclipse/wiki)

  - Help -\> Install New Software...
  - Add Remote Site
      - Name: subclipse
      - URL: https://subclipse.github.io/updates/
  - Select all subclipse update site (others have been added) (Next)
  - Select all features, or minimally Core SVNKit Library, Optional JNA library, and Subclipse (Next)
  - Accept the terms (Next)
  - Finish

### Checkout the code

Checkout takes the code from the repository and saves it on your
machine.

  - Window -\> Show View -\> Other -\> SVN -\> SVN Repository
  - Right click in SVN Repository view -\> New -\> Repository Location
  - Location Url: <svn://cserg0.site.uottawa.ca/projetseg/>
  - <svn://cserg0.site.uottawa.ca/projetseg/> -\> trunk -\> seg.jUCMNav
    (right click) -\> Checkout as project

Checking out the code does not require a username/password. However,
committing code requires it. If you need authentication user/password,
contact <damyot@uottawa.ca>

**NOTE**: If you get an error about JavaHL, please see this [relevant
information](http://stackoverflow.com/questions/5721456/svn-error-on-connecting-with-eclipse#5724181).
(Thanks Marc van Zee for reporting this)

## Setup project properties

### Eclipse 4.2 and above

We use JDK 1.7 compatibility (should also work with 1.8). JDK 1.6 is no
longer sufficient. Follow the following steps.

  - Right-click on the seg.jUCMNav project you just created, choose
    properties.
  - Choose Java Compiler
  - Check Enable Project Specific Settings
  - Put the **JDK compliance to 1.7** as in the following screenshot.
  - Accept this and give Eclipse a while to rebuild the solution.

[[img/JDK.png]]

## Run/Debug/Test jUCMNav

  - Developers should always have assertions enabled when running
    jUCMNav as our commands are built to catch bugs using assertions.
  - In the Debug or Run configuration preferences (accessible by
    right-clicking on the project name), select Run-time workbench as
    the configuration used to run jUCMNav. Create a new configuration
    (jUCMNav) if necessary.
  - Make sure you have the -ea Java Virtual Machine attribute set.
  - jUCMnav: Runtime workbench settings

[[img/debug.png]]

  - To test jUCMNav, create a new JUnit Plug-in Test for the test class
    seg.jUCMNav.tests.TestAllTestSuite and don't forget the -ea JVM
    attribute\!

## Last thing, coding standards

  - Please review [Dev Doc Coding Standards](DevDocCodingStandards) before starting to program.

\-- Main.DanielAmyot - 05 Jun 2015
