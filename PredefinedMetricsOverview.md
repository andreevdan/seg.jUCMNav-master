# Predefined Metrics Overview

This page is related to the [Semantic Verification and Metrics
Computation](SemanticVerification) sub-project of jUCMNav.

The following are predefined metrics in jUCMNav, which you can recover
using the Restore Default in the Preferences page (make sure to Export
your custom metrics definitions first, as this will erase them).

<span class="twiki-macro TOC"></span>

## GRL Size and Complexity

| Name | Description | Context | Updated |
| --- | --- | --- | --- |
| NbOfGRLgraphs           | \#GRL graphs                                        | <urn::URNspec> | 4.1.0 |
| NbOfActors              | \#GRL actors                                        | <urn::URNspec> | 4.1.0 |
| NbOfActorRefs           | \#GRL actor references                              | <urn::URNspec> | 4.1.0 |
| NbOfGoals               | \#GRL goals                                         | <urn::URNspec> | 4.1.0 |
| NbOfResources           | \#GRL resources                                     | <urn::URNspec> | 4.1.0 |
| NbOfSoftgoals           | \#GRL softgoals                                     | <urn::URNspec> | 4.1.0 |
| NbOfTasks               | \#GRL tasks                                         | <urn::URNspec> | 4.1.0 |
| NbOfIndicators          | \#GRL indicators                                    | <urn::URNspec> | 4.1.0 |
| NbOfIntentionalElements | \#GRL intentional elements (no indicators)          | <urn::URNspec> | 4.1.0 |
| NbOfIEreferences        | \#GRL intentional element references (no indicator) | <urn::URNspec> | 4.1.0 |
| NbOfIntentionalLinks    | \#GRL intentional links                             | <urn::URNspec> | 4.1.0 |
| NbOfIntentionalLinkRefs | \#GRL intentional link references                   | <urn::URNspec> | 4.1.0 |
| NbOfVisualGRLelements   | \#GRL visual elements                               | <urn::URNspec> | 4.1.0 |
| AvgVisualGRLelements    | Average \#GRL visual elements per graph             | <urn::URNspec> | 4.1.0 |
| MaxVisualGRLelements    | Maximum \#GRL visual elements per graph             | <urn::URNspec> | 4.1.0 |

## UCM Size and Complexity

| Name | Description | Context | Updated |
| --- | --- | --- | --- |
| NbOfComponents                  | \#UCM components                                                | <urn::URNspec> | 4.1.0   |
| NbOfResponsibilities            | \#UCM responsibilities                                          | <urn::URNspec> | 4.1.0   |
| NbOfComponentRefs               | \#UCM component references                                      | <urn::URNspec> | 4.1.0   |
| NbOfResponsibilityRefs          | \#UCM responsibility references                                 | <urn::URNspec> | 4.1.0   |
| NbOfStubs                       | \#UCM stubs                                                     | <urn::URNspec> | 4.1.0   |
| NbOfPathNodes                   | \#UCM path nodes                                                | <urn::URNspec> | 4.1.0   |
| NbOfMaps                        | \#UCM maps                                                      | <urn::URNspec> | 4.1.0   |
| AvgResponsibilitiesPerComponent | Average \#UCM responsibilities per component                    | <urn::URNspec> | 4.1.0   |
| AvgRespRefPerCompRef            | Average \#UCM responsibility references per component reference | <urn::URNspec> | 4.1.0   |
| MaxPathNodePerCompRef           | Maximum \#UCM path nodes per component reference                | <urn::URNspec> | 4.1.0   |
| NbOfVisualUCMelements           | \#UCM visual elements                                           | <urn::URNspec> | 4.1.0   |
| AvgVisualUCMelements            | Average \#UCM visual elements per map                           | <urn::URNspec> | 4.1.0   |
| MaxVisualUCMelements            | Maximum \#UCM visual elements per map                           | <urn::URNspec> | 4.1.0   |
| CoverageOfUCMelements           | Coverage % of UCM visual elements                               | <urn::URNspec> | 4.2.0   |

## Aspect Metrics

Experimental (and heavily under construction) metrics on Aspect-oriented
URN models

| Name | Description | Context | Updated |
| --- | --- | --- | --- |
| NbOfConcerns | \#Aspect concerns | <urn::URNspec> | 4.1.0 |

\-- Main.DanielAmyot - 16 Nov 2009
