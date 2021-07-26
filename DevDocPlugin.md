# Creating a plugin for jUCMNav

## Overview

  - This guide shows you how to setup your project in order to create a
    plugin for jUCMNav.
  - Start out by [checking out jUCMNav into your
    workspace](DevDocCheckoutCode)
  - As an example, we will use the [ExportUseCaseMap extension
    point](DevDocImportExportExtensionPoints).

## Setup

### Use wizard

  - Ctrl-N -\> Plug-in project
  - Plug-in Project
      - Enter a project name
      - Next.
  - Plug-in Contenjt
      - Plug-in ID: A unique id such as seg.jUCMNav.UCM2CSM
      - Plug-in Name: A name such as Use Case Map to CSM plugin
      - Plug-in provider: usecasemaps.org
      - Next.
  - Templates
      - Uncheck Create a plug-in using one of the templates.
      - Finish.
  - If prompted for perspective change, click yes.

### Modify your manifest / create plugin.xml

  - Click on the dependencies tab.
  - Add required plugins.
      - seg.jUCMNav
      - org.eclipse.gef (if using UseCaseMapExport, even if might not
        export using IFigure)
      - org.eclipse.emf, org.eclipse.emf.ecore,
        org.eclipse.emf.common.ui (note: not sure which ones are
        required to manipulate the meta-model and which not)
  - Click on the extensions tab.
  - Add Extension.
      - Choose seg.jUCMNav.UseCaseMapExport
      - Notice plugin.xml has been created.
  - Right-click on the extension -\> new -\> exporter.
  - Fill the fields such as specified in
    [Dev Doc Import Export Extension Points](DevDocImportExportExtensionPoints)
  - The class you have specified does not exist. Lets create it\!

### Creating a class that implements the interface. 
  - Create the appropriate package structure for your project.
  - Create a new class that implements IUseCaseMapExport in this
    package.
  - Implement the relevant methods.

## Test

  - Debug-As -\> Eclipse Application
  - By default, all plugin projects are added to the launched Eclipse.
  - Test to see your plugin appears where it should in the UI.

\-- Main.JasonKealey - 15 Jan 2006
