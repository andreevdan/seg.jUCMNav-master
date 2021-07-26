# Deliverable 4 - Design report

## jUCMNav – Eclipse Plugin

by [Olivier Clift-Noël](Main.OlivierCliftNoel)    
[Jean-Philippe Daigle](Main.JeanPhilippeDaigle)
[Jason Kealey](Main.JasonKealey)
[Jordan McManus](Main.JordanMcManus)
[Etienne Tremblay](Main.EtienneTremblay)
--     Team SoftwareEngineering.Ca             

Work presented to     Dr. Liam Peyton     for the     software
engineering capstone project    

            

University of Ottawa     May 13th, 2005             

# Table of Contents

<span class="twiki-macro TOC"></span>             

# Design Specification

## Architecture

### Package description
<img alighn = "left" src="img/packageHiearchy.png">

What follows is a description of the packages in our
project, for future development reference. We will take care to explain
the subset of most important packages with appropriate detail.

#### Model packages

grl.\*     ucm.\*     urn.\*    

Classes that are located in the above packages belong to the URN
meta-model provided to us by Daniel. These include URN (User
Requirements Notation), UCM (Use Case Maps) and GRL (Goal-Oriented
Requirement Language). These packages were generated with EMF.
EMF-generated classes and packages behave in a way that reflects the
class diagram from which they were generated. For example, if two
classes have a bi-directional relation, when you set the property of
this relation in one class, the property is automatically set in the
other class of the relation. EMF generates the code expressing these
relationships for us.

#### seg.jUCMNav

