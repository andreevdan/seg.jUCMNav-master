Quick CVS usage tips

When checking in a project, do not check in your compiled classes

Google search: cvsignore

jpdaigle@Tempranillo ~/docs/2005_Hiver/projetseg/samples/seg.gefForDummies
``
$ find -name *.class
./bin/seg/gefForDummies/editParts/DiagramEditPart$ShapesXYLayoutEditPolicy.class
./bin/seg/gefForDummies/editParts/DiagramEditPart.class
./bin/seg/gefForDummies/editParts/RectangleEditPart.class
./bin/seg/gefForDummies/editParts/RectEditPartFactory.class
./bin/seg/gefForDummies/GefForDummiesPlugin.class
./bin/seg/gefForDummies/model/commands/ShapeCreateCommand.class
./bin/seg/gefForDummies/model/commands/ShapeSetConstraintCommand.class
./bin/seg/gefForDummies/model/Diagram.class
./bin/seg/gefForDummies/model/ModelElement.class
./bin/seg/gefForDummies/model/RectangularShape.class
./bin/seg/gefForDummies/model/Shape$1.class
./bin/seg/gefForDummies/model/Shape.class
./bin/seg/gefForDummies/RectangleEditor.class
``
-- Jean Philippe Daigle? - 25 Jan 2005

When using CVS with eclipse, check out the CVS Repository Exploring perspective. It seems natural (and it works) to "import..." from CVS, but in eclipse, you can only manage your connection from this perspective (i.e. if you make a mistake while importing, then you need to go to this perspective to correct it).

-- Jordan Mc Manus? - 03 Feb 2005 