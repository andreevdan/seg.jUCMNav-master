# jUCMNav Requirements Prioritization Exercise

The following is a list of candidate high-level requirements to be
prioritized (using, for instance, Ali Pourshahid's Web-based
prioritization tool). Feel free to add to the list, modify the current
requirements, or restructure the list. Our goal is to have a list ready
for priorization by November 26, 2006.

### Usability features. jUCMNav shall support:

  - Labels
      - Movable labels for GRL contribution labels
      - Movable labels for GRL satisfaction labels
      - Movable labels for UCM stub IN/OUT segments
      - Multi-line labels in UCM responsibilities and components
  - Copy/paste
      - Copying/pasting part of UCM diagrams across diagrams in the same
        model
      - Copying/pasting part of GRL diagrams across diagrams in the same
        model
      - Copying/pasting part of UCM diagrams across models
      - Copying/pasting part of GRL diagrams across models
      - Copying/pasting part of UCM diagrams (images) to external tools
        such as Word without using the export wizard.
      - Copying/pasting part of GRL diagrams (images) to external tools
        such as Word without using the export wizard.
  - Duplicate and delete
      - The duplication of UCM diagrams
      - The duplication of GRL diagrams
      - The automatic deletion of unused UCM components and
        responsibilities
      - The combined deletion of definition **and** of all references of
        a UCM component, UCM responsibility, GRL actor, GRL intentional
        element
  - Others
      - Adding “Negate all others” (else) to conditions in UCM OR-forks
        and stubs
      - Code completion for UCM responsibility/condition code editor
      - Extracting a stub with a plug-in from a selection of UCM
        elements (refactoring)
      - Arrow to empty-point transformation in UCM diagrams
      - Responsibility to stub transformation in UCM diagrams
      - Taking the direction of the UCM path into account when adding a
        branch to a stub or a fork
      - Reorder the GRL diagrams/UCM maps (in the Outline and in the
        multipage editor)

### Visualization and Navigation. jUCMNav shall support:

  - Layout
      - Usable auto-layout of UCM diagrams
      - Usable auto-layout of GRL diagrams
      - UCM scenario/map flattening (expand stubs)
      - Collapsing GRL actors and their content
      - Collapsing UCM components and their content
      - Viewing only the result of a UCM scenario traversal
  - Views
      - A hierarchical navigation view (where are we in the tree of
        maps/submaps)
      - A component tree view (showing the containment relationships in
        components)
      - Showing GRL conflict resolutions and other decisions in the
        Problems view
      - Sorting of diagrams in the Outline view
      - Collapse/expand all in the Outline view
      - Sorting of diagrams in the Strategies/Scenarios view
      - Collapse/expand all in the Strategies/Scenarios view
      - Changing group for a strategy/scenario
      - Definition of root map for a feature/use case plus automatic
        listing of all plug-in maps reached from the defined root map
  - Others
      - The use of resizable fonts for URN models
      - Centered labels in GRL intentional elements
      - Adding labels (yellow triangle) to GRL elements when URN links
        are defined
      - The automatic identification of top-level UCM maps
      - The selectable visualization of GRL graphical and textual
        contribution/satisfaction labels globally
      - Closable panels/tabs for URN models with a large number of
        diagrams
      - Highlighting of start/end points and in/out-paths when moving
        from stub to plug-in map and back

### UCM scenarios and GRL strategies. jUCMNav shall support:

  - Semantic variations for UCM traversal (AND-joins, timers, waiting
    places, …)
  - Displaying the result of the traversal of multiple scenarios
  - Coverage analysis of multiple scenarios
  - GRL strategies integrated with UCM scenario definitions
  - GRL numerical contributions (beyond current help, make, hurt…)
  - Automated combination and execution of each scenario in group A with
    each scenario in group B (or potentially, each scenario in the model
    with all other scenarios)
  - Indicating order of plug-in traversal where one or more plug-ins of
    a stub are traversed multiple times during the execution of one
    scenario
  - String data type for scenatio definitions
  - Interactive selection (by user) of alternatives in non-deterministic
    locations when executing a UCM scenario
  - Local variables for components in scenario definitions
  - Local variables for plug-ins in scenario definitions

