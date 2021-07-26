# Test Plan for Import/Export Wizard

  - Rationale: Work on the import/export wizard by both Jason (for
    images, Graphviz dot, Doors DXL, and UCEd) and by JF (for GRL
    catalogs) have introduced conflicting needs and caused a few
    regression bugs. These tests aim at clarifying the wizards' expected
    behaviour.

## Export Wizard

### Export Single Diagram (a single UCM/GRL or a list of these)

  - Export to image (BMP, JPG, GIF)
  - [Export to Graphviz dot](AutoLayoutRequirements)
  - Export Diagram (UCM/GRL: references) (Future work)

### Export Complete URN file

  - [Export to Doors DXL](DoorsExport)
      - Also exports images (BMP) for all diagrams
  - Export GRL Catalog (definitions)
  - [Export CSM](CsmExport)

## Import Wizard

### Create new jucm file

  - [Import from UCEd](UCEd%20Import)
  - Import GRL Catalog (definitions)

### Create/modify maps in a new jucm

  - Import GRL Catalog (definitions)
  - [Import from Graphviz dot](AutoLayoutRequirements) (Future work)
  - Import Diagram (UCM/GRL: references) (Future work)

## Ramblings

  - We can choose import/export either by:
    1.  Right-clicking in diagram editor. (ANY ELEMENT)
    2.  Right-clicking in outline (on diagram or on urn element).
    3.  File-\>Export or File-\>Import
    4.  Right-clicking on a file/project/folder in the Navigator.
  - Export from navigator (files selected) should prefill the exported
    URN from the list of selected jucm files.
      - One jucm file -\> show all diagrams in this file.
          - If exporting individual maps, all maps should be shown and
            selected on the export page.
      - Multiple jucm files -\> show all diagrams in all files.
          - If exporting individual maps, all maps should be shown and
            selected on the export page.
      - If a file is selected for export and no editor exists for the
        file, its editor should be loaded and closed on finish/cancel.
        Must not close editors that were already open.
  - Export from File-\>Export should show an error (no files selected).
  - Export from navigator (project/folder selected) should show an error
    (no files selected) or recurse through folders.
  - Export from outline should show all diagrams in file and pre-select
    the ones that are selected in the outline.
  - Export from editor should show all diagrams in file and pre-select
    the currently opened editor.
  - When doing an export, one has two choices: export whole URN or
    individual UCMs.
      - Whatever preferences was last used should be remembered in the
        preference store.
      - Whatever preferences were used on the second wizard pages should
        be remembered in the preference store.
      - Both secondary pages should share the same preference for the
        export directory.
      - The export type dropdown lists should use different preferences.
      - Both secondary pages should share the same preference for the
        file prefix.
      - The export individual diagram page should update its list
        automatically to show prefix-UCMID-Name.EXTENSION or
        prefix-GRLID-Name.EXTENSION when the export type is changed or
        when the prefix is changed.
  - A URN exporter can choose a Diagram Exporter to be run on all
    diagrams in the URN after the URN export has finished; it should use
    the same prefix information.

<!-- end list -->

  - One can import into an existing file or into a folder. If one
    chooses to import into a folder, the wizard is responsible for
    asking if the file should be overwritten. If not, a suffix should be
    added to the imported filename.
  - Only certain plugins support importing into an existing file (see
    extension point description).
  - The import wizard page should present a dropdown list of import
    types and a radio-button to select which type of import. If the
    selected type supports both types of imports, both radio-buttons
    should be enabled. Otherwise, only the available type should be
    enabled.
  - If we launch the import wizard from an editor, outline, or file in
    the navigator, the default import into file textbox should include
    this file and the default import into folder should be the file's
    container. (even if one method or the other is disabled)
  - In the previous scenario, if multiple files are selected, the
    preselected import into file can be any one of these. If they are in
    different folders, the chosen folder should be the one containing
    the file.
  - The import wizard shall provide a vector of diagrams that should be
    automatically layed-out after the import. This vector shall be
    filled by the extension point. Only the diagrams contained in this
    vector should be automatically layed out.
  - When importing into an opened editor, it is desirable that the
    editor shall remain opened, but it can be closed and reopened if
    necessary. (This is the case because we get thread access if we try
    to modify the URN while it is opened in the editor, from another
    thread).
  - When import/export is ran on a file in the Navigator and this file
    is not opened, open it for the duration of the import/export and
    close it on finish/cancel.
      - If it already is open, do not close it on finish/cancel.

\-- Main.JasonKealey - 27 Mar 2006
