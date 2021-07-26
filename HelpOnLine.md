# jUCMNav Online Help

## Part I - Introduction

### User Requirements Notation (URN)

jUCMNav is a graphical editor and an analysis and transformation tool
for the *User Requirements Notation* (URN). URN is intended for the
elicitation, analysis, specification, and validation of requirements.
URN combines modelling concepts and notations for *goals and intentions*
(with GRL, mainly for non-functional requirements and quality
attributes) and *scenarios* (with UCM, mainly for operational
requirements, functional requirements, and performance and architectural
reasoning). In particular, URN has concepts for the specification of
goals, non-functional requirements, rationales, behaviour, scenarios,
and structuring. URN allows software and requirements engineers to
discover and specify requirements for a proposed system or an evolving
system, and analyse such requirements for correctness and completeness.
URN is applicable within standards bodies and industry. It helps to
describe and communicate requirements, and to develop reasoning about
them. The main applications areas include telecommunications systems,
services, and business processes, but URN is generally suitable for
describing most types of reactive systems and information systems. The
range of applications is from business goals and requirements
description to high-level design.

### The Goal-oriented Requirement Language (GRL)

#### GRL in a Nutshell

The *Goal-oriented Requirement Language* is a graphical language for
supporting goal-oriented modelling and reasoning about requirements,
especially non-functional requirements and quality attributes. It
provides constructs for expressing various types of concepts that appear
during the requirement process. GRL has its roots in two widespread
goal-oriented modelling languages: i\* and the NFR Framework. Major
benefits of GRL over other popular notations include an integration with
a scenario notation and a clear separation of model elements from their
graphical representation, enabling a scalable and consistent
representation of multiple views/diagrams of the same goal model.

#### Why use the Goal-oriented Requirement Language?

  - Goals become an important driver for requirements elaboration. Yet,
    stakeholders goals and objectives are complex and will conflict
  - GRL expresses and clarifies tentative, ill-defined and ambiguous
    requirements
      - Models goals and their importance to stakeholders
      - Supports argumentation, negotiation, conflict detection &
        resolution, and in general decisions
      - Captures decision rationale and criteria (documentation)
  - GRL identifies alternative requirements and alternative system
    boundaries
  - GRL provides clear traceability from strategic objectives to
    technical requirements
  - GRL allows reuse of stable higher-level goals when the system
    evolves
  - GRL strategies help visualize satisfaction levels related to
    high-level decisions
  - Nothing like this in UML...

### The Use Case Maps (UCM) Notation

#### UCMs in a Nutshell

The *Use Case Map* notation is a graphical language that employ scenario
paths to illustrate causal relationships among *responsibilities*. UCM
models provide an integrated view of behaviour and structure by allowing
the superimposition of scenario paths on a structure of abstract
components. The combination of behaviour and structure enables
architectural reasoning after which UCM specifications may be refined
into more detailed scenario models such as MSCs and UML sequence
diagrams, or into state machines in SDL or UML statechart diagrams and
finally into concrete implementations. Validation, verification,
performance analysis, interaction detection, and test generation can be
performed at all stages. Thus, the UCM notation enables a seamless
transition from the informal to the formal by bridging the modeling gap
between goal models and natural language requirements (e.g. use cases)
and design in an explicit and visual way. The UCM notation allows the
user to delay the specification of component states and messages and
even, if desired, of concrete components to later, more appropriate,
stages of the development process. The goal of the UCM notation is to
provide the right degree of formality at the right time in the
development process.

#### Why use Use Case Maps?

  - Bridge the modeling gap between use cases, requirements, and design
      - Link behavior and structure in an explicit and visual way
      - Provide a behavioral framework for making (evaluating)
        architectural decisions at a high level of design
      - Characterize the behavior at the architecture level once the
        architecture is decided
  - Convey a lot of information in a compact form
  - Use case maps integrate many scenarios
      - Enables reasoning about potential undesirable interactions of
        scenarios
  - Provide ability to model dynamic systems where scenarios and
    structures may change at run-time
      - Business processes
      - E-commerce applications, Web services
      - Distributed systems based on agents
  - Effective learning tool for people unfamiliar with the domain
  - UCM scenarios may be transformed (e.g., into MSC/sequence diagrams,
    performance models, test goals)

