# JUnit Test Plan

## Description

  - These are the tests that help verify what actions are possible with
    the goal of being able to measure progress.
  - We are using a top-down approach at defining our tests.
  - The total number of tests must not be modified but the actual tests
    can change in explicitness as we progress.
  - I’m only listing automatable tests here.
  - I greatly encourage defining other regression tests during the
    development, but they will not be accounted for here.
  - We will need discipline creating our Commands. See ReqActionUndoOne
    and DevDocCommands
  - A tool was created to generate the code structure. For example,
    given the table, it should produce code like this:

<!-- end list -->

    //    /**
    //     * Test #1 for requirement ReqCompCompBind
    //     * 
    //     * Author:
    //     */
    //    public void testReqCompCompBind1() {
    //        //  TODO: implement
    //        assertTrue("Unimplemented", false);
    //    }

  - Use ctrl-/ to uncomment the block when ready to implement it.
  - We will use this tool once to generate the structure of all our
    tests. We will comment out those that we can’t yet implement. When
    ready to implement them, we will uncomment them.
  - Keeping the number of tests to implement constant lets us graph out
    our progress (% of tests implemented, % of tests passing)
  - The tests listed here are very general; when implemented should try
    to cover as much code as possible, testing from the highest level
    possible.
  - We have 71 tests for our mandatory requirements.
  - 1 requirement has been put out of scope. 70 tests remain.

## Tests

### [Req Action Undo One](ReqActionUndoOne)

0 explicit tests.

All Commands must implement execute/redo/undo/canexecute/canundo
properly. Usual sequence: canExecute() ? execute()-\>redo() and later:
canUndo()?undo();

All Commands should leave the model in a valid UCM state. To verify
this, the top level class of our seg.jUCMNav package shall include two
methods: testPreConditions(), testPostConditions(). These methods shall
be used in JUnit tests but also in our debug build using assertions. If
they aren’t overwritten, these methods should fail so that we know we
have to create them. This will test our model manipulation layer
extensively; higher level tests won’t have to worry about these details
but since they will be executed everytime a command is executed (in
debug mode or in JUnit tests), they will be tested VERY often.

testPreConditions(): will check the model to see if it is valid to call
redo(). This can involve calling canExecute() but its main goal is to
check that if a redo has already been called, followed by undo, the
model is back in its initial state. Should verify that newly created
elements are not in the model, etc. Should be the first line executed in
redo() and last in undo().

testPostConditions(): will check the model to see if it is valid after
the execution of the command. This usually involves checking to see if
the newly created elements are actually in the model, that removed ones
are no longer in it, that PathNodes have appropriate in/out connections.
Should be the last line executed in redo() and first in undo().

### [Req Comp](ReqComp)

2 explicit tests.

Requirement concerns both ComponentElement and ComponentREf

1.  Creation scenario: ComponentRef must be in palette.  
    When put on content pane, must be added to the model.  
    Must always be linked to a ComponentElement
2.  Edition scenarios: Properties view must show
    x,y,id,name,width,height,
    compDef:EObjectPropertySource.addPropertyToDescriptor(Collection
    descriptors, EAttribute attr, EClass c) must modify descriptors.

X,y,width,height
MapAndPathGraphXYLayoutEditPolicy.createChangeConstraintCommand(EditPart
child, Object constraint) shall create a command. If fixed should not be
able to move or resize.

### [Req Comp Comp Bind](ReqCompCompBind)

2 explicit tests

1.  When a component is moved inside another, parent is set.
2.  Properties view must show parent
    EObjectPropertySource.addPropertyToDescriptor(Collection
    descriptors, EAttribute attr, EClass c) must modify descriptors.
    Should see dropdown of possible componentrefs.

### [Req Comp Comp Unbind](ReqCompCompUnbind)

2 explicit tests

1.  When a component is moved outside its parent, parent is unset.
2.  Properties view must show parent
    EObjectPropertySource.addPropertyToDescriptor(Collection
    descriptors, EAttribute attr, EClass c) must modify descriptors.
    Should have a none option in the componentrefs dropdown list.

### [Req Comp Path Bind](ReqCompPathBind)

2 explicit tests.

1.  When a PathNode is moved inside a ComponentRef, parent is set.
2.  Properties view must show parent
    EObjectPropertySource.addPropertyToDescriptor(Collection
    descriptors, EAttribute attr, EClass c) must modify descriptors.
    Should see dropdown of possible componentrefs.

### [Req Comp Path Unbind](ReqCompPathUnbind)

2 explicit tests.

1.  When a PathNode is moved outside its parent, parent is unset.
2.  Properties view must show parent
    EObjectPropertySource.addPropertyToDescriptor(Collection
    descriptors, EAttribute attr, EClass c) must modify descriptors.
    Should have a none option in the componentrefs dropdown list.

### [Req Connections](ReqConnections)

3 explicit tests.

1.   When end and start/wait/timer are selected, connect appears in the
    contextual menu.
2.   Connect element overlaps others, disconnect appears in contextual
    menu.
3.   Connect command moves two selected elements.

### [Req Elem And Fork](ReqElemAndFork)

