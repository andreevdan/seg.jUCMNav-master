## MAPPING DESIGNER INFORMATION FOR TDL EXPORT

Mappings are basic transformations of UCM Scenarios objects to their
equivalent TDL representation. Such mappings can only be made for
elements that are found in both UCM and TDL notations. Since the *id*
attribute of a *ModelElement* has no equivalent in TDL it is not kept
after the transformation.

### Basics of the transformation

To begin, the scenario traversal algorithm flattens the *URNspec* of a
UCM map a URN map where each scenario has no alternative. Then a
*ScenarioSpec* object is extracted with a Traversal Listener from the
traversal and sent to the transformation in TDL algorithm. A TDL
*Package* is then created to be the parent container for other TDL
objects.

### *ScenarioDef*

UCM Scenario's *ScenarioDef* objects are mapped to *TestDescription*
objects in TDL. Each scenario get's exported to a single file with the
*name* of the *ScenarioDef* as filename. A TDL "main" *Block* contains
all the *Behaviour* of one *TestDescription*.

### *Component*

UCM Scenario's *Component* objects are mapped to *ComponentInstance*
objects in TDL. The *name* attribute of a *Component* is also used to
determine to *ComponentType* of the generated *ComponentInstance*
following the convention below:\<br /\>\<br /\> - The *name* of a
*Component* must follow this format: *ComponentName* : *ComponentType*
\<br /\>\<br /\> Where *ComponentName* will be assigned to the *name* of
the generated *ComponentInstance* and *ComponentType* will be assigned
to it's corresponding *ComponentType* 's *name*. The transformation
supports the conversion of *Component* that don't specify their
*ComponentType* in their *name* . In this case, the default
*ComponentType* 's *name* that will be assigned to this generated
*ComponentInstance* will be the *ComponentName* + "Type". \<br /\>\<br
/\> Notes: \<br /\> - To be compatible with the *PlantUML* visualisation
tool (TBA), all special characters (e.g. @\#$%^&\*(), etc.) and white
spaces are removed from the *name* of the *Component* during the
transformation and replaced with void.

### *Event ( Event Type : Responsability)*

UCM Scenario's *Responsability* objects are mapped to *ActionReference*
objects of a certain *Action* in TDL. Notes: \<br /\> - To be compatible
with the *PlantUML* visualisation tool (TBA), every *ActionReference*
must have a *name* and a *body* who decribes it's name and decription,
respectively. Those two attributes are implemented in TDL as
*AnnotationType* named "STEP" and "PROCEDURE". Each *ActionReference*
must then be generated with one *Annotation* of each of these two
*AnnotationType* ( see example in [Mapping Examples For Tdl Export](MappingExamplesForTdlExport))

### \_Event ( Event Type : Timer*Set)*

UCM Scenario's \_Timer*Set* Events are mapped to *TimerStart* objects in
TDL. A *TimerStart* must have a *period* that defines the duration of
the timer from start to timeout. The *period* is transfered from
\_Timer*set* to *TimerStart* as a *Metadata* that must follow this
convention: \<br\>\<br\> Metadata name = "period" \<br\> Metadata value
= "timeValue timeUnit" (e.g. 45 second)\<br\>\<br\> Note: Accepted
"timeUnit" values are : tick, nanosecond, microsecond, millisecond,
second, minute and hour. A space character is mandatory between the
timeValue and the timeUnit as it acts as a separator in the algorithm.

### \_Event ( Event Type : Timer*Reset)*

UCM Scenario's \_Timer*Reset* Events are mapped to *TimerStop* objects
in TDL.

### *Event ( Event Type : Timeout)*

UCM Scenario's *Timeout* Events are mapped to *Timeout* objects in TDL.

### *Message*

UCM Scenario's *Message* objects are mapped to *Interaction* objects in
TDL. For two *ComponentInstance* to interact together ( e.g. send
*Interaction* to each other) there must be a unique *Connection* between
two, which is created implicitly during the transformation. Furthermore,
a *GateInstance* of a certain *GateType* is needed as attribute of each
*ComponentInstance* at both ends of a *Connection*. Currently a default
*GateType* is used for every *GateInstance* as the *Message* in UCM
Scenarios are very abstract.

### *Parallel*

UCM Scenario's *Parallel* objects are mapped to *ParallelBehaviour*
objects in TDL contained in the "main" *Block*. In the transformation
algorithm, the *Parallel* objects are seen as *Sequence* and so they
generate one children *Block* for each parallel *Sequence* .

\-- Main.PatriceBoulet - 27 May 2014
