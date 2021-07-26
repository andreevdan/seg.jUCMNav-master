# Status Report

## Project: UCMNav Eclipse Plug-in

## Iteration: MilestoneFive

## Implementation Status

In this iteration, we continued to expand what could be done with the
tool, with a great push towards improving stability. We now have more
explicit rules for what is permitted when editing paths, eliminating
most crashing scenarios previously identified in cases where illegal
loops were created. We also now support an important client-driven
scenario: exporting use case maps as images. The user-friendliness and
visual presentation of our application is greatly improved compared to
the alpha release produced in the MilestoneFour timeline.

### Beta build demo

The current state of the system is shown in the following screenshots.
Note that it does not show off all features, but it will give the reader
a decent idea of what we have built. A beta release version is now
available on this wiki site, for (very) early adopters and testers.

[[img/snapshot2s.png]]

  - Screenshot 1: Various map features and rendering

[[img/snapshot3s.png]]

  - Screenshot 2: Plugin bindings

## Highlights

  - Legal information page (EPL license) and contributors
  - Deletion works in several scenarios (stubs, paths, forks, etc.)
  - Safety-checking to disallow illegal loops
  - Professional graphic designer contributed new graphical resources
  - Implementation of the Stub Binding dialog
  - Image exporting works
  - Extracting of all strings for i18n
  - Implemented more tests
  - Fork and Join transmogrification
  - Various fixes related to deploying on Linux
  - Better path tool
  - Metamodel updated to version 7
  - **LOTS** of bugfixes

In terms of the proposed milestone iterations, we are bit late in
quality assurance, but bugs are being logged and addressed in a timely
fashion. In concrete terms, many bugs reported by our client using
development builds were fixed within 24 hours. Our prototype has evolved
into a working system, albeit still showing some rough edges. Most
crashing and / or data corruption scenarios known in the MilestoneFour
timeline have been eliminated. Use of the jUCMNav tool by early-adopters
(our client) in real-world situations has confirmed that quality has
improved over the last month; at the same time, some new issues to fix
have been logged. Many little things (the spit and polish, if you will)
have been fixed for the initial beta trial, such as proper license and
credits, better rotation and display of some path nodes, tweaked icons,
etc.

## Risks or Issues List

The reader will find, in the following table, a list of risks possibly
impacting our project presently, as well as thoughtful followup on past
risks.

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
<td style="text-align: left;">Semester over</td>
<td style="text-align: left;">Closed</td>
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
<td style="text-align: left;">We have received it and integrated it.</td>
<td style="text-align: left;">Closed</td>
</tr>
<tr class="even">
<td style="text-align: left;">15 Feb 2005</td>
<td style="text-align: left;">Paths</td>
<td style="text-align: left;">We're not sure how paths will be implemented in our system. Must experiment.</td>
<td style="text-align: left;">Experimentation done, success!</td>
<td style="text-align: left;">Closed</td>
</tr>
<tr class="odd">
<td style="text-align: left;">15 Feb 2005</td>
<td style="text-align: left;">Stubs</td>
<td style="text-align: left;">Stubs are the second riskiest UCM element. They have deep implications in many views and the editor but haven't bene prototyped.</td>
<td style="text-align: left;">Most of the legwork here has been done</td>
<td style="text-align: left;">Ongoing</td>
</tr>
<tr class="even">
<td style="text-align: left;">15 Feb 2005</td>
<td style="text-align: left;">Divide and conquer</td>
<td style="text-align: left;">Requirements need to be divided into micro objectives that can be tracked in our task management system. Until then, we can't plan completion</td>
<td style="text-align: left;">See BugZilla</td>
<td style="text-align: left;">Closed</td>
</tr>
<tr class="odd">
<td style="text-align: left;">15 Feb 2005</td>
<td style="text-align: left;">Unit tests</td>
<td style="text-align: left;">We haven't formally written down our unit tests as they are too closely bound to our architecture.</td>
<td style="text-align: left;">See JUnitTestPlan</td>
<td style="text-align: left;">Closed</td>
</tr>
<tr class="even">
<td style="text-align: left;">15 Feb 2005</td>
<td style="text-align: left;">Get Coding</td>
<td style="text-align: left;">Not everyone is as familiar with the framework because not everyone was prototyping</td>
<td style="text-align: left;">With the end of the semester, developers have been contributing code much more frequently.</td>
<td style="text-align: left;">Closed</td>
</tr>
<tr class="odd">
<td style="text-align: left;">10 May 2005</td>
<td style="text-align: left;">Lack of time</td>
<td style="text-align: left;">We're progressing nicely but the Eclipse learning curve is steep. We should focus on getting the core features done and take care not to spread out efforts over too many features.</td>
<td style="text-align: left;">-</td>
<td style="text-align: left;">Closed</td>
</tr>
<tr class="even">
<td style="text-align: left;">10 May 2005</td>
<td style="text-align: left;">ReqSaveBackup</td>
<td style="text-align: left;">We're not sure how to hookup to the local history mechanism in Eclipse</td>
<td style="text-align: left;">Not easy with XMI; postponed until DTD</td>
<td style="text-align: left;">Closed</td>
</tr>
<tr class="odd">
<td style="text-align: left;">13 Jun 2005</td>
<td style="text-align: left;">Beta deployment</td>
<td style="text-align: left;">Deploying the beta to hereto untested systems might reveal deployment problems</td>
<td style="text-align: left;">We will see soon after 15 Jun</td>
<td style="text-align: left;">Ongoing</td>
</tr>
</tbody>
</table>

