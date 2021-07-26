# File Management

## Overview

  - We've already covered loading in [Dev Doc Multi Page Editor](DevDocMultiPageEditor).
  - Saving is also handled by the [multi page
    editor](DevDocMultiPageEditor)
  - We delegate the actual handling to
    seg.jUCMNav.editors.resourceManagement.MultiPageFileManager and
    other files in the same package.
  - Currently, XMI handles the actual low level serialization.

## Saving

\* The editor's doSave() and doSaveAs() methods are invoked. \*
Delegation to MultiPageFileManager doSave() and doSaveAs(). \* This
class does all the save/save-as logic and uses the UrnModelManager's for
the low level stuff. UrnModelManager handles the link between URNspec
and an XMI resource. \* Behaviour is similar to
[DevDocMultiPageEditor-Map156-init.jpg](DevDocMultiPageEditor)

## Save-as

  - We have had many problems with the save-as. We've try to keep it
    simple but it seems we failed miserably. :)
  - Our UrnModelManager keeps a reference to our URNspec and XMI
    resource and we have to manipulate multiple files in doSaveAs().
  - The main difficulty here is that if we do a save-as, we must refresh
    the editor so that is linked to the new file. This seems easy but is
    not as straightforward as planned:
      - The low-level xmi resource must be changed
      - the URNSpec used in the editors must be changed.
      - the graphical viewers must be refreshed so that they use the new
        model and not the old one
      - command stacks must be updated
      - ... many dependencies on the new URNspec to be refreshed
      - At first, we tried re-invoking the init procedures as mentioned
        in [Dev Doc Multi Page Editor](DevDocMultiPageEditor) and [Dev Doc UCMEditor](DevDocUCMEditor).
      - We ended up with something that worked but broke later when we
        added new general editor features.
      - Not wanting to update the init code every time we add a new
        feature (because we would obviously forget), we decided on
        simply closing the current editor/reopening a new one.

\-- Main.JasonKealey - 07 Jul 2005
