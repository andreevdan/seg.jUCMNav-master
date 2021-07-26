# jUCMNav v7.0.0

-----

<img align="right" src="img/LogoFinal.gif">

## Important Note

This version requires Eclipse 4.x. For a version of jUCMNav that
supports Eclipse 3.x, please use [JUCMNavRelease540](JUCMNavRelease540)

## Enhancements Highlights\!

  - <span class="twiki-macro N"></span> New jUCMNav metamodel with
    improved support of feature modeling, concern-oriented requirements
    engineering, and activity theory
  - <span class="twiki-macro N"></span> Better support for the creation
    of feature models
  - <span class="twiki-macro N"></span> Aggregate contributions in goal
    models
  - <span class="twiki-macro N"></span> Initial support for CoURN
    (Concern-Oriented User Requirements Notation)
  - <span class="twiki-macro N"></span> Reusable elements in
    feature/goal models of CoURN models
  - <span class="twiki-macro N"></span> Evaluation of goal and feature
    models with reused elements in a CoURN model
  - <span class="twiki-macro N"></span> Partial support for feature
    models in HTML/PDF/RTF reports

### Better support for the creation of feature models

  - not allow a contribution value of mandatory/optional link to be set
  - not allow toggling between contribution and correlation for
    mandatory/optional links
  - support toggling between optional and mandatory links
  - only allow features and not goal model elements to be selected as a
    new definition in the property view of a feature
  - provide an option in jUCMNav General Preferences whether to show
    contributions on mandatory and optional links

### Aggregate contributions in goal models

  - added the concept of aggregate contribution to goal models,
    applicable for the following strategies: quantitative, qualitative,
    mixed, and feature model
  - added options to the context menu of a node in the goal model to
    enable aggregate contributions for the node, to disable aggregate
    contributions, or to show both aggregate and individual contribution
    (the node must fulfill the criteria for aggregate contributions:
    element must be decomposed and should be contributing to another
    element; aggregate contributions are shown after running the
    evaluation)

### Initial support for CoURN (Concern-Oriented User Requirements Notation)

  - allow a URN model to be designated as concern-oriented in the new
    file wizard (using metadata)
  - automatically create a concern for such a URN model and do not allow
    to modify the concern or add another concerns (i.e., a CoURN model
    is restricted to one concern)
  - the name of the file determines the name of the concern as well as
    the root feature (automatically kept consistent)
  - any diagram in such a URN model is automatically assigned to the
    concern
  - show the name of the concern instead of URNspec in the hierarchical
    outline as well as "Reused Concerns" instead of "Concerns"
  - do not show the "Concerns" outline
  - new default Concern-oriented URN perspective for such a URN model
  - automatic creation and identification of root feature
  - prevent deletion of root feature
  - prevent outgoing links for root feature
  - visualization of feature model configuration issues in the problem
    view when the feature model evaluation algorithm is selected

### Reusable elements in feature/goal models of CoURN models

  - new Custom Common Navigator view as an alternative for the old
    navigator view
  - navigate through the goal model, feature model, and scenario model
    definitions and select of one of the model elements
  - drag the selected model element from one file (i.e., with the help
    of the Custom Common Navigator) to another file (i.e., the editor
    background), thus adding the reused element from the source model to
    the target model
  - create a link reuse in a target model (either goal or feature model)
    to connect the reused element with an element in the target model
    (the reuse link always has a reused element as its source)

### Evaluation of goal and feature models with reused elements in a CoURN model

  - support evaluation of feature/goal models with reused elements (not
    yet recursively evaluated)
  - properly set the contribution value of a reuse link to 100
  - auto-select a reused elements
  - not allow more than one reuse link to be created per feature/goal
    reference
  - not allow a reused feature to be selected
  - not allow a satisfaction value to be set for a reused goal model
    element
  - not allow a contribution value of a reuse link in a feature model to
    be set
  - not allow toggling between contribution and correlation for reuse
    links
  - properly show the definition in the properties view of a reused
    element
  - restrict changing the definition of a reused element through the
    properties view

