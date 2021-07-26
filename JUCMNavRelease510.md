# jUCMNav v5.1.0

<img align = "right" src= "img/LogoFinal.gif">

<span class="twiki-macro TOC"></span>

-----

## Enhancements Highlights\!

  - <span class="twiki-macro N"></span> Release 5.1.0 focuses on bug
    fixes, usability enhancements, user manual enhancements and other
    minor improvements from the major 5.0.0 release.
  - <span class="twiki-macro N"></span> Much better and flexible support
    for managing and navigating URN links
  - <span class="twiki-macro N"></span> Support for bilingual models
  - <span class="twiki-macro N"></span> GRL: legal compliance profile
  - <span class="twiki-macro N"></span> GRL: Strategy difference
    visualization
  - <span class="twiki-macro N"></span> GRL: \[0,100\] evaluation scale
    mode
  - <span class="twiki-macro N"></span> GRL: Support for strategies
    including other strategies
  - <span class="twiki-macro N"></span> GRL: Support for contribution
    overrides
  - <span class="twiki-macro N"></span> GRL: Support for sensitivity
    analysis
  - <span class="twiki-macro N"></span> GRL: Support for CSV
    Import/Export of Strategies
  - <span class="twiki-macro N"></span> Integration with EMF Compare for
    visualizing model differences.
  - Many improvements (contribution label editing, element resizing,
    searching, reporting, etc.) and bug fixes