### New Tools (carried over from previous milestones)

  - BugZilla/CVS/Rational tools: Already familiar.
  - TWiki: Passed the critical level, very easy to use.
  - Ant/JUnit: Tested on prototypes, learnt in SEG4511.
  - DOORS: Abandoned in favor of TWiki.
  - UCMNav: We have three experts to help us. We are only replicating
    the tool's basic functionality.
  - Eclipse+GEF+EMF: Developing Java in Eclipse is a breeze. Developing
    plug-ins with GEF and EMF requires lots of reading and
    experimenting. The road from prototype to a beta evaluation release
    has allowed us to be confident in our development abilities with
    regard to leveraging the above-mentioned technologies.

## Tasks in Progress or Completed This Iteration:

List the tasks that each member of the project worked on last
iteration.  

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
<td style="text-align: left;">Project automation</td>
<td style="text-align: left;">javadoc/junit tests in automated build</td>
<td style="text-align: left;">Main.JeanPhilippeDaigle</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="even">
<td style="text-align: left;">Upgrade metamodel</td>
<td style="text-align: left;">To version 7</td>
<td style="text-align: left;">Main.EtienneTremblay</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="odd">
<td style="text-align: left;">Tests &amp; JUnitTestPlan</td>
<td style="text-align: left;">Implement tests</td>
<td style="text-align: left;">Main.JasonKealey, Main.JordanMcManus, Main.JeanPhilippeDaigle</td>
<td style="text-align: left;">80%</td>
</tr>
<tr class="even">
<td style="text-align: left;">ReqHelpAbout</td>
<td style="text-align: left;">About and legal information</td>
<td style="text-align: left;">Main.JeanPhilippeDaigle</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="odd">
<td style="text-align: left;">Fork / Join conversions</td>
<td style="text-align: left;">Transmogrification</td>
<td style="text-align: left;">Main.JeanPhilippeDaigle</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="even">
<td style="text-align: left;">Autolayout</td>
<td style="text-align: left;">Implemented autolayout functions</td>
<td style="text-align: left;">Main.JasonKealey</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="odd">
<td style="text-align: left;">Plugins and stub binding</td>
<td style="text-align: left;">Implementation and UI creation</td>
<td style="text-align: left;">Main.EtienneTremblay</td>
<td style="text-align: left;">90%</td>
</tr>
<tr class="even">
<td style="text-align: left;">Graph traversal / loop prevention algorithms</td>
<td style="text-align: left;">Design and implementation</td>
<td style="text-align: left;">Main.JeanPhilippeDaigle</td>
<td style="text-align: left;">70%</td>
</tr>
<tr class="odd">
<td style="text-align: left;">Deletion of paths and path elements</td>
<td style="text-align: left;">Implementing robust handling of this requirement</td>
<td style="text-align: left;">Main.JasonKealey</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="even">
<td style="text-align: left;">Conditions</td>
<td style="text-align: left;">Worked on conditions for ReqCharConditions</td>
<td style="text-align: left;">Main.JordanMcManus</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="odd">
<td style="text-align: left;">Visual improvements</td>
<td style="text-align: left;">Better rendering of graph elements and labels</td>
<td style="text-align: left;">Main.JordanMcManus</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="even">
<td style="text-align: left;">Documentation</td>
<td style="text-align: left;">Framework for the help added</td>
<td style="text-align: left;">Main.OlivierCliftNoel</td>
<td style="text-align: left;">10%</td>
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
<td style="text-align: left;">ReqElemWait, ReqElemTimer, ReqConnections</td>
<td style="text-align: left;">Code &amp; test</td>
<td style="text-align: left;">Main.JordanMcManus and Main.JeanPhilippeDaigle</td>
</tr>
<tr class="even">
<td style="text-align: left;">ReqHelpAbout, ReqBrowseHistory, ReqBrowseModel, ReqHelpOnLine, ReqDocumentation</td>
<td style="text-align: left;">Code &amp; test</td>
<td style="text-align: left;">Main.OlivierCliftNoel</td>
</tr>
<tr class="odd">
<td style="text-align: left;">Many bugfixes / improvements not covered by requirements</td>
<td style="text-align: left;">Code &amp; test</td>
<td style="text-align: left;">Main.JasonKealey</td>
</tr>
<tr class="even">
<td style="text-align: left;">Continue working on stubs</td>
<td style="text-align: left;">Code &amp; test</td>
<td style="text-align: left;">Main.EtienneTremblay</td>
</tr>
<tr class="odd">
<td style="text-align: left;">Update site</td>
<td style="text-align: left;">Investigate &amp; implement in build process</td>
<td style="text-align: left;">Main.JeanPhilippeDaigle</td>
</tr>
<tr class="even">
<td style="text-align: left;">User training videos</td>
<td style="text-align: left;">Production</td>
<td style="text-align: left;">Main.JeanPhilippeDaigle</td>
</tr>
<tr class="odd">
<td style="text-align: left;">Unit testing of model manipulation commands</td>
<td style="text-align: left;">Coding</td>
<td style="text-align: left;">All</td>
</tr>
</tbody>
</table>

\-- Main.JeanPhilippeDaigle - 15 Jun 2005
