# Command Generation

## Overview

  - Commands are the foundation of modifications in GEF.
  - They encapsulate changes to be done, and how these changes can be
    undone.
  - See [Dev Doc Commands](DevDocCommands) for a good idea of how to structure your
    commands, to ensure proper testing.
  - Our commands are located in seg.jUCMNav.model.commands

## Command Generation

  - Basically, you can generate commands anywhere. You must have access
    to a CommandStack and a meta model instance and you're ready to go.
  - We use GEF commands because we're running them in GEF CommandStacks
    but if you were to write a simple command-line based application, it
    might be sufficient to use EMF commands and command stacks.
  - In our application, most commands are instanciated in [edit
    policies](DevDocEditPolicies). The framework is built in such a way
    that edit parts receive requests that are passed on to edit
    policies, which generate commands and return them to the edit part
    for execution, in the framework.
  - Our wizards also instanciate commands
      - The autolayout wizard generates and executes commands directly
        in the command stack to manipulate empty points or to
        resize/move elements.
      - The stub bindings dialog has its own internal command stack
        which runs the commands. This helps us manipulate only one model
        instance at a time and gives us the flexibility to undo all
        commands if the user cancels the dialog.
  - Our test cases also instanciate commands. An interesting test suite
    would generate sequences of commands and execute them against one
    instance of the meta model. Furthermore, by executing in an instance
    of our plugin, it would verify that none of the code built on top of
    the metamodel (which is refreshed via [EMF
    Notifications](DevDocEMFNotifications)) throws any exceptions or
    freezes.

\-- Main.JasonKealey - 05 Jul 2005
