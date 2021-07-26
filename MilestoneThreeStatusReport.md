# Status Report

## Project: UCMNav Eclipse Plug-in

## Iteration: MilestoneThree

## Implementation Status

*In a sentence or two briefly describe what can currently be run to
demonstrate the system. In other words, what is now available for
feedback from the customer and testing within the development team?
Attach or include a few sample screen shows to illustrate the progress.*

In this iteration, we created a new prototype that allows us to mitigate
the risks associated with the paths, one of the most complex elements in
our application. We succeed in creating the desired behaviour and
appearance using what was available in the GEF framework. Furthermore,
we migrated this prototype away from our prototype model to the model
supplied by our customer.

[[img/prototype1.PNG]]

**Screenshot**

## Highlights

*List any items of note. Breakthroughs, accomplishments, major
decisions, or changes in the project plan. Are you on schedule, ahead of
schedule or behind schedule?*

  - Model received from client.
  - Quality Assurance process defined.
  - Paths are now rendered as splines.
  - Model is integrated in our prototype.
  - UCM Element behaviour analyzed
  - We know how we are going to test our requirements and we know when
    they will be considered complete.
  - Change Request process put in place.

In terms of the proposed milestone iterations, we are late in quality
assurance. However, we have realized that following this exact model
isn't fit for us as we are integration tons of varied small features
inside a huge framework. Our tests need to be defined at the same time
as our architecture. As far as our prototypes go, we're way ahead of
schedule. We know exactly what we have to do for 80% of our requirements
because we have done so much prototyping.

## Risks or Issues List

*In the following table, list any risk or issue that needs to be managed
that is critical to the success of the project. This could be anything
from we need to get good test data from our customer, to how do we
ensure the system is usable, to performance is unacceptable. This should
be a complete historical list that is kept from the beginning of the
project until the end. Status should be one of New, Ongoing, Closed. The
resolution column should be filled in if the issue or risk is closed.
Normally, I would expect a project to have about 1-5 issues or risks
they are managing that are New or Ongoing at any given time. If you have
more than that then either you have a project in serious trouble or your
criteria for what is 'critical to success' is to loose.*

| **Date Entered** | **Risk or Issue** | **Description** | **Resolution** | **Status** | 
| --- | --- | --- | --- | --- |
| 05 Jan 2005 | Eclipse is an evolving platform | Eclipse/GEF is rapidly evolving and the current version (3.1) has not yet been released as stable. | We have decided to settle on version 3.0.1 of all Eclipse tools that we will be using. | Closed |
| 05 Jan 2005 | New Tools | We are using various tools that we don't necessarily have experience with: Ant, BugZilla, CVS, DOORS, Eclipse+GEF+EMF, JUnit, Rational XDE, TWiki, UCMNav | See below | Closed|
| 05 Jan 2005 | Varying schedules | Must find way so that all team members can contribute equally, regardless of schedule differences. | - | Ongoing | 
| 05 Jan 2005 | Difficult deployment | We may have to support different versions of Eclipse, testing different operating systems, distributing the plug-in with and without Eclipse | We have decided on supporting only Eclipse/GEF version 3.0.1 and EMF v2.0.1, testing only on Windows XP SP2 and distributing the plug-in without Eclipse. | Closed | | 23 Jan 2005 | New version of the DTD | We await the new version of the DTD that we will have to support (read/write). UCM Version 0.23 is already on the website | Supporting the DTD is no longer in the scope of our project | Closed |
| 23 Jan 2005 | Requirements | We have defined the requirements definition process in which Main.DanielAmyot will have an important role but they have yet to be drafted | Requirements have been drafted. | Closed |
| 15 Feb 2005 | Meta-model | We await our meta-model draft for the notation's elements to be used by our tool | We have received it and integrated it. | Closed|
| 15 Feb 2005 | Paths | We're not sure how paths will be implemented in our system. Must experiment. | Experimentation done, success! | Closed | 
| 15 Feb 2005 | Element behaviour | We're not sure how we will determine our element's behaviour. We're not sure to what point our meta-model will define this. We want to avoid having to specify this for all elements. | We have analyzed and categorized our elements behaviour| Closed | 
| 15 Feb 2005 | Stubs | Stubs are the second riskiest UCM element. They have deep implications in many views and the editor but haven't bene prototyped. | - | Ongoing | 
| 15 Feb 2005 | Divide and conquer | Requirements need to be divided into micro objectives that can be tracked in our task management system. Until then, we can't plan completion | - | Ongoing | 
| 15 Feb 2005 | Unit tests | We haven't formally written down our unit tests as they are too closely bound toour architecture. | - | Ongoing | 
| 15 Feb 2005 | Get Coding | Not everyone is as familiar with the framework because not everyone was prototyping | - | Ongoing |

