# Import/Export Extension Points

## Overview

  - A common extension to jUCMNav is to add the capability of creating a
    new file from an existing use case map (export) or to create a new
    one from an existing file (import).
  - This guide covers the extension points related to jUCMNav's
    import/export wizards

## Extension Points

### UseCaseMapExport

  - Given one UCM, create a file.
      - Either receive a ucm.map.UCMmap or a org.eclipse.draw2d.IFigure
        (for image formats).
  - Example: Export the JPEG representation of one map to a file.
  - You will need to implement the IUseCaseMapExport interface.

### URNExport

  - Given one URN (containing multiple UCMs), create a file.
  - Example: Export the DXL script required to load all the maps in
    Telelogic DOORS.
  - You will need to implement the IURNExport interface.

### URNImport

  - Create a URN instance from an existing file.
  - Example: Create a URN instance from UCEd use cases.
  - You will need to implement the IURNImport interface.

## Usage

\* In your plugin.xml, create an extension to one of the above extension
points. \* Basically, the information you provide in your plugin.xml
will define which of the interface's methods is invoked. \* All others
can remain unimplemented.

| Field | Description |
| --- | --- |
| id | a unique ID for your extension |
| name | a string representing your extension in jUCMNav | 
| class | the class which implements the aforementioned interface |
| extension | the filename extension used for import/export | 
| useStream | should we invoke the method using a FileInputStream/FileOutputStream (true) or do you want us to provide only the filename (false) |
| mode | (only for IUseCaseMapExport) image: provide a IFigure, model instance: provide a UCMmap | 

  - When your plugin.xml is filled, simply implement the appropriate
    method and test.

## Testing

  - To test if your plugin is correctly used, simply start up the
    appropriate import or export wizard and check to see that your name
    field appears in the dropdown list of import/export alternatives.

\-- Main.JasonKealey - 15 Jan 2006
