# UCM Editor

## Overview

As described in [Dev Doc Multi Page Editor](DevDocMultiPageEditor), a URNspec is opened, and for each
Map a new tab is created. This tab contains a new instance of the
UcmEditor.

  - The UcmEditor is a subclass of
    org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette. We
    couldn't ask better for our jUCMNav: a graphical pane where items
    are inserted, using the palette.
  - The UcmEditor generates a new instance of an EditDomain. Among
    others, the edit domain is the container for the palette and the
    command stack.
  - The superclass takes care of creating an instanceof of a
    GraphicalViewer. Graphical viewers are containers for editparts. We
    will cover the editpart creation process later but basically the
    graphical viewer is given a root editpart, an editpart factory and a
    model element and it generates the editpart hierarchy.
  - As the graphical viewer knows of all the editparts in the editor
    (using the editpartregistry), one can query it with a model element
    to obtain its editpart.
  - At this time, I recommend you read
    <http://eclipsewiki.editme.com/GefDescription> and
    <http://eclipsewiki.editme.com/GefDescription2>. Refresh the page,
    the images will appear.
  - A fun fact to know about the editpart registry is that it is a hash
    map from model element to editpart. Therefore, one now understands
    why one model element can only be associated to one editpart, per
    graphical viewer. One in the outline, one in the editor, etc.

## Graphical Viewer

  - The framework initializes the editor by invoking
    configureGraphicalViewer() and initializeGraphicalViewer() (Among
    others).

<!-- end list -->

``` 
    /**
     * Configure the graphical viewer before it receives contents.
     * <p>
     * This is the place to choose an appropriate RootEditPart and EditPartFactory for your editor.
     * The RootEditPart determines the behavior of the editor's
     * "work-area". For example, GEF includes zoomable and scrollable root edit parts.
     * The EditPartFactory maps model elements to edit parts (controllers).
     * </p>
     * 
     * @see org.eclipse.gef.ui.parts.GraphicalEditor#configureGraphicalViewer()
     */
    protected void configureGraphicalViewer();

    /**
     * Set up the editor's inital content (after creation).
     * 
     * @see org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette#initializeGraphicalViewer()
     */
     protected void initializeGraphicalViewer();
```

\* In configureGraphicalViewer(), we register our editor's root edit
part is seg.jUCMNav.editparts.ConnectionOnBottomRootEditPart \* Also, we
register our contextual menu provider
(seg.jUCMNav.editors.actionContributors.UcmContextMenuProvider) using
the action registry built in the multi page editor (See
DevDocMultiPageEditor) \* Finally, we register our edit part factory:
seg.jUCMNav.editparts.GraphicalEditPartFactory \* In
initializeGraphicalViewer(), the important task that is performed is
feeding the instanceof of the Map to our graphical viewer, so that the
editor is ready to render itself.

## General behaviour

  - This editor used to be the root editor for our project. Because it
    is an editor, it provides much of the same functionality as
    documented in DevDocMultiPageEditor. However, because we have moved
    to a multipage editor which contains several UcmEditors, many
    functions are either irrelevant or must redirect to the container.
      - createActions() is now in the parent.
      - getActionRegistry() returns the shared action registry
      - getSelectionSynchronizer() returns the parent's synchronizer
      - doSave(), doSaveAs() are now handled by the parent.
  - What's left?
      - Behaviour pertaining directly to the graphical viewer
          - We have one palette per editor.
          - We have one zoom manager per editor.
          - Drag\&drop is managed at the editor level, although we don't
            do much of this yet.
      - Behaviour pertaining directly to the edit domain (as each editor
        has its own)
          - We have one outline per editor (although our current use
            doesn't justify this)
          - We have one command stack per editor. (See the documentation
            about command stacks as this is a bit touchy).
  - As mentioned for the [multi page editor](DevDocMultiPageEditor), the
    getAdapter() function is important here.

\-- Main.JasonKealey - 24 Jun 2005
