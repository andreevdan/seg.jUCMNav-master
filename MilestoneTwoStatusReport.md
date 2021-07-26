# Status Report

## Project: UCMNav Eclipse Plug-in

## Iteration: MilestoneTwo

## Implementation Status

*In a sentence or two briefly describe what can currently be run to
demonstrate the system. In other words, what is now available for
feedback from the customer and testing within the development team?
Attach or include a few sample screen shows to illustrate the progress.*

In addition to the resizable rectangle of MilestoneOne which represent
components in Use Case Maps, we have added the following elements which
all act as nodes (movable, not resizable): start point, end point, empty
point and responsibility. We have also started working on paths by
creating connections between our nodes. These are simply straight arrows
for the moment. Our use case map can be saved and loaded in XMI. We also
have Hello World versions of most of our views.

**Example data**:  
[[img/pizza.png]]
**Editor Toolbox**: 
[[img/palette.png]]

**Property Page**: 
[[img/properties.png]] 

**Model Used for the Hello World**:  
[[img/model.png]]

## Highlights

*List any items of note. Breakthroughs, accomplishments, major
decisions, or changes in the project plan. Are you on schedule, ahead of
schedule or behind schedule?*

  - We have started using EMF for the model aspect of our MVC
    architecture. It works really well and saved us lots of time.
  - We realized that the initial editor framework was hard to realize
    but once it is done, it becomes easy to add features to the project.
  - The loading and saving according to the DTD has been downgraded in
    priority. We will be loading and saving in XMI, which is trivial in
    EMF. We are still awaiting an initial version of the DTD.
  - Our Hello World throwaway prototype is ahead of schedule.
    Development has been easier than expected.
  - Our requirements definition is on schedule. We have restrained the
    scope of our project but have discussed future requirements.
  - Some of our views are still at the mockup level as implementing them
    in Eclipse is not a priority right now. The main views are used in
    our prototype but some others are of no use until we have obtained
    our meta-model.

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

<table>
<thead>
<tr class="header">
<th style="text-align: left;">Date Entered</th>
<th style="text-align: left;">Risk or Issue</th>
<th style="text-align: left;">Description</th>
<th style="text-align: left;">Resolution</th>
<th style="text-align: left;">Status</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td style="text-align: left;">05 Jan 2005</td>
<td style="text-align: left;">Eclipse is an evolving platform</td>
<td style="text-align: left;">Eclipse/GEF is rapidly evolving and the current version (3.1) has not yet been released as stable.</td>
<td style="text-align: left;">We have decided to settle on version 3.0.1 of all Eclipse tools that we will be using.</td>
<td style="text-align: left;">Closed</td>
</tr>
<tr class="even">
<td style="text-align: left;">05 Jan 2005</td>
<td style="text-align: left;">New Tools</td>
<td style="text-align: left;">We are using various tools that we don't necessarily have experience with: Ant, BugZilla, CVS, DOORS, Eclipse+GEF+EMF, JUnit, Rational XDE, TWiki, UCMNav</td>
<td style="text-align: left;">See below</td>
<td style="text-align: left;">Closed</td>
</tr>
<tr class="odd">
<td style="text-align: left;">05 Jan 2005</td>
<td style="text-align: left;">Varying schedules</td>
<td style="text-align: left;">Must find way so that all team members can contribute equally, regardless of schedule differences.</td>
<td style="text-align: left;">-</td>
<td style="text-align: left;">Ongoing</td>
</tr>
<tr class="even">
<td style="text-align: left;">05 Jan 2005</td>
<td style="text-align: left;">Difficult deployment</td>
<td style="text-align: left;">We may have to support different versions of Eclipse, testing different operating systems, distributing the plug-in with and without Eclipse</td>
<td style="text-align: left;">We have decided on supporting only Eclipse/GEF version 3.0.1 and EMF v2.0.1, testing only on Windows XP SP2 and distributing the plug-in without Eclipse.</td>
<td style="text-align: left;">Closed</td>
</tr>
<tr class="odd">
<td style="text-align: left;">23 Jan 2005</td>
<td style="text-align: left;">New version of the DTD</td>
<td style="text-align: left;">We await the new version of the DTD that we will have to support (read/write). UCM Version 0.23 is already on the website</td>
<td style="text-align: left;">Supporting the DTD is no longer in the scope of our project</td>
<td style="text-align: left;">Closed</td>
</tr>
<tr class="even">
<td style="text-align: left;">23 Jan 2005</td>
<td style="text-align: left;">Requirements</td>
<td style="text-align: left;">We have defined the requirements definition process in which Main.DanielAmyot will have an important role but they have yet to be drafted</td>
<td style="text-align: left;">Requirements have been drafted.</td>
<td style="text-align: left;">Closed</td>
</tr>
<tr class="odd">
<td style="text-align: left;">15 Feb 2005</td>
<td style="text-align: left;">Meta-model</td>
<td style="text-align: left;">We await our meta-model draft for the notation's elements to be used by our tool</td>
<td style="text-align: left;">-</td>
<td style="text-align: left;">Ongoing</td>
</tr>
<tr class="even">
<td style="text-align: left;">15 Feb 2005</td>
<td style="text-align: left;">Paths</td>
<td style="text-align: left;">We're not sure how paths will be implemented in our system. Must experiment.</td>
<td style="text-align: left;">-</td>
<td style="text-align: left;">Ongoing</td>
</tr>
</tbody>
</table>

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

