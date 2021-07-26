# Stub Binding Dialog

## Overview

[[img/stubBinding.jpg]]

  - The view is composed of three largepanels. First of all at the left
    of the dialog, there's a list with all the maps of the UCM. Checking
    a map in this list will produce a PluginBinding between the Stub and
    the checked map. The created PluginBinding will be shown in the tree
    view in the middle panel. This tree view will list all
    PluginBindings and all In/Out Bindings for a specific PluginBinding.

<!-- end list -->

  - Then after creating a PluginBinding, the user will probably want to
    create some InBindings and OutBindings with the StartPoints and
    EndPoints of the plugged map. The panel at the right contains four
    lists. The two lists at the left lists the Ins and the Outs of the
    Stub. The two lists at the right list the StartPoints and the
    EndPoints of the plugin map. The user can then select an In with a
    StartPoint and then click the button between the two to create an
    InBinding. He can do the same thing for the OutBindings. The tree
    view at the middle will then get updated as well.

## How everything is connected in the code?

  - The StubBindingDialog was first designed to be an eclipse view that
    would get activated after selecting a Stub. This decision was an
    error because we had too much things to fit in the UI at the first
    place to fit all that in a simple view. So the view had to be
    refactored into an SWT dialog.

<!-- end list -->

  - Since the class was initially designed to be a view, it was a
    listener to a Stub. Each time the observed Stub changed, the view
    would change. The view was designed to change the currently observed
    Stub. When the view was refactored into a dialog, we no longer
    needed this mechanism because now we could observe only one Stub
    during all the life of the dialog.

<!-- end list -->

  - First of all the method createDialogArea() if where all the controls
    are created and layed out. This dialog was done during the learning
    process of the developper, so it's not 100% clean... Everything
    works, but it's just hard to find something to modify. Breaking this
    out into methods for contructing each panel would have probably be
    much better.

<!-- end list -->

  - Something that is essential to talk about is that each time the user
    perform an action with the StubBindingDialog, it is actually done
    directly in the model with a command (that we execute/store
    internally). The dialog is a listener to the model and then updates
    all the required controls once the model has changed. Only the
    required panels are updated after a change in the model. This
    approach violates the model view controller pattern. This should
    probably be changed in the future if the dialog is extended a lot to
    add new properties and new things to edit in a Stub.

<!-- end list -->

  - Since everything is done using commands, this allow the user to undo
    and redo what he just did. The Undo/Redo buttons in the middle are
    for exactly that.

<!-- end list -->

  - All the method beginning with the prefix 'handle' are events
    handlers for various actions the user can perform in the UI. For
    example handlePluginChecked will get called when a user check a Map
    in the map list. It then execute the right command and then the
    other required views will get updated accordingly.

<!-- end list -->

  - It's important to know that if the user click the Cancel button, all
    the action done during the session in the dialog will get undone.

\-- Main.EtienneTremblay - 13 Jul 2005
