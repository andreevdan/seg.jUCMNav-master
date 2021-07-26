# Command Structure, Learn By Example

  - Here's how to implement the latest Eclipse's API for commands
    [Dev Doc New Command Structure](DevDocNewCommandStructure)

<!-- end list -->

    /**********************************************************************************************************/
    package seg.jUCMNav.model.commands;
    
    import ucm.map.ComponentRef;
    
    /**
     * This command is used to resize/move ComponentRefs
     * 
     * @author jkealey
     *  
     */

***/\* 1. Must implement JUCMNavCommand \*/***

    public class SetConstraintComponentRefCommand extends Command implements JUCMNavCommand {
        // default size for new components
        public static final int DEFAULT_HEIGHT = 100;
        public static final int DEFAULT_WIDTH = 100;
    
        // the ComponentRef
        private ComponentRef compRef;

***/\* 2. You must remember everything that you can in order to undo the
change \*/***\</b\>

``` 
    // constraints
    private int oldWidth, oldHeight, newWidth, newHeight;
    private int oldX, oldY, newX, newY;
```

***/\* 3. It is good practice to specify all required info in the
Command's constructor. \*/***\</b\>

``` 
    public SetConstraintComponentRefCommand(ComponentRef cr, int x, int y, int width, int height) {
        setCompRef(cr);
        setNewX(x);
        setNewY(y);
        setNewWidth(width);
        setNewHeight(height);
```

***/\* 4. Call setLabel() in the constructor \*/***\</b\>

``` 
        setLabel("Change Component Constraints"); 
    }

    /**
     * We can't resize or move fixed components.
     * 
     * @return if the command can execute
     */
```

***/\* 5. canExecute() is always called before execute(); overwrite if
necessary. \*/***\</b\>

``` 
    public boolean canExecute() {
        return compRef != null && !compRef.isFixed();
    }

    public void execute() {
```

***/\* 6. Save all information needed to be able to revert later on
\*/***\</b\>

``` 
        oldX = compRef.getX();
        oldY = compRef.getY();
        oldWidth = compRef.getWidth();
        oldHeight = compRef.getHeight();
```

***/\* 7. If you need to create a new element; do not use the
EMFfactories directly. \<br\>    Use
ModelCreationFactory.getNewObject(Class) \*/***\</b\>

***/\* 8. call redo() \*/***\</b\>

``` 
        redo();
    }

    /**
     * @return Returns the compRef.
     */
    public ComponentRef getCompRef() {
        return compRef;
    }

    /**
     * @return Returns the newHeight.
     */
    public int getNewHeight() {
        return newHeight;
    }

    /**
     * @return Returns the newWidth.
     */
    public int getNewWidth() {
        return newWidth;
    }

    /**
     * @return Returns the newX.
     */
    public int getNewX() {
        return newX;
    }

    /**
     * @return Returns the newY.
     */
    public int getNewY() {
        return newY;
    }

    /**
     * Will not change model if new and old parameters are the same.
     */
    public void redo() {
```

***/\* 9. redo must start with testPreConditions(); and end with
testPostConditions() \*/***\</b\>

``` 
        testPreConditions();
```

***/\* 10. Assign values, add elements in model, etc. \*/***\</b\>

``` 
        if (oldX != newX)
            compRef.setX(newX);
        if (oldY != newY)
            compRef.setY(newY);
        if (oldWidth != newWidth)
            compRef.setWidth(newWidth);
        if (oldHeight != newHeight)
            compRef.setHeight(newHeight);

        testPostConditions();
    }

    /**
     * @param comp
     *            The component to set.
     */
    public void setComponentRef(ComponentRef comp) {
        this.compRef = comp;
    }

    /**
     * @param compRef
     *            The compRef to set.
     */
    public void setCompRef(ComponentRef compRef) {
        this.compRef = compRef;
    }

    /**
     * @param newHeight
     *            The newHeight to set. If <=0, sets the default value.
     */
    public void setNewHeight(int newHeight) {
        this.newHeight = newHeight;
        if (newHeight <= 0)
            this.newHeight = DEFAULT_HEIGHT;
    }

    /**
     * @param newWidth
     *            The newWidth to set. If <=0, sets the default value.
     */
    public void setNewWidth(int newWidth) {

        this.newWidth = newWidth;
        if (newWidth <= 0)
            this.newWidth = DEFAULT_WIDTH;
    }

    /**
     * @param newX
     *            The newX to set.
     */
    public void setNewX(int newX) {
        this.newX = newX;
    }

    /**
     * @param newY
     *            The newY to set.
     */
    public void setNewY(int newY) {
        this.newY = newY;
    }

    public void testPreConditions() {
```

***/\* 11. Conditions that must hold before a redo() and after an
undo(). \<br\>    Could be very long but will help catch regression
errors \*/***\</b\>

***/\* 12. Notice I am passing unique strings to help with debugging
\*/***\</b\>

``` 
        assert canExecute() : "pre canExecute";        
        assert compRef.getWidth() == this.oldWidth : "pre width";
        assert compRef.getHeight() == this.oldHeight : "pre height";
        assert compRef.getX() == this.oldX : "pre x";
        assert compRef.getY() == this.oldY : "pre y";
    }

    public void testPostConditions() {
```

***/\* 13. Conditions that must hold after a redo() and before an
undo(). \<br\>    Could be very long but will help catch regression
errors \*/***\</b\>

``` 
        assert canExecute() : "post canExecute";
        assert compRef.getWidth() == this.newWidth : "post width";
        assert compRef.getHeight() == this.newHeight : "post height";
        assert compRef.getX() == this.newX : "post x";
        assert compRef.getY() == this.newY : "post y";
    }

    /**
     * Will not change model if new and old parameters are the same.
     */
    public void undo() {
```

***/\* 14. undo must start with testPostConditions(); and end with
testPreConditions() \*/***\</b\>

``` 
        testPostConditions();

        if (oldX != newX)
            compRef.setX(oldX);
        if (oldY != newY)
            compRef.setY(oldY);
        if (oldWidth != newWidth)
            compRef.setWidth(oldWidth);
        if (oldHeight != newHeight)
            compRef.setHeight(oldHeight);

        testPreConditions();
    }
}
```

## Checklist

  - Implement JUCMNavCommand
      - implement testPreConditions();
          - Try to insert unique debug messages.
      - implement testPostConditions();
          - Try to insert unique debug messages.
  - setLabel() is called in the constructor
      - We could overwrite getLabel() but there are some issues that
        might arise with composite commands
  - Never invoke the EMF factories directly. Use
    ModelCreationFactory.getNewObject(Class) (see other examples)
  - testPreConditions/testPostConditions are called properly in
    redo()/undo()
  - the model is not changed in execute()
  - canExecute() and canUndo() are implemented where necessary (helps
    with GEF feedback)
  - asserts have strings that help debugging
