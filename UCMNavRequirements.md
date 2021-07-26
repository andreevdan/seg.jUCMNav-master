# Current Requirements

| Name | Description | Type | Importance | Priority | Status | Dependencies | Date |
| --- | --- | --- | --- | --- | --- | --- | --- |
| [Req Action Redo Many](ReqActionRedoMany)| jUCMNav SHOULD allow the user to redo many of the latest transformations or actions undone on the UCM model. | Functional | Optional | Low | Completed | [Req Action Undo Many](ReqActionUndoMany), [Req Action Redo One](ReqActionRedoOne) | 14 Jul 2005 - 13:20  |
| [Req Action Redo One](ReqActionRedoOne)| jUCMNav SHOULD allow the user to redo the latest undone transformation or action on the UCM model. | Functional | Optional | Low | Completed | [Req Action Undo One](ReqActionUndoOne) | 14 Jul 2005 - 13:20  |
| [Req Action Undo Many](ReqActionUndoMany)| jUCMNav SHOULD allow the user to undo many of the latest transformations or actions on the UCM model. | Functional | Optional | Medium | Completed | [Req Action Undo One](ReqActionUndoOne) | 14 Feb 2006 - 11:37 |
| [Req Action Undo One](ReqActionUndoOne)| jUCMNav SHALL allow the user to undo the latest transformation or action on the UCM model. | Functional | Optional | Urgent | Completed |  | 14 Jul 2005 - 13:21 |
| [Req ADLInteroperability](ReqADLInteroperability)| Given that UCM can be used both to discover architecture and to investigate it a move to some form of interoperability between ADL approaches such as Able/ACMEStudio (http://www.cs.cmu.edu/~acme/AcmeStudio/AcmeStudio.html)or XAch (http://www.isr.uci.edu/projects/xarchuci/) to support Software Architecture definiton or reverse engineering would be useful. | Goal| Future| Low | Proposed |  | 17 Oct 2005 - 21:34 |
| [Req Area Zoom Scroll](ReqAreaZoomScroll)| jUCMNav SHALL support the zooming the work area and scrolling.  | GUI | Mandatory | Low | Completed |  | 14 Jul 2005 - 13:22 |
| [Req Browse History](ReqBrowseHistory)| jUCMNav SHALL support the browsing of the history of navigation (previous/next).  | GUI | Mandatory | Medium | Completed |  | 14 Jul 2005 - 13:21 |
| [Req Browse Model](ReqBrowseModel)| jUCMNav SHALL support browsing and selecting the UCMs and their elements in a tree structure on a panel different from the main work area.  | GUI | Mandatory | Urgent | Completed |  | 14 Jul 2005 - 13:21 |
| [Req Char Bound Start End](ReqCharBoundStartEnd)| jUCMNav SHOULD display between accolades the parent stub's IN/OUT labels bound to the start/end points, when the map is a plug-in (e.g., thestart{IN1}, theend{OUT3}).  | GUI | Optional | Low | Approved |  | 16 Feb 2005 - 17:24 |
| [Req Char Conditions](ReqCharConditions)| jUCMNav SHALL display conditions on branches between square brackets (e.g., [condition]). | GUI | Mandatory | Low | Completed |  | 14 Jul 2005 - 13:24 |
| [Req Char Multi Lingual](ReqCharMultiLingual)| jUCMNav SHOULD support a multi-lingual character code for capturing labels and descriptions. | GUI | Optional | Low | Completed |  | 14 Jul 2005 - 13:24 |
| [Req Char Signatures](ReqCharSignatures)| jUCMNav is INTENDED to display the type signatures of start and end points between parenthesis. | GUI | Optional | Low | Approved |  | 17 Feb 2005 - 13:32 |
| [Req Char Stub In Out](ReqCharStubInOut)| jUCMNav SHALL display the stub entry/exit segment labels (e.g., IN1, IN2, OUT1, OUT2) in gray, uppercase, and with a smaller font size. | GUI | Mandatory | Low | Completed |  | 14 Jul 2005 - 13:24 |
| [Req Comments](ReqComments)| jUCMNav SHOULD allow the creation, resising, deletion, and display of user-defined comments anywhere on a diagram. | Functional | Optional | Low | Approved |  | 16 Feb 2005 - 17:32 |
| [Req Comp](ReqComp)| jUCMNav SHALL support the creation, deletion, naming, editing, resizing, and moving of UCM components. | Functional | Mandatory | Urgent | Completed |  | 06 May 2005 - 13:58 |
| [Req Comp Color](ReqCompColor)| jUCMNav SHOULD support line and fill colors for components. | GUI | Optional | Low | Completed | [Req Comp](ReqComp) | 14 Jul 2005 - 13:24 |
| [Req Comp Comp Bind](ReqCompCompBind)| jUCMNav SHALL support the (containment) binding of a component to another component. | Functional | Mandatory | Urgent | Completed | [Req Comp](ReqComp) | 06 May 2005 - 13:59 |
| [Req Comp Comp Unbind](ReqCompCompUnbind)| jUCMNav SHALL support the unbinding of a component contained in (bound to) another component. | Functional | Mandatory | Urgent | Completed | [Req Comp](ReqComp) | 06 May 2005 - 13:59 |
| [Req Comp Path Bind](ReqCompPathBind)| jUCMNav SHALL support the (containment) binding of a path element to a component. | Functional | Mandatory | Urgent | Completed | [Req Comp](ReqComp) | 06 May 2005 - 13:59 |
| [Req Comp Path Unbind](ReqCompPathUnbind)| jUCMNav SHALL support the unbinding of path elements contained in (bound to) a component. | Functional | Mandatory | Urgent | Completed | [Req Comp](ReqComp) | 06 May 2005 - 13:59 |
| [Req Comp Pools](ReqCompPools)| jUCMNav SHOULD support the creation, naming, editing, and moving of UCM pools. | Functional | Mandatory | Low | Approved |  | 14 Feb 2005 - 22:19 |
| [Req Comp Type](ReqCompType)| jUCMNav SHALL support the unbinding of path elements contained in (bound to) a component. | Functional | Mandatory | Low | Completed | [Req Comp](ReqComp) | 14 Jul 2005 - 13:25 |
| [Req Comp User Types](ReqCompUserTypes)| jUCMNav is INTENDED to suppor user-defined component types, with user-provided bitmaps. | Functional | Optional | Low | Approved | [Req Comp](ReqComp) | 17 Feb 2005 - 13:11 |
| [Req Connections](ReqConnections)| jUCMNav SHALL support connecting an end point to a start/wait/timer. | Functional | Mandatory | Medium | Completed |  | 14 Jul 2005 - 13:25 |
| [Req Connections Async](ReqConnectionsAsync)| jUCMNav SHALL support connecting an end point to a start/wait/timer. | Functional | Mandatory | Low | Completed | [Req Connections](ReqConnections) | 14 Jul 2005 - 13:25 |
| [Req Cut Copy Paste Support](ReqCutCopyPasteSupport)| jUCMNAV SHALL support cut/copy/paste operations | Functional | Optional | Low | Proposed |  | 20 May 2005 - 11:32 |
| [Req Display Abstract API](ReqDisplayAbstractAPI)| jUCMNav SHOULD offer an abstract API or layer to support the display and export (e.g., to EPS) UCM diagrams. | Non Functional | Optional | Medium | Approved |  | 17 Feb 2005 - 13:09 |
| [Req Documentation](ReqDocumentation)| jUCMNav code SHALL be accompanied with documentation on how to add new element/component types, menu items, functionalities, and tests. | Non Functional | Mandatory | Medium | Completed |  | 14 Jul 2005 - 13:31 |
| [Req Elem Abort](ReqElemAbort)| jUCMNav SHOULD support the creation, naming, editing, and moving of UCM aborts. | Functional | Optional | Low | Approved |  | 10 Feb 2005 - 14:26 |
| [Req Elem And Fork](ReqElemAndFork)| jUCMNav SHALL support the creation, naming, editing, and moving of UCM and forks. | Functional | Mandatory | Urgent | Completed |  | 10 Jun 2005 - 13:43 |
| [Req Elem And Join](ReqElemAndJoin)| jUCMNav SHALL support the creation, naming, editing, and moving of UCM and joins. | Functional | Mandatory | Urgent | Completed |  | 01 Jun 2005 - 21:36 |
| [Req Elem Delete](ReqElemDelete)| jUCMNav SHALL support the deletion of path elements. | Functional | Mandatory | Urgent | Completed |  | 14 Jul 2005 - 13:25 |
| [Req Elem Direction Arrow](ReqElemDirectionArrow)| jUCMNav SHALL support the creation and moving of UCM direction arrows. | Functional | Mandatory | Medium | Completed |  | 14 Jul 2005 - 13:25 |
| [Req Elem Dynamic Components](ReqElemDynamicComponents)| jUCMNav SHALL support the dynamic components (slots). | Functional | Mandatory | Low | Approved | [Req Comp Pools](ReqCompPools) | 14 Feb 2005 - 21:36 |
| [Req Elem Dynamic Responsibility](ReqElemDynamicResponsibility)| jUCMNav SHOULD support the creation, naming, editing, and moving of UCM dynamic responsibilities. | Functional | Optional | Low | Approved |  | 10 Feb 2005 - 14:14 |
| [Req Elem Dynamic Stub](ReqElemDynamicStub)| jUCMNav SHALL support the creation, naming, editing, and moving of UCM dynamic stubs. | Functional | Mandatory | Medium | Completed |  | 01 Jun 2005 - 21:37 |
| [Req Elem Empty Point](ReqElemEmptyPoint)| jUCMNav SHALL support the creation, naming, editing, and moving of UCM empty points. | Functional | Mandatory | Urgent | Completed |  | 31 May 2005 - 16:36 |
| [Req Elem Empty Responsibility](ReqElemEmptyResponsibility)| jUCMNav SHOULD support the creation, editing, and moving of UCM empty responsibilities. | Functional | Optional | Low | Approved | [Req Elem Responsibility](ReqElemResponsibility) | 20 May 2005 - 11:24 |
| [Req Elem End Point](ReqElemEndPoint)| jUCMNav SHALL support the creation, editing, and moving of UCM end points. | Functional | Mandatory | Urgent | Completed |  | 14 Jul 2005 - 13:25 |
| [Req Elem Failure Point](ReqElemFailurePoint)| jUCMNav SHOULD support the creation, naming, editing, and moving of UCM failure points. | Functional | Optional | Medium | Approved |  | 10 Feb 2005 - 14:32 |
| [Req Elem Goals](ReqElemGoals)| jUCMNav SHOULD support the creation, naming, editing, and moving of UCM goals. | Functional | Optional | Low | Approved |  | 10 Feb 2005 - 14:24 |
| [Req Elem Loops](ReqElemLoops)| jUCMNav SHOULD support the creation, naming, editing, and moving of UCM loops. | Functional | Optional | Low | Approved |  | 14 Jul 2005 - 13:29  |
| [Req Elem Or Fork](ReqElemOrFork)| jUCMNav SHALL support the creation, naming, editing, and moving of UCM or forks. | Functional | Mandatory | Urgent | Completed |  | 01 Jun 2005 - 21:37 |
| [Req Elem Or Join](ReqElemOrJoin)| jUCMNav SHALL support the creation, naming, editing, and moving of UCM OR joins. | Functional | Mandatory | Urgent | Completed |  | 10 Jun 2005 - 13:43 |
| [Req Elem Responsibility](ReqElemResponsibility)| jUCMNav SHALL support the creation, naming, editing, and moving of UCM responsibilities. | Functional | Mandatory | Urgent | Completed |  | 31 May 2005 - 16:40 |
| [Req Elem Shared Responsibilities](ReqElemSharedResponsibilities)| jUCMNav SHOULD support the creation, naming, editing, and moving of UCM shared responsibilities. | Functional | Optional | Low | Approved |  | 10 Feb 2005 - 14:20 |
| [Req Elem Shared Stubs](ReqElemSharedStubs)| jUCMNav SHOULD support the creation, naming, editing, and moving of UCM shared stubs. | Functional | Optional | Low | Approved |  | 10 Feb 2005 - 14:21 |
| [Req Elem Start Point](ReqElemStartPoint)| jUCMNav SHALL support the creation, naming, editing, and moving of UCM start points. | Functional | Mandatory | Urgent | Completed |  | 14 Jul 2005 - 13:29 |
| [Req Elem Start Point Attributes](ReqElemStartPointAttributes)| jUCMNav SHALL provide the following attributes for start points: name, workload | Functional | Mandatory | Urgent | Completed | [Req Elem Start Point](ReqElemStartPoint) | 10 Jun 2005 - 13:43 |
| [Req Elem Static Stub](ReqElemStaticStub)| jUCMNav SHALL support the creation, naming, editing, and moving of UCM static stubs. | Functional | Mandatory | Urgent | Completed |  | 01 Jun 2005 - 21:37 |
| [Req Elem Stub Actions](ReqElemStubActions)| jUCMNAV stubs SHALL allow the following actions: create plug-in, view plug-in, add plug-in, remove plug-in, rename plug-in, bind plug-in, properties. | Functional | Mandatory | Urgent | Started |  | 14 Jul 2005 - 13:31  |
| [Req Elem Stub Other Actions](ReqElemStubOtherActions)| jUCMNAV stubs SHOULD allow the following actions: duplicate plug-in, import plug-in. | Functional | Optional | Medium | Approved | [Req Elem Static Stub](ReqElemStaticStub) | 16 Feb 2005 - 17:40  |
| [Req Elem Stub Other Actions](ReqElemStubOtherActions)| jUCMNAV stubs SHOULD allow the following actions: duplicate plug-in, import plug-in. | Functional | Optional | Medium | Approved | [Req Elem Static Stub](ReqElemStaticStub) | 16 Feb 2005 - 17:40  |
| [Req Elem Timer](ReqElemTimer)| jUCMNav SHALL support the creation, naming, editing, and moving of UCM timers. | Functional | Mandatory | Medium | Completed |  | 14 Jul 2005 - 13:29  |
| [Req Elem Timestamp](ReqElemTimestamp)| jUCMNav SHOULD support the creation, naming, editing, and moving of UCM timestamps. | Functional | Optional | Low | Approved |  | 10 Feb 2005 - 14:26 |
| [Req Elem Wait](ReqElemWait)| jjUCMNav SHALL support the creation, naming, editing, and moving of UCM wait items. | Functional | Mandatory | Medium | Completed |  | 14 Jul 2005 - 13:29 |
| [Req Export Bitmap](ReqExportBitmap)| jUCMNav SHALL support the export of a selection of maps (current, current and submaps, all maps) to individual bitmap files. | Functional | Mandatory | Medium | Completed |  | 14 Jul 2005 - 13:32 |
| [Req Export EPS](ReqExportEPS)| jUCMNav SHALL support the export of a selection of maps (current, current and submaps, all maps) to individual Encapsulated Post Script? files.  | Functional | Mandatory | Low | Approved | [Req Print Diagram](ReqPrintDiagram) | 14 Feb 2005 - 21:48 |
| [Req Export Map](ReqExportMap)| jUCMNav SHOULD support the export of a selection of maps (current, current and submaps, all maps) to a file.  | Functional | Optional | Low | Approved | [Req Save](ReqSave) | 06 Feb 2005 - 21:38  |
| [Req Export SVG](ReqExportSVG)| jUCMNav SHOULD support the export of a selection of maps (current, current and submaps, all maps) to individual Scalable Vector Graphics files. | Functional | Optional | Low | Approved |  | 10 Feb 2005 - 19:22  |
| [Req File Association](ReqFileAssociation)| jUCMNav SHOULD be the application selected by the OS for its files (e.g., .jucm) | Platform | Optional | Low | Rejected | [Req Open](ReqOpen) | 10 Feb 2005 - 19:22 |
| [Req Goal Attributes](ReqGoalAttributes)| jUCMNav is INTENDED to provide access to as many attributes from the metamodel as possible. | Goal | Future | Medium | Completed |  | 14 Jul 2005 - 13:29 |
| [Req Goal Auto Layout](ReqGoalAutoLayout)| jUCMNav is INTENDED to support the automatic layout of UCM diagrams. | Goal | Future | Low | Started |  | 19 May 2005 - 15:25 |
| [Req Goal Browsing](ReqGoalBrowsing)| jUCMNav is INTENDED to support navigation of UCM model in a Web-browser-like way. | Goal | Future | Urgent | Approved |  | 16 Feb 2005 - 22:08 |
| [Req Goal Command Line](ReqGoalCommandLine)| jUCMNAv is INTENDED to support a command line interface. | Goal | Future | Low | Approved |  | 16 Feb 2005 - 22:08 |
| [Req Goal Composite Scenarios](ReqGoalCompositeScenarios)| jUCMNav is INTENDED to allow scenarios to be defined based on existing scenario definitions. | Goal | Future | Low | Approved |  | 16 Feb 2005 - 22:09 |
| [Req Goal Grl Support](ReqGoalGrlSupport)| jUCMNav INTENDS to support the complete User Requirements Notation, including GRL | Goal | Future | Low | Approved |  | 06 Feb 2005 - 21:44  |
| [Req Goal Gui Standards](ReqGoalGuiStandards)| jUCMNav is INTENDED to comply to the Eclipse GUI standards as much as possible. | Goal | Future | Low | Approved |  | 17 Feb 2005 - 13:22 |
| [Req Goal Multi Language](ReqGoalMultiLanguage)| jUCMNav is INTENDED to support multiple languages for the GUI, including English and French. | Goal | Future | Low | Completed | [Req Char Multi Lingual](ReqCharMultiLingual) | 14 Jul 2005 - 13:29 |
| [Req Goal Open API](ReqGoalOpenAPI)| jUCMNav is INTENDED to be an open an extensible tool, which can be achieved via an open API. | Goal | Future | Low | Approved |  | 16 Feb 2005 - 17:04 |
| [Req Goal Scripting](ReqGoalScripting)| jUCMNav INTENDS to support a scripting language enabling all the functionalities available via the GUI | Goal | Future | Low | Approved |  | 16 Feb 2005 - 22:12 |
| [Req Goal Shortcuts](ReqGoalShortcuts)| jUCMNav is INTENDED to provide keyboard access to its functionalities and menus. | Goal | Future | Low | Approved | [Req Goal Gui Standards](ReqGoalGuiStandards) | 17 Feb 2005 - 13:23 |
| [Req Goal Traversal](ReqGoalTraversal)| jUCMNav INTENDS to support model traversal based on scenario definitions. | Goal | Future | Low | Approved |  | 06 Feb 2005 - 21:47 |
| [Req Goal Well Formed UCM](ReqGoalWellFormedUCM)| jUCMNav is INTENDED to ensure that only well-formed UCMs will be constructed. | Goal | Future | Low | Completed|  | 14 Jul 2005 - 13:32 |
| [Req Help About](ReqHelpAbout)| jUCMNav SHALL have an About menu item that displays the tool version, contributors, acknowledgements, and copyright notices. | Functional | Mandatory | Medium | Completed |  | 14 Jul 2005 - 13:29 |
| [Req Help Contextual](ReqHelpContextual)| jUCMNav SHOULD provide contextual help for its GUI components.  | GUI | Optional | Low | Approved |  | 16 Feb 2005 - 22:03 |
| [Req Help On Line](ReqHelpOnLine)| jUCMNav SHALL include a searchable on-line help on its functionalities.  | Functional | Mandatory | Medium | Completed |  | 14 Jul 2005 - 13:32 |
| [Req Help Tool Tips](ReqHelpToolTips)| jUCMNav SHOULD provide tool tips for all the GUI buttons and panels.  | GUI| Optional | Medium | Approved | [Req Goal Gui Standards](ReqGoalGuiStandards) | 06 Feb 2005 - 22:14 |
| [Req Help Tool Tips](ReqHelpToolTips)| jUCMNav SHOULD provide tool tips for all the GUI buttons and panels.  | GUI | Optional | Medium | Approved | [Req Goal Gui Standards](ReqGoalGuiStandards) | 06 Feb 2005 - 22:14 |
| [Req Java Version](ReqJavaVersion)| jUCMNav SHALL be executable on Java 1.5 | Non Functional | Mandatory | Urgent | Completed |  | 06 Feb 2005 - 22:14 |
| [Req Labels](ReqLabels)| jUCMNAV SHALL support labels anchored to elements and positioned via X-Y deltas. | GUI | Mandatory | Medium | Completed |  | 01 Jun 2005 - 21:37 |
| [Req Model Compare](ReqModelCompare)| jUCMNav is INTENDED to enable the comparison between two use case map models (including two versions of the same model) and emphasize the differences. | Goal | Future | Low | Approved |  | 17 Feb 2005 - 13:13 |
| [Req Model Hyperlink](ReqModelHyperlink)| jUCMNav SHOULD allow the user to anotate any model element with a hyperlink (Unified Resource Locator) and to visit this URL. | Functional | Optional | Medium | Approved |  | 16 Feb 2005 - 17:30 |
| [Req Model Merge](ReqModelMerge)| jUCMNav is INTENDED to support the merging of two UCM models. | Functional | Optional | Low | Approved | [Req Model Compare](ReqModelCompare) | 17 Feb 2005 - 13:16 |
| [Req Model Search](ReqModelSearch)| jUCMNav SHOULD support user-defined searches for elements in a UCM model. | Functional | Optional | Low | Approved |  | 06 Feb 2005 - 22:18 |
| [Req Mode Move All](ReqModeMoveAll)| jUCMNav SHOULD offer a default mode where modifying sizes and positions of all elements is allowed. | Functional | Optional | Low | Completed|  | 14 Jul 2005 - 13:29 |
| [Req Mode Move Nothing](ReqModeMoveNothing)| jUCMNav SHOULD offer a mode where modifying sizes and positions of all elements is prevented. | Functional | Optional | Low | Approved |  | 06 Feb 2005 - 22:15 |
| [Req Mode Move Paths](ReqModeMovePaths)| jUCMNav SHOULD offer a mode where modifying sizes and positions of components only is prevented. | Functional | Optional | Low | Approved |  | 06 Feb 2005 - 22:16 |
| [Req Multi Windows](ReqMultiWindows)| jUCMNav SHALL support the editing of multiple UCM diagrams simultaneously. | Functional | Mandatory | Low | Completed |  | 14 Jul 2005 - 13:29 |
| [Req Open](ReqOpen)| jUCMNav SHALL support opening a document from its XMI serialization. | Functional | Mandatory | Medium | Completed |  | 19 May 2005 - 15:26 |
| [Req Open Old DTD](ReqOpenOldDTD)| jUCMNav SHOULD support the opening or import of .ucm files compliant to the UCM DTD 0.23. | Functional | Optional | Medium | Approved |  | 14 Feb 2005 - 22:17 |
| [Req Open Previous](ReqOpenPrevious)| jUCMNav SHOULD allow the user to open recently accessed files (e.g. any of the last four) via the menu. | GUI | Optional | Low | Approved | [Req Open](ReqOpen) | 14 Feb 2005 - 22:17 |
| [Req Print Diagram](ReqPrintDiagram)| jUCMNav SHALL support the printing of a diagram or a selection of diagrams. | Functional | Optional | Medium | Approved |  | 14 Feb 2005 - 22:17 |
| [Req Print Preview](ReqPrintPreview)| jUCMNAv SHOULD support the preview of the document on screen for user confirmation. | Functional | Optional | Low | Approved | [Req Print Diagram](ReqPrintDiagram) | 16 Feb 2005 - 17:27 |
| [Req Print Properties](ReqPrintProperties)| jUCMNav SHOULD support user-defined page properties for printing documents. | Functional | Optional | Low | Approved | [Req Print Diagram](ReqPrintDiagram) | 16 Feb 2005 - 17:20  |
| [Req Print Report](ReqPrintReport)| jUCMNav SHALL support the generation of printable reports that include the UCM diagrams and at least these options: UCM selection, date/time, and description of responsibilities, components, stubs, conditions, scenario definitions, and performance annotations. | Functional | Mandatory | Low | Approved | [Req Print Diagram](ReqPrintDiagram) | 16 Feb 2005 - 22:10  || [Req Save As](ReqSaveAs)| jUCMNav SHALL support saving the document (in XMI) to a file selected by the user. | Functional | Mandatory | Urgent | Approved |  | 01 Jun 2005 - 21:37  |
| [Req Save](ReqSave)| jUCMNav SHALL support saving the document (in XMI) to a known filename.  | Functional | Mandatory | Urgent | Approved | [Req save as](REqSaveAs) | 01 Jun 2005 - 21:37  |
| [Req Save Auto](ReqSaveAuto)| jUCMNav SHALL provide an auto-save (to a different file with the same name but with a different extension) option with user-defined intervals. | Functional | Mandatory | Low | Approved | [Req Save](ReqSave) | 16 Feb 2005 - 22:13  |
| [Req Save Auto Revert](ReqSaveAutoRevert)| jUCMNav SHALL support the opening of the last auto-saved version of the document. | Functional | Mandatory | Low | Approved | [Req Open](ReqOpen), [Req Save Auto](ReqSaveAuto) | 16 Feb 2005 - 22:14  |
| [Req Save Backup](ReqSaveBackup)| jUCMNav SHALL make a backup of the existing file before saving the latest version of the document. | Functional | Mandatory | Low | Approved |  | 25 May 2005 - 19:57  |
| [Req Save Schema](ReqSaveSchema)| jUCMNav SHALL support saving the document to a known filename valid according to the URN DTD. | Functional | Mandatory | Low | Approved |  | 25 16 Feb 2005 - 17:43  |
| [Req Select All](ReqSelectAll)| jUCMNav SHALL support the selection of all elements in the current UCM. | Functional | Mandatory | Medium | Completed |  | 01 Jun 2005 - 21:37 |
| [Req Select Feedback](ReqSelectFeedback)| jUCMNav SHALL provide visual feedback about selected model elements. | GUI | Mandatory | Urgent | Completed | [Req Select Single](ReqSelectSingle), [Req Select Group](ReqSelectGroup) | 01 Jun 2005 - 21:37 |
| [Req Select Group](ReqSelectGroup)| jUCMNav SHALL support the selection of groups of elements, at least via multiple shift-clicks and via selection box dragging. | Functional | Mandatory | Medium | Completed | [Req Select Single](ReqSelectSingle) | 01 Jun 2005 - 21:37 |
| [Req Select Group Align](ReqSelectGroupAlign)| jUCMNav SHOULD allow the user to align the elements in a group of selected items: top, center vertically, bottom, left, center horizontally, or right. | Functional | Optional | Medium | Approved | [Req Select Group](ReqSelectGroup) | 06 Feb 2005 - 22:21 |
| [Req Select Group Delete](ReqSelectGroupDelete)| jUCMNav SHOULD allow the user to align the elements in a group of selected items: top, center vertically, bottom, left, center horizontally, or right. | Functional | Optional | Medium | Approved | [Req Select Group](ReqSelectGroup) | 06 Feb 2005 - 22:21 |
| [Req Select Group Distr](ReqSelectGroupDistr)| jUCMNav SHOULD allow the user to distribute the elements in a group of selected items: vertically or horizontally. | Functional | Optional | Medium | Approved | [Req Select Group](ReqSelectGroup) | 10 Feb 2005 - 14:03 |
| [Req Select Group Move](ReqSelectGroupMove)| jUCMNav SHALL allow the user to move a group of selected items. | Functional | Mandatory | Medium | Approved | [Req Select Group](ReqSelectGroup) | 01 Jun 2005 - 21:37 |
| [Req Select Single](ReqSelectSingle)| jUCMNav SHALL support the single-click selection of a desired UCM component or path element. | Functional | Mandatory | Urgent | Completed |  | 01 Jun 2005 - 21:37 |
| [Req Select Unselect All](ReqSelectUnselectAll) | jUCMNav SHALL allow the user to unselect all selected elements. | Functional | Mandatory | Urgent | Completed |  | 01 Jun 2005 - 21:37 |
| [Req Select Unselect One](ReqSelectUnselectOne)| jUCMNav SHALL allow the user to unselect one element in a group selected elements. | Functional | Mandatory | Medium | Approved | [Req Select Group](ReqSelectGroup) | 01 Jun 2005 - 21:37 |
| [Req Static Semantic Check](ReqStaticSemanticCheck)| The system shall check, upon user’s request, all enabled static semantics checking rules on the URN model that is being opened in jUCMNav. | Functional | Mandatory | Medium | Implemented |  | 23 Jan 2008 - 13:00 |
| [Req Static Semantic Disable](ReqStaticSemanticDisable)| The system shall allow users to disable static semantics checking rules. | Functional | Mandatory | Medium | Implemented |  | 27 Jan 2008 - 21:55 |
| [Req Static Semantic Enable](ReqStaticSemanticEnable)| The system shall allow users to enable static semantics checking rules. | Functional | Mandatory | Urgent | Implemented |  | 27 Jan 2008 - 21:54 |
| [Req Static Semantic Modify](ReqStaticSemanticModify)| The system should allow defined rules to be changed without the need to recompile jUCMNav | Functional | Mandatory | Medium | Implemented |  | 27 Jan 2008 - 21:51 |
| [Req Static Semantic New](ReqStaticSemanticNew)| The system shall allow new rules to be added without the need to recompile jUCMNav | Functional | Mandatory | Medium | Implemented |  | 27 Jan 2008 - 21:56 |
| [Req Static Semantic Report](ReqStaticSemanticReport)|The system shall report rules violations to the user. | Functional | Mandatory | Medium | Implemented |  | 27 Jan 2008 - 21:55 |
| [Req Static Semantic Share Export](ReqStaticSemanticShareExport)| The system shall allow a user to save rules into a file. | Functional | Mandatory | Medium | Implemented |  | 27 Jan 2008 - 21:57 |
| [Req Static Semantic Share Import](ReqStaticSemanticShareImport)| The system shall allow a user to load rules saved in a file into the system. | Functional | Mandatory | Medium | Implemented |  | 27 Jan 2008 - 21:52 |
| [Req View Full Screen](ReqViewFullScreen)| jUCMNav SHOULD allow the user to navigate a UCM model in full screen mode (can be within a window with menu). | GUI| Optional | Low | Completed |  | 14 Jul 2005 - 13:29 |



# jUCMNav 2.0 Requirements

  - [List of jUCMNav 2.0 Requirements](JUCMNavRequirementsVer2)



# Reports

  - [Requirements by authors](AuthorsOfReqReport).
  - [Verification strategies and related test
    cases](VerificationOfReqReport).
  - [Mandatory high/low with all information](MustDoReport)
  - Here is a [summary of the discussions](SummaryOfReqDiscussions)
    (risks, rationales, feasibility) related to our requirements.



# Guidelines

Twiki.TWikiForms will be used to manage requirements. See
QuickTwikiFormsFacts for explanations on such forms.

  - Each new requirement goes into a new topic page starting with
    ***Req***
      - This also means ***no*** other topic page in this Wiki should
        have this prefix.
  - In the form, the name of the requirement should be the same as the
    topic page's.
  - The fields are briefly explained in FormForReq. Explanations also
    show as tool tips in the forms.
  - Make sure your names are well choses and your requirements well
    written.
      - Requirements should be testable, concise, unambiguous, feasible,
        etc. (note that this very sentence is *not* a requirement but
        more like a goal or even a wish...).
  - Do not hesitate to use the topic pages to discuss risks,
    feasibility, rationales, etc. for your requirements. Sign and date
    your comments.

\-- Main.DanielAmyot - 16 Jan 2005
