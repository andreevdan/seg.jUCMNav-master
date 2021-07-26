# Model Creation Factory

## Overview

  - As mentioned in [Dev Doc Palette](DevDocPalette), the palette requires a model creation
    factory to support the creation tools. The factory's constructor
    requires the class to be created.
  - EMF provides factories to generate instances of elements.
  - EMF provides one factory per package.
  - Throughout our application, we frequently have to generate new
    instances of objects.

## seg.jUCMNav.model.ModelCreationFactory

  - Central location to obtain new model element instances
  - static method to obtain new objects instantly
  - initializes model elements in a uniform fashion.
  - usage example:

<!-- end list -->

    OrFork newOrFork = (OrFork) ModelCreationFactory.getNewObject(getUrnspec(), OrFork.class);

  - requires an instance of a URNspec to be able to give an adequate id
    and unique name, if relevant.
  - Use this method for all model elements, except URNspec which has its
    own getNewURNspec()
  - Overloaded method has third argument for passing a type integer, to
    preset the type for stubs and components

\-- Main.JasonKealey - 08 Jul 2005