### Updated URN Metamodel

  - Now at version 0.29. See
    <http://jucmnav.softwareengineering.ca/ucm/bin/view/ProjetSEG/URNMetaModel>

## Thanks\!

[Contributors](https://www.openhub.net/p/jucmnav/contributors?sort=latest_commit)
to this release included Jiaying Yang, Aprajita, Aldo Navea Pina, Gunter
Mussbacher, Nishanth Thimmegowda, Amal Anda, Patrice Boulet, and Daniel
Amyot.

## Release Notes

### Help

  - End-user documentation is integrated with the Eclipse help system.
    `Access Help > Help Contents` from the Eclipse workbench, then
    select topic `jUCMNav Online Help`.
  - The latest user documentation can also be accessed via HelpOnLine
  - **NOTE**: The user documentation has not yet been updated since
    2014. This will be done as part of a future minor release.

### Reporting Bugs / Usability Requests

  - Send your bug reports to jucmnav-dev@softwareengineering.ca.
  - Include reproduction steps, sample .jucm files and, if applicable,
    copy-paste the error log messages.
  - If you're zealous enough, we'll create a
    [BugZilla](http://jucmnav.softwareengineering.ca/bugzilla/) account
    for you :)

### Enhancements / Fixes since 6.0.0

<table>
<thead>
<tr class="header">
<th style="text-align: left;">Bug</th>
<th style="text-align: left;">Description</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td style="text-align: left;">793</td>
<td style="text-align: left;">Increased maximum number of columns for export to CVS from 12 to 10000</td>
</tr>
<tr class="even">
<td style="text-align: left;">932</td>
<td style="text-align: left;">ASD must be optional in jUCMNav's metamodel</td>
</tr>
<tr class="odd">
<td style="text-align: left;">936</td>
<td style="text-align: left;">Null pointer exception in Feature Diagrams (advanced tab from Properties view now works with features)</td>
</tr>
<tr class="even">
<td style="text-align: left;">939</td>
<td style="text-align: left;">Partial support for feature models in HTML reports, including feature diagram with new icon and strategies</td>
</tr>
<tr class="odd">
<td style="text-align: left;">No bug</td>
<td style="text-align: left;">Type casting mistake in the handling of URN links</td>
</tr>
<tr class="even">
<td style="text-align: left;">No bug</td>
<td style="text-align: left;">Fixed an issue in the navigation of URN links for actor references</td>
</tr>
</tbody>
</table>

For enhancements and fixes since previous releases, please refer to the
release notes of the [Previous Releases](PreviousReleases).

### Known Issues in 7.0.0

  - <span class="twiki-macro N"></span> After a new installation, to use
    OCL semantic constraints and metrics, one needs to **Restore Default
    Settings** in both jUCMNav preference pages.
  - <span class="twiki-macro N"></span> in the .jucm files, references
    now use IDs rather than relative paths. New files won't be readable
    by jUCMNav 5.4.0 and older. Some older files that are saved may have
    a mix of IDs and path as references.
  - MSC Viewer and user documentation only available in English (GUI,
    models and reports are however multi-lingual)
  - When changing a few of the preferences, one must sometimes close &
    re-open a model for the change to have an impact on the editor.
  - The UCM traversal mechanism does not take into consideration
    advanced stubs, failures, aspect-oriented extensions, and some other
    attributes.
  - Aspect-oriented GRL is not yet supported.
  - GRL belief links not yet handled by the features for
    creating/expanding diagrams
  - [Open bugs on Buzilla
    server](http://jucmnav.softwareengineering.ca/bugzilla/buglist.cgi?query_format=specific&order=relevance+desc&bug_status=__open__&product=jUCMNav&content=)

### Downloading and Installation

Start your journey with the [Downloading and
Installation](DownloadingAndInstallation)
instructions.

\-- Main.DanielAmyot - 06 Sep 2016