3 explicit tests.

1.   Appears in palette and can be inserted on path. Adds a second
    outgoing path.
2.   Appears in PathNode contextual menu, adds a second path
3.   Appears in contextual meunu, when EmptyNode and StartPoint are
    selected; doesn’t add a path, removes the start point.

### [Req Elem And Join](ReqElemAndJoin)

3 explicit tests.

1.   Appears in palette and can be inserted on path. Adds a second
    incoming path.
2.   Appears in PathNode contextual menu, adds a second path
3.   Appears in contextual meunu, when EmptyNode and EndPoint are
    selected; doesn’t add a path, removes the end point.

### [Req Elem Delete](ReqElemDelete)

5 explicit tests. *changed text; May 30th*

1.   Can delete any PathNode that have exactly 1 input, 1 output at any
    time.
2.   When deleting the last input/output of a stub/fork/join,
    stub/fork/join transforedm to empty node.
3.   Can delete componentrefs at any time, can delete components if they
    have no references.
4.   For all PathNodes that have multiple inputs or outputs, deleting
    all elements on the optional inputs or outputs removes the optional
    paths.
5.   Deletion of completely selected paths is possible.

### [Req Elem Direction Arrow](ReqElemDirectionArrow)

2 explicit tests.

1.   Appears in palette and can be inserted on path.
2.   Is oriented properly; not only the direction but the angle. this
    test must also be able to orient end points properly.

### [Req Elem Dynamic Stub](ReqElemDynamicStub)

2 explicit tests.

1.   Appears in palette and can be inserted on path. Replaces EmptyNode
    if placed on one.
2.   Can **consume** start/end points; when dragged on them, they are
    linked.

### [Req Elem Empty Point](ReqElemEmptyPoint)

2 explicit tests.

1.   Appears in palette and can be inserted on path.
2.   To be used as test subject for edit/movement of PathNodes.  
    Properties view must show x,y,id,name  
    EObjectPropertySource.addPropertyToDescriptor(Collection
    descriptors, EAttribute attr, EClass c) must modify descriptors.

X,y
MapAndPathGraphXYLayoutEditPolicy.createChangeConstraintCommand(EditPart
child, Object constraint) shall create a command.

### [Req Elem End Point](ReqElemEndPoint)

3 explicit tests

1.   Path tool exists in palette and can be inserted onto path
2.   Start/End points can be merged.
3.   Can have guard condition

### [Req Elem Or Fork](ReqElemOrFork)

3 explicit tests.

1.   Appears in palette and can be inserted on path. Adds a second
    outgoing path.
2.   Appears in PathNode contextual menu, adds a second path
3.   Appears in contextual meunu, when EmptyNode and StartPoint are
    selected; doesn’t add a path.

### [Req Elem Or Join](ReqElemOrJoin)

4 explicit tests.

1.   Appears in palette and can be inserted on path. Adds a second
    incoming path.
2.   Appears in PathNode contextual menu, adds a second path
3.   Appears in contextual meunu, when EmptyNode and EndPoint are
    selected; doesn’t add a path, removes the end point.
4.   Can have guard condition

### [Req Elem Responsibility](ReqElemResponsibility)

2 explicit tests.

1.   Responsibility tool exists in palette and can be inserted into
    diagram
2.   Must always be linked to Responsibility. Properties view should
    show Responsibility dropdown.3)

### [Req Elem Start Point](ReqElemStartPoint)

2 explicit test.

1.  Path tool exists in palette and can be inserted onto path.
2.  Can have guard conditions

### [Req Elem Start Point Attributes](ReqElemStartPointAttributes)

1 explicit test.

1.  Properties view shows workload attribute

### [Req Elem Static Stub](ReqElemStaticStub)

2 explicit tests.

1.   Appears in palette and can be inserted on path. Replaces EmptyNode
    if placed on one.
2.   Can **consume** start/end points; when dragged on them, they are
    linked.

### [Req Elem Stub Actions](ReqElemStubActions)

6 explicit tests.

1.   Must be able to create plugin.
      - creates a new map
      - positions editor at a new navigationlocation
      - from contextual menu
      - from views
2.   must be able to view plugin
      - double click in editor
      - from views
      - positions editor at a new navigationlocation
3.   add plug-in
      - if static and has no plug-ins, must be able to select maps from
        a list of possibilities
      - if dynamic, should be able to add a map from a list of
        possibilities to a list of plugins
      - during execution, stub binding conditions are examined to know
        which plug-in to be used
4.   remove plugin
      - inverse of previous operations
5.   rename plugin
      - a plugin is just another map.
6.   bind plugin
      - wizard or property page
      - activated by contextual menu on stub
      - select a plugin
      - match stub inputs with plugin start points
      - match stub outputs with plugin end points
      - numbers do not need to match

### [Req Elem Timer](ReqElemTimer)

2 explicit tests.

1.   Timer appears in palette and can be inserted into diagram
2.   Contextual menu allows for the creation of a timeout path.

### [Req Elem Wait](ReqElemWait)

2 explicit tests

