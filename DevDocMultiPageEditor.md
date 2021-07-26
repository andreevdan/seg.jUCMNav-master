# Multi Page Editor

## Overview

As described in [Dev Doc Plugin XML](DevDocPluginXML), Eclipse has associated .jucm files to a
class implementing IEditorPart. This class is
seg.jUCMNav.editors.UCMNavMultiPageEditor; it is our plugin's central
class. Its main responsibilities are:

  - The editor associated with .jucm files. See
    seg.jUCMNav.editors.resourceManagement.MultiPageFileManager.
  - An editor itself, has an outline when no maps are available. Its
    model is the root URNspec. See seg.jUCMNav.editors.UcmOutlinePage.
  - A container for seg.jUCMNav.editors.UcmEditors, which edits only one
    map. Some aspects are delegated to the children but some are handled
    here.
      - For tab management, see seg.jUCMNav.editors.MultiPageTabManager.
      - For command stack management (delegated to children), see
        seg.jUCMNav.editors.MultiPageCommandStackListener,
        seg.jUCMNav.editors.DelegatingCommandStack.
      - For zoom management (delegated to children) see
        seg.jUCMNav.editors.DelegatingZoomManager

## Open file

  - User double clicks a .jucm file. Framework performs code similar to
    the following (where path is an IFile in the resource navigator):

<!-- end list -->

``` 
            IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
            IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(file.getName());
            editor = (UCMNavMultiPageEditor) page.openEditor(new FileEditorInput(file), desc.getId());
```

  - This creates an editor (constructor), initializes it (init()) and
    displays it (createPartControl());

<!-- end list -->

``` 
   /**
    * Initializes this editor with the given editor site and input.
    * <p>
    * This method is automatically called shortly after the part is instantiated.
    * It marks the start of the part's lifecycle. The 
    * {@link IWorkbenchPart#dispose IWorkbenchPart.dispose} method will be called 
    * automically at the end of the lifecycle. Clients must not call this method.
    * </p><p>
    * Implementors of this method must examine the editor input object type to
    * determine if it is understood.  If not, the implementor must throw
    * a <code>PartInitException</code>
    * </p>
    * @param site the editor site
    * @param input the editor input
    * @exception PartInitException if this editor was not initialized successfully
    */
         public void init(IEditorSite site, IEditorInput input) throws PartInitException
```

  - The IEditorSite is its location in the Eclipse workbench. You can
    access toolbars and such using it. Not used alot.
  - You can access the content of the opened file using IEditorInput

<!-- end list -->

``` 
         !IEditorInput IFile file = ((IFileEditorInput) input).getFile();
```

  - In init(), you basically hook up with the framework, load the file
    and setup your internals.
      - We create our command stack
      - We register to be informed when the selection changes
      - We fill up the action registry that will be used to build
        toolbars, contextual menus and react to key strokes.
      - We open the file from the file system to build our URNSpec. This
        is done in the seg.jUCMNav.editors.resourceManagement package.
        Currently the XMI serialization does all the work so we don't
        check the validity of the URNspec while loading it, we do it
        once it has been created.

<!-- end list -->

  - As with all IWorkBenchParts, createPartControl() is invoked to
    render the control. MultiPageEditorPart invokes createPages() which
    we use to generate our tabs, one tab for each Map in a file. We
    delegate this behaviour to seg.jUCMNav.editors.MultiPageTabManager.

## Adapters

  - Once initialized, Eclipse and GEF query our editor for its
    capabilities via getAdapter() from IAdaptable.

<!-- end list -->

``` 
   /**
    * Returns an object which is an instance of the given class
    * associated with this object. Returns <code>null</code> if
    * no such object can be found.
    *
    * @param adapter the adapter class to look up
    * @return a object castable to the given class, 
    *    or <code>null</code> if this object does not
    *    have an adapter for the given class
    */
   public Object getAdapter(Class adapter);
```

 -  Our [UCM Nav Multi Page Editor](UCMNavMultiPageEditor) gets queries (among others) for
org.eclipse.gef.commands.CommandStack,
org.eclipse.gef.ui.actions.ActionRegistry,
org.eclipse.ui.views.contentoutline.IContentOutlinePage,
org.eclipse.ui.part.IContributedContentsView,
org.eclipse.ui.views.properties.IPropertySheetPage, and
org.eclipse.gef.editparts.ZoomManager. 
 -  The important thing to
remember here is that we return items that we have created in init() for
the most part. 
   -  CommandStack: Where our commands will be pushed for
the undo/redo framework. Our command stack is usually contained in an
EditDomain. 
   -  ActionRegistry: Where all our actions are registered.
They are only created once and registered there. When a context menu,
for example, needs to know if an action is enabled, it obtains it from
the registry and verifies. 
   -  IContentOutlinePage is the outline view.
   -  IPropertySheetPage is for the properties view. 
   -  ZoomManager is for
(obviously) zooming.

\-- Main.JasonKealey - 23 Jun 2005

## UCM Description

  - [DevDocMultiPageEditor.jucm](att/DevDocMultiPageEditor.jucm.xml):

<!-- end list -->

  - DevDocMultiPageEditor-Map2-Openingafile.jpg: 
[[img/DevDocMultiPageEditor-Map2-Openingafile.jpg]]

<!-- end list -->

  - DevDocMultiPageEditor-Map156-init.jpg: 
[[img/DevDocMultiPageEditor-Map156-init.jpg]]


<!-- end list -->

  - DevDocMultiPageEditor-Map157-createPages.jpg: 
[[img/DevDocMultiPageEditor-Map157-createPages.jpg]]

<!-- end list -->

  - DevDocMultiPageEditor-Map158-getAdapter.jpg: 
[[img/DevDocMultiPageEditor-Map158-getAdapter.jpg]] 