<table>
<thead>
<tr class="header">
<th style="text-align: left;">Task Name</th>
<th style="text-align: left;">Description</th>
<th style="text-align: left;">Who Worked on it</th>
<th style="text-align: left;">%complete</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td style="text-align: left;">Investigate JUnit + Eclipse</td>
<td style="text-align: left;">Write a 1-2 page report on the subject</td>
<td style="text-align: left;">Main.OlivierCliftNoel</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="even">
<td style="text-align: left;">Build prototype EMF+GEF</td>
<td style="text-align: left;">Build a simple prototype using EMF and GEF with components and links</td>
<td style="text-align: left;">Main.EtienneTremblay, Main.JordanMcManus</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="odd">
<td style="text-align: left;">Build prototype views</td>
<td style="text-align: left;">Define and prototype all the views in the system. Major UI work here.</td>
<td style="text-align: left;">Main.OlivierCliftNoel, Main.JeanPhilippeDaigle</td>
<td style="text-align: left;">50%</td>
</tr>
<tr class="even">
<td style="text-align: left;">Define requirements</td>
<td style="text-align: left;">Work with Main.DanielAmyot to define the draft requirements</td>
<td style="text-align: left;">Main.JasonKealey</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="odd">
<td style="text-align: left;">MilestoneTwo</td>
<td style="text-align: left;">Use case model + functional features</td>
<td style="text-align: left;">Main.JeanPhilippeDaigle</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="even">
<td style="text-align: left;">MilestoneTwo</td>
<td style="text-align: left;">Background, non functional features, database schemas and file formats</td>
<td style="text-align: left;">Main.JasonKealey</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="odd">
<td style="text-align: left;">MilestoneTwo</td>
<td style="text-align: left;">Architecture for MilestoneTwo</td>
<td style="text-align: left;">Main.EtienneTremblay</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="even">
<td style="text-align: left;">MilestoneTwo</td>
<td style="text-align: left;">Algorithms</td>
<td style="text-align: left;">Main.JordanMcManus</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="odd">
<td style="text-align: left;">Ant</td>
<td style="text-align: left;">Develop ant build scripts for existing projects</td>
<td style="text-align: left;">Main.JeanPhilippeDaigle</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="even">
<td style="text-align: left;">Investigate Requirements</td>
<td style="text-align: left;">We researched many requirements to verify the ease of creation</td>
<td style="text-align: left;">All</td>
<td style="text-align: left;">100%</td>
</tr>
</tbody>
</table>

## Tasks to be worked on next Iteration:

List the tasks that each member of the project is planning on working on
this iteration.

<table>
<thead>
<tr class="header">
<th style="text-align: left;">Task Name</th>
<th style="text-align: left;">Description</th>
<th style="text-align: left;">Who Will Work on it</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td style="text-align: left;">Build prototype views</td>
<td style="text-align: left;">Define and prototype all the views in the system. Major UI work here.</td>
<td style="text-align: left;">Main.OlivierCliftNoel, Main.JeanPhilippeDaigle</td>
</tr>
<tr class="even">
<td style="text-align: left;">Define QA process</td>
<td style="text-align: left;">Define QA process</td>
<td style="text-align: left;">Main.OlivierCliftNoel, Main.JasonKealey</td>
</tr>
<tr class="odd">
<td style="text-align: left;">Test plan</td>
<td style="text-align: left;">Write the test plan for our different requirements</td>
<td style="text-align: left;">Main.OlivierCliftNoel</td>
</tr>
<tr class="even">
<td style="text-align: left;">Views</td>
<td style="text-align: left;">Implement first version of all views</td>
<td style="text-align: left;">Main.JeanPhilippeDaigle</td>
</tr>
<tr class="odd">
<td style="text-align: left;">UI Implementation</td>
<td style="text-align: left;">Define all hooks that must be made for relevant notifications</td>
<td style="text-align: left;">Main.JeanPhilippeDaigle</td>
</tr>
<tr class="even">
<td style="text-align: left;">Define editpart hierarchy</td>
<td style="text-align: left;">So that we can bind paths to components, etc.</td>
<td style="text-align: left;">Main.JordanMcManus</td>
</tr>
<tr class="odd">
<td style="text-align: left;">Investigate coding</td>
<td style="text-align: left;">Attempt to code as many features as possible to understand what needs to be done and what can be done very quickly in our prototype.</td>
<td style="text-align: left;">Main.JordanMcManus</td>
</tr>
<tr class="even">
<td style="text-align: left;">Redefine architecture</td>
<td style="text-align: left;">Following lessons learned, redesign the system so that our architecture is sufficiently robust to continue development</td>
<td style="text-align: left;">Main.EtienneTremblay</td>
</tr>
<tr class="odd">
<td style="text-align: left;">Refine requirements</td>
<td style="text-align: left;">According to feedback, go to a more granular level for requirements so that our team knows exactly what needs to be implemented.</td>
<td style="text-align: left;">Main.JasonKealey</td>
</tr>
<tr class="even">
<td style="text-align: left;">Research Use Case Maps</td>
<td style="text-align: left;">Need to define a way to express how elements can behave together but first, we need to know what these behaviours are.</td>
<td style="text-align: left;">Main.JasonKealey</td>
</tr>
</tbody>
</table>