Contains the root class that is registered as an Eclipse plug-in. Is
also the container for all of our other packages. The plugin’s
responsibility is simply to manage shared resources. For example, our
icons are stored in this package’s icons subfolder. All classes that
need to obtain icons, such as the palette, will query this central
location.

  - See
    [AbstractUIPlugin](http://www.eclipse.org/documentation/html/plugins/org.eclipse.platform.doc.isv/doc/reference/api/org/eclipse/ui/plugin/AbstractUIPlugin.html)
  - See [UI
    Guidelines](http://www.eclipse.org/articles/Article-UI-Guidelines/Contents.html)

#### seg.jUCMNav.actions All classes located in this package extend the org.eclipse.jface.action.Action class. Actions can manipulate the model or simply perform any general task. All actions located in this package are registered in the ActionRegistry associated with our editor. After being registered in the action registry, actions are not only available for our editor but also for other workbench parts, such as views or toolbars. Classes in this package are mainly used in our editor’s context menu provider and its action bar contributor. For example, the show/hide label action available in a path node or component’s context menu is defined here. \* See [Action](http://www.eclipse.org/documentation/html/plugins/org.eclipse.platform.doc.isv/doc/reference/api/org/eclipse/jface/action/Action.html)

#### seg.jUCMNav.editors

This package contains the central part of our plug-in: the use case map
graphical editor.

  - See in GEF Developer Guide:
    org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette

#### seg.jUCMNav.editors.palette

The palette is a visual representation of all the tools that are
available to the user while using an editor. Our palette contains the
selection tool, various creation tools for all of our path nodes and the
path tool (see seg.jUCMNav.editors.palette.tools).

  - See in GEF Developer Guide: org.eclipse.gef.palette.PaletteRoot

#### seg.jUCMNav.editors.palette.tools

All classes in this package extend org.eclipse.gef.tools.AbstractTools.
The palette contains custom tools that can use finite state machines to
change their behaviour depending on the current context. Our plug-in
contains a special path tool that allows the creation, extension,
merging or connection of different paths.

  - See in GEF Developer Guide: org.eclipse.gef.tools.CreationTool
  - See in GEF Developer Guide: org.eclipse.gef.tools.SelectionTool

#### seg.jUCMNav.editors.resourceManagement

Our editor has been created to modify .jucm files. The classes in this
package are responsible for the conversion of file inputs into our
topmost meta-model element, URNspec, and vice-versa. Furthermore,
editors watch for changes in the underlying file system object using a
class in this package, ResourceTracker.

  - See
    [IResourceChangeListener](http://www.eclipse.org/documentation/html/plugins/org.eclipse.platform.doc.isv/doc/reference/api/org/eclipse/core/resources/IResourceChangeListener.html)
  - See
    [IResourceDeltaVisitor](http://www.eclipse.org/documentation/html/plugins/org.eclipse.platform.doc.isv/doc/reference/api/org/eclipse/core/resources/IResourceDeltaVisitor.html)

#### seg.jUCMNav.editparts

All classes located in this package extend the
org.eclipse.gef.editparts. AbstractGraphicalEditPart class via
ModelElementEditPart. Edit parts are the controller in the MVC
architecture. They are the link between the model and its view. Edit
parts contain a figure which is the actual visual representation of the
model. When the underlying model changes, edit parts change this visual
representation. Furthermore, when the user performs an action in the
editor, these actions are sent to the edit part which then delegates any
request handling to the edit policies.

The main container edit part is our MapAndPathGraphEditPart which
corresponds to the ucm.map.Map and ucm.map.PathGraph model elements. It
does not have any visual representation but will contain all component
references and path nodes. Our path nodes are represented by our
PathNodeEditPart. Furthermore, the controller for the relations between
path nodes is handled by the NodeConnectionEditPart. To instantiate our
edit parts, we invoke createEditPart() on the GraphicalEditPartFactory.

  - See in GEF Developer Guide:
    org.eclipse.gef.editparts.AbstractGraphicalEditPart
  - See in GEF Developer Guide:
    org.eclipse.gef.editparts.AbstractConnectionEditPart
  - See in GEF Developer Guide:
    org.eclipse.gef.editparts.ScalableFreeformRootEditPart
  - See in GEF Developer Guide: org.eclipse.gef.EditPartFactory

#### seg.jUCMNav.editpolicies

All classes in this package extend
org.eclipse.gef.editpolicies.AbstractEditPolicy. Edit policies represent
an edit part’s behaviour. Given certain requests, they are responsible
for visual feedback, creating commands to be performed on the model and
communication with other edit parts.

  - See in GEF Developer Guide:
    org.eclipse.gef.editpolicies.AbstractEditPolicy

#### seg.jUCMNav.editpolicies.element

This package contains the edit policies that handle all non-standard
requests that we will have defined on our model elements, such as our
path nodes or components. For example, our PathNodeComponentEditPolicy
is responsible for the deletion of path nodes.

  - See in GEF Developer Guide:
    org.eclipse.gef.editpolicies.ComponentEditPolicy (Don't confuse the
    Component Role for edit policies and UCM/URN Components)

</td\> </tr\> </table\>

#### seg.jUCMNav.editpolicies.layout

The edit policies contained in this package take care of the creation,
movement and resizing of our model elements. An interesting starting
point when studying the edit policies in our plug-in is the
MapAndPathGraphXYLayoutEditPolicy which handles the creation of new path
nodes and component references and the movement or resizing of all
elements in a diagram. Furthermore, the NodeConnectionXYLayoutEditPolicy
is responsible for the same kind of behaviour but on node connections.

  - See in GEF Developer Guide:
    org.eclipse.gef.editpolicies.XYLayoutEditPolicy

#### seg.jUCMNav.editpolicies.feedback

The edit policies in this package take care of the visual feedback shown
to the user before an actual action is performed. For example, since our
path nodes are not resizable, this package contains
PathNodeNonResizableEditPolicity so that the user knows that this is not
appropriate.

  - See in GEF Developer Guide:
    org.eclipse.gef.editpolicies.NonResizableEditPolicy

#### seg.jUCMNav.editpolicies.directEdit

Edit policies providing direct edition allow the user to modify text in
a diagram directly in the editor. For example, labels can be modified
directly using LabelDirectEditPolicy.

  - See in GEF Developer Guide:
    org.eclipse.gef.editpolicies.DirectEditPolicy

#### seg.jUCMNav.figures

Figures are the visual representation of model elements. They depend on
Draw2D to facilitate their rendering but the package will be extended in
the future (or a subpackage will be created) to allow drawing the
figures to general outputs such as EPS or SVG files.

  - See in Draw2D Developer Guide: org.eclipse.draw2d.Label
  - See in Draw2D Developer Guide: org.eclipse.draw2d.Figure
  - See in Draw2D Developer Guide: org.eclipse.draw2d.geometry.Rectangle

#### seg.jUCMNav.figures.router

Classes in this package simply represent the B-spline used to draw the
curved connections between path nodes.

  - See in Draw2D Developer Guide: org.eclipse.draw2d.AbstractRouter

#### seg.jUCMNav.model

The ModelCreationFactory contained in this package contains our business
logic when we instantiate new elements from the meta-model. To simplify
our application, some elements such as the ucm.map.Map must always
contain a ucm.map.PathGraph, the container for path nodes and
connections. These are created here. Furthermore, because EMF generates
one factory per package, this class helps us centralize the creation of
model elements.

  - See in GEF Developer Guide: org.eclipse.gef.requests.CreationFactory

#### seg.jUCMNav.model.util

This package contains utility classes to manipulate or query the
underlying model. For example, to be able to sort a list of certain
model elements, such as components, using the algorithms provided to us
by java.util, we created ComponentRefAreaComparator which implements
Comparator.

  - See
    [Comparator](http://java.sun.com/j2se/1.4.2/docs/api/java/util/Comparator.html)

#### seg.jUCMNav.model.commands

All classes in this folder extend our JUCMNavCommand which extends
org.eclipse.gef.commands.Command. Commands are used to manipulate the
underlying model and are stacked in our editor’s CommandStack. Edit
policies and actions instantiate our commands and push them onto the
stack. Our JUCMNavCommand imposes a structure used in our test cases.

  - See in GEF Developer Guide: org.eclipse.gef.commands.Command
  - See in GEF Developer Guide: org.eclipse.gef.commands.CompoundCommand

#### seg.jUCMNav.model.commands.changeConstraints

The commands located in this package are change constraint commands.
These are created when an element is moved or resized.

#### seg.jUCMNav.model.commands.create

The commands in this package either create new elements and add them to
the underlying model or simply add passed elements.

#### seg.jUCMNav.model.commands.delete

The commands in this package remove elements from the model. They must
keep references to the deleted items in case an undo() is performed.

#### seg.jUCMNav.model.commands.transformations

This package contains all other general model manipulation commands such
as the Cut Path command.

#### seg.jUCMNav.tests

This package is the top level container for all JUnit tests. It contains
TestAllTestSuite which runs all the programmed tests.

#### seg.jUCMNav.tests.progress

This package contains the tests defined in our test plan to be able to
measure our progress throughout development. ProgressTests will
eventually contain 71 tests that should all pass when the project is
complete.

#### seg.jUCMNav.tests.commands

This package contains the tests that run solely on JUCMNav commands.
JUCMNavCommandTests test the undo/redo behaviour for all our commands.

#### seg.jUCMNav.views

This package contains our plug-in’s views or classes that are used by
them: the responsibility view, the description view and the property
view. As for the toolbox, it has been implemented as a flyout palette
inside the editor itself. Furthermore, we have decided not to modify the
navigator view. The property view itself uses EObjectPropertySource to
refine its behaviour for our custom meta-model elements.

  - See
    [IPropertySource](http://www.eclipse.org/documentation/html/plugins/org.eclipse.platform.doc.isv/doc/reference/api/org/eclipse/ui/views/properties/IPropertySource.html)
  - See
    [ContentOutline](http://www.eclipse.org/documentation/html/plugins/org.eclipse.platform.doc.isv/doc/reference/api/org/eclipse/ui/views/contentoutline/ContentOutline.html)
  - See [View
    Part](http://www.eclipse.org/documentation/html/plugins/org.eclipse.platform.doc.isv/doc/reference/api/org/eclipse/ui/part/ViewPart.html)

#### seg.jUCMNav.views.wizards

This package contains our wizards that extend
org.eclipse.jface.wizard.Wizard or org.eclipse.jface.wizard.WizardPage.
Wizards help perform more complex tasks such as resource creation or
import/export.

  - See
    [Wizard](http://help.eclipse.org/help30/index.jsp?topic=/org.eclipse.platform.doc.isv/reference/api/org/eclipse/jface/wizard/Wizard.html)
  - See
    [WizardPage](http://help.eclipse.org/help30/index.jsp?topic=/org.eclipse.platform.doc.isv/reference/api/org/eclipse/jface/wizard/WizardPage.html)

### Package dependencies

[[img/jdepend.png]]

The above image represents our high level package dependencies as
computed by [JDepend](www.clarkware.com/software/JDepend.html) (The
diagram layout was done by [Graphviz](http://www.graphviz.org). Although
the diagram might seem cluttered at first, it is interesting to note
that the color of all nodes indicates the level of dependency. The
redder the package, the more it is used elsewhere. As we can see, our
commands are the focal point of the system; that is why we have focused
most of our testing energy at this level.

#### Structural Analysis

The following pictures were obtained with *Structural Analysis for Java*
from IBM. This software is used to produce a graph of all the packages
with their dependencies. It can draw class and interfaces too but it
would clutter our diagrams with no clear benefits. The pictures
represent our package dependencies and containment relations. We took
some screenshots to show the most meaningful diagrams and then explain
some of our class hierarchy choices.



[[img/editpartsPackage.png]]

 Here we can see the package diagram for the
editpart package. What is interesting to mention here is that our
editpart package, which represents our controller in our MVC pattern,
uses both the figures and some model packages but doesn't know about the
editor that contains it. We want our editpart to be as reusable as
possible and didn't include a relation with our editor even though in
some situations it would have been easier to do so. We can see that the
editpolicies use the editpart package since the editpolicies are the
dynamic behaviour of a particular editpart. The advantage of separating
the behaviour of the editparts in another class is to add the ability
for the editpart to change its behaviour at runtime. For example, if we
have an editpolicy that manages the feedback produced to the user when
he tries to do a given operation, the editpart could change this default
behaviour at runtime to install a totally new editpolicy with new
behaviour, etc. </td\> </tr\> <tr\> <td align="center"\>
[[img/figurePackage.png]]     </td\> <td bgcolor="\#F9F9F9"\>
Here we have our figure package diagram. This package represents our
view in the MVC pattern. The interesting fact here is that the figure
package references the model package (the package "map") but in fact
it's only the router package inside the figure package that uses the
model. We are currently talking about moving the router package outside
of the figure package, but right now for semantic reasons the package
will probably stay this way. Since the router routes figures, we thought
it would be a good idea to put it in the same package as figures, but
not including the router package, the figure package doesn't know about
the model at all. Only editparts packages use this package. </td\>
</tr\> <tr\> <td align="center"\> 
[[img/modelPackage2.png]]
[[img/modelPackage.png]]      </td\> <td
bgcolor="\#F9F9F9"\> Here we can see our model package. The model
package doesn't really represent a model in an MVC pattern; rather it's
the package containing our classes using most of the metamodel given by
our client. The first diagram represents a two-level hierarchy of the
package around model. What is interesting here is that it shows the
package hierarchy of the command package too. The command package
modifies the model with operations that can be undone. We have different
kinds of commands, separated into different packages, as explained
previously.

The second diagram is a little bit more interesting and shows the
dependencies of the model package. Once again we can see that the model
package uses a lot of packages from the metamodel. That's normal since
our model package contains a class that is responsible for creating all
the classes we use from the metamodel. We centralized this process in
the class ModelCreationFactory which knows how to construct an object
from a given class. This way if the model changes a little bit and we
have to change the way we initialize an object, the changes will be
constrained to this factory.

Next, we can see that the entire commands package uses the model package
since most of them create objects. The resourceManagement package uses
it too because it's the class responsible for loading files. When you
load a file, you have to create objects, which is why there's this
dependency. </td\> \</tr\> <tr\> <td align="center"\>
[[img/jUCMNavPackage.png]]      </td\> <td bgcolor="\#F9F9F9"\>
Here we have the main jUCMNav package. This package is the central point
of our plugin. The only class in this package is JUCMNavPlugin, which
represents our plugin in eclipse. This diagram only shows the
containment relationship of the package, but it also shows that the
*palette* and the *resourcemanagement* packages use this package. In
fact, those two packages use the JUCMNavPlugin class only to know the
path of our plugin in eclipse. No function actually calls a function
within JUCMNavPlugin. In fact, JUCMNavPlugin does no processing; it's
just a class containing an id of our plugin. All the information about
our plugin is contained in our plugin.xml. </td\> </tr\> </table\>

##### Summary of structural analysis

Here is the summary from *Structural Analysis for Java* when we run it
with all packages from our project and the generated class from the
metamodel of our client:

  - *"The overall stability of the system is **67%**. Highly stable
    systems are typically above **90%**. There are 288 objects, forming
    a total of 2297 relationships. The typical object in this system
    immediately depends on 7.98 objects. On average, the modification of
    one object potentially affects 93.2 other objects."*

And then here are the results if we look only at the classes of our
project without the generated metamodel:

  - *"The overall stability of the system is **87%**. Highly stable
    systems are typically above 90%. There are 100 objects, forming a
    total of 403 relationships. The typical object in this system
    immediately depends on 4.03 objects. On average, the modification of
    one object potentially affects 12.1 other objects."*

We have to take those numbers with caution. We must take into account
that the objects generated by EMF are tightly coupled with EMF and that
we don't really have (or need) any control on the generation of the code
itself. So for this same reason, we think that the "93.2 objects that
can potentially be affected by a change" figure is greatly influenced by
our generated code. We can try to improve this number by doing some
refactoring and eliminating some dependencies between elements. We
refactored a LOT our package hierarchy to produce the hierarchy we have
now. Unfortunately, we didn't run *Structural Analysis for Java* (SA4J)
on it before to compare the results. Instead we provide numbers
generated by SA4J with the generated EMF code and without it to have a
good comparison. The code that we have actually written is analyzed in
the second column of this table.

###### Statistics

<table>
<thead>
<tr class="header">
<th style="text-align: left;">Property</th>
<th style="text-align: center;">Value with generated code</th>
<th style="text-align: center;">Value without generated code</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td style="text-align: left;">Number of Objects</td>
<td style="text-align: center;">288</td>
<td style="text-align: center;">100</td>
</tr>
<tr class="even">
<td style="text-align: left;">Number of Packages</td>
<td style="text-align: center;">48</td>
<td style="text-align: center;">27</td>
</tr>
<tr class="odd">
<td style="text-align: left;">Number of Relationships</td>
<td style="text-align: center;">2297</td>
<td style="text-align: center;">403</td>
</tr>
<tr class="even">
<td style="text-align: left;">Maximum Dependencies</td>
<td style="text-align: center;">76</td>
<td style="text-align: center;">26</td>
</tr>
<tr class="odd">
<td style="text-align: left;">Minimum Dependencies</td>
<td style="text-align: center;">0</td>
<td style="text-align: center;">0</td>
</tr>
<tr class="even">
<td style="text-align: left;">Average Dependencies</td>
<td style="text-align: center;">7.98</td>
<td style="text-align: center;">4.03</td>
</tr>
<tr class="odd">
<td style="text-align: left;">Maximum Dependents</td>
<td style="text-align: center;">98</td>
<td style="text-align: center;">16</td>
</tr>
<tr class="even">
<td style="text-align: left;">Minimum Dependents</td>
<td style="text-align: center;">0</td>
<td style="text-align: center;">0</td>
</tr>
<tr class="odd">
<td style="text-align: left;">Average Dependents</td>
<td style="text-align: center;">7.98</td>
<td style="text-align: center;">4.03</td>
</tr>
<tr class="even">
<td style="text-align: left;">Relationship To Object Ratio</td>
<td style="text-align: center;">7.98</td>
<td style="text-align: center;">4.03</td>
</tr>
<tr class="odd">
<td style="text-align: left;">Affects on Average</td>
<td style="text-align: center;">93.2</td>
<td style="text-align: center;">12.1</td>
</tr>
</tbody>
</table>

###### Structural Patterns

Here is a table of the main anti-patterns that can be found in our
system. The numbers look bad for the generated code part, but as we
said, we are confident that EMF can account for a lot of those numbers.
As you can see, if we delete the generated code from the analysis, we
obtain much more acceptable numbers. The descriptions of each pattern
were taken from the [IBM SA4J
FAQ](http://www.alphaworks.ibm.com/tech/sa4j/faq).

<table>
<tbody>
<tr class="odd">
<td></td>
<td><strong>Value with generated code</strong></td>
<td></td>
<td><strong>Value without generated code</strong></td>
<td></td>
</tr>
<tr class="even">
<td><strong>Pattern</strong></td>
<td><strong>Count</strong></td>
<td><strong>% of total objects</strong></td>
<td><strong>Count</strong></td>
<td><strong>% of total objects</strong></td>
</tr>
<tr class="odd">
<td><strong>Tangle</strong> &lt;br&gt; [[img/tangle.png]] &lt;br&gt; <em>Tangles are a bunch of intermingled circular dependencies. If any object in a tangle is changed, all of the other objects in that tangle are affected. The bigger the tangle is, the more significant its negative impact will be on the rest of the system. Tangles are first candidates for refactoring. By looking at the weakest links within them, you can break them down into smaller, acyclic parts.</em></td>
<td>9</td>
<td>n/a</td>
<td>5</td>
<td>n/a</td>
</tr>
<tr class="even">
<td><strong>Global Hub</strong> &lt;br&gt; [[img/globalhub.png]] &lt;br&gt; <em>Global hubs are hybrids of global breakables and global butterflies. As breakables they are often affected when anything is changed, and as butterflies they affect a significant percentage of the system. Global hubs can be very harmful for your system. They indicate that a system is not conceptualized well and that it is highly unstable.</em></td>
<td>87</td>
<td>30%</td>
<td>7</td>
<td>7%</td>
</tr>
<tr class="odd">
<td><strong>Global Breakable</strong> &lt;br&gt; [[ img/globalbreakable.png]] &lt;br&gt; <em>Global breakables are the objects with large number of global dependencies. Global breakables often break when anything in the system is changed. Typically, these would be implementations of the highest-level concepts in your system. Having many global breakables in your system is rather undesirable, because it implies high instability.</em></td>
<td>136</td>
<td>47%</td>
<td>17</td>
<td>17%</td>
</tr>
<tr class="even">
<td><strong>Global Butterfly</strong> &lt;br&gt; [[img/globalButterfly.png]] &lt;br&gt; <em>Global butterflies are the objects with a large number of global dependents. Generally they are basic interfaces, abstract base classes, and utilities. Global butterflies are very important, even though they are not necessarily problematic. If you change a global butterfly, the overall global impact will be significant.</em></td>
<td>151</td>
<td>52%</td>
<td>34</td>
<td>34%</td>
</tr>
<tr class="odd">
<td><strong>Local Hub</strong> &lt;br&gt; [[img/localHub.png]] &lt;br&gt; <em>Local hubs are the objects with many immediate dependencies and dependents. In a sense, hubs are both butterflies and breakables. Local hubs are typically undesirable because they act as amplifiers of the change throughout the system. Refactoring a local hub into several classes will distribute the dependencies and improve the stability of the system overall.</em></td>
<td>15</td>
<td>5%</td>
<td>2</td>
<td>2%</td>
</tr>
<tr class="even">
<td><strong>Local Breakable</strong> &lt;br&gt; [[img/localBreakable.png]] &lt;br&gt; <em>Local breakables are the objects with many immediate dependencies. Local breakables are typically undesirable because they "know too much." Refactoring a local breakable into several classes will distribute the dependencies and improve the stability of the system overall.</em></td>
<td>57</td>
<td>19%</td>
<td>7</td>
<td>7%</td>
</tr>
<tr class="odd">
<td><strong>Local Butterfly</strong> &lt;br&gt; [[img/localButterfly.png]] &lt;br&gt; <em>Local butterflies are the objects with many immediate dependents. Typically they would be basic interfaces, abstract base classes, and utilities. Local butterflies are very important, even though they are not necessarily problematic. If you change a local butterfly, the immediate local impact will be significant.</em></td>
<td>50</td>
<td>17%</td>
<td>5</td>
<td>5%</td>
</tr>
</tbody>
</table>

We want to reduce even more the number here since one of our main goals
is to have a maintainable system. The more stable our code is, the
better. We'll make some effort in the future to reduce those numbers to
a minimum and show that our system is robust and that changes carry the
appropriate scope.

## Design

*The design of the main packages you are going to code needs to be
described using diagrams (preferably UML). For business components, this
would typically be a set of class diagrams. For your user interface you
might have a diagram showing the different forms or pages and the
dependencies between them. For your database you should have a detailed
database model, or at least a well-documented database schema. You do
not need to document and diagram every single class in your system. Show
what is important for understanding the design of the system. Only show
important relationships, methods and attributes. Leave the details to
your source code..*

*You also need to diagram how your design will satisfy system
requirements. This is typically done using interaction diagrams of the
participating classes for the most significant scenarios and mechanisms
that relate to your use cases and non-functional requirements. The
intent here is NOT to diagram every last step or method call in your
system. The intent is to show your architecture supports the requirement
by showing how the different components and layers of your system
distribute and coordinate the desired behavior. Only critical classes or
method calls should be mentioned.*

*Algorithm(s) or key mechanisms (like error handling, or persistence)
that are critical to your system should be described as well within the
context of the overall architecture and design of the system.*

### Javadoc

We put a lot of effort into documenting our system with javadoc syntax
directly in our code. This makes the generation of useful developer
documentation easier and can be accessed on the web:
[Javadoc](http://jkealey.shade.ca:82/jucmnav-docs/). Some comments are
better left to the code itself so we'll talk only about the important
architectures present in our system.

### Use Case Maps metamodel

**Main package diagram**      

[[img/main_model_package.png]]

Here is a package diagram representing the relations between our model
packages. The package we'll be using the most in our application is UCM
since our editor targets this kind of file. Since the work done on
jUCMNav is only the tip of the iceberg of a larger tool, and since
jUCMNav will one day be an editor for the whole URN notation, we need
all the classes located in the URN metamodel.

**UCM package diagram**      

[[img/UCM_package.png]]

If we go one level deeper in the hierarchy, we obtain the UCM package. A
UCM is represented by Maps and can contain scenarios and performance
information. We will concentrate on the Map package since the scope of
our project is focused on this package. The Map package will be used a
lot in our application since all the information that an UCM contains is
in this package.

**UCM.Map class diagram**      

[[img/UCM_Map_package.png]]

A subset of the Map package is presented in the diagram shown above.
This class diagram shows the essence of our model and what we'll
represent on screen for the user. Nearly all of the classes here will
have a visual representation and will let the user interact with it. As
we know, the model only represents the data that the user will interact
with. This class diagram is extremely important to understand because
its hierarchy drives all of the architectural decisions we make in our
project.

This model is at its fifth version since the beginning of the project
and will probably change again during the course of the project. Petal
files are included in our TWiki here (URNMetaModel) for a better
understanding of the evolution of the model. Some classes in this
diagram are more important than others for the general understanding of
the diagram. Among the most important, there's UCMSpec which represents
the root of a use case map. A UCM file can have more than one diagram
per file. A Map represents a diagram within the file. The diagram
consists of a PathGraph and a set of component references. Another
interesting class is the PathNode class. This represents all the UCM
elements that can be inserted on a path. For instance, the start points,
end points, responsibilities, etc. NodeConnection is the class used to
connect two PathNodes together. See the PathNode hiearchy in the
following diagram.

**UCM.Map: PathNode hierarchy class diagram**     

[[img/UCM_Map_package2.png]]

This diagram is pretty self-explanatory. This shows the possible
PathNodes in our diagram. OCL constraints could have been written in
those diagrams to define more clearly how these classes can be used. For
example, there should always be an empty point before and after another
path node. EMF doesn't support OCL constraints, so it would have been
useless to enforce the constraints there. Instead we opted for another
strategy. Right now in our prototypes, we use an ad-hoc solution,
appropriate for feasability testing purposes.

### jUCMNav Design

#### MVC Architecture

[[img/MVC.png]]

The package diagram shows all relations between the packages of our
project. We wanted to show that the diagram could be separated in
Model-View-Controller layers. Since our architecture is built around
this pattern, we thought it a good idea to organize the package diagram
this way.

#### Use Case Map

Here we included some typical scenarios in our application that we
thought could be interesting for the reader. These are pretty simple UCM
diagrams, but since we wanted to use this opportunity to test our
application, we were limited by the number of features our software
supported. Just to make sure the reader understands a UCM diagram, we'll
list here the elements that compose a UCM diagram.

  - UCM diagrams are composed of components. Components are elements of
    our system we want to represent in our diagram. This could represent
    a class, a user, a package etc. This is usually represented by a
    rectangle:    
      - [[img/comp.png]]    
  - The UCM starts with an interaction path. This path starts with a
    StartPoint:     
      - [[img/startPoint.png]]
  - Then the path can be extended with some empty points. EmptyPoints
    are there only to give shape to the path. They can be used to show a
    condition on a fork too.
      - [[ img/emptyPoint.png]]
  - Extremely important are the responsibilities along the path. These
    represent things that a component is responsible for. These are
    either written by our development team or a framework
    responsibility. This is represented with a little x along the path.
      - [[img/resp.png]]
  - Sometimes we want to represent that our system offers a choice. We
    represent this with an or-Fork. Right now our system only supports
    or-Forks, but other kinds of forks will be supported in the future.
    As you can see, the first two emptypoints of the paths after a fork
    must have condition labels to show why we should follow this path
    instead of the other.
      - [[img/orFork.png]]
  - Then the path finishes with an EndPoint to signal that this is the
    end of an interaction path:    
      - [[img/endPoint.png]]

##### Typical scenario: moving something in GEF. 

[[img/MoveNodeUCM.png]]

This scenario represents the user selecting a node and moving it in the
diagram. We follow this action along a path that passes through the
model-view-controller components. These are virtual components, but we
wanted to show the interaction of them all.

Something that could be interesting about this diagram is which
responsibilities are handled by us and which are relegated to the
framework.

  - In the selection tool component, the GenerateMoveRequest
    responsibility is done by the framework right now. Eventually we
    want to do our own SelectionTool that will be able to generate
    requests depending on what we selected. This way we can have one
    tool that can do all the tasks we need to edit our paths.
  - In the Editpart component, DispatchRequest is done by the framework.
    What is done here is that the editpart tries to find an editpolicy
    that can process the request.
  - In the EditPolicy component, we programmed the GenerateCommand
    responsibility. Here we construct the command that will execute when
    we receive a request of a certain type. In our system, we have
    several kinds of editpolicies that know how to generate a command
    for each kind of request from the user.
  - FillCommandParameters only fill the generated command with the
    parameter of the request and dispatch the command to the edit domain
    where it will be executed. We omitted this detail in the diagram
    since it would have been too big.
  - In the Command component, we programmed the *execute*
    responsibility. Then the model is updated in the MetaModel
    component. The MetaModel was generated with the EMF tool, so we
    didn't implement those responsibilities in the MetaModel.
  - In our editpart, we have to tell our view how to update itself. This
    is implemented by the programmers.
  - Finally, the figures lay themselves out and then are drawn on the
    screen to the correct positions to reflect the change to the user.
    This is done by the framework.

##### Typical scenario: Load a file and extract the model. 

[[img/loadFileUCM.png]]

This scenario represents the loading of a UCM file. It explains the
process that eclipse uses to find an editor for the file type the user
tries to open. In this case it's a UCM file. First of all, after the
user selects the file, eclipse looks in the JUCMNavPlugin component to
see if there's a compatible editor in this plugin for this file type. If
so, we proceed to launch the editor and then set the input of the editor
to the data from the file. The component UrnModelManager loads the file
and then calls an EMF class to interpret the XMI (serialized data) of
the UCM file. If the file is valid, we can continue to the next phase.
Here the editor takes its main editpartviewer and makes it generate all
the edit parts for the model. Depending on whether the model elements
have an editpart or not, the GraphicalEditPartFactory will generate
appropriate editparts for the model elements. If it's a connection then
the BSplineConnectionRouter will route the connection to make it follow
a spline. After all the model elements have been processed, then the
loading is finished and the user can edit the diagram.

## Alpha System

*Screen shots to illustrate the current progress of your system should
be included in your status report for the iteration.*

<http://jucmnav.softwareengineering.ca/twiki/pub/ProjetSEG/MilestoneFourStatusReport/demo_page1.png>

  - Screenshot 1: Notice components, colors, multiple files in one UCM

<http://jucmnav.softwareengineering.ca/twiki/pub/ProjetSEG/MilestoneFourStatusReport/demo_page2.png>

  - Screenshot 2: Notice components are bound, or-forks, and-forks, path
    node labels, component labels

## Project Plan

Now that the architecture and design has been completely specified, you
should have a complete project plan that captures all the tasks left to
do on your project (and who will do them). Ideally, it would be broken
down so that no individual task is more than 1 week in duration.

**Project plan**      

[[img/shedule.png]]

## Quality Assurance Report

*Include a test report (of around 1 to 2 pages) that reflects the
current state of your “alpha” system. The report should provide a brief
description of the release that was tested. Clearly indicate what
release was tested (date and/or build number) and indicate what
requirements were supposed to be addressed in the release in terms of
use cases and non-functional requirements. Then summarize the tests that
were run to verify your system. For each test, you can indicate whether
or not it has been implemented yet (i.e. can you run the test), and
whether or not the system has passed the test. You should also summarize
the status of bugs. How many, what severity, and what is the rate of
change in finding and fixing bugs.*

See JUnitTestPlan and DevDocCommands for more in-depth information on
the tests.

<span class="twiki-macro INCLUDE">EvolvingStatusReport</span>


[[img/tab1.PNG]]
[[img/tab2.PNG]]
[[img/tab3.PNG]]
[[img/tab4.PNG]]
[[img/tab5.PNG]]
[[img/tab6.PNG]]
[[img/tab7.PNG]]
[[img/tab8.PNG]]
[[img/tab9.PNG]]
[[img/tab10.PNG]]
