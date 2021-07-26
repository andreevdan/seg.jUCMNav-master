# What do we have to do? 
*Mandatory - Urgent and Mandatory - Medium (and some lower priority stuff taken into consideration)*

Note: this document is under construction.

## List of elements

  - Map
      - Rename
      - Title is to be more verbose; might be removed.

<!-- end list -->

  - UCMModelElement
      - Add
      - Move
      - Delete
      - Rename in properties view
      - Change description in properties view
      - Rename in editor(label)
      - Move Label

<!-- end list -->

  - Component
      - Resize
      - Bind to other component
      - See [Test Bind Unbind](TestBindUnbind)
      - Unbind from other component
      - Unbind enclosing elements
      - We manipulate references to the same component.
          - Dropdown in properties

 - Responsibility

   - We manipulate references to the same Responsibility.
      - Dropdown in properties
   - 1 in, 1 out. 
 - Path
   - Collection of NodeConnections
   - Graph traversal functions must be supplied; not in model
   - See [Interaction Scenarios](InteractionScenarios)
   - Path direction should be displayable.
   - Must discuss deletion UI with forks/joins/etc.

<!-- end list -->

  - NodeConnection \* can have conditions

<!-- end list -->

  - And Join
      - UI discussed, to be formalized.
      - visual appearance depends on path orientation
      - 2-N in, 1 out
  - And Fork
      - UI discussed, to be formalized.
      - visual appearance depends on path orientation
      - 1 in, 2-N out
  - Or Join
      - UI discussed, to be formalized.
      - visual appearance depends on path orientation
      - Guard condition: string
      - 2-N in, 1 out
  - Or Fork
      - UI discussed, to be formalized.
      - visual appearance depends on path orientation
      - 1 in, 2-N out

<!-- end list -->

  - Empty Point
      - Can be converted into a model element.
      - Mandatory-Low: Can be connected to timer, wait, start.

<!-- end list -->

  - End Point
      - Can be connected to timer, wait, start
      - Can be merged with a start point
      - can have conditions
      - 1 in, 0 out.

<!-- end list -->

  - Start Point
      - Workload: ?
      - can have conditions
      - can be merged with an end point
      - 0 in, 1 out

<!-- end list -->

  - Wait (Waiting Place)
      - Can be connected to an end point.
      - can have conditions
      - 1 in, 1 out
      - No abort/timeout paths.

<!-- end list -->

  - Timer
      - Like wait
      - Has possible timeout path.

<!-- end list -->

  - Stubs
      - Dynamic or Static
      - 1-N in, 1-N out
      - interior plugins do not have to have the same amount of in/outs
      - Must be able to create plugin.
          - creates a new map
          - positions editor at a new navigationlocation
          - from contextual menu
          - from views
      - must be able to view plugin
          - double click in editor
          - from views
          - positions editor at a new navigationlocation
      - add plug-in
          - if static and has no plug-ins, must be able to select maps
            from a list of possibilities
          - if dynamic, should be able to add a map from al ist of
            possibilities to a list of plugins
          - during execution, stub binding conditions are examined to
            know which plug-in to be used
      - remove plugin
          - inverse of previous operations
      - rename plugin
          - a plugin is just another map.
      - bind plugin
          - wizard or property page
          - activated by contextual menu on stub
              - select a plugin
              - match stub inputs with plugin start points
              - match stub outputs with plugin end points
              - numbers do not need to match
              - **TBD: UI**

<!-- end list -->

  - Connect element
      - Invisible
      - NodeConnection to EndPoint
      - (Mandatory-low allows connection to Empty node as well)
      - NodeConnection to Start/wait/timer

## Different behaviour

 - Binding/unbinding 
   - Components (all types) 
   - Path elements in components 
 - Resizing 
   - Components (all types) 
 - References andactual element 
   - Components (all types) 
   - Responsibilities
 - Conditions 
   - start 
   - end 
   - wait 
   - timer 
   - or fork 
 - Possible connection to an end point. (UML: creates connect node) 
   - waiting point
   - timer 
   - start point 
 - Mandatory-low: Possible connection to a blank point. (UML: creates connect node) 
   - waiting point 
   - timer 
   - start point 
 - Possible merger 
   - start with end (creates empty node) 
 - Timeout paths 
   - timer 
 - Path elements that end splines versus those that don't. 
   - I don't think connections should end splines as they are simply "connected". 
   - a spline passing through a timer should not stop the spline; even if a timeout path exists (which is its own spline)
   - stubs/forks/joins end splines, rest should not. 
 - Deletion 
   - **General concepts discussed. Must be formalized.**

## Behaviour that should be abstracted into "roles" known by the ?facade?

  - Path behaviour
      - with respect to the spline
      - with respect with in/outs path numbers
      - with respect to connections with end point
      - with respect timeout/abort paths

<!-- end list -->

  - the rest can be, for now, derived from class hierarchy, unless
    further analysis of future goals provide different clues.
      - bind/unbind; only to elements that can be resized.
      - high level plugin must be special cased because is so different
        from rest and has deep structural implications
      - guard conditions
      - merger is a bit like deletion

<!-- end list -->

  - what might be interesting is a 2d matrix combining all elements with
    all other ones; for each cell, list allowed behaviour when many are
    selected.

\-- Main.JasonKealey - 15 Mar 2005