1.  Wait appears in palette and can be inserted onto path
2.  can have guard condition

### [Req Export Bitmap](ReqExportBitmap)

2 explicit test

1.  Appears in file/export
2.  Appears in contextual menu of a diagram in package explorer

### [Req Help About](ReqHelpAbout)

1 explicit test

1.  help about exists

1 implicit Daniel finds it sufficient.

### [Req Help On Line](ReqHelpOnLine)

1 explicit test

1.  online help exists

1 implicit Daniel finds it sufficient.

### [Req Open](ReqOpen) 

1 explicit test
1.  top level model element is URNSpec

### [Req Save](ReqSave)

1 explicit test

1.  top level model element is URNSpec

### [Req Save As](ReqSaveAs)

0 explicit tests

Supported by framework; implicit if ReqSave is done.

### [Req Save Backup](ReqSaveBackup) **No longer in scope**

1 explicit test

1.  UCM Editor supports Team Support for Local History purposes.

### [Req Select All](ReqSelectAll)

0 explicit tests.

### [Req Select Group](ReqSelectGroup)

0 explicit tests.

### [Req Select Group Delete](ReqSelectGroupDelete)

0 explicit tests. See ReqElemDelete

### [Req Select Group Move](ReqSelectGroupMove)

0 explicit tests.

### [Req Select Single](ReqSelectSingle)

0 explicit tests.

### [Req Select Unselect All](ReqSelectUnselectAll)

0 explicit tests.

### [Req Select Unselect One](ReqSelectUnselectOne)

0 explicit tests.

### [Req Browse History](ReqBrowseHistory)

1 explicit test

1.  Navigation Location implemented for all diagrams in one UCM

### [Req Browse Model](ReqBrowseModel)

4 explicit tests

1.  Outline view is implemented properly
2.  Explorer is implemented properly (remember to be able to rename map)
3.  Responsibilities view is implemented properly
4.  Description view is implemented properly

### [Req Labels](ReqLabels)

2 explicit tests

1.  Contextual menu on ComponentRef/PathNode shows show/hide label
2.  Properties view must show label
    EObjectPropertySource.addPropertyToDescriptor(Collection
    descriptors, EAttribute attr, EClass c) must modify descriptors.

### [Req Select Feedback](ReqSelectFeedback)

0 explicit tests.

### [Req Documentation](ReqDocumentation)

0 explicit tests.

### [Req Java Version](ReqJavaVersion)

0 explicit tests.

If it builds, it runs.

## Categories

### Palette tests

1.  ReqComp1
2.  ReqElemAndFork1
3.  ReqElemAndJoin1
4.  ReqElemDirectionArrow1
5.  ReqElemDynamicStub1
6.  ReqElemEmptyPoint1
7.  ReqElemEndPoint1
8.  ReqElemOrFork1
9.  ReqElemOrJoin1
10. ReqElemResponsibility1
11. ReqElemStartPoint1
12. ReqElemStaticStub1
13. ReqElemTimer1
14. ReqElemWait1

### Properties tests

1.  ReqComp2
2.  ReqCompCompBind2
3.  ReqCompCompUnbind2
4.  ReqCompPathBind2
5.  ReqCompPathUnbind2
6.  ReqElemEmptyPoint2
7.  ReqElemEndPoint3
8.  ReqElemOrJoin4
9.  ReqElemResponsibility2
10. ReqElemStartPoint2
11. ReqElemStartPointAttributes
12. ReqElemWait2
13. ReqLabels2

### Behaviour tests

1\. ReqCompCompBind1 1. ReqCompCompUnbind1 1. ReqCompPathBind1 1.
ReqCompPathUnbind1 1. ReqConnections3 1. ReqElemDelete1 1.
ReqElemDelete2 1. ReqElemDelete3 1. ReqElemDelete4 1. ReqElemDelete5 1.
ReqElemDirectionArrow2 1. ReqElemDynamicStub2 1. ReqElemEndPoint2 1.
ReqElemStaticStub2 1. ReqLabels1

### Contextual Menu tests

1.  ReqConnections1
2.  ReqConnections2
3.  ReqElemAndFork2
4.  ReqElemAndFork3
5.  ReqElemAndJoin2
6.  ReqElemAndJoin3
7.  ReqElemOrFork2
8.  ReqElemOrFork3
9.  ReqElemOrJoin2
10. ReqElemOrJoin3
11. ReqElemTimer2
12. ReqExportBitmap2

### Stub action tests 1. ReqElemStubActions1

1.  ReqElemStubActions2
2.  ReqElemStubActions3
3.  ReqElemStubActions4
4.  ReqElemStubActions5
5.  ReqElemStubActions6

### General non-editor tests 1. ReqExportBitmap1

1.  ReqHelpAbout1
2.  ReqHelpOnLine1
3.  ReqOpen1
4.  ReqSave1
5.  ReqSaveBackup1 **no longer in scope**
6.  ReqBrowseHistory1
7.  ReqBrowseModel1
8.  ReqBrowseModel2
9.  ReqBrowseModel3
10. ReqBrowseModel4

*(jkealey: changed categories, June 1st)*
