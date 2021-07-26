# Status Report

## Project: UCMNav Eclipse Plug-in

## Iteration: MilestoneFour

## Implementation Status

In this iteration, we continued to expand what could be done with the
tool. We now support multiple maps per file, which up to here
constituted a major problem holding up implementation of
ReqElem\[\*\]Stub. Furthermore, we've implemented components, component
binding/undbinding with other components or path elements, path forks,
path node labels, component labels, etc. We have a nice alpha version of
the system; we can't do everything yet but we know where we are headed.

### Alpha build demo

The current state of the system is shown in the following recorded demo.
Note that it does not show off all features, but it will give the reader
a decent idea of what we have built. The demo is a live recording of the
plugin running in Eclipse 3.0. \<a
href="<http://jucmnav.softwareengineering.ca/twiki/pub/ProjetSEG/MilestoneFourStatusReport/peyton_jucmnav_alpha_demo.htm>"\>Click
here to view demo\</a\>.

[[img/demo_page1.png]]

  - Screenshot 1: Notice components, colors, multiple files in one UCM

[[img/demo_page2.png]]

  - Screenshot 2: Notice components are bound, or-forks, and-forks, path
    node labels, component labels

## Highlights

(Thank you CVS log & [StatCVS](http:/jkealey.shade.ca:82/statcvs/))

  - We now run javadoc on the plugin on each build.
  - We now run junit tests on the plugin
  - We now support multiple paths in one map
  - We now support components
  - We now support version 5 of the URN model
  - Implemented property view behaviour for booleans
  - We now support component colors, implemented property view behaviour
    for colors
  - We now show components on a seperate layer than the paths
  - The parent model element in the XMI serialization is now the URNspec
  - We now support path node labels
  - We created our test plan, JUnitTestPlan in this iteration, after
    planning our architecture.
  - We've started implementing tests
  - We implemented the undo/redo test framework for existing commands
  - Cleaned up our existing commands
  - We now support binding/unbinding components with other components
  - We now support binding/unbinding components with their containing
    path nodes.
  - We can now delete components
  - We can now delete empty points
  - We now support component labels
  - We now support multiple maps per file
  - Start of perspective
  - We now support (partially) or-forks and and-forks.

