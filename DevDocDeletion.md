# Deletion

## Overview

  - This page is intended to explain how deletion works in the framework
    and our specific implementation for UCMs.

## Framework

  - DeletionAction is added to our context menus / keybindings (See
    [Dev Doc Actions](DevDocActions))
  - Our ComponentEditPolicies located in
    seg.jUCMNav.editpolicies.element all have a
    getDeleteCommand(GroupRequest request) method.
  - Given an editpart's component editpolicy, specify which command to
    run when delete is pressed/selected.

## Base Elements

  - We need to be able to delete any PathNode from its path. See
    DeletePathNodeCommand
      - 1 in / 1 out: is removed from the path
      - Multiple in or out: disconnect all branches
          - Might require deleting the element or downgrading it into an
            empty point. See DoesDisconnectImplyDelete
  - We need to be able to delete a Path, starting from its end point or
    start point. See DeletePathCommand and [Dev Doc Algo Deletion](DevDocAlgoDeletion)
  - Implicit deletion: When performing some transformations, such as
    merging a StartPoint and an EndPoint, elements are deleted and their
    properties must be removed.

## Major issues

  - Our original implementation used adhoc ways to get rid of certain
    information when deleting. We pretty much duplicated the code
    everywhere to, for example, remove InBindings/\!OutBindings from
  - We did a good job implementing all this during explicit deletions,
    but we could not assure the uniformity with transformation commands.
  - When doing certain transformations, we not only need to delete the
    information, we sometimes need to move it. This is the case with
    NodeConnections around a Stub or after a Timer/WaitingPlace/OrFork.
    If we insert a new node connection in between of the original one
    and the PathNode, we need to move plugin bindings, conditions, etc.
  - As a solution, we implemented a few CompoundCommands that are
    intended to be used everywhere an element must be deleted, so that
    we don't end up with model relationships that have not been broken.

## Our implementation

  - See [Dev Doc Algo Deletion](DevDocAlgoDeletion) for an overview of the algorithms.
  - See [Dev Doc Deletion Tests](DevDocDeletionTests) for an overview of the desired behaviour.
  - The hardest part about deletion commands is that they can be run
    simultaneously in a large CompoundCommand built by the
    DeletionAction. One intuitively builds a GEF CompoundCommands by
    adding regular Commands during its constructor. However, we often
    cannot do this because the state of the model will change between
    the constructor and the execute() method. We therefore had to wait
    as long as possible before building our commands, by overriding
    canExecute() and execute().
  - What follows is a brief hierarchical overview of what is in both
    packages

### Commands

  - PreDeleteUcmModelElementCommand : This command prepares an element
    for deletion.
      -  CleanRelationshipsCommand : Removes all invisible relationships
        related to a NodeConnection, PathNode or ComponentRef.
          - RemoveLinkedInfoCommand : Given a ComponentRef, PathNode,
            NodeConnection or Map, remove its performance/scenario
            information
          - ComponentRefUnbindChildCommand (to disconnect from parent)
          - ComponentRefUnbindChildCommand (to disconnect children)
          - DeleteBindingsCommand : Given a PathNode, NodeConnection or
            Map, removes anything to do with Stub-Plugin bindings.
      - DisconnectCommand:
          - Disconnects synchronous and asynchronous connections

<!-- end list -->

  - PrePathManipulationCommand: Manipulates the path to prepare to
    remove this PathNode.
      - DisconnectBranchesCommand: Given a PathNode, disconnect all
        relevant branches.
      - RewirePathCommand: Given a PathNode with one input and output,
        removes the outgoing node connection and rewires the incoming
        node connection onto the successor.

<!-- end list -->

  - RemoveUcmModelElementCommand: Given a PathNode or ComponentRef,
    remove it from the map or pathgraph, the component ref binding
    hierarchy and disconnect it from its definition if it is a
    responsibility

<!-- end list -->

  - PostPathManipulationCommand: Intented to be used after the deletion
    of a PathNode which must be downgraded to an EmptyPoint
      - SplitLinkCommand: Insert an empty point at the deletion
        location, if necessary.

<!-- end list -->

  - DeletePathNodeCommand: Deletes any PathNode from the model.

If not StartPoint or EndPoint

  - PreDeleteUcmModelElementCommand
  - PrePathManipulationCommand
  - RemoveUcmModelElementCommand
  - PostPathManipulationCommand

Else \* DeletePathCommand: Given a StartPoint / EndPoint, find the
deletion path using the query infrastructure and delete the whole path
\* infer the affected nodes using the deletion path query \*
DeleteBranchesCommand on extremity: This command will delete the
branches from a PathNode. \* DeletePathNode on all PN/NC in set, except
extremities \* DeleteStartNCEnd on last elements: This command will
remove a simple path from the map.

\-- Main.JasonKealey - 14 Jul 2005
