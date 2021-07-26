# Model manipulation/query utilities

## Overview

  - We often have to do the same tasks in the model.
  - We have centralized some of the code in the seg.jUCMNav.model.util
    package.

## ParentFinder

  - Given a path node or component ref, give me a list of plausible
    component ref parents.
  - Given a component ref, give me a list of the contained elements that
    aren't already children.
  - We have implemented a few static methods to help with this task.
  - Usually, one uses getPossibleParents(UCMModelElement) to find the
    list of parents (used in properties) and
    getPossibleParent(UCMModelElement) to find the smallest container
    (used when dragging pathnodes).
  - One must not forget to use the ParentFinder when inserting new model
    elements in a use case map during model commands.
  - findParent() is invoked with x/y coordinates to find parents.
  - findNewChildren() is used by for binding enclosed elements.

## SafePathChecker

  - SafePathChecker verifies if the fusion of a pathnode with a node
    connection or another pathnode will cause an illegal loop.
  - See the implementation for details.
  - Here are a few algorithm facts:
      - You can always merge elements that are on different paths. (A
        path being defined by ReachableNodeFinder)
      - Fusion must leave at least one start and one end point.
      - Elements must not be on the same path segment as defined by
        DeletionPathFinder

## URNNamingHelper

  - Cleans files onload to make sure they have unique IDs and unique
    component/responsibility names.
  - Informs if a given name/id is already in use.
  - Sets the name/id of new model elements (See
    [Dev Doc Model Creation Factory](DevDocModelCreationFactory))

## URNElementFinder

  - Given an ID, returns the model element.
  - Has a general find method for when you don't know the type, but
    other methods to improve performance and decrease required casting
    when you do.

## Query Infrastructure

  - See [Dev Doc Query Infrastructure](DevDocQueryInfrastructure)

## ModelCreationFactory

\* See [Dev Doc Model Creation Factory](DevDocModelCreationFactory)

\-- Main.JasonKealey - 11 Jul 2005
