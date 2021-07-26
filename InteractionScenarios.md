# Specific scenarios for user interaction

## UCM diagram modification

### Create Components

#### Create components ClientAffame, Banque, Pizzeria, Livreur

1\. Select 'component' in the element palette with the mouse  
2\. Click anywhere in the editor window to place a component.  
3\. In the element properties window, change the 'Name' property to
ClientAffame.  
4\. Repeat 1-3 for Banque, Pizzeria, Livreur.  
5\. Select each component and place it in the desired location.  
6\. Drag each component's edges out to resize the components to desired
size.  
7\. Create new components named Receptioniste and Chef by using the
Component tool and clicking inside the Pizzeria component.  

### Create Path

#### Create start point and an endpoint

1\. Choose the path tool in the tool palette.  
2\. Click once inside the ClientAffame component. This creates a start
point.  
3\. Click once inside the 'Receptioniste' component to extend the path
to this component.  
4\. Click once inside the 'Banque' component to extend thepath to this
copmonent.  
3\. Select the created Start Point and edit its Name property (in the
properties window) to 'Commande'  

### Create -elements-

# Tool definition

## Path tool

The path tool indicates to the user the command to be executed by a
cursor overlay. The following actions are permissible:

  - Initial: No path nodes selected.
      - User: clicks
      - Aspect: Normal path tool.
      - Actions: Creates a Start Node at the cursor coordinates.
      - Final: Start Node selected. A rubber-band line follows the
        cursor, which is now ready to create an End Node.

<!-- end list -->

  - Initial: Start node selected, no existing End Nodes, rubber band
    follows cursor.
      - User: clicks
      - Aspect: Normal path tool.
      - Actions: Creates an End Node at the cursor coordinates.
      - Final: End node is selected. A rubber-band line follows the
        cursor, which is now ready to create another End Node to extend
        the path.

<!-- end list -->

  - Initial: Start node selected, no existing End Nodes, rubber band
    follows cursor.
      - User: cancels
      - Aspect: Normal path tool.
      - Actions: Deletes Start Node to preserve graph integrity.
      - Final: No path nodes selected.

<!-- end list -->

  - Initial: Start node selected, End Node exists in path, rubber-band
    line follows the cursor.
      - User: clicks
      - Aspect: Normal path tool.
      - Actions: Creates a new Start Node at the cursor position;
        replaces the previous one with an empty point.
      - Final: A rubber-band line follows the cursor, which is again
        ready to create another Start Node to extend the path.

<!-- end list -->

  - Initial: End Node selected, End Node exists in path, rubber-band
    line follows the cursor.
      - User: clicks
      - Aspect: Normal path tool.
      - Actions: Creates a new End Node at the cursor position; replaces
        the previous one with an empty point.
      - Final: A rubber-band line follows the cursor, which is again
        ready to create another End Node to extend the path.

<!-- end list -->

  - Initial: No nodes selected
      - User: clicks on path
      - Aspect: Path tool with + overlay
      - Actions: Creates a new empty point
      - Final: empty point selected

<!-- end list -->

  - Initial: No nodes selected
      - User: clicks on Start / End / Empty point.
      - Aspect: Path tool with selection (???) overlay.
      - Actions: Selects the Node clicked on.
      - Final: Node is selected. If node is Start or End Node, a rubber
        band line follows the cursor from the selected Node.

\-- Main.JeanPhilippeDaigle - 20 Mar 2005
