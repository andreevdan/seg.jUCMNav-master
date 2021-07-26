# Outline

## Overview

  - The outline is a view external to our editor.
  - As mentioned in [Dev Doc Multi Page Editor](DevDocMultiPageEditor) and/or [Dev Doc UCMEditor](DevDocUCMEditor), the
    framework queries editors for its outline using
    getAdapter(IContentOutlinePage.class)
  - Our outline is the seg.jUCMNav.views.outline.UrnOutlinePage

## GEF Treeview. 
  - UrnOutlinePage extends org.eclipse.gef.ui.parts.ContentOutlinePage
- See [Dev Doc Edit PartC reation](DevDocEditPartCreation) for explanations on GEF editparts 
- Is implemented as a treeview, all editparts extend
org.eclipse.gef.editparts.AbstractTreeEditPart \* Our editpart factory is TreeEditPartFactory 
- As explained in DevDocEditPolicies, our
editpart's behaviour are the same as the ones in the graphical editor by
attaching the same edit policies. 
- Our root editpart is managed by the framework. However, the root's only child is OutlineRootEditPart. 
- Because the topmost editpart (OutlineRootEditPart; I say topmost to
avoid saying root's only child) isn't represented visually in the
outline (for unknown/unexplored reasons) and because we wanted the
URNspec to be visible in the outline, we had to create another editpart
whose's child is URNspec. 
- Therefore, OutlineRootEditPart's model is
the multipage editor, whose model child is the URNspec. 
- This is
probably due to bad programming on our part, but we never got around to
investigating a better way to do it. 
- Our categories (Components,
Responsibilities) are not linked to any model elements; they are linked
to strings; their sole purpose is to group the components and
responsibilities together.

## Specifics

- The outline is the only location in the editor where the user has
access to the URNspec and to component/responsibility definitions. 
- As
a treeview, items can have icons. These must match the same icons used
in the palette; this is done manually. 
- We generate one outline page
per UcmEditor and if none exist, one in the UCMNavMultiPageEditor. They
are all currently the same, but the behaviour could change in the
future.

\-- Main.JasonKealey - 08 Jul 2005
