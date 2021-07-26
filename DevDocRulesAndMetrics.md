# Default Semantic Rules and Metrics

<span class="twiki-macro TOC"></span>

## Overview

This page is related to the [Semantic Verification and Metrics
Computation](Semantic%20Verification) sub-project of jUCMNav.

The 3 seg.jucmnav sub-packages affected by updates to the default static
semantic rules and/or metrics are:

[[img/PackageStructure.png]]

## Updating or Adding a New Default Rule (or Metric) in a Group

1.  Edit the appropriate .xml file in the *staticSemantic* (or *metrics*) directory. Simply edit it in a text editor.
2. Test your modification using the "Restore Defaults" button in the
Preference page of your plug-in under test.
3. Update the [Predefined Semantics Rules Overview](PredefinedSemanticsRulesOverview) (or [Predefined Metrics Overview](PredefinedMetricsOverview))
documentation page.

## Adding a New Default Group 

1. Export the new rules (created with jUCMNav) to a .xml file in the *staticSemantic* (or *metrics*) directory.
2. Edit *StaticSemanticDefMgr.java* (or *MetricsDefinitionManager.java*)
3. In the method *getDefaultGroups()*, add a line stating where to get
the new group of rules/metrics:
  - 1. For rules:
*defaultGroups.add(createDefaultGroup("Your Group Name",
"GroupName.xml", all, MetricsDefinitionManager.class)); //$NON-NLS-1$
//$NON-NLS-2$* 
 - 2. For metrics:
*defaultGroups.add(createDefaultGroup("Your Group Name",
"GroupName.xml", all, StaticSemanticDefMgr.class)); //$NON-NLS-1$
//$NON-NLS-2$* 
4. Update the [Predefined Semantics Rules Overview](PredefinedSemanticsRulesOverview) (or
[Predefined Metrics Overview](PredefinedMetricsOverview)) documentation page.

## Updating the OCL library

  - Simply edit the file *library.ocl*. Update in the code base and also
    the file on the [Semantic Verification](SemanticVerification) page (since this also serves as
    user documentation).
  - Do not hesitate to add more functions to this library (and minimize
    the number of helper functions local to rules).
  - Make sure the definition is added to the right package and the right
    context. Packages/contexts can be declared many times in this file.
  - **Beware**: an OCL function in this library can invoke another one
    only if it was defined earlier in the file.

\-- Main.DanielAmyot - 16 Nov 2009
