# Plugin.xml

## jUCMNav's Extensions (of Extension Points)

  - The extension mechanism in Eclipse is very nice. Using a simple xml
    file (plugin.xml), one registers itself as an extension of existing
    extension points.
  - Eclipse has an extension point for **editors**
      - org.eclipse.ui.editors
      - Defines the editor class which must implement
        org.eclipse.ui.IEditorPart
        (seg.jUCMNav.editors.UCMNavMultiPageEditor) and to which
        extensions it is linked to.
  - Eclipse has extension points for items in the **toolbar**
      - One of them: org.eclipse.ui.editorActions
      - Adds items to the toolbar that are only visible when a
        particular editor is loaded.
  - Eclipse has extension points for **views/perspectives**
      - Some of them: org.eclipse.ui.views, org.eclipse.ui.perspectives,
        org.eclipse.ui.perspectiveExtensions
      - Registers views/perspectives to be opened using the
        Show-View/Open-Perspective operations.
  - Eclipse has extension points for **help**
      - One of them: org.eclipse.help.toc
      - Registers a certain xml file as containing the structure for a
        table of contents
  - Eclipse has extension points for **wizards**
      - Some of them: org.eclipse.ui.exportWizards,
        org.eclipse.ui.newWizards
      - For use with File-Export, File-New
  - Many extension points exist. Using the (sometimes hard to
    comprehend) interfaces, one knows which classes to extend, registers
    them here, and, on reload, the new code is integrated with the
    platform.

## jUCMNav's Extension Points

  - As of writing, jUCMNav offers no extension points. Therefore, one
    cannot extend the codebase without modifying the code. High level
    tasks like creating another plugin that adds new views to jUCMNav is
    possible though.
  - There are plans of creating an extension point for jUCMNav's
    File-Export. Given an instance of the metamodel, save it in another
    format. Could also be used to save the rendered image in other
    formats.

## Alternatives

   -  As far as I know, once you have one extension registered (like the
editor), you can bypass the plugin.xml and register yourself
programatically for anything.

\-- Main.JasonKealey - 22 Jun 2005