Many of these improvements are discussed in a paper and a presentation
(RIGiM 2012, [available
here](http://jucmnav.softwareengineering.ca/ucm/bin/view/UCM/VirLibRIGiM2012).

## Video and Image Overviews

**IMPORTANT**: If you have not yet looked at the enhancements of
versions 4.x, please visit these video overviews of [version
4.0.0](JUCMNavRelease400#Video_Overviews), [version
4.1.0](JUCMNavRelease410#Video_Overviews), [version
4.2.0](JUCMNavRelease420#Video_and_Image_Overviews), [version
4.4.0](JUCMNavRelease440#Video_and_Image_Overviews), and the
[description of AoURN](AoURN) .

#### Evaluation Range from 0 to 100

The standard GRL satisfaction range (\[100..100\]) many be
counter-intuitive to many people, even more so when a goal with a
negative evaluation that has a negative contribution to another
intentional element leads to a positive evaluation value for that
element. jUCMNav now supports an an alternative \[0..100\] evaluation
scale (where 0 now means fully denied) and adapted the user interface
(e.g., pop-up menus with predefined values) and the propagation
algorithms accordingly. The color feedback in jUCMNav now also depends
on the scale being used (with the new scale, 0 is red as there is no
longer any negative satisfaction values, and 50 is yellow). The scale
can be set/changed by right-clicking the model in the Outline view. This
affects the *evaluation* scale, not the *contribution* scale (which
remains \[-100..100\]). Note that this should be done before creating
strategies (as initial values in strategies remain unaffected by this
change, i.e., one could have -100 on a \[0..100\] scale).


#### Strategy Inclusion

A parent strategy can now include another strategy, which means that the
initial evaluations of the latter will be included automatically (i.e.,
reused) in those of the former. These included evaluations can then be
overridden by parent evaluations (if they target the same intentional
element), or complemented by additional evaluations. Strategy inclusion
can be done recursively (across many levels). jUCMNav ensures that
inclusion cycles are avoided. This feature hence improves consistency
and reduces the number of updates required when new strategies or model
elements are added. This is very useful for defining strategies that are
minor variations of a base strategy. This is even more useful when
indicators are being used (as their target/threshold/worst values can be
set once and then inherited by other strategies, whose current indicator
values are different).



#### Contribution Overrides

A contribution override (a.k.a. *contribution change*) is a modification
to the weight (quantitative or qualitative) of a GRL contribution link.
Manu such overrides can be grouped in a *contribution context*.
Different such contexts can be defined for a model, to assess the impact
of variations of contribution weights for different evaluation
strategies. A contribution context is hence akin to a mini-aspect
modifying the links in a GRL model.


#### Strategy Difference

One can now compute the "diff" between between a base strategy and a
currently selected strategy on a per element basis (including actors).
The standard GRL scale for quantitative evaluations goes from 100
(fully denied, shown in red) to 0 (neutral, in yellow) to +100 (fully
satisfied). Consequently, the difference scale is \[200..200\].
Differences are displayed between angle brackets (to differentiate them
from normal satisfaction values), again with color feedback (\<200\> in
red, \<0\> in yellow, and \<+200\> in green), so the tradeoffs can be
understood at a glance. On a \[0..100\] evaluation scale, differences
will be in the \[-100..100\] range. jUCMNav allows one to select a base
strategy and then switch between many alternative strategies to
visualize (instantly) their differences. This feature is useful to
highlight differences within the graphical model itself in order to
provide more immediate feedback and support discussions between
stakeholders around the model, its strategies, and the supporting tool.


#### Model Difference

jUCMNav now uses the EMF Compare plugin to display the results of
comparing two versions of a URN model (or two URN models). This feature
also allows one to copy changes (or merge) from one version to the
other.


#### Sensitivity Analysis

jUCMNav now allows for ranges of values to be used for strategy
evaluations and for contribution changes instead of just single values.
The step of a range is the increment by which we iterate from the start
to the end. By associating a range to an initial evaluation (or to a
contribution), all other intentional elements impacted directly or
indirectly will also have a range, but this time for computed values.
Their resulting ranges are also displayed. In addition, all intermediate
values (for each iteration) are accessible as metadata, and hence
visible as a tooltip by hovering over the desired element. This simple
sensitivity analysis enables the modeler or analyst to assess the impact
of localized changes and to determine whether a change to an initial
satisfaction value really matters or not. Sensitivity analysis in
jUCMNav is currently limited to one dimension only, i.e., to a range for
one evaluation or for one contribution.


#### Bilingual Models

jUCMNav's user interface is already multilingual (and supports French
and English), but there was, until now, no way of attaching multiple
names and descriptions to model elements. We implemented a feature that
allows the modeler to switch between model languages and to provide
alternative names and descriptions for UCM and GRL model elements. When
switching languages, the name and description of each element are
swapped with alternative values attached to the element as metadata.
This feature is limited to two languages for the moment.

#### Link Management

URN links can now much more easily be created, deleted, and traversed
(as hyperlinks) in models. URN links can be typed too. Links can be
started/ended from/to element definitions and references (e.g., for UCM
components, UCM responsibilities, GRL actors, GRL intentional elements,
GRL links, and GRL indicators).


## Requirements and Installation

Please visit DownloadingAndInstallation and the animated
InstallationDemo. Note that this version requires Eclipse 3.7 and above
(and preferably Eclipse Modeling Tools 3.7.x)

## Thanks\!

[Contributors](http://www.ohloh.net/p/11712/contributors) to this
release included Jason Kealey, Andrew Miga, Etienne Tremblay, Daniel
Amyot, Azalia Shamsaei, Gunter Mussbacher, Hao Luo, Dominique Blouin and
Stéphane Leblanc.

## Release Notes

### Help

  - End-user documentation is integrated with the Eclipse help system.
    `Access Help > Help Contents` from the Eclipse workbench, then
    select topic `jUCMNav Online Help`.
  - The latest user documentation can also be accessed via HelpOnLine

### Reporting Bugs / Usability Requests

  - Send your bug reports to \<a
    href=[mailto:jucmnav-dev@softwareengineering.ca](mailto:jucmnav-dev@softwareengineering.ca)\><jucmnav-dev@softwareengineering.ca>\</a\>.
  - Include reproduction steps, sample .jucm files and, if applicable,
    copy-paste the error log messages.
  - If you're zealous enough, we'll create a
    [BugZilla](http://jucmnav.softwareengineering.ca/bugzilla/) account
    for you :)

### Enhancements / Fixes since 5.0.0

<table>
<thead>
<tr class="header">
<th style="text-align: left;">Bug</th>
<th style="text-align: left;">Description</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=811">811</a></td>
<td style="text-align: left;">Widget disposed error</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=831">831</a></td>
<td style="text-align: left;">GRL contribution labels cause issues with delete and undo</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=835">835</a></td>
<td style="text-align: left;">Trim element names</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=837">837</a></td>
<td style="text-align: left;">Additional zoom levels</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=839">839</a></td>
<td style="text-align: left;">New diagrams should be next to the current one</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=844">844</a></td>
<td style="text-align: left;">Do not auto-delete definitions when doing cut&amp;paste (prevent prompt dialog)</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=845">845</a></td>
<td style="text-align: left;">Metadata editor widget disposed error</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=846">846</a></td>
<td style="text-align: left;">Metadata indicator symbol no longer shows</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=849">849</a></td>
<td style="text-align: left;">Preserve sizes when copy-pasting GRL nodes</td>
</tr>
<tr class="even">
<td style="text-align: left;"><a href="http://jucmnav.softwareengineering.ca/bugzilla/show_bug.cgi?id=850">850</a></td>
<td style="text-align: left;">Do not auto-delete contributions when doing cut&amp;paste</td>
</tr>
</tbody>
</table>

For enhancements and fixes since previous releases, please refer to the
release notes of the PreviousReleases.

### Known Issues in 5.1.0

  - Reports generated, MSC Viewer, and user documentation only available
    in English.
  - When changing a few of the preferences, one must sometimes close &
    re-open a model for the change to have an impact on the editor.
  - The UCM traversal mechanism does not take into consideration
    advanced stubs, failures, aspect-oriented extensions, and some other
    attributes.
  - Aspect-oriented GRL is not yet supported.
  - Generated reports could be more complete

\-- Main.JasonKealey - 04 May 2012
