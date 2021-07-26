# Command Stack

## Overview

  - As mentioned in [Dev Doc UCMEditor](DevDocUCMEditor), a graphical editor has an
    EditDomain. This EditDomain contains the CommandStack.
  - [Dev Doc Commands](DevDocCommands) are executed in CommandStacks and can be
    undone/redone.
  - We've decided to go with one command stack per map instead of one
    for the whole URNspec.
  - This allows us to undo in one page without affecting the pages that
    aren't visible.
  - There are CommandStacks and CommandStackListeners. The latter is
    informed when the first one changes, to refresh the view for
    instance.

## DelegatingCommandStack

  - Inspired by other GEF examples, we created/stole a
    DelegatingCommandStack for our UCMNavMultiPageEditor.
  - Basically, the DelegatingCommandStack holds a reference to another
    CommandStack. Every action is delegated to the latter.
  - Therefore, the DelegatingCommandStack is registered once as the
    multipage editor's command stack in the Eclipse framework. This
    hooks it up with the undo/redo toolbar buttons and menu items.
  - Hence, everytime the open tab changes, the DelegatingCommandStack is
    refreshed with the CommandStack of the UcmEditor. Subsequent
    commands will be executed/undone/redone in this CommandStack.

## Problem solved?

  - Nope\! This solution worked fine until we decided to add/remove
    maps.
  - The commands for adding and deleting maps are, in essence, not
    intended to be executed in one particular tab.
  - If you create a new map and execute that command in the currently
    opened tab's command stack, three problems occur:
      - The tab changes (so does the pointer located in the
        DelegatingCommandStack) so if you try to undo in this new page,
        it won't undo the creation.
      - Suppose you do modifications in this new page and return to the
        page where the map was created. Undoing its creation will leave
        dangling references because new associations were made when you
        manipulated the map.
      - If your .jucm file doesn't contain any maps, where are you going
        to execute your command?
  - If you delete a map and execute it in its tab's command stack:
      - How are you going to undo it? The editor is now closed and the
        command stack, gone.

## Our solution

  - We created a URNspec related command stack. It is included directly
    in the DelegatingCommandStack but come to think of it, we should
    have simply created it elsewhere and not clutter the
    DelegatingCommandStack
  - Add/Delete Maps are pushed into this stack.
  - Other problem: We have another stack, but our delegation mechanism
    says that the current editor's stack receives request. When should
    this new stack be referenced by the DelegatingCommandStack?
  - We used a simple solution:
      - CreateMapCommands/\!DeleteMapCommands are always pushed onto
        this stack.
      - If this stack is non-empty, it will receive undo requests.
      - If it's redo-stack is non-empty, it wil receive redo requests.
      - As soon as another command (non
        CreateMapCommand/\!DeleteMapCommand) is executed, this special
        stack is flushed.
  - Problems with our simple solution:
      - We can't undo our delete/create commands if we execute new
        commands afterwards.
      - Non uniformity with all other commands

## Improvements

  - This algorithm could be improved. There are various issues at hand
    so don't just jump into coding. Think about your algorithm first.
    You never want to be able to undo a create before undoing all
    commands that concern it: this may not be simply in the new editor,
    stub bindings could have been created externally.
  - This is an open bug in BugZilla

\-- Main.JasonKealey - 08 Jul 2005
