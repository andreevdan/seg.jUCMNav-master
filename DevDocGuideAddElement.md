# Extension Guide : Add New UCM Element

## Overview

  - The purpose of this guide is to give pointers on what tasks need to
    be accomplished when a new model element is to be added.
  - For simplification purposes, lets consider adding a new PathNode
    subclass.
  - This guide should be verified by the person actually following the
    guide.

## Initial Steps

  - Read [JUCMNav Dev Doc](JUCMNavDevDoc) articles if you have the time :)
  - You'll need to add your model element to the palette so that it can
    be added.
      - Create an icon; maybe we've already created it for you; check
        the icons folder (See [Dev Doc Icons](DevDocIcons))
      - Make sure ModelCreationFactory can generate instances of your
        new object (See [Dev Doc Model Creation Factory](DevDocModelCreationFactory))
      - Add entry in UcmPaletteRoot.buildPalette() (See [Dev Doc Palette](DevDocPalette))
  - Create a figure for your new model element (See [Dev Doc Figures](DevDocFigures))
  - Create an editpart for your new element (See [Dev Doc Edit Part Creation](DevDocEditPartCreation))
      - Register your figure in PathNodeEditPart.createFigure()
      - If you have lots of new behaviour, extend PathNodeEditPart and
        Register yourself in GraphicalEditPartFactory
      - Do same for outline (See [Dev Doc Outline](DevDocOutline)):
          - Simply add icon image in PathNodeTreeEditPart
          - Hopefully won't need to access TreeEditPartFactory

## Optional Steps

  - You'll probably have some special "do something or other" that
    you'll want to add to the contextual menu.
  - Create a command that does your work (See [Dev Doc Commands](DevDocCommands)). Look at
    many command examples before attempting this; it is critical.
  - Create an action that maps a user selection to your command. (See
    [Dev Doc Actions](DevDocActions))
      - Don't forget to register your action in the action registry and
        context menu provider.

## Testing

- Any command you created implements JUCMNavCommand and must therefore
implement testPreConditions()/testPostConditions(). (See DevDocCommands)
- Create a simple test case in JUCMNavCommandTests; simply add a method
and a few lines that execute your command. Find other examples. \* You
might want to create tests for your action (elsewhere) as well, if it is
complicated. 
- See [Dev Doc Checkout Code](DevDocCheckoutCode) for running the tests.

\-- Main.JasonKealey - 14 Jul 2005
