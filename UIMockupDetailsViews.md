### 1\. Views

#### 1.1 Navigator

[[img/view_navigator_mockup.png]]  
Above: Concept sketch.

**Description**  
The Navigator view displays .ucm files included in the current project.
Under each of those files, it lists the diagrams they contain, ordered
alphabetically by name. It does not display sub-elements of a diagram
such as stubs, a responsibility left to the Outline view.

**Behaviour**  
On load: If a project is already open and active, this view displays the
current project's structure and highlights the currently focused UCM
diagram, from the topmost editor window (if applicable). (Eclipse UI
Guideline 7.8)

Double-click: Double-clicking a UCM file or a diagram contained therein,
opens that diagram for editing. If a UCM file is opened, the editor
defaults to the topmost level of the first diagram. For a diagram, the
topmost level of that diagram is shown.

Subitems' context menu: A context menu can be invoked by right-clicking
on the project folder, on a UCM file, or on a UCM diagram. Note that
several of the usual items found in Eclipse context menus for package
explorer / navigator items either do not apply or are not targeted for
implementation in our project's timeframe. Future versions will expand
on this.  
Project folder, UCM File, UCM Diagram context menu items (relevant
extensions): Open, Delete, Import, Export  

#### 1.2 Outline

[[img/view_outline_mockup.png]] 

[[img/view_jucmnav_outlineview_demo.png ]]

Above: Concept with example data (**Left**) and *Hello World*
implementation (**Right**).

**Description**  
Contains a tree-view style list of all components of a diagram, using
icons representative of the component type. Stubs are expandable into
another level of the tree view. Icons are similar to those used in the
toolbox. Components can be grouped by type or listed alphabetically.

**Behaviour**  
On load: Upon opening this view, it derives its contents from the
component contents of the top-most or active diagram being edited.
(Eclipse UI Guideline 7.8)

Click: Clicking a node in the tree will focus that component and select
it in the editor. Selecting multiple nodes will select the corresponding
components in the editor.

Response: View responds to selection of a component in the editor by
highlighting that component. Does the same for multiple selections.

Subitems' context menu: Show, Delete

#### 1.3 Responsibilities

[[img/view__responsibilites_mockup1.png ]] 

[[img/view_responsibilities\_demo.png ]] 

Concept (**left**) and *Hello World* implementation (**right**).

**Description**  
Contains a list of all Responsibilities in a diagram, along with their
textual description.

**Behaviour**  
On load: Upon opening this view, it derives its contents from the
component contents of the top-most or active diagram being edited.
(Eclipse UI Guideline 7.8) The diagram's model is queried and the
Responsibilities are enumerated.

Click: Clicking a Responsibility will focus that Responsibility and
select it in the editor. No multiple selections are permitted.

Response: View responds to selection of a component in the editor by
highlighting that component.

Subitems' context menu: None targeted for this release.

#### 1.4 Properties

[[img/view_properties_mockup.png]]  

[[img/view_properties_demo.png ]] 

Concept (**left**) and *Hello World* implementation (**right**).

**Description**  
Contains a list of all Properties for the selected object in a diagram,
along with their actual value.

**Behaviour**  
On load: Upon opening this view, it derives its contents from the
selected object in the diagram. The object is queried and the properties
are enumerated along with their actual values.

Click: Clicking a property will focus the value of the selected
property. No multiple selections are permitted. Once the value is
focused, the user will be able to edit that value. The editor used to
edit a property is determined by the nature of that property. If a value
is changed, the change is reflected into the editor.

Typing: Typing will edit the selected value if it can be edited that
way. If a value is changed, the change is reflected into the editor and
other views.

Response: View responds to selection of a component in the editor.

Subitems' context menu: None targeted for this release.

#### 1.5 Description Panel

[[img/view_description_mockup.png]] 
[[img/view_description\_demo.png ]] 

Concept (**left**) and *Hello World* implementation (**right**).

**Description**  
Contains the description of the selected item in the editor.

**Behaviour**  
On load: Upon opening this view, it derives its contents from the
selected item of the top-most or active diagram being edited. The item
is queried and the description is retrieved.

Click: Clicking in this view will place the cursor in the text box.

Typing: Typing in this view will edit the description.

Response: View responds to selection of an item in the editor by
retrieving the description of the newly selected item.

Subitems' context menu: Basic text editing commands (Undo, Cut, Copy,
Paste, Delete, Select All).

#### 1.6 Palette

[[img/view_palette_mockup.png]] 
[[img/view_palette_demo.png]]  

Concept (**left**) and *Hello World* implementation (**right**).

**Description**  
Contains all the element the user can insert in a UCM model.

**Behaviour**  
On load: Upon opening this view, it will display all the items a user
can insert in a UCM diagram. If there is no UCM model open, the content
of this view is not populated.

Click: Clicking in this view will select the item the user wants to
insert. Clicking in a UCM diagram will perform the selected action from
the palette.

Response: View responds to selection of an item by changing the
appearance of the selected item.

Subitems' context menu: None targeted for this release.
