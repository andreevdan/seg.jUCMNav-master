# Palette

## Overview

  - The palette is managed by the GEF framework. As a
    GraphicalEditorWithFlyoutPalette, the [UCM Editor](DevDocUCMEditor)
    has a collapsible palette that can even be extracted into an
    external view.
  - All we need to do is create a palette root that defines its
    contents.
  - Our palette related classes are in seg.jUCMNav.editors.palette

## Integration

  - The palette must be registered in the EditDomain, as mentioned in
    [Dev Doc UCMEditor](DevDocUCMEditor).
  - GraphicalEditorWithFlyoutPalette features this code:

<!-- end list -->

    /**
     * Sets the edit domain for this editor.
     * 
     * @param   ed   The new EditDomain
     */
    protected void setEditDomain(DefaultEditDomain ed) {
       super.setEditDomain(ed);
       getEditDomain().setPaletteRoot(getPaletteRoot());
    }

  - We override getPaletteRoot() and provide a simple implementation
    that creates a new instanceof
    seg.jUCMNav.editors.palette.UcmPaletteRoot (which extends
    PaletteRoot)
  - Usually, a PaletteRoot doesn't need to know its editor, but we had
    to work it in because we're invoking the
    [ModelCreationFactory](DevDocModelCreationFactory) and need to pass
    a valid URNspec.
  - The palette memorizes its state in the preference store, but that is
    not very important for us now.
  - The palette is built in buildPalette(), a private method invoked by
    our constructors.
  - Basically, we add a PaletteGroup, PaletteDrawers and ToolEntries to
    build the palette. The rest is managed by the framework.
  - Groups and Drawers are straightforward from the code.

## Tool Entries \* See seg.jUCMNav.editors.palette.tools

  - A ToolEntry is simply a wrapper around an actual Tool. It defines
    its palette icons and text.
  - The selection tool is already created for us: SelectionToolEntry.
  - Usually, the palette contains many CreationToolEntries. We choose to
    use CombinedTemplateCreationEntry for all our tools. This class
    instanciates CreationTool with a model creation factory.
  - The default behaviour for CreationTool is to restore the default
    palette state (selection tool) after use. We wanted to keep the
    currently selected tool active; we subclassed both previously
    mentioned classes into UCMElementCreationEntry and
    UCMElementCreationTool to achieve this behaviour.
  - We also created the PathTool (and corresponding PathToolEntry) to
    help us extend paths.
  - The PathTool is a finite state machine that decides what to create
    depending on the current selection. The destination
    MapAndPathGraphXYLayoutEditPolicy and
    NodeConnectionXYLayoutEditPolicy handle the insertion of the newly
    created objects into the use case map, as they do with all other
    CreationTools.

### UCMElementCreationEntry \* As CombinedTemplateCreationEntries are passed many parameters in their constructor, I will explain an example here.

``` 
        entry = new UCMElementCreationEntry(Messages.getString("UcmPaletteRoot.actor"), Messages.getString("UcmPaletteRoot.createActor"), ComponentRef.class, new ModelCreationFactory(getURNspec(), ComponentRef.class, //$NON-NLS-1$ //$NON-NLS-2$
                ComponentKind.ACTOR), ImageDescriptor.createFromFile(JUCMNavPlugin.class, "icons/Actor16.gif"), ImageDescriptor.createFromFile( //$NON-NLS-1$
                JUCMNavPlugin.class, "icons/Actor24.gif")); //$NON-NLS-1$
        componentsDrawer.add(entry);
```

  - To be read more easily, the format is as such:

<!-- end list -->

``` 
        entry = new UCMElementCreationEntry(_*Short String Description*_, _*Long String Description*_, _*Class Being Created*_, _*Instance of factory for which getNewObject() can be invoked to obtain new object*_, _*Small icon*_, _*Large icon*_); 
        componentsDrawer.add(entry);
```

  - The class being created is used for informational purposes at the
    destination edit policy (via a CreateRequest).
  - For more information about the factory, see
    [Dev Doc Model Creation Factory](DevDocModelCreationFactory).

\-- Main.JasonKealey - 05 Jul 2005
