# Contextual menus

## Overview

  - Contextual menus are easy to build in Eclipse/GEF.
  - In Eclipse, you simply have to register a MenuManager with your
    IWorkbenchPartSite.
  - In GEF, ContextMenuProvider extends MenuManager and can be
    registered with your GraphicalViewer.
  - Our implementation is
    seg.jUCMNav.editors.actionContributors.UcmContextMenuProvider

<!-- end list -->

``` 
        ContextMenuProvider provider = new UcmContextMenuProvider(viewer, getActionRegistry());
        viewer.setContextMenu(provider);
        getSite().registerContextMenu("seg.jUCMNav.editors.actionContributors.UcmContextMenuProvider", provider, viewer); //$NON-NLS-1$
```

## How is the menu built?

``` 
    public void buildContextMenu(IMenuManager manager) {
        GEFActionConstants.addStandardActionGroups(manager);

        IAction action;

        action = getActionRegistry().getAction(ActionFactory.UNDO.getId());
        manager.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
        ...
    }
```

  - Simply lookup an action in the registry and add it to a particular
    group.
  - In case anyone wants to put our actions in better groups, here is
    the default list:

<!-- end list -->

    /** 
     * Context menu group for copy/paste related actions. 
     * Value: <code>"org.eclipse.gef.group.copy"</code>
     */
    public static final String GROUP_COPY = "org.eclipse.gef.group.copy"; //$NON-NLS-1$
    
    /** 
     * Context menu group for EditPart manipulation actions. 
     * Value: <code>"org.eclipse.gef.group.edit"</code>
     */
    public static final String GROUP_EDIT = "org.eclipse.gef.group.edit"; //$NON-NLS-1$
    
    /** 
     * Context menu group for find/replace related actions. 
     * Value: <code>"org.eclipse.gef.group.find"</code>
     */
    public static final String GROUP_FIND = "org.eclipse.gef.group.find"; //$NON-NLS-1$
    
    /** 
     * Context menu group for print related actions. 
     * Value: <code>"org.eclipse.gef.group.print"</code>
     */
    public static final String GROUP_PRINT = "org.eclipse.gef.group.print"; //$NON-NLS-1$
    
    /** 
     * Context menu group for actions which do not fit in one of the other categories. 
     * Value: <code>"org.eclipse.gef.group.rest"</code>
     */
    public static final String GROUP_REST = "org.eclipse.gef.group.rest"; //$NON-NLS-1$   
    
    /** 
     * Context menu group for save related actions. 
     * Value: <code>"org.eclipse.gef.group.save"</code>
     */
    public static final String GROUP_SAVE = "org.eclipse.gef.group.save"; //$NON-NLS-1$
    
    /** 
     * Context menu group for undo/redo related actions. 
     * Value: <code>"org.eclipse.gef.group.undo"</code>
     */
    public static final String GROUP_UNDO = "org.eclipse.gef.group.undo"; //$NON-NLS-1$
    
    /** 
     * Context menu group for view related actions. 
     * Value: <code>"org.eclipse.gef.group.view"</code>
     */
    public static final String GROUP_VIEW = "org.eclipse.gef.group.view"; //$NON-NLS-1$

\-- Main.JasonKealey - 08 Jul 2005