### Architecture. jUCMNav shall support:

  - Diff of URN models (beyond Eclipse’s XML diff)
  - Merging URN models
  - The generalization and refactoring of the model import API
  - The inclusion of a textual use case editor
  - URN hyperlinks (to/from URLs)
  - A scripting language for batch execution and tool interworking
  - A central repository with locking mechanism for concurrent
    development of URN models
  - Links to an Architecture Description Language (ADL)

### Transformations of URN models. jUCMNav shall support:

  - Exporting UCM models to UML use case diagrams
  - Exporting UCM models to UML activity diagrams
  - Exporting UCM scenarios to UML sequence diagrams
  - Exporting UCM scenarios to Message Sequence Charts
  - Exporting UCM scenarios to DOORS (in DXL)
  - Exporting UCM scenarios to XML
  - Exporting UCM to FitNesse test goals
  - Exporting GRL strategies to HTML
  - Exporting UCM models to BPMN (Business Process Modeling Notation)
  - Exporting UCM models to BPEL (Business Process Execution Language)
  - Exporting UCM models to CSM (Core Scenario Model)
  - Exporting UCM models to TTCN-3 test cases
  - The application of UCM reengineering patterns

### Generation of URN reports. jUCMNav shall support:

  - Images
      - Cropping images to eliminate surrounding white space during
        export
      - Optional rectangles around images during export
      - Exporting URN images in SVG format (Scalable Vector Graphics)
      - Exporting URN diagrams in PS/PDF
  - Reports
      - Exporting URN model information to HTML (in addition of images)
      - Exporting URN reports to one flat HTML file (instead of current
        multi-file, hierarchical HTML documents)
      - Exporting URN reports in MS Word (e.g. RTF)
      - Exporting URN reports in PS/PDF
      - Saving URN models to metamodel-independent XML-based file format

### Import of URN models. jUCMNav shall support:

  - Loading URN models from metamodel-independent XML-based file format
  - Loading UCM models from old UCMNav files
  - Importing GRL models from the OpenOME tool (OME uses the same file
    format)
  - Importing UCM models from the Compact Trace Format (CTF)
  - Importing UCM models from ASP.NET code
  - Importing UCM models from .NET code

### URN notation. jUCMNav shall support:

  - Existing URN metamodel concepts
      - Meta-information (tagged values) attached to URN elements
      - Performance annotations
      - UCM dynamic components (slots) and dynamic responsibilities
      - UCM empty responsibilities
      - UCM component stacks
      - UCM events on start points, waiting places, and timers
      - User-defined links between GRL and UCM elements
  - New concepts
      - UCM exception mechanism (definitions and handling)
      - UCM stub references (separate from stub definition)
      - Time concept in URN
      - UCM component classes and instances
      - Distinguishing UCM plug-in maps that are the same instance from
        those that are different instances
      - UCM component parameterization in stubs/plug-ins
      - Groups of stubs which share the same plug-in instance and
        optional merging of plug-in bindings for those stubs
      - Reference to “parent” component in UCM plug-ins
      - GRL dependencies between actors - expanding/hiding actor details
      - Visual user-defined comments (post notes) for UCM diagrams
      - UML class diagrams for describing domain models
      - Aspect-oriented concepts and notation for UCM
      - Aspect-oriented concepts and notation for GRL

### Documentation

  - jUCMNav shall include help for all its wizards
  - jUCMNav’s documentation shall cover GRL model editing
  - jUCMNav’s documentation shall cover GRL strategy usage
  - jUCMNav’s Web site shall include examples (GRL with strategies, UCM
    with scenarios, models integrating GRL and UCM)
  - jUCMNav’s Web site shall include training material (exercises and
    solutions) for creating and analyzing URN models

\-- Main.DanielAmyot - 19 Nov 2006
