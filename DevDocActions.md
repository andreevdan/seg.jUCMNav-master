# Actions

## Overview

  - Almost all classes located in the seg.jUCMNav.actions package extend
    the org.gef.ui.actions.SelectionAction class. Actions can manipulate
    the model or simply perform any general task. All actions located in
    this package are registered in the Action Registry associated with
    our editor. After being registered in the action registry, actions
    are not only available for our editor but also for other workbench
    parts, such as views or toolbars. Classes in this package are mainly
    used in our editor’s context menu provider and its action bar
    contributor. For example, the show/hide label action available in a
    path node or component’s context menu is defined here.
  - It is recommended that any new action subclass the
    UCMSelectionAction class. Furthermore, most actions make use of the
    SelectionHelper. This class acts as a bridge between a List of
    EditParts and a particular selection of model elements. Furthermore,
    many actions make use of SafePathChecker to ensure they don't create
    illegal loops.
  - A good example action is the AddOrForkAction. It demonstrates use of
    setting an image descriptor, using SafePathChecker and the
    SelectionHelper.

## Hookup with framework

  - see seg.jUCMNav.editor.actionContributions
  - Builds the action registry, contextual menus and toolbars. If you
    create a new action, don't forget to register it in the two
    locations below:
      - The ActionRegistryManager is invoked by the
        UCMNavMultiPageEditor to create the actions once per multi page
        editor. These single instances are used throughout the
        application.
      - The UcmContextMenuProvider builds a context menu from a subset
        of actions taken from the ActionRegistry.

Note: this guide was written but the material covered here is probably
spread out in the other ones; have a look at [Dev Doc Context Menu](DevDocContextMenu)

\-- Main.JasonKealey - 14 Jul 2005