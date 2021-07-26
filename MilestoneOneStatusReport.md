# Status Report

## Project: UCMNav Eclipse Plug-in

## Iteration: MilestoneOne

## Implementation Status

*In a sentence or two briefly describe what can currently be run to
demonstrate the system. In other words, what is now available for
feedback from the customer and testing within the development team?
Attach or include a few sample screen shows to illustrate the progress.*

We currently have an Eclipse editor that handles \*.ucm files. It
doesn't actually do anything with the data other than replace the
default XML editor with a graphical editor built with the Graphical
Editing Framework. It allows for moving and resizing a rectangle which
represents a component in the Use Case Maps notation.

The following sequence of screenshots shows a rectangle being resized.  
[[img/progress_01.png]]
  
[[img/progress_02.png ]]
  
[[img/progress_03.png  ]]
  

## Highlights

*List any items of note. Breakthroughs, accomplishments, major
decisions, or changes in the project plan. Are you on schedule, ahead of
schedule or behind schedule?*

  - We have decided to submit our reports in English. [Milestone One](MilestoneOne) is
    the exception, because of its tight resemblance with [Milestone Zero](MilestoneZero).
  - Our development environment is set up.
    1.  TWiki works and has gained tremendous acceptance in our team
          - We will not only use TWiki to share information but also to
            define our requirements and work on any reports we must
            submit.
          - We have installed various plugins such as a calendar, a
            drawing tool and easy linking to BugZilla
    2.  BugZilla works
    3.  CVS works
    4.  SSH accounts work
  - TWiki was so easy to use that it has been decided that it will
    replace DOORS as our requirements management tool.
  - We will be forced to respect the MVC structure imposed by GEF
    (Graphical Editing Framework) which handles the view and controller
    aspects of our system. We have also decided to use EMF (Eclipse
    Modeling Framework) to design the model part of the system. With a
    bit of experience, it should help us cope with the evolving model.
  - We are on schedule in general. We are ahead of schedule in the
    plug-in prototypes and a bit behind schedule on formally written
    requirements.

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
<td style="text-align: left;">Ongoing</td>
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
<td style="text-align: left;">-</td>
<td style="text-align: left;">Ongoing</td>
</tr>
<tr class="even">
<td style="text-align: left;">23 Jan 2005</td>
<td style="text-align: left;">Requirements</td>
<td style="text-align: left;">We have defined the requirements definition process in which Main.DanielAmyot will have an important role but they have yet to be drafted</td>
<td style="text-align: left;">-</td>
<td style="text-align: left;">Ongoing</td>
</tr>
</tbody>
</table>

### New Tools \* BugZilla/CVS/Rational tools: Already familiar.

  - TWiki: Passed the critical level, very easy to use.
  - Ant/JUnit: To be learned in SEG4511.
  - DOORS: Abandoned in favor of TWiki.
  - UCMNav: We have three experts to help us. We are only replicating
    the tool's basic functionality.
  - Eclipse+GEF+EMF: Developing Java in Eclipse is a breeze. Developing
    plug-ins with GEF and EMF requires lots of reading. Our team members
    have already started writing high-level reports on various
    experiences. A ten page tutorial has already been written for a GEF
    editor so that all team members can benefit from the trial-error of
    others. We still have much to learn about this framework.

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
<td style="text-align: left;">Setup Environment</td>
<td style="text-align: left;">Install TWiki (and plugins), BugZilla, CVS, CVS Stat, ViewCVS</td>
<td style="text-align: left;">Main.JasonKealey, Main.JeanPhilippeDaigle, Main.OlivierCliftNoel</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="even">
<td style="text-align: left;">Install Eclipse</td>
<td style="text-align: left;">Eclipse 3.0.1, GEF 3.0.1, EMF 2.0.1</td>
<td style="text-align: left;">All</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="odd">
<td style="text-align: left;">Research Eclipse Plug-ins</td>
<td style="text-align: left;">Read about the architecture of Eclipse</td>
<td style="text-align: left;">Main.EtienneTremblay, Main.JordanMcManus</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="even">
<td style="text-align: left;">GEF Editor</td>
<td style="text-align: left;">Create a graphical GEF editor that allows you to move and resize rectangles.</td>
<td style="text-align: left;">Main.EtienneTremblay</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="odd">
<td style="text-align: left;">10 Page tutorial on GEF</td>
<td style="text-align: left;">GEF is very new to us. Write a tutorial letting us know how to do it.</td>
<td style="text-align: left;">Main.EtienneTremblay</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="even">
<td style="text-align: left;">Investigate Ant + Eclipse</td>
<td style="text-align: left;">Write a 1-2 page report on the subject</td>
<td style="text-align: left;">Main.JeanPhilippeDaigle</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="odd">
<td style="text-align: left;">Dummy CVS project</td>
<td style="text-align: left;">Test the development environment with CVS</td>
<td style="text-align: left;">Main.JeanPhilippeDaigle</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="even">
<td style="text-align: left;">Research UI Guidelines</td>
<td style="text-align: left;">Find documents on Eclipse UI guidelines</td>
<td style="text-align: left;">Main.JeanPhilippeDaigle</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="odd">
<td style="text-align: left;">Investigate EMF</td>
<td style="text-align: left;">Find resources + create a dummy EMF model + write 1-2 page report</td>
<td style="text-align: left;">Main.JordanMcManus</td>
<td style="text-align: left;">50%</td>
</tr>
<tr class="even">
<td style="text-align: left;">Calendar</td>
<td style="text-align: left;">Write down all events in the following six months in our web based calendar (meetings, milestones, vacations)</td>
<td style="text-align: left;">Main.JordanMcManus</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="odd">
<td style="text-align: left;">Define views</td>
<td style="text-align: left;">Define the specifications for the views</td>
<td style="text-align: left;">Main.JasonKealey, Main.JeanPhilippeDaigle, Main.EtienneTremblay</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="even">
<td style="text-align: left;">Mockup UI</td>
<td style="text-align: left;">For MilestoneOne, mockup the UI</td>
<td style="text-align: left;">Main.OlivierCliftNoel</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="odd">
<td style="text-align: left;">MilestoneZero, MilestoneOne</td>
<td style="text-align: left;">Write up the reports</td>
<td style="text-align: left;">Main.JasonKealey, Main.JeanPhilippeDaigle</td>
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
<td style="text-align: left;">Investigate JUnit + Eclipse</td>
<td style="text-align: left;">Write a 1-2 page report on the subject</td>
<td style="text-align: left;">Main.OlivierCliftNoel</td>
</tr>
<tr class="even">
<td style="text-align: left;">Build prototype EMF+GEF</td>
<td style="text-align: left;">Build a simple prototype using EMF and GEF with components and links</td>
<td style="text-align: left;">Main.EtienneTremblay, Main.JordanMcManus</td>
</tr>
<tr class="odd">
<td style="text-align: left;">File Manipulation</td>
<td style="text-align: left;">Investigate XML based file manipulations using UCM's DTD and EMF</td>
<td style="text-align: left;">Main.JasonKealey</td>
</tr>
<tr class="even">
<td style="text-align: left;">Build prototype views</td>
<td style="text-align: left;">Define and prototype all the views in the system. Major UI work here.</td>
<td style="text-align: left;">Main.OlivierCliftNoel, Main.JeanPhilippeDaigle</td>
</tr>
<tr class="odd">
<td style="text-align: left;">Define QA process</td>
<td style="text-align: left;">Define QA process</td>
<td style="text-align: left;">Main.OlivierCliftNoel, Main.JasonKealey</td>
</tr>
</tbody>
</table>

\-- Main.JasonKealey - 24 Jan 2005