### Reference

  - For an in-depth explanation of both notations, which are portions of
    the User Requirements Notation (URN), please visit
    [UseCaseMaps.org](http://www.usecasemaps.org/)

### Quick Tour of Eclipse and jUCMNav

#### Creating and Opening Files

[[img/newFile.png]]

  - In Eclipse, one must understand that all files and folders must be
    in projects. You can create a new project by using a wizard: File
    -\> New -\> Project.
      - Choose Simple -\> Project.
  - Once a project is created, select it and create a new jUCMNav file
    (\*.jucm)
      - File -\> New -\> Other
      - jUCMNav -\> Use Case Map / GRL Graph, Click next.
      - Choose the containing project and name your .jucm file.
      - Select whether you want the URN model to include a default UCM
        and/or GRL diagram.
      - Click finish.
  - Later, you can open and close files by using the Navigator view. You
    can also use the File -\> Import wizard to import existing files
    from the file system into your Eclipse workspace.

#### Perspectives

  - Now that you have an open file, you might be wondering why your
    interface does not look exactly like the screenshots below. This is
    because Eclipse uses *perspectives* to layout all the windows in the
    interface. Perspectives can be saved, reset and changed.
      - jUCMNav has its own perspectives (one for regular editing as in
        the first screenshot, the other for scenario execution as in the
        second screenshot).
          - Window -\> Open Perspective -\> Other
          - Choose jUCMNav (or jUCMNav Execution).
  - Later, you may return to another perspective by using the
    alternatives presented in the Windows menu bar or by clicking on the
    \>\> button at the top right of your screen.
[[img/GRL.png]]

[[img/UCM.png]]

#### Views and Editor

  - Navigator View
      - Top left corner
      - Contains all the files in your projects.
  - Editor
      - Center of the page.
      - The main location for manipulating URN models.
      - When one opens a file, an editor is opened.
      - Because one file can contain multiple GRL/UCM diagrams in one
        model, this editor has multiple tabs at the bottom.
      - Will be described in greater depth in further sections.
      - Double click on the title to use the whole screen to edit your
        model.
  - Palette
      - There is a collapsible palette inside of the editor, on its
        right side.
      - It can be moved to the left or side, or collapsed if screen real
        estate is scarce.
      - The described contains elements that can be inserted into a
        diagram.
      - Different layouts and icon sizes are available by righ-clicking
        on the palette.
      - Will be studied in greater depth in further sections.
      - **Important**: Press ESC to replace the currently selected tool
        with the selection tool.
  - Outline View
      - (see additional screenshot below)
      - Bottom left corner
      - Shows an outline of the contents of the URN specification
        currently loaded editor.
      - From this view, you will be able to add/remove UCMs/GRL diagrams
        and manipulate component, responsibilities, actors, and
        intentional element definitions.
      - Selecting something in the editor will reflect the selection in
        the outline and vice-versa.
      - The outline has multiple sub-views. The regular outline with
        diagrams and definitions view visualizes everything in the model
        in a tree view format.
      - The definitions sub-view (small D icon) filters the list to only
        show element definitions (as opposed to references or particular
        diagrams). This view makes it easier to drag definitions onto
        diagrams.
      - The concerns sub-view (small C icon) shows the various
        *concerns* in the model (for Aspect-oriented URN).
      - The graphical outline view (mini UCM/GRL icon) shows a smaller
        graphical view of what is contained within the editor, allowing
        you to easily navigate larger diagrams.

[[img/Outlines.png]]

  - Scenarios / Strategies view
      - Bottom middle
      - Shows the scenarios and strategies that have been defined for
        this URN model.
      - One can switch between design and execution view by using the
        icons in this view's toolbar
      - While in execution view, if we select a scenario or strategy, it
        will be executed and the results will be visually shown.
  - Properties View
      - Bottom right side of screen; can be moved elsewhere if needed,
        as with any Eclipse view.
      - When an element is selected in the Editor, its properties are
        shown here.
      - Many properties can be updated through this view.
      - For complex properties, dialogs or wizards may be offered to
        simplify the manipulation.
  - Elements View
      - Behind the Outline view.
      - For UCMs: Shows the names/descriptions of every responsibility
        in the current map.
      - For GRL: Shows the names/descriptions of every intentional
        element in the current graph
  - Problems View
      - Behind the Properties view.
      - jUCMNav scenarios may generate errors / warnings that are added
        in this view.
      - Double-clicking on an error / warning will bring you to the
        model element that caused the problem.
  - Toolbar
      - At the top of the interface, there is a toolbar of buttons.
      - The toolbar includes some standard Eclipse buttons, such as
        undo-redo and navigation back through your history.
      - It also includes some jUCMNav specific buttons: a zoom selector,
        a button to open jUCMNav's display preferences, a button to
        toggle the advanced mode feature and a button to open the
        auto-layout mechanism.
      - The display preferences enable you to hide certain items (for
        example UCM empty points), useful when including models in
        documents for publications

[[img/toolbar.png]]

#### Preferences

  - Open the Window -\> Preferences -\> jUCMNav Preferences menu to edit
    jUCMNav's preferences.
  - The top-level preferences concern various display options.
      - Author name: This name is used to record the creator of a URN
        model and used in a few reports.
      - Diagram Display Options: These hide/show various model elements,
        which can be useful when models are to be included in official
        documents (publications, etc.) where it is desirable to remove
        design elements.
      - Advanced Mode: These are advanced features which are not
        typically used by beginners. When deactivated, they are no
        longer included in the user interface, to avoid confusing those
        unfamiliar with those concepts.
      - Use anti-aliasing in diagrams: a visualization option
      - Add existing GRL links automatically: when dragging a GRL
        definition to a diagram, this option will inform jUCMNav to
        automatically create links (decompositions, contributions, etc.)
        to other elements already on the diagram, based on the links
        already defined in the model.
      - Use a strict UCM pseudo-code editor: This option ensures that
        the pseudo-code editor used within UCM diagrams enforces the
        standard pseudo-code syntax.
  - Auto-layout preferences are mainly about stating where
    [GraphViz](http://www.graphviz.org/) (required) is installed,
    orientation and page size.
  - Color Preferences define some standard colors used in jUCMNav.
  - GRL Strategy Evaluation Algorithm: Defines how evaluations are
    calculated by strategies within GRL models.
  - KPI Monitoring Preferences: The URL to fetch the KPI values used in
    the model.
  - Metrics Preferences: Manage the list of metrics which can be
    computed on the model.
  - Outline Preferences: Filters/sorts the outline view based on these
    settings.
  - Reference/Definition Preferences: Specifies how to behave when
    deleting references/definitions.
  - Report Generation Preferences: Display settings used within the
    various reports.
  - Scenario Export Preferences: Various options related to exporting
    scenarios from a UCM model.
  - Static Semantics Checking Preferences: Manages the list of semantic
    checks which can be applied on the model.
  - UCM Scenario Traversal Algorithm: Defines how scenarios are
    evaluated within UCM models.

[[img/PreferencesTop.png]]

## Part II - Basic Editing

**Note**: Many of these features are illustrated with Flash demos (see
JUCMNavTutorials).

### Keyboard shortcuts

  - The following text discusses actions that can be performed using the
    mouse.
  - Most of these can be done using the standard GEF editor keyboard
    shortcuts.
  - With an element selected, use the arrow keys to change your
    selection. Hold the Ctrl or select key while using the arrow keys to
    expand your selection.
  - With elements selected, hit the . (period) key. Your arrow keys will
    now allow you to move the selected elements. Hit enter to confirm
    the new location.
  - Using the . (period) key, you can cycle between move and resize
    different bounds. For example, select a component, hit period twice
    and you can resize its right bound using the arrow keys and confirm
    the new size using enter.

### Diagrams

#### Adding a GRL or UCM diagram

  - This can be done in many ways:
      - jUCMNav menu --\> Add GRL Diagram (or Add Use Case Map)
      - Right-click any element in the Outline View --\> Add GRL graph
        (or Add UCM)
      - Right-click any element in the Editor --\> Add GRL graph (or Add
        UCM)
  - Notice a new diagram has been added in the outline and a new tab
    exists at the bottom of the page.
  - The new diagram has been opened in the editor.
  - To return to your previous diagram, click on its tab or its entry in
    the outline and it will be reopened.
  - Furthermore, the toolbar contains a back and next arrow to browse
    through your navigation history.

#### References versus Definitions

  - Some UCM and GRL constructs use references and definitions (UCM
    components, UCM responsibilities, GRL actors, GRL intentional
    elements, and GRL links).
  - When creating a reference, you also create a new definition. See the
    Outline view for a list of all definitions in a model.
  - You can drag and drop a definition from the Outline view (in the
    UCM/GRL definitions section) to the editor.
  - All references must be associated to a definition, but not all
    definitions must have references.
  - Unreferenced GRL/UCM definitions are grayed out in the Outline view
  - You can change the associated definition of a reference in the
    Properties view.
  - Properties such as name and descriptions are stored in the
    definitions. Modification of these properties update all references.
  - Note that definitions must have unique names.

### Components (UCM) / Actors (GRL)

  - Insertion / Moving
      - To insert a component or actor reference, select it in the
        palette and click in the editor to insert it.
      - You may also click and drag when inserting to resize it on
        creation.
      - If you click anywhere on the component/actor reference, it is
        selected.
      - Once selected, you can move the component/actor in the editor.
      - If you click on the bounds of the component/actor, you may
        resize it.
      - When creating a component or actor, a label will be created
        automatically.
      - The label represents the name of the component/actor definition.
        If you change the name field in the properties, you will change
        the definition's name. All references in the editor will be
        updated.
      - You can also double click on a label to change it directly in
        the editor.
  - Other properties
      - You can change the fill and line color of references in the
        properties. All references will be updated. Note that if filled
        is false, the fill color will be ignored; the component/actor
        will appear transparent.
      - Components can have different kinds. You can change the
        component kind in the properties. Changing the kind will have a
        visual impact on the figure.
      - One cannot move or resize fixed components/actors.

### Intentional Elements (GRL)

  - Insertion / Editing
      - To create a new intentional element, select it type (Softgoal,
        Goal, Task, or Resource) in the palette and click in the editor
        to insert it (or drag and drop the element from the palette to
        the editor).
      - Intentional elements are resized automatically in the editor.
        The element size is calculated using the element name length.
        You may also manually resize intentional elements by dragging
        one of their borders.
      - You can double click on an intentional element to edit it name.
      - You can change an intentional element type using the properties
        view.
      - The importance of the element to its containing actor (if any)
        is shown between parenthesis next to the intentional element's
        name
  - Other properties
      - Fill and line colors can be changed in the properties. Note that
        fill and line colors are ignored if a GRL strategy is applied.
      - Criticality, priority and decomposition type are properties
        associated with the references. Modifying the value for a
        reference does not affect other references in the model.

### Beliefs (GRL)

  - Creation / Editing
      - Create a belief using the belief element in the palette
      - Beliefs are local to diagrams
      - The size of the element is set based on the length of the
        description
      - The description can be modified by double-clicking on the belief
  - Belief links
      - Links can be create between beliefs and intentional element
        references using the Belief Link tool. To create a link, select
        the tool, click on the starting element (belief) and on the
        destination element (intentional element reference).

### Creating Paths (UCM)

  - Creation
      - To create a path, select the path tool in the palette.
      - Click once in the editor and notice a small path being created.
      - Notice the end point is selected.
      - Click elsewhere in the editor.
      - The path will be extended.
      - Repeat until satisfied and click the selection tool in the
        palette to disable this behaviour.
  - Extensions
      - Select a start or end point, choose the path tool in the
        palette.
      - Your next click will extend the path.
      - To insert an empty point on an existing path, click on a node
        connection with the path tool selected. Notice the new empty
        point was added and that the path's empty point is selected.
  - Inserting path elements
      - To insert path elements on a path, simply select the path
        element in the palette and click on the node connection on which
        it is to be inserted.
      - As with component references and definitions, the
        responsibilities that are inserted on a path are references. See
        the components section for more information about references
        versus definitions.

### Decomposition, Dependencies, and Contributions (GRL)

  - Creation
      - Links can be created between intentional element. To create a
        link, select the type (Decomposition, Contribution, or
        Dependency). Then, click on start element and on the destination
        element.
      - Only one link can be create between two elements.
      - Links are created using references and definitions.
      - Contribution levels are set through the Properties view.

### Elements bound to components (UCM) / actors (GRL)

  - By default, any element moved onto a component/actor is bound to it.
  - When bound, elements are moved and resized automatically if one
    moves or resizes the parent.
  - If you move a component/actor behind other elements, these will not
    be bound. Automatic binding occurs when moving elements onto
    components/actors.
  - If you wish to bind these other elements to a component/actors, you
    may use the contextual menu option to do so.
  - One can bind/unbind an element from its parent using either the
    contextual menu or property page.
  - One can bind/unbind all enclosed elements from a component/actor
    using the contextual menu.
  - Note the special behavior concerning fixed components/actors.

### Working with labels (UCM/GRL)

  - Some labels are created automatically when an element is created:
    start points, end points, responsibilities, stubs, components,
    actors.
  - These labels contain the name of the element.
  - They can be moved around freely. When the labelled element is moved,
    the labels will move as well.
  - You can hide these labels by deleting them (contextual menu or
    delete key).
  - The name of the element can be changed directly in the editor by
    double clicking on the label.

### Forks/Joins (UCM)

  - To insert a fork or join on a path, you can use the palette and do
    as you would with any other path node.
  - You can also use the palette and insert them directly on an empty
    point.
  - The contextual menus also allow you to replicate the same behaviour.
  - It is also possible to drag and drop a start point on a node
    connection or empty point to form an OR fork. The same is applicable
    for an dragging an end point on a node connection or empty point and
    creating an OR join.
  - If you need to change an OR fork/join into an AND fork/join, use the
    contextual menu.
  - Additional branches can be inserted on forks and joins using the
    contextual menu or by using the same drag and drop technique
    illustrated above.

### Conditions (UCM)

  - The node connections exiting OR forks, timers and waits can have
    conditions that will be illustrated visually.
  - To insert a condition, select the node connections and modify its
    properties. You must change the label field to the condition you
    want to be displayed. The expression field is used for scenario
    evaluation.
  - Start points can have pre-conditions and end points,
    post-conditions. The behaviour is the same.
  - To hide a condition label, change its text to an empty string or
    delete it.
  - See the scenario portion of this guide to learn more about the
    syntax of conditions in jUCMNav.

### Deletion (UCM/GRL)

  - You can select an element and use the contextual menu or press the
    delete key to remove it from the URN diagram. If a reference is
    deleted, its definition will not be affected, unless you are
    deleting the last reference associated with this definition and the
    preferences state it should also be deleted.
  - You can select multiple elements using your mouse or the select all
    option and delete them all.
  - You can delete elements via the outline, but can only delete
    definitions that have no references (unless you have specified
    otherwise in the preferences).
  - UCM
      - If a stub, join or fork is deleted, the existing branches will
        be truncated.
      - You can delete a portion of a path by deleting its start point
        or end point.
      - If only one entry/exist path subsists for a join/fork, it will
        be replaced with an empty point.
      - If no entry paths and no exist paths subsist for a stub, it will
        be deleted as well.
  - GRL
      - Deleting an intentional element reference delete all the link
        references associate to the element. The link definition is
        deleted if the model does not contain other references to the
        link.

### Waiting places, timers and connects (UCM)

  - Timers can have a timeout path. Use the context menu to insert a
    timeout path. It has a special icon to help identify it.
  - As mentioned previously, waiting places and timers have conditions.
    The timeout path condition is the logical opposite of the regular
    path's condition. Therefore, one cannot add a condition on the
    timeout path.
  - To create a synchronous connection, select both an end point and a
    starting point, waiting place or timer to choose the connect
    elements option in the contextual menu.
  - Once connected, the path elements will move together. If they
    overlap, simply use the outline to select the one beneath to modify
    its properties.
  - To disconnect the elements afterwards, use the contextual menu.
  - Asynchronous connections work similarly, but using an empty point
    and starting point, waiting place or timer.
  - Drag and drop also works to create connections, for waiting places
    and timers only.

## Part III - Advanced Editing

### Zooming and view modes

  - There are controls in the toolbar located above the editor. Next to
    the obvious undo/redo buttons is located the zoom level drop down
    box.
  - Select a zoom level and the editor will be updated.
  - Note that only the currently opened diagram will be affected.
  - To the right of the zoom level drop down box is the view mode drop
    down box.
  - Using this drop down box, one can choose to hide all empty points
    from the editor or to hide all empty points and stub labels.

### Auto-layout

  - In the toolbar, there is also a round button. Click on it to open
    the auto-layout wizard.
  - If you have [GraphViz](http://www.graphviz.org/) (dot) installed,
    the wizard will automatically position the elements of the current
    diagram.
  - Auto-layout is very useful when importing GRL catalogues into a URN
    model.
  - Auto-layout can be undone.

### Using Stubs

[[img/jucmnav-screenshot3.png]]

  - Stub plugins
      - Open a stub's contextual menu and select the "Edit stub plugins"
        option.
      - This view allows you to bind a stub to other maps.
      - The left portion of the screen presents a list of possible maps
        that this stub can be bound to.
      - If the checkbox next to a map is checked, it is bound to this
        stub. Note that static stubs can only be bound to one map.
      - Check one box and observe the plugin tree at the middle of the
        screen.
  - Plugin tree
      - The plugin tree lists all the current bindings. Click on the
        binding between a map and the plugin and notice the new panel to
        the right of the screen.
      - This panel has two tabs.
          - First, the start/end point shows the relationships between
            the stubs in/out paths and the plugin's start/end points.
            When the path is traversed, it will pass through the Stub's
            in-bound path down into the related plugin's start point. It
            will then flow through the plugin map and, once it hits an
            end point, it bubble back up to the stub's associated
            outbound path.
          - Second, the Components/Responsibilities tab lets you define
            relationships between these elements in the parent map and
            the plugin map. In the child, the associated element will
            behave as if it was passing through the parent element.
      - To create associations, simply select one element in the left
        list and another in the right list and click the bind (\<-\>)
        button. Certain elements can be re-used.
      - If you ever need to delete this binding, select it in the plugin
        tree and press the delete button.
  - Binding condition
      - The bottom right portion of the view defines the condition that
        must be respected in order for this plugin to be activated.
        Click on ... to open the pseudo-code editor.
      - Labels (displayed between \[...\]) can be provided, together
        with descriptions.
      - A probability can also be associated with the binding, and one
        can also indicate whether the plugin should be executed as a
        transaction.

### Import/Export

[[img/Export.png]]

#### Exporting Images

  - To export a diagram to an image (\*.jpg, \*.gif, \*.png or \*.bmp),
    select a diagram background, open the contextual menu and select the
    export option.
  - Alternatively, you could access the same option in the diagram's or
    URNSpec's contextual menu in the outline or by using the File -\>
    Export -\> Export UCM/GRL/URN menu.
  - Choose to export individual diagrams in order to produce diagrams
    for each individual file. Ctrl-A will select all diagrams.
  - Select the path where the images should be saved, the file type and
    select the diagrams to export, and press finish.

#### Other Import/Exports

  - jUCMNav's import/export mechanisms are extensible via plugins to
    jUCMNav.
  - Some example plugins:
      - Import/Export in [standard Z.151 format (XML)](Z151ImportExport)
      - Import/Export [GRL Catalogues](#GRL_Catalogues)
      - Export to .dot format for GraphViz
      - Export [GRL Strategies to .csv
        files](#Exporting_Strategies_in_CSV)
      - Export Scenario Execution Traces (as UCM or MSC), see [Part
        V](#Part_V_UCM_Scenarios).
      - Export to Telelogic DOORS DXL
          - jUCMNav can export and synchronize URN models with
            [Telelogic
            DOORS](http://www.telelogic.com/corp/products/doors/index.cfm)
            for requirements management and traceability.
            [[img/DOORS.png]]
          - For more information and online demos, see DoorsExport
      - Export to CSM
          - Exports UCM models to the CoreScenarioModel representation,
            targeting performance modelling.
          - UCM models need to include resource definitions expressing
            deployment information, as well as resource usage and
            workload information.
          - jUCMNav includes several wizards and windows enabling users
            to input this information, for instance
            [[img/resources.png]]
          - For more information, see CsmExport

### Report Generation

  - jUCMNav allows users to export URN models to PDF documents, RTF
    (Microsoft Word) documents or HTML pages.
  - The Report Generation Preferences allow you to specify the
    dimensions and orientation of the report’s pages (for PDF and RTF
    reports). These preferences also allow you to specify the elements
    you wish to include in the report. In particular, it is possible to
    include the following URN elements:
      - Diagram descriptions (UCM and GRL diagrams).
      - URN links.
      - UCM-specific preferences. If the “Show UCM diagrams and
        descriptions” preference is checked, you can decide whether or
        not the report should include information related to
        responsibilities, stubs, or forks, start points and end points,
        in addition to the UCM diagrams themselves.
      - Documentation and execution of scenarios. If the “Show scenario
        execution information” preference is checked, the report will
        have a section that will execute each scenario that is part of
        the model, and will return the execution result (i.e. Passed or
        Failed) as well as information on errors/warnings (if any) that
        occurred during the execution. If the “Show scenario
        information” preference is checked, the report will have a
        section describing each component (included scenarios, start/end
        points, initializations, preconditions and postconditions) of
        the scenarios present in the model.
      - GRL-related preferences. If the “Show GRL diagrams and
        descriptions” preference is checked, you can decide whether or
        not the report should include information related to GRL beliefs
        and intentional elements, in addition to the GRL diagrams
        themselves.
      - GRL Strategy evaluations. If the “Show Strategy Evaluation
        information” is checked, you can decide whether or not the
        report should evaluate the trends of the strategy evaluations
        found in the model, in addition to the evaluations themselves.
        If that last preference is checked, you will need to specify the
        number of evaluations to be used when a trend is calculated.

[[img/ReportGen_Prefs.png]]

  - Typical PDF and RTF reports contain the following sections (here
    listed in order of appearance):
      - A title page.
      - A data dictionary section: this section includes a list of
        scenario groups (with all their scenarios), the
        names/descriptions of variables, GRL intentional elements as
        well as GRL actors and a strategy legend (used in the strategy
        evaluation table, displayed in the following section).
      - A section including all the evaluations of strategies that are
        part of the model, as well as a trend for each intentional
        element/actor.
      - A section including all the diagrams present in the URN model,
        as well as a description of their components.
      - A Scenario Documentation section: this section includes the
        scenario execution summary for all scenarios that are part of
        the model, followed by information on every component of these
        scenarios.
      - Note that one or more of these sections could be missing
        depending on the values of the Report Generation Preferences and
        the elements present in the model.
  - The HTML reports contain an interactive menu that consists of three
    main sections:
      - UCM Diagrams: By clicking on this directory, you will be able to
        see the links to every UCM diagram present in the model. These
        links are listed as sub-menus of the UCM Diagrams menu. Each of
        these sub-menus will lead to an HTML page consisting of the
        corresponding diagram as well as a description of each of its
        components.
      - GRL Diagrams: By clicking on this directory, you will be able to
        see the links to every GRL diagram present in the model. These
        links are listed as sub-menus of the GRL Diagrams menu. Each of
        these sub-menus will lead to an HTML page consisting of the
        corresponding diagram as well as a description of each of its
        components.
      - Definitions: This menu contains a UCM Definitions sub-menu, a
        GRL Definitions sub-menu, a UCM Scenarios sub-menu as well as a
        link to the report’s title page.
          - The UCM Definitions page typically consists of a description
            of the model’s variables, enumeration types, as well as a
            list of the model’s scenario groups.
          - The GRL Definitions page typically consists of the strategy
            evaluation table.
          - The UCM Scenarios page consists of a summary of the
            execution of each scenario that is part of the model, as
            well as a description of each component of these scenarios.
      - Note that it is possible that one or more pages are empty (i.e.
        contain only the titles of the various sections without any
        information). This will depend on the values of the Report
        Generation Preferences as well as the components that are
        present in the URN model.
  - To generate a report, select File -\> Export… -\> Generate a Report
    (or select that context menu on a .jucm file in the Navigator view).

[[img/ReportGen_Export_Page1.png]]

  - Next, select the target directory, the report format (PDF, RTF or
    HTML Pages). If the type selected is either PDF or RTF, you will
    need to specify the report name as well as the diagrams to export.
    Note that the diagram list displayed in the wizard is filtered
    according to the value of the preferences mentioned above. UCM
    diagrams will be displayed if the “Show UCM diagrams and
    descriptions preferences” or one of the two scenario preferences is
    checked. Similarly, GRL diagrams will be shown if the “Show GRL
    diagrams and descriptions” or the “Show Strategy Evaluation
    information” is checked.
  - When all parameters have been entered, click on Finish.

[[img/ReportGen_Export_Page2pdf.png]]

[[img/ReportGen_Export_Page2html.png]]

  - When the “Show GRL Strategy Evaluations trend” preference is
    checked, the strategy evaluation table in the report will contain an
    additional column which illustrates the variation of the numerical
    value of the intentional element or actor by calculating a trend.
    The trend is calculated based on the last 3 evaluations by default,
    which can be modified in the preferences. The value entered in the
    preferences will be displayed in the Strategy Legend section of the
    report. There must be at least two strategies in order to calculate
    a trend. A positive trend is represented by an up arrow, a negative
    trend by a down arrow, a neutral trend (no variation) by a straight
    arrow and a varying trend by a zigzagging arrow. If there are not
    enough strategies to calculate a trend (number of strategies is less
    than two or smaller than the number set in the preferences), a
    question mark will be displayed instead to indicate that no trend
    could be calculated.

[[img/Report_GRLStrategyTrend.png]]

  - This export is work in progress. Among the current features present
    and missing in the report generator:
      - OCL constraints are not reported.
      - Information related to KPIs is not displayed.

[Click here](jUCMNav_s_Report_Generation_Tool) to view a series of tutorial videos on jUCMNav's report
generation tool as well as a few report samples.

### GRL Catalogues

  - GRL catalogues are reusable high-level GRL models, often used to
    describe common model elements and relationships related to
    non-functional aspects.
  - Catalogues are used to start new models or add concerns to existing
    ones. They consist of a XML file describing:
      - Intentional elements
      - Decomposition, contribution, and dependency links
      - Actors
      - Containment of intentional elements in actors
  - To create a catalogue, in a URN model, use the *Export* mechanism
    and choose to export the whole URN file. The file type is \*.grl for
    catalogues.
  - To import a catalogue in a model, select *Import* in the contextual
    menu and select the .grl file to import.
      - The import mechanism creates a new GRL diagram with the above
        four types of elements (intentional elements, links, actors,
        containment).
      - If a name already exist in the model where the catalogue is
        imported, then the imported elements gets a numerical suffix
        (-1, -2, -3...) and can be renamed or changed later to refer to
        the original file definition.
      - The autolayout feature can be used to display the diagram.

### Metadata

[[img/Metadata.png]]

  - jUCMNav allows users to add metadata to any model element. Metadata
    information is a pair \<Name, Value\>, and many such pairs can be
    attached to a model element. This can be used in ad hoc analysis or
    transformations.
  - The Metadata Editor (above) is invoked by selecting a model element
    and right-clicking on the Edit Metadata item in the pop-up menu.
  - The type of element (first pull-down menu) can be used as a filter.
    The second pull-down menu allows to select an element of the desired
    type.
  - The window includes a table that shows the name-value pairs attached
    to the model element. New ones can be added, and the existing ones
    can be edited and deleted.
  - For elements that are references to definitions, metadata can be
    created on both the reference and the definition.
  - Metadata with names that start with *ST* are considered as
    stereotypes and will be shown between \<\< and \>\> in the element's
    label. The label of the element will include a ¶ symbol to indicate
    the presence of non-stereotype metadata. Metadata values are shown
    in the element's tool ship as illustrated below. 
[[img/metadataIndicators.png]]

### URN Links

  - The concept of URN links has been greatly expanded from previous
    versions of jUCMNav. Currently URN links can be created between any
    two URN model elements. These can be any UCM or GRL diagram element,
    URN definition objects ( Component, Responsibility, Actor,
    Intentional Element ), Evaluation Strategies and groups, UCM
    Scenarios and groups, as well as UCM and GRL diagrams themselves
  - URN links are created, viewed and managed by a popup menu invoked by
    the "URN Links ..." contextual menu item. Links can be created,
    modified ( by modifying the URN link type ), and deleted.
  - Once an element has one or more links, one of three icons are
    displayed next to the element labels. A triangle pointing to the
    right for outgoing links, a triangle pointing to the left for
    incoming links, or two triangles pointing in both directions for
    elements that have both incoming and outgoing links.
  - When a new URN link is created the user must either choose an
    existing URN link type (a string) from a list or enter a new type.
    Newly entered types are added to the global list. The types in this
    global list can be renamed or deleted.
  - It is possible to navigate to the opposite end of a link by
    selecting either "Show Target" or "Show Source" depending on whether
    the current selected element is the start or end of the link.
  - An example of a popup menu and the URN link creation dialog is
    shown.

[[img/URNlinks-menu-expanded.png]]

URN Link creation dialog: 
[[img/URNlink-creation-dialog.png]] 

### Bilingual models

  - Up until version 5.0.0, jUCMNav supported different user interface
    languages (English, French), but only supported unilingual models.
    Every element in the model was in the language chosen by the
    designer.
  - Version 5.0.0 introduces the concept of bilingual models. Given any
    existing model, one can use the jUCMNav -\> Switch Model Language
    menu option. This will copy the name or description of every element
    into metadata. The designer can now freely translate every model
    element name or description into a second language.
  - Once completed, the designer can select jUCMNav -\> Switch Model
    Language again, to revert back to the original language.
  - This enables the evolution of a bilingual model without having to
    manage separate files.

### Comparing Models using EMF Compare.

  - Download and install [EMF
    Compare](http://wiki.eclipse.org/EMF_Compare)
  - The Eclipse "Compare With" feature will then be enabled on \*.jucm
    files.
  - This enables you to compare various revisions of the same file with
    version control or two different models in your workspace. EMF
    Compare visualizes all differences between both models (additions,
    deletions, changes, etc.).

## Part IV GRL Strategies

  - The concept of GRL strategies is a mechanism developed in jUCMNav to
    analyze GRL models using a set of user-defined evaluations.
  - There are two evaluation labels use in strategies. One to evaluate
    the satisfaction level of intentional elements (goals, softgoals,
    resources and tasks) which is located on top of the intentional
    element and can be set only at evaluation time; the other one to
    calculate a global satisfaction value for actors which is located
    inside the intentional element and can be set any time .
  - GRL strategies are visualized using the execution view (selected in
    Scenarios and Strategies view).
  - Different evaluation algorithms can be used. Currently, jUCMNav
    supports six algorithms, and the selection is done through the
    Preferences page: 
[[img/algorithm_selection.png]]
      - A fully quantitative evaluation (with numerical contributions
        and satisfaction levels)
      - A fully qualitative evaluation (with qualitative contributions
        and satisfaction levels)
      - Two hybrid evaluations (with qualitative contributions but with
        quantitative satisfaction levels).
      - Formula based evaluations.
      - A constraint solver based quantitative evaluation
  - See Appendix II of Z.151 for a definition of the algorithms.

### Managing Strategies

  - Strategy Creation/Deletion
      - In the Scenarios and Strategies view, under GRL Evaluation
        Strategies, the contextual menu allows creating, deleting and
        duplicating evaluation groups and strategies.
      - Evaluation groups are constructs to store one or more
        strategies. Strategies must be created in an evaluation group.
      - Strategies can contain other strategies. The containing strategy
        will thus apply the child evaluations in the order of their
        inclusion.

### Constraint solver based evaluation (Hao2011 algorithm)

  - With this evaluation, the satisfaction values are between -100
    (denied) and +100 (satisficed). A special value(-101) is assigned to
    unsolvable case. The basic mappings between GRL model and the
    constraint(s) are as follows:
      - Node B contribute to Node A by X: A = MAX (-100, MIN(100,(B \*
        X)/100 ) ) = 
[[img/c1.png]]
      - Node B AND-compose Node A: A = B 
[[img/c2.png]]
      - Node B OR-compose Node A: A = B 
[[img/c3.png]]
      - Node B depends on Node A: B \<= A 
[[img/c4.png]]
  - Currently, if more than one solution can be found in the domain, the
    smallest value in domain will be used as the evaluation result.
  - Constraint solving is NP-hard in nature: the execution of the
    strategy can sometimes take a few seconds.

### (Now deprecated) Mixed evaluation (Roy2006 algorithm)

  - With this evaluation, the satisfaction values are between -100
    (denied) and +100 (satisficed). The correspondence between
    quantitative and the qualitative is:
      - Satisficed: 100
      - Weakly Satisficed: 1 to 99
      - Unknown: 0
      - Weakly Denied: -1 to -99
      - Denied: -100
  - In Execution mode, qualitative evaluations are displayed next to
    numerical evaluations.
  - Default evaluation value is 0 (Unknown).

### Analyzing GRL models

  - Intentional elements and GRL strategies:
      - Once a strategy is created, select it and switch to Execution
        view. For strategies without user evaluations, evaluations are 0
        for all intentional elements and actors.
      - In the properties view, set the strategy properties (name,
        description and author).
      - To set an evaluation for an intentional element, select the
        element in the editor. In the properties view, under Strategy,
        set the evaluationLevel property (between 100 and -100). The new
        evaluation is propagated to other elements using the links
        (contributions, dependencies, decompositions) associated to the
        intentional element definition. Note that user evaluations
        overwrite calculated evaluations. Elements with user-defined
        evaluations are identified with a star (\*).
      - To delete a user evaluation, select the intentional element. In
        the contextual menu, choose Delete User Evaluation. The
        calculated evaluation is restored and propagated. \* The Roy2006
        algorithm (now deprecated) in jUCMNav calculates the evaluations
        using the following method:
          - Decompositions  
            Decompositions are calculated as a standard AND/OR graph (as
            shown in the following figure).

[[img/AndOrDecomposition.JPG]]

  - Contributions  
    Contributions must have a label other than "Unknown" to be used in
    the algorithm. The following diagram shows example of typical
    contributions for elements.

[[img/Contributions.JPG]]

  - Dependencies  
    An element that depends on others elements as an evaluation less or
    equal (\<=) to the minimal value of the elements it depends on. The
    following figure shows how dependencies are propagated.

[[img/Dependencies.JPG]]

  - The Hao2011 algorithm in jUCMNav calculates the evaluations with
    great flexibility:
      - Standard bottom-up approach is supported: 
      [[img/bottom-up.png]]
      - Top down approach is supported 
      [[img/top-down.png]]
      - Generic case with constraints set on some nodes is supported
        [[img/initialized.png]]
      - Unsolvable case is visualized with blue color code and special
        value(-101) 
      [[img/unsolvable.png]]
      - Tasks as leaf nodes are limited to take either 0 or 100 as
        values 
     [[img/top-down-task.png]]
      - Generic case with constaints and tasks as leaf nodes is
        supported 
     [[img/generic-task.png]]
  - Actors and GRL strategies
      - The actor evaluation label is calculated based on the bound
        intentional element references. It is displayed in a label at
        the top of actors in execution mode.
      - A priority and criticality is required for intentional element
        references to be considered in the actor evaluation. By default,
        all elements have a criticality and priority of "None",
        resulting to a value of 0 for actor evaluations.
      - Elements with highest priority and criticality have the most
        influence on evaluations.
      - Priority and criticality must be set for each reference.

### Exporting/Importing Strategies in CSV

  - Suppose you have a dozen strategies defined for your model. Having
    screenshots is not very helpful in comparing all of them at the same
    time (especially when you have many diagrams). jUCMNav hence allows
    you to export the evaluations of all the strategies in a .csv file
    that you can then import in Excel to get a nice, tabular view of
    everything that happens. 1 Right-click on URNspec in the Outline
    view and select Export 1 In the export wizard, select *Export the
    whole URN file* and click Next. 1 In the next page, select the
    *Comma-separated Values - GRL Strategies (.csv)* option in the File
    type selection box. 1 Also choose the target directory and file name
    and click Finish 1 (optional) In Excel (or similar tool), open the
    .csv file just generated. You now have a tabular representation of
    the satisfaction levels for all elements, per strategy\!
  - Later, these strategies can be re-imported. 1 Right-click on URNspec
    in the Outline view and select Import. 1 In the import wizard,
    select *GRL Strategy Evaluations (\*.csv)* from the file type
    selection box. Choose the file to import, your target folder
    (mandatory, although will not be used) and click Import. 1 The
    strategies will be created in your model. Missing intentional
    elements will generate warnings.

### Contribution Changes (Contribution Overrides)

  - Contributions have static values which are defined at design time.
    However, it is possible to create Contribution Overrides which will
    change these values at runtime, once enabled.
  - To do so, right-click on the Contribution Overrides folder in the
    Scenarios and Strategies view and click on Create an Contribution
    Context Group.
  - Right-click on this group and click on Add Contribution Context.
    This is a container for the Contribution Overrides.
  - Enable this context by selecting it within the Scenario and
    Strategies view and activating the execution view. It is also
    helpful to activate a strategy at the same time to visualize the
    changes.
  - Change any Contribution value as you would normally do using the
    editor. Instead of changing the Contribution, this will create a
    Contribution Change within the Contribution Context you've just
    created.
  - Contribution changes show \*\* next to the contribution value.
    Contribution changes which are inherited from included contexts are
    shown with a \* suffix instead.
  - Switch to design view and back to execution view (from the Scenarios
    and Strategies view) to disable this context and revert to the
    design values.
  - Contribution changes, contexts and context groups can be deleted,
    duplicated or moved via context menu options or drag & drop.

### Strategy Difference Mode

  - When comparing the impact of different strategies, it is often
    desirable to visualize only the difference between two strategies:
    the difference between the evaluation of a particular element in two
    different strategies.
  - With an active strategy, right-click on the strategy in the
    Scenarios and Strategies view and select *Start Strategy Difference
    Mode*.
  - Select another strategy. The editor will show the difference between
    the two. If an element shows \< 0 \> as an evaluation, its value is
    the same as in the original strategy.
  - At any time, disable the difference mode by right-clicking on any
    strategy and selecting *Stop Strategy Difference Mode*.

### Ranged Analysis

  - Intentional elements which possess an evaluation offer an additional
    "Edit Evaluation Range..." context menu option, when a strategy is
    active.
      - By entering values (start, end and step) and pressing Finish in
        this dialog, jUCMNav will evaluate all the entered options in
        succession and display the results (in range format) in the
        model.
      - For example, by entering Start=0, End=50 and Step=10, jUCMNav
        will execute the model for the values \[0,10,20,30,40,50\] and
        show the impact on the evaluation of the other elements. (ex:
        \[0...50\])
      - Executing any other strategy will revert back to the normal
        values.
  - Contribution Changes can also be ranges. Right-click on a
    contribution change and click "Edit Contribution Range ..." to
    perform a similar analysis.

### Switching between the \[-100,100\] and \[0,100\] evaluation ranges

  - By default, jUCMNav evaluation strategies utilize the \[-100,100\]
    evaluation range. This implies that -100 is the worst evaluation and
    100 is the best. In some contexts, it is desirable to ensure that
    all evaluations are positive, with 0 being the worst value instead
    of -100.
  - When enabled, elements with an evaluation of zero will appear as a
    red instead of yellow, as the worst value has been reached.
  - To toggle between these two settings, right-click on the URNspec in
    the Outline view and select *Change this model's GRL evaluation
    range to \[...\]* which will toggle from \[-100,100\] to \[0,100\].
    The setting is model-specific and will thus revert back to the
    original setting if you open a new model.
  - You may set the default value for this setting (new models only) by
    going in jUCMNav GRL Strategy Evaluation Algorithm's preferences and
    changing the *Visualize \[-100,100\] evaluation ranges as
    \[0,100\]?* checkbox.

## Part V UCM Scenarios

  - Scenarios execute a UCM model and highlight the traversed path in
    the diagrams. One can then verify that the traversal matches with
    the intended behaviour and rectify the situation if this is not the
    case.
  - You first design model by creating scenario groups and scenarios
    (using the contextual menu) while in the design view of the
    Scenarios and Strategies view. When satisfied, you proceed to the
    execution view to see the impact of your work when it is simulated.
  - A [Flash demo on using scenario variables](UcmVariableDemo) and
    another [Flash demo on using UCM scenarios](UcmScenarioDemo) are
    also available.

### Code and Condition Editor

  - Before executing your model, you must insert pseudo-code inside
    pre/post conditions and inside responsibilities (which change the
    internal state of the model).
  - If you double-click on a condition or responsibility in the UCM, a
    pseudo-code editor will be opened.
  - Some conditions are only available via the Properties view or the
    stub bindings view.

#### Variables

  - jUCMNav supports Booleans, Integers, and User-Defined Enumerations.
  - You may create these variables via the contextual menu of the
    Variable item in the Scenarios / Strategies treeview, or via the
    Create Variable Wizard, which is available in the pseudo-code
    editor.
  - Modifications to the variables (names, descriptions, etc.) can be
    done through the Properties view.

[[img/jucmnav_newvariable.jpg]]

#### BNF Grammar

  - Some of you might be interested in seeing the grammar behind these
    editors. For others, examples follow.
  - For Conditions:

<!-- end list -->

    Expression              := Implication   
    Implication             := Disjunction (Implies Disjunction)*   
    Disjunction             := Conjunction ((Or | Xor ) Conjunction)*   
    Conjunction             := Comparison (And Comparison)*   
    Comparison              := BooleanUnit ((Equals| NotEquals) BooleanUnit)*   
    Negation                := Not BooleanUnit  
    BooleanUnit             := Negation | RelationalExpression | BooleanConstant   
    RelationalExpression    := AdditiveExpression ((GreaterThan | GreaterOrEqualTo | LowerThan | LowerOrEqualTo) AdditiveExpression)?  
    AdditiveExpression      := MultiplicativeExpression ((Addition | Substraction) MultiplicativeExpression)*  
    MultiplicativeExpression:= UnaryExpression (Multiplication UnaryExpression)*  
    UnaryExpression         := (Addition | Substraction)? ("(" Expression ")" | IntegerConstant | Identifier )  
    And                     := "and" | "&&"  
    Or                      := "or" | "||"  
    Xor                     := "xor" | "^"  
    Implies                 := "=&gt;"  
    Equals                  := "=" | "=="  
    NotEquals               := "/=" | "!="  
    Not                     := "not" | "!"  
    GreaterThan             := ">"  
    GreaterOrEqualTo        := ">="  
    LowerThan               := "<"  
    LowerOrEqualTo          := "<="  
    Addition                := "+"  
    Substraction            := "-"  
    Multiplication          := "*"  
    IntegerConstant         := ["0"-"9"]+  
    BooleanConstant         := "true" | "false"  
    Identifier              := ["_","a"-"z","A"-"Z"](["_","a"-"z","A"-"Z", "0"-"9"])*

  - For responsibilities:

<!-- end list -->

    ResponsibilityAction   := Statement+ 
    Statement              := Assignment | CompoundStatement  | IfStatement 
    Assignment             := Identifier AssignmentOperator Expression StatementTerminator 
    CompoundStatement      := "{" Statement* "}" 
    IfStatement            := If Expression Statement (Else Statement)?  
    AssignmentOperator     := "=" | ":=" 
    If                     := "if" 
    Else                   := "else" 
    StatementTerminator    := ";" 

#### Examples

  - The astute reader will have discovered that we support
    (simultaneously) two different concrete notations. jUCMNav offers a
    Java-like syntax in addition to an SDL-like syntax.
  - The examples that follow use the Java-like syntax but can be
    trivially converted into the SDL-like syntax by swapping terminals.
    1 Condition Examples

<!-- end list -->

    VariableX  
    VariableX && VariableY  
    (VariableX && !(VariableX || VariableY)) => true  
    (IntegerVariableA+IntegerVariableB)*2 <= -10  
    _x - 3 == 0  
    CurrentState == BLOCKED /* assuming a user-defined enumeration containing BLOCKED exists, and CurrentState is defined of the same type */ 

  - Notes
      - We do not support division (because we only have integers)
      - We do not support inline assignments in conditions (because the
        = operator is the comparison operator in the SDL-like syntax) 1
        Responsibility Examples

<!-- end list -->

    if (-x - 3 == 0)    { // comments are allowed.
           VariableX=true;
           CurrentState=BLOCKED;
        } 
    else {
          VariableX=(-x+3 == 0);
          VariableY=true;
        }  
    IntegerVariableB=IntegerVariableB+15; 

### Scenario children

#### Start Points

  - Start points are what launches a scenario. The default traversal
    algorithm executes them sequentially, in the order that they are
    defined (you can re-order them with the move up / move down
    contextual menu items). Other algorithms may decide to launch them
    in parallel. The same start point can be used many times in a
    scenario.

#### End Points

  - End points are defined as targets for the execution. These are
    points that must be traversed by the algorithm. Others may also be
    reached, but this is the minimum set. If they are not reached,
    errors appear in the Problems view.

#### Variable initializations, preconditions and postconditions

  - Each scenario has a variable initialization wizard that will, simply
    put, initialize the variables before launching the start points.
  - Scenario preconditions / postconditions are conditions that are
    evaluated at the scenario level. Once again, errors will appear in
    the Problems view if they are not true.
  - Start points and end points can also have preconditions and
    postconditions associated with them. These are distinct from the
    scenario level ones.
  - Depending on the algorithm settings defined in the preference page,
    an invalid precondition can either permanently abort a path or
    simply block it until the condition becomes true.

#### Included Scenarios

  - Included scenarios prevent from having to redefine the same elements
    in multiple scenarios. Scenarios will respect the start points, end
    points, variable initializations, preconditions and postconditions
    of the included scenarios.
  - A scenario can override initializations but can only append to the
    other scenario children.
  - *NOTE*: Scenario definitions in the scenario group named *Init* are
    now skipped when running all scenarios (including during MSC
    export). This *Init* group is hence a good candidate for defining
    partial scenarios that are included elsewhere but that are not meant
    to be run standalone.

### Executing a Scenario

  - To execute a scenario, activate the execution view by clicking on
    its icon in the scenarios / strategies view. Then, click on a
    scenario and it will be automatically executed. If you change
    anything in the map, you may need to use the refresh toolbar button.
    Select another scenario to execute it.

#### Detecting Problems

  - The traversal algorithm notes problems during the execution of the
    scenario in the Problems view.
  - Double click on the problem to focus the editor at the appropriate
    location. Some items have quick fixes (right click on the problem
    and choose the quick fix operation).

#### Scenario Traversal Preferences

[[img/jucmnav_traversalprefs.jpg]]

  - Maximum number of times an element can be hit before it is declared
    blocked: This integer helps trap infinite loop conditions. The lower
    it is, the more restricted your models will be, but the quicker
    infinite loops will be found.
  - Should we include GRL intentional elements as variables for UCM
    scenarios?: If this checkbox is set, jUCMNav will automatically
    create an integer variable for each GRL intentional element. When a
    strategy is executed, the variables are overridden with the
    propagation results and can be use to guide conditions in UCM.
    Furthermore, responsibilities can modify them, which will modify the
    satisfaction levels in the GRL graph. The order in which the
    scenario and strategy are executed impacts the behaviour. This is
    currently only a prototype.
  - Should we continue other processing and come back to the element
    later if its precondition is false?: If this checkbox is set, the
    default scenario traversal algorithm is said to be patient. For
    example, it will wait for false preconditions to become true before
    launching a start point.
  - Deterministic algorithm: If the algorithm is deterministic, in
    certain situations where multiple alternatives could be taken but
    only will be selected, such as when an or-fork with multiple true
    out paths is reached, the chosen path will always be the same.
    Otherwise, it would pick one randomly.

## Part VI MSC Viewer

  - jUCMNav now integrates a Message Sequence Chart (MSC) Viewer. A
    [Flash MSC Viewer Demo](MscViewerDemo) is also available.
[[img/MSC.png]]

  - To generate an MSC from a UCM, do the following after executing a
    scenario, File -\> Export, Export UCM/GRL/URN, Export Whole URN
  - Choose file type: Export Scenarios and select a directory/filename.
    \*Be careful\* Depending on your export preferences, you may
    override the existing file should you enter the same filename.
  - The resulting export depends on the scenario export preferences
      - Export type
          - \*.jucmscenarios will generate an MSC viewable by jUCMNav's
            MSC Viewer.
          - Linearized \*.jucm file will generate a flat UCM
            representing the scenario execution. Auto-layout will have
            to be performed to be able to visualize the results.
          - Well-formed linearized \*.jucm file will generate a flat UCM
            representing the scenario execution. Well-formed refers to
            the fact that it can be expressed in a linear form, which is
            required for MSCs. Please note that this step possibly
            includes additional concurrency constraints, changing the
            interpretation of the original model. Auto-layout will have
            to be performed to be able to visualize the results.
          - Typically, when generated MSCs are considered inaccurate, it
            is because of the additional concurrency constraints that
            this algorithm MUST add in order to represent the execution
            trace as an MSC. A warning is given to the user when such
            situations occur.
      - Export what
          - All scenarios: all scenarios are exported
          - Last run scenario only: only the last run scenario is
            exported.
      - Automatically open editor after export: if the exported file is
        located inside the Eclipse workspace, setting this flag will
        automatically open it after exporting.

[[img/jucmnav_exportprefs.jpg]]

### Exporting MSC images

  - Right-click on the .jucmnavscenarios file and select Export
  - Select *Other --\> UCM Scenario Image* and click Next
  - Select the scenario to export (currently limited to 1 scenario) and
    click Next
  - Select the target directory and filename, as well as the appropriate
    format (.png, .bmp or .jpg) and click Finish

## Part VII Static Semantics Checking Tool

jUCMNav allows modellers to perform static verification on URN models
based on user-defined rules. Rules are described in the Object
Constraint Language (OCL). They are invariants described in terms of the
metaclasses found in [jUCMNav's metamodel](URNMetaModel). This
functionality is available on jUCMNav version 3.1 and above.

### Creating a rule

  - Example rule: *There should be no containment cycles in UCM
    components.*
  - Rule properties
      - **Rule name**: It must be unique in the system. For example,
        \_UCM*NoComponentCycle*
      - **Rule classifier**: Packagename::Classname, to specify the
        object's type on which the rule is applied. For example,
        *ucm::map::ComponentRef*
      - **OCL context expression**: Creating a rule on a particular type
        means that each instance of this type must be conform to the
        constraint that the rule implies. Therefore, to ensure the rule
        is not violated, we must check if every instance of the type
        conforms to the constraint. Based on [jUCMNav's
        metamodel](URNMetaModel), all instances of all types except the
        URNspec are contained in the singleton instance of URNspec (the
        current model). From URNspec, we can collect all instances of a
        particular type by using an "OCL navigation path". For example,
        to collect all instances of the type Responsibility in UCM, from
        the instance of URNspec, we specify the navigation path
        *self.urndef.responsibilities*. We call this navigation path
        *Rule Context Expression*, which must return a sequence of
        objects with a type specified by Rule Classifier. For example,
        \_self.urndef.specDiagrams-\>select(d|d.oclIsTypeOf(ucm::map::UCMmap)).contRefs-\>select(r|r.oclIsTypeOf(ucm::map::ComponentRef))-\>collect(o|o.oclAsType(ucm::map::ComponentRef))\_
      - **OCL invariant expression**: This describes the precise
        semantics of the rule using an OCL expression. It is as same as
        the **inv** part in an OCL expression. For example,
        \_not(self.ancestors()-\>exists(ar|ar.contDef.oclAsType(urncore::ComponentElement).id=self.contDef.oclAsType(urncore::ComponentElement).id))\_
      - **Rule description**: This describes the human readable
        semantics of the rule. For example, *There should be no
        containment cycles in UCM components.* This is also used as an
        error message in the Problems view when the rule is violated.
      - **Rule utilities**: User-defined operations used to simplify the
        logic of OCL invariant expression. They are similar the **def**
        part in an OCL file. For example,

<!-- end list -->

    Utility One: ancestorSet(current:Set(ComponentRef)):Set(ComponentRef)=
             let oneStep:Set(ComponentRef)= current->iterate(ar; result : Set(ComponentRef) = Set{} |
                ar.contDef.contRefs->union( if ar.parent->notEmpty() then ar.parent->asSet() else Set{} endif)
                    ->;collect(o|o.oclAsType(ComponentRef))-&gt;asSet()
                 )
             in
             if current->size() < current->union(oneStep)->size()
                -- The set gets bigger
             then 
                ancestorSet(current->union(oneStep))
             else
                current
             endif 
    
    Utility Two: ancestors():Set(ComponentRef)= ancestorSet(
           if self.parent->notEmpty() then self.parent.contDef.contRefs->union(
                   self.parent->asSet() )->collect(o|o.oclAsType(ComponentRef))->asSet()
           else
                     Set{}
           endif ) 

  - Creating the example rule 1 Open the Preferences dialog of Eclipse
    and then choose the Static Semantics Checking Preferences page under
    the node of jUCMNav Preferences . 1 Next, click the "New Rule"
    button and input all properties in the rule editing dialog 1 Next,
    click the "New" button and input the definition of utility one and
    then click the "OK" button. (Note that utilities are optional for
    rules). 1 Repeat the previous step for Utility two 1 Click the "OK"
    button to close the Preferences dialog
  - See also [Static Semantic Demo 1](StaticSemanticDemo1)

### Grouping a rule

  - You can organize related rules into groups to facilitate
    enabling/disabling those rules by one click.
  - A rule can be included in many groups.
  - There is a special rule group called **All**. As the name indicates,
    this group includes all rules in the system and cannot be edited or
    deleted.
  - Grouping a rule 1 Open the Preferences dialog of Eclipse and then
    choose the Static Semantics Checking Preferences page under the node
    of jUCMNav Preferences . 1 Click "New Group" button 1 Input a unique
    group name 1 Select the rule in the bottom list to be included in
    the group 1 Click the "Add to group" button 1 Click "OK" button to
    close the group editing dialog
  - See also [Static Semantic Demo 2](StaticSemanticDemo2)

### Enabling/disabling rules

[[img/staticVerif.png]]

  - Enabling/disable one rule 1 Open the Preferences dialog of Eclipse
    and then choose the Static Semantics Checking Preferences page under
    the node of jUCMNav Preferences . 1 Click "+" on the left of the
    group "All" to expand all rules 1 Look for the rule to
    enable/disable by rule's name and description 1 Check/uncheck the
    desired rule by clicking the selection box on the left of the rule 1
    Click "OK" button to close the Preferences dialog 1 See also
    [Static Semantic Demo 3](StaticSemanticDemo3)
  - Enabling/disabling a collection of rules in a group 1 Open the
    Preferences dialog of Eclipse and then choose the Static Semantics
    Checking Preferences page under the node of jUCMNav Preferences . 1
    Look for the group in which the desired rules are 1 Check/uncheck
    the desired group and then you can see all rules under this group
    being enabled/disabled 1 Click "OK" button to close the Preferences
    dialog 1 See also [Static Semantic Demo 4](StaticSemanticDemo4)

### Running a check/verification

  - Open a .jucm file
  - jUCMNav menu -\> Verify Static Semantics
  - The checking result is showed in the Problems view
  - See also [Static Semantic Demo 5](StaticSemanticDemo5)

### Exporting/importing a rule

  - Exporting a rule 1 Open the Preferences dialog of Eclipse and then
    choose the Static Semantics Checking Preferences page under the node
    of jUCMNav Preferences. 1 Select a rule 1 Click "Export" button 1
    Specify the path and name of the file where the rule will be saved.
    1 Click "Save" button 1 See also [Static Semantic Demo 6](StaticSemanticDemo6)
  - Importing a rule 1 Open the Preferences dialog of Eclipse and then
    choose the Static Semantics Checking Preferences page under the node
    of jUCMNav Preferences. 1 Click "Import" button 1 Select the rule
    file to be imported 1 Click "Open" button 1 If the name conflicts,
    the rule is renamed. 1 The imported rule is put in the group
    "Imported". 1 See also [Static Semantic Demo 7](StaticSemanticDemo7)

## Part VIII Key Performance Indicators

As of version 3.0, jUCMNav supports extensions to model Key Performance
Indicators (KPI) to provide business process monitoring and performance
management capabilities, as well as enabling the alignment of processes
and goals.

[[img/KPI.png]]

  - The GRL palette was extended to support Indicators, Dimensions, and
    KPI Model Links (linking indicators to the dimensions of interest
    for analysis). GRL models can hence be turned into performance
    models.
  - KPIs can be set up through the Properties view.
  - Two new views were added (see below).
  - More information available in [Chen's
    thesis](http://jucmnav.softwareengineering.ca/twiki/bin/view/UCM/VirLibPChenThesis07).
    A [Flash KPI Demo](KPIDemo) is also available.

### List of Key Performance Indicators view

  - To manage KPIs and KPI groups, a KPI list view presents users with
    an overview of categorized KPIs.
  - Users can also create their own groups in the KPI list view. Four
    groups of performance dimensions are created by default: cost, time,
    quality and flexibility.
  - To assign or remove KPI groups on a selected KPI, the use can select
    Edit Indicator Group in the Indicator contextual menu (on the
    diagram or in the list of KPIs), or select the Indicator and use the
    Properties view.
  - If a GRL strategy is being defined/evaluated, for each indicator the
    target value, the threshold value, the worst value, the evaluation
    value and the unit of the indicator can be set through the
    Properties view. Also, the level and value of dimensions for each
    KPI information element can be set through the Properties view.
  - After KPI models are defined and KPI strategies are created, KPI
    values then can be retrieved through the monitoring services by
    clicking on the button *Retrieve KPI values* (top-right corner of
    the list of KPIs view). The KPI evaluation module includes an
    interface defined for requesting KPI values so that the interface
    can be implemented in different ways to obtain KPI values. In this
    implementation, a Web services client serves as the interface to
    facilitate the communication with the external monitoring services.
    To connect to the monitoring services, the URL of the monitoring
    services is set in jUCMNav's KPI monitoring preferences page in the
    Eclipse tool.
  - After the KPI values are retrieved and applied to each KPI in each
    strategy, the KPI evaluation values can be transformed to GRL
    evaluation levels and then used for propagation to generate
    evaluation levels on higher level goals.
  - After a specific evaluation strategy is selected, the KPI evaluation
    status is shown in the List of KPI view as icons with different
    colors, in which the red-down arrow means poor performance, the
    green-up arrow means acceptable or satisfied performance and the
    yellow arrow means the performance just meets the threshold value.

### Key Performance Indicators view

  - The KPI view is designed to present the details of KPI evaluation
    status visually so that when a user selects any GRL/UCM element or
    map that has KPIs defined or linked either directly or indirectly,
    the KPIs' evaluation status will be displayed in the KPI view to
    present a general performance view of that process or goal.
  - The URN editors, the GRL strategy view, the KPI list view and the
    KPI view are synchronized to present an overview of process and goal
    evaluation from different perspectives.
  - Business processes and goals can be linked by URN links, thus KPIs
    defined for goal models can also be linked to processes. In this
    case, when users trigger a strategy and choose a process element,
    the linked KPIs are shown in the KPI view and the satisfaction level
    of the connected goal element will be displayed on the target
    process element.
  - A detailed KPI evaluation status shows the KPI information, such as
    its name and the description, the groups and the evaluated tasks are
    presented to users, along with the strategy information, such as the
    dimensions, the unit, the target, threshold, worst and evaluation
    values.
  - The values are color-coded and shown graphically.