In terms of the proposed milestone iterations, we are late in quality
assurance. Our prototype has evolved nicely. Our main problem is that we
realized that it was impossible for us to define our architecture
milestone as required because we aren't experienced enough with Eclipse
and because of the such large number of classes in our project and in
the framework. It is simply impossible for us to define our exact public
interface right now, given our experience and time allocation. We're not
worried about this as most of our architecture is imposed on us and
we're successfully developing our tool by adding new features to it
daily. It might not be great from a software engineering point of view
(we should have had better planning) but we see why, in industry, most
applications end up being underdocumented/underplanned/undertested.

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
<td style="text-align: left;">[The core problem, multiple maps per file, has been solved ]</td>
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
<td style="text-align: left;">Ongoing</td>
</tr>
<tr class="even">
<td style="text-align: left;">10 May 2005</td>
<td style="text-align: left;">ReqSaveBackup</td>
<td style="text-align: left;">We're not sure how to hookup to the local history mechanism in Eclipse</td>
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
<td style="text-align: left;">Project automation</td>
<td style="text-align: left;">javadoc/junit tests in automated build</td>
<td style="text-align: left;">Main.JeanPhilippeDaigle</td>
<td style="text-align: left;">75%</td>
</tr>
<tr class="even">
<td style="text-align: left;">Multiple Paths</td>
<td style="text-align: left;">Multiple paths in one map</td>
<td style="text-align: left;">Main.EtienneTremblay</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="odd">
<td style="text-align: left;">ReqComp</td>
<td style="text-align: left;">Components</td>
<td style="text-align: left;">Main.JasonKealey</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="even">
<td style="text-align: left;">Upgrade metamodel</td>
<td style="text-align: left;">To version 5</td>
<td style="text-align: left;">Main.EtienneTremblay</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="odd">
<td style="text-align: left;">Property view work</td>
<td style="text-align: left;">boolean/color support</td>
<td style="text-align: left;">Main.JasonKealey</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="even">
<td style="text-align: left;">ReqCompColor</td>
<td style="text-align: left;">Optional color components</td>
<td style="text-align: left;">Main.JasonKealey</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="odd">
<td style="text-align: left;">Different layers</td>
<td style="text-align: left;">Seperate path nodes, paths, components on different layers</td>
<td style="text-align: left;">Main.EtienneTremblay</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="even">
<td style="text-align: left;">ReqSave, ReqOpen</td>
<td style="text-align: left;">The parent model element in the XMI serialization is now the URNspec</td>
<td style="text-align: left;">Main.JasonKealey</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="odd">
<td style="text-align: left;">ReqLabels</td>
<td style="text-align: left;">Path node labels and component labels</td>
<td style="text-align: left;">Main.JordanMcManus</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="even">
<td style="text-align: left;">Tests &amp; JUnitTestPlan</td>
<td style="text-align: left;">Define, code &amp; tools</td>
<td style="text-align: left;">Main.JasonKealey, Main.JordanMcManus, Main.JeanPhilippeDaigle</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="odd">
<td style="text-align: left;">ReqCompCompBind, ReqCompCompUnbind, ReqCompPathBind, ReqCompPathUnbind</td>
<td style="text-align: left;">Binding/unbinding</td>
<td style="text-align: left;">Main.JasonKealey</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="even">
<td style="text-align: left;">ReqElemDelete</td>
<td style="text-align: left;">Components and empty points</td>
<td style="text-align: left;">Main.JasonKealey</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="odd">
<td style="text-align: left;">ReqSave, ReqOpen</td>
<td style="text-align: left;">Multiple maps per file</td>
<td style="text-align: left;">Main.JasonKealey, Main.EtienneTremblay</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="even">
<td style="text-align: left;">Perspective</td>
<td style="text-align: left;">Start of jUCMNav perspective</td>
<td style="text-align: left;">Main.EtienneTremblay</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="odd">
<td style="text-align: left;">ReqElemOrFork</td>
<td style="text-align: left;">Implementation of the or-forks and connection routers</td>
<td style="text-align: left;">Main.JeanPhilippeDaigle</td>
<td style="text-align: left;">80%</td>
</tr>
<tr class="even">
<td style="text-align: left;">MilestoneFour</td>
<td style="text-align: left;">Milestone Four document redacting &amp; review</td>
<td style="text-align: left;">Main.EtienneTremblay, Main.JasonKealey, Main.JeanPhilippeDaigle</td>
<td style="text-align: left;">100%</td>
</tr>
<tr class="odd">
<td style="text-align: left;">Views</td>
<td style="text-align: left;">Views</td>
<td style="text-align: left;">Main.OlivierCliftNoel</td>
<td style="text-align: left;">?</td>
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
<td style="text-align: left;">ReqElemAndFork, ReqElemOrFork</td>
<td style="text-align: left;">Clean up code, remove bugs, test</td>
<td style="text-align: left;">Main.JeanPhilippeDaigle</td>
</tr>
<tr class="even">
<td style="text-align: left;">ReqElemAndJoin, ReqElemOrJoin</td>
<td style="text-align: left;">Code &amp; test</td>
<td style="text-align: left;">Main.JeanPhilippeDaigle</td>
</tr>
<tr class="odd">
<td style="text-align: left;">ReqElemWait, ReqElemTimer, ReqConnections</td>
<td style="text-align: left;">Code &amp; test</td>
<td style="text-align: left;">Main.JeanPhilippeDaigle</td>
</tr>
<tr class="even">
<td style="text-align: left;">ReqElemDynamicStub, ReqElemStaticStub, ReqElemStubActions, ReqElemDelete</td>
<td style="text-align: left;">Code &amp; test</td>
<td style="text-align: left;">Main.EtienneTremblay</td>
</tr>
<tr class="odd">
<td style="text-align: left;">ReqSaveBackup, ReqElemEndPoint, ReqElemStartPoint, ReqElemStartPointAttributes, ReqElemDirectionArrow, ReqExportBitmap</td>
<td style="text-align: left;">Code &amp; test</td>
<td style="text-align: left;">Main.JordanMcManus</td>
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
</tbody>
</table>
