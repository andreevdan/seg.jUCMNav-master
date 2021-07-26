# Static Semantics Checking and Metrics Computation Tool for jUCMNav

jUCMNav already reports some issues found during the traversal of UCM
scenarios, the propagation of strategies in GRL graphs, and the export
of URN models to other representations such as CSM. However, although
the tool prevents users from creating syntactically invalid models,
there are still many rules related to the static semantics of the URN
language that are not enforced, especially when considering the various
modeling styles required by export filters to other notations (Message
Sequence Charts, Core Scenario Model, etc.) or by advanced concepts (Key
Performance Indicators, Aspect-oriented URN, etc.).

This tool enhances jUCMNav by enabling users to create/delete, group,
load/save, enable/disable, and verify customized rules. Rules are
managed via the jUCMNav Preferences, rules are checked against the
current URN model via the *jUCMNav --\> Verify Static Semantics* menu
item, and violations are reported in Eclipse's Problems view.
Additionally, this tool was extended to support the definition and
computation of metrics on URN models, using a similar mechanism. This is
triggered via the *jUCMNav --\> Calculate Metrics* menu item

User rules and metrics are described using OMG's Object Constraint
Language (OCL). The tool depends on the presence of the MDT OCL plug-in,
which provides OCL parsing and verification facilities.

This tool provides a flexible way for users to manage their own rules
and tailor them to particular applications as the URN language and its
applications evolve. Rules applicable in one context (e.g., export to
CSM such that another specific tool can process the CSM files generated)
may not be applicable in other contexts, whereas other rules may span
multiple contexts. We expect the library of rules for jUCMNav to grow
and become quite valuable over the next few years.

## Resources

  - [library.ocl](%ATTACHURL%/library.ocl): OCL Library, for jUCMNav
    release 5.0.0 (130+ predefined functions to simplify the creation of
    rules and metrics)
  - [Predefined Semantics Rules Overview](PredefinedSemanticsRulesOverview): List of the predefined groups of
    semantic verification rules
  - [Predefined Metrics Overview](PredefinedMetricsOverview): List of the predefined groups of metrics
  - [Goal Process Consistency](GoalProcessConsistency): Additional rules for GRL/UCM consistency
    checks (under construction)

## Documentation

  - [Dev Doc Rules And Metrics](DevDocRulesAndMetrics): What do I need to do to add new default rules
    and/or metrics to the tool?
  - The main functionalities are described in the [Online
    Help](HelpOnLine#Part_VII_Static_Semantics_Checki)
  - [Byrne Yan](ByrneYan): Static Semantics Checking Tool for jUCMNav. Intensive
    Graduate Project Report, SITE, University of Ottawa, March 2008.
  - The source code of the *seg.jUCMNav.staticSemantic* package is also
    documented using JavaDoc

## Demos

The following sequence of Flash demonstrations illustrate how to perform
static verification and metrics calculation on URN models based on
user-defined rules/metrics.

### Version 4.1, November 2009

1 See [JUCMNav Release 410#Video Overviews](JUCMNavRelease410\#Video\_Overviews)

### Version 3.1, May 2008

1. [Creating a rule](StaticSemanticDemo1) 
1. [Creating a
group](StaticSemanticDemo2) 
1. [Enabling/disabling one
rule](StaticSemanticDemo3) 
1. [Enabling/disabling all rules in a
group](StaticSemanticDemo4) 
1. [Running a check](StaticSemanticDemo5) 
1. [Exporting a rule](StaticSemanticDemo6) 
1. [Importing arule](StaticSemanticDemo7)

## Resources

  - Object Management Group (2006). Object Constraint Language
    Specification, version 2.0, May 2006.
    <http://www.omg.org/cgi-bin/doc?formal/2006-05-01>
  - MDT OCL Wiki, MDT OCL, March 2008,
    <http://wiki.eclipse.org/index.php/MDT-OCL>
  - Eclipse.org, MDT OCL SDK 1.1.2, 28 Nov 2007, MDT OCL developer
    guide,
    <http://www.eclipse.org/modeling/mdt/downloads/index.php?project=ocl&showAll=0&showMax=5>

## Contributors

  - [Byrne Yan](ByrneYan) (2007-2008)
  - [Daniel Amyot](DanielAmyot) (2007-2012)
  - [Anisur Rahman](AnisurRahman) (2009)

\-- Main.DanielAmyot - 24 Mar 2008