### New Tools \* BugZilla/CVS/Rational tools: Already familiar.

  - TWiki: Passed the critical level, very easy to use.
  - Ant/JUnit: Tested on prototypes, learnt in SEG4511.
  - DOORS: Abandoned in favor of TWiki.
  - UCMNav: We have three experts to help us. We are only replicating
    the tool's basic functionality.
  - Eclipse+GEF+EMF: Developing Java in Eclipse is a breeze. Developing
    plug-ins with GEF and EMF requires lots of reading and
    experimenting. Our hello world prototype has allowed us to feel
    comfortable with GEF and EMF.

## Tasks in Progress or Completed This Iteration:

List the tasks that each member of the project worked on last iteration.

| **Task Name** | **Description** | **Who Worked on it** | **complete**| 
| --- | --- | --- | --- | 
| Build prototype views | Define and prototype all the views in the system. Major UI work here. | Main.OlivierCliftNoel, Main.JeanPhilippeDaigle | 100% | | Define QA process | Define QA process| Main.OlivierCliftNoel, Main.JasonKealey | 100% | 
| Test plan | Write the test plan for our different requirements | Main.OlivierCliftNoel | 100% | 
| Views | Implement first version of all views | Main.JeanPhilippeDaigle | 50% | 
| UI Implementation | Define all hooks that must be made for relevant notifications | Main.JeanPhilippeDaigle | 50% | 
| Define editpart hierarchy | So that we can bind paths to components, etc. | Main.JordanMcManus | 25% | 
| Investigate coding | Attempt to code as many features as possible to understand what needs to be done and what can be done very quickly in our prototype. | Main.JordanMcManus | 70% | 
| Redefine architecture | Following lessons learned, redesign the system so that our architecture is sufficiently robust to continue development | Main.EtienneTremblay | 50% | 
| Refine requirements | According to feedback, go to a more granular level for requirements so that our team knows exactly what needs to be implemented. | Main.JasonKealey | 80% | 
| Research Use Case Maps | Need to define a way to express how elements can behave together but first, we need to know what these behaviours are. | Main.JasonKealey | 80% | 
| Integrate new model | Replace our old temporary model with the draft supplied by Daniel | Main.EtienneTremblay | 100% | 
| Change Request process | Form + process put online on TWiki. | Main.JasonKealey | 100%| 
| Prepare presentation | for MilestoneThree | Main.OlivierCliftNoel, Main.JeanPhilippeDaigle, Main.JasonKealey | 100% |

## Tasks to be worked on next Iteration:

List the tasks that each member of the project is planning on working on
this iteration.

| **Task Name** | **Description** | **Who Will Work on it** | 
| --- | --- | --- |
|Decompose requirements | into micro-objectives in BugZilla | Main.JasonKealey | 
| Architecture | define global architecture | Main.EtienneTremblay | 
| Formal tests | Write down formal tests for all requirements | Main.OlivierCliftNoel | 
| Use Cases | Develop formal use cases to be tested | Main.JeanPhilippeDaigle | 
| Write EditCommands/EditPolicies/EditParts | Start coding various portions of the implementation that are to be used in automated tests | All |
