# Predefined Semantic Rules Overview

This page is related to the [Semantic Verification and Metrics
Computation](SemanticVerification) sub-project of jUCMNav.

The following are predefined rules in jUCMNav, which you can recover
using the Restore Default in the Preferences page (make sure to Export
your custom rules first, as this will erase them).

<span class="twiki-macro TOC"></span>

## GRL Consistency Completeness

Consistency and completeness rules applicable to most models with GRL
diagrams.

| Name | Description | Context | Updated |
| ---| --- | --- | ---|
| GRLcontributionConsistency         | The qualitative and quantitative values of a GRL contribution/correlation must be consistent.    | grl::Contribution       | 4.1.0 |
| GRLstrategyEvaluationConsistency   | The qualitative and quantitative values of a GRL strategy evaluation must be consistent.         | grl::Evaluation         | 4.1.0 |
| GRLstrategyWithIncorrectXORinit    | GRL strategy initializes more than one child of an XOR decomposition.                            | grl::EvaluationStrategy | 4.2.0 |
| GRLdependencyEvaluationConsistency | The depender of a GRL dependency should not have an evaluation value higher than its dependee's. | grl::IntentionalElement | 4.2.0 |
| GRLindicatorThresholdConsistency   | Indicator threshold value must be between the target and worst values.                           | grl:Evaluation          | 4.1.0 |
| GRLindicatorIndicatorTooGood       | Evaluation value of indicator better than target value.                                          | grl:Evaluation          | 4.1.0 |
| GRLindicatorIndicatorTooBad        | Evaluation value of indicator worse than worst value.                                            | grl:Evaluation          | 4.1.0 |
| GRLactorNoCycle                    | GRL actor must not be part of a containment cycle                                                | grl::ActorRef           | 4.1.0 |
| GRLintentionalElementInManyActors  | GRL intentional element must not be bound to more than one actor                                 | grl::IntentionalElement | 4.1.0 |
| GRLactorWithNoImportantIE          | GRL actor contains no intentional element with a non-zero importance                             | grl::Actor              | 4.1.0 |

## UCM Consistency Completeness

Consistency and completeness rules applicable to most models with UCM
diagrams.

| Name | Description | Context | Updated |
| ---| --- | --- | ---|
| UCMcomponentNoCycle               | UCM component must not be part of a containment cycle                                      | ucm::map::ComponentRef  | 4.1.0 |
| UCMpluginNoOutBinding             | UCM plugin bindings of this stub must all have out-bindings                                | ucm::map::Stub          | 4.1.0 |
| UCMpluginNoInBinding              | UCM plugin bindings of this stub must all have in-bindings                                 | ucm::map::Stub          | 4.1.0 |
| UCMsyncStubIsDyn                  | UCM synchronizing stub must be dynamic                                                     | ucm::map::Stub          | 4.1.0 |
| UCMblockingStubIsSync             | UCM blocking stub must be synchronizing                                                    | ucm::map::Stub          | 4.1.0 |
| UCMstaticStubTooManyPlugins       | UCM static stub must not have more than one plug-in                                        | ucm::map::Stub          | 4.1.0 |
| UCMstaticStubPreconditions        | UCM static stub must have a true precondition for its plugin binding                       | ucm::map::Stub          | 4.1.0 |
| UCMstaticStubReplication          | UCM static stub must have replicationFactor=1 for its plugin binding                       | ucm::map::Stub          | 4.1.0 |
| UCMstubSingletonWithReplication   | UCM stub containing a singleton map must have replicationFactor=1 for its plugin binding   | ucm::map::Stub          | 4.1.0 |
| UCMcomponentBindingContextIsTeam  | UCM component target of a binding must be of kind Team                                     | ucm::map::ComponentRef  | 4.1.0 |
| UCMprocessWithObjectAncestor      | UCM process component should not have an object component ancestor                         | ucm::map::ComponentRef  | 4.1.0 |
| UCMresponsibilityInManyComponents | UCM responsibility should not be bound to more than one component                          | urncore::Responsibility | 4.1.0 |
| UCMsubCompInManyComponents        | UCM component should not be bound to more than one component                               | urncore::Component      | 4.1.0 |
| UCMconnectBindings                | UCM wait/timer/end/empty points in a connect must be bound to the same component reference | ucm::map::WaitingPlace  | 4.1.0 |
| UCMstubAtMostOneElse              | UCM stub must not have more than one plug-in with an "else" precondition                   | ucm::map::Stub          | 4.2.0 |
| UCMorForkAtMostOneElse            | UCM Or-Fork must not have more than one branch with an "else" condition                    | ucm::map::OrFork        | 4.2.0 |

## URN Features for Software Product Lines

Experimental rules for feature models capturing Software Product Lines.

| Name | Description | Context | Updated |
| ---| --- | --- | ---|
| ArequiresB     | Feature A requires Feature B       | grl:EvaluationStrategy | 4.1.0 |
| AconfictsWithB | Feature A conflicts with Feature B | grl:EvaluationStrategy | 4.1.0 |

## URN Layout and Overlaps

URN rules targeting diagram layouts.

| Name | Description | Context | Updated |
| ---| --- | --- | ---|
| GRLnoOverlappingActors           | GRL actor boundary must not overlap with the boundary of another actor          | grl::ActorRef              | 4.1.0 |
| GRLnoOverlappingIEonActor        | GRL intentional element must not overlap with the boundary of an actor          | grl::IntentionalElementRef | 4.1.0 |
| GRLnoOverlappingIEonIE           | GRL intentional element must not overlap with another intentional element       | grl::IntentionalElementRef | 4.1.0 |
| GRLintentionElemInsideButUnbound | GRL intentional element is visually contained by actor but is not bound to it   | grl::IntentionalElementRef | 4.1.0 |
| TooManyGRLelementsInGraph        | Too many \#GRL visual elements in graph...                                      | grl::GRLGraph              | 4.1.0 |
| UCMnoOverlappingComponents       | UCM component boundary must not overlap with the boundary of another component  | ucm::map::ComponentRef     | 4.1.0 |
| UCMcomponentInsideButUnbound     | UCM component is visually contained by another component but is not bound to it | ucm::map::ComponentRef     | 4.1.0 |
| UCMpathNodeInsideButUnbound      | UCM path node is visually contained by a component but is not bound to it       | ucm::map::PathNode         | 4.1.0 |
| TooManyUCMelementsInMap          | Too many \#UCM visual elements in map...                                        | ucm::map::UCMmap           | 4.1.0 |

## URN Value Ranges

Range checking rules applicable to most URN models

| Name | Description | Context | Updated |
| ---| --- | --- | ---|
| GRLcontributionNoUnknown          | There should not be unknown contributions in GRL models                             | grl::Contribution        | 4.1.0 |
| GRLcontributionRange              | GRL quantitative contribution must be between -100 and 100                          | grl::Contribution        | 4.1.0 |
| GRLimportanceRange                | GRL quantitative importance must be between 0 and 100                               | grl::IntentionalElement  | 4.1.0 |
| GRLevaluationRange                | GRL strategy evaluation must be between -102 and 100                                | grl::Evaluation          | 4.1.0 |
| UCMnodeConnectionProbabilityRange | UCM node connection must have a probability between 0 and 1.0                       | ucm::map::NodeConnection | 4.1.0 |
| UCMnodeConnectionDefProbability   | UCM node connections not following OrFork or Timer should have a probability of 1.0 | ucm::map::NodeConnection | 4.1.0 |
| UCMpluginMapDefProbability        | UCM plugin bindings of this stub must all have a probability between 0 and 1.0      | ucm::map::Stub           | 4.1.0 |

## URN Styles for Names and Descriptions

Rules targeting the completeness of descriptions significance of
identifiers, mainly for documentation and report generation (applicable
to most URN models)

| Name | Description | Context | Updated |
| ---| --- | --- | ---|
| GRLactorDescNotEmpty           | GRL actor definition should have a non-empty description               | grl::Actor              | 4.1.0 |
| GRLintentionalElemDescNotEmpty | GRL intentional element definition should have a non-empty description | grl::IntentionalElement | 4.1.0 |
| GRLgraphDescNotEmpty           | GRL diagram should have a non-empty description                        | grl::GRLGraph           | 4.1.0 |
| GRLgraphNameNotDefault         | GRL graph name should be changed from default                          | grl::GRLGraph           | 4.1.0 |
| UCMcomponentDescNotEmpty       | UCM component definition should have a non-empty description           | urncore::Component      | 4.1.0 |
| UCMresponsibilityDescNotEmpty  | UCM responsibility definition should have a non-empty description      | urncore::Responsibility | 4.1.0 |
| UCMmapDescNotEmpty             | UCM diagram should have a non-empty description                        | ucm::map::UCMmap        | 4.1.0 |
| UCMmapNameNotDefault           | UCM map name should be changed from default                            | ucm::map::UCMmap        | 4.1.0 |

## URN Unused Elements

Rules detecting unused definitions and model elements in URN models

| Name | Description | Context | Updated |
| ---| --- | --- | ---|
| GRLgraphEmpty                | GRL graph is empty                                       | grl::GRLGraph           | 4.1.0 |
| GRLactorEmpty                | GRL actor is empty                                       | grl::ActorRef           | 4.1.0 |
| GRLactorWithoutRef           | GRL actor definition without any reference               | grl::Actor              | 4.1.0 |
| GRLintentionalElemWithoutRef | GRL intentional element definition without any reference | grl::IntentionalElement | 4.1.0 |
| GRLintentionalLinkWithoutRef | GRL intentional link definition without any reference    | grl::ElementLink        | 4.1.0 |
| UCMmapEmpty                  | UCM map is empty                                         | ucm::map::UCMmap        | 4.1.0 |
| UCMcomponentEmpty            | UCM component is empty                                   | ucm::map::ComponentRef  | 4.1.0 |
| UCMcomponentWithoutRef       | UCM component definition without any reference           | urncore::Component      | 4.1.0 |
| UCMresponsibilityWithoutRef  | UCM responsibility definition without any reference      | urncore::Responsibility | 4.1.0 |
| UCMstubEmpty                 | UCM stub has no plug-in map                              | ucm::map::Stub          | 4.1.0 |
| UCMscenarioCoverage          | UCM path node not covered by the scenario(s) executed    | ucm::map::PathNode      | 4.2.0 |

## URN Legal Compliance Profile

Special rules that specifically target URN models where GRL diagrams are
meant to represent legal models used in compliance analysis.

| Name | Description | Context | Updated |
| ---| --- | --- | ---|
| StereotypeInLegalModelOnly        | Legal: The "Permission", "Obligation", "No", and "Consequence" stereotypes must be referenced in at least one "Legal" diagram | grl::IntentionalElement | 4.2.0 |
| LegalStereotypesNotForActors      | Legal: The "Permission", "Obligation", "No", and "Consequence" stereotypes are for intentional elements only                  | grl::Actor              | 4.2.0 |
| ObligationNotDecomposableByNo     | Legal: An "Obligation" intentional element must not be And-decomposed by a "No" element                                       | grl::Decomposition      | 4.2.0 |
| ObligationDecomposableByAndOnly   | Legal: An "Obligation" intentional element must be And-decomposed                                                             | grl::IntentionalElement | 4.4.0 |
| TracesLinksBetweenActors          | Legal: A "traces" URN link must be between two actors or two intentional elements                                             | grl::Actor              | 4.2.0 |
| TracesLinksBetweenIEs             | Legal: A "traces" URN link must be between two actors or two intentional elements                                             | grl::IntentionalElement | 4.2.0 |
| TracesLinksFromOrgToLegalActors   | Legal: "traces" URN links must go from the organization model to the legal model                                              | grl::Actor              | 4.2.0 |
| TracesLinksFromOrgToLegalIEs      | Legal: "traces" URN links must go from the organization model to the legal model                                              | grl::IntentionalElement | 4.2.0 |
| ConsequenceContribFromLegalToOrg  | Legal: Only GRL contributions from "Consequence" IEs can go from the legal model to the organization model                    | grl::Contribution       | 4.2.0 |
| ConsequenceContribPositive        | Legal: GRL contributions from "Consequence" IEs must be positive                                                              | grl::Contribution       | 4.2.0 |
| ConsequenceUnused                 | Legal: "Consequence" intentional element has no contribution to the organization model                                        | grl::IntentionalElement | 4.2.0 |
| LegalIEinitialized                | Legal: A strategy should not initialize intentional elements from a Legal model                                               | grl::EvaluationStrategy | 4.2.0 |
| ConsequenceWithMinus100Contrib    | Legal: "Consequence" IEs must have a -100 contribution from DefaultNonComp                                                    | grl::IntentionalElement | 4.2.0 |
| ConsequenceDependOnDefaultMaxEval | Legal: "Consequence" IEs must have a dependency to DefaultMaxEval                                                             | grl::IntentionalElement | 4.2.0 |
| DefaultNonCompSetTo100            | Legal: DefaultNonComp must be a resource evaluated to 100 in the Legal model                                                  | grl::IntentionalElement | 4.2.0 |
| DefaultMaxEvalSetToZero           | Legal: DefaultMaxEval must be a resource evaluated to 0 in the Legal model                                                    | grl::IntentionalElement | 4.2.0 |
| NonComplianceOnTracesIEs          | Legal: The source of the "traces" URN link does not comply with its destination                                               | grl::IntentionalElement | 4.2.0 |
| NonComplianceOnTracesActors       | Legal: The source of the "traces" URN link does not comply with its destination                                               | grl::Actor              | 4.2.0 |
| ObligationFullySatisfied          | Legal: Non-compliance: an "Obligation" must be evaluated to 100                                                               | grl::IntentionalElement | 4.2.0 |
| PermissionFullySatisfied          | Legal: Non-compliance: a "Permission" with non-"No" children must be evaluated to 100                                         | grl::IntentionalElement | 4.2.0 |

## URN iStar Profile

Special rules that specifically target URN models where GRL diagrams are
meant to represent i-star models (see [this
paper](http://jucmnav.softwareengineering.ca/ucm/bin/view/UCM/VirLibRIGiM09)
for more information)

| Name | Description | Context | Updated |
| ---| --- | --- | ---|
| SoftgoalAsContributionDestination     | The destination of a Contribution must be a Softgoal                                             | grl::Contribution  | 4.1.0 |
| DecompositionLinkForbidenDestinations | Decomposition links must not have softgoals, resources or beliefs as a destination.              | grl::Decomposition | 4.1.0 |
| DecompositionLinkForbidenSources      | Decomposition links must not have beliefs as a source. Note: Beliefs are not yet IEs in jUCMNav. | grl::Decomposition | 4.1.0 |
| ISAbetweenSimilarActors               | ISA (generalization) must be between two actors of the same type                                 | grl::Actor         | 4.1.0 |
| CoversFromPositionToRole              | A Covers association must be from a Position to a Role                                           | grl::Actor         | 4.1.0 |
| PlaysFromAgentToRole                  | A Plays association must be from an Agent to a Role.                                             | grl::Actor         | 4.1.0 |
| OccupiesFromagentToPosition           | An Occupies association must be from an Agent to a Position                                      | grl::Actor         | 4.1.0 |
| INSbetweenAgents                      | An INS association must only be used between Agents                                              | grl::Actor         | 4.1.0 |
| NoDependencyInsideActor               | Dependency links must never completely be inside of an actor boundary                            | grl::LinkRef       | 4.1.0 |
| DependencyInSDwithoutDependum         | Dependency links in an SD model must always have a dependum                                      | grl::GRLGraph      | 4.1.0 |
| SDmodelsRestrictedLinks               | SD models must not have links other than dependency and actor association links                  | grl::GRLGraph      | 4.1.0 |
| NoBeliefAsLinkDestination             | Beliefs should not be the destination of element links                                           | grl::Belief        | 4.1.0 |
| TasksAsDestOfAndLinks                 | AND decomposition links should only have tasks as destinations                                   | grl::Decomposition | 4.1.0 |
| MeansEndMustHaveGoalDest              | OR/IOR decomposition (means-end) links should only have goals as destinations                    | grl::Decomposition | 4.1.0 |
| IsPartOfBetweenSimilarActors          | Is Part Of association should be between two actors of the same type                             | grl::Actor         | 4.1.0 |
| AllGRLdiagramsSRorSD                  | All GRL diagrams should be tagged as SD or SR diagrams.                                          | grl::GRLGraph      | 4.1.0 |
| SRdependencyAlwaysHasDependums        | Dependency links in an SR model should always have a dependum                                    | grl::Dependency    | 4.1.0 |
| OnlyDependenciesCrossing              | The only links that cross actor boundaries should be dependency links                            | grl::LinkRef       | 4.1.0 |

## Z.151 Export

Rules that detect deprecated jUCMNav elements, elements that will not be
exported, and elements that will be transformed during the export.

| Name | Description | Context | Updated |
| ---| --- | --- | ---|
| IncludedStrategiesNotExported    | Z.151 Export: Strategies included in others will not be exported                                                    | grl::EvaluationStrategy              | 5.0.0 |
| EvaluationRangeNotExported       | Z.151 Export: Strategy evaluation ranges will not be exported                                                       | grl::EvaluationStrategy              | 5.0.0 |
| IndicatorsNotExported            | Z.151 Export: Indicator associations, attributes, and groups will not be exported                                   | grl::kpimodel::Indicator             | 4.2.0 |
| DimensionsNotExported            | Z.151 Export: Dimensions and their KPI model links will not be exported                                             | grl::kpimodel::KPIInformationElement | 5.0.0 |
| ContributionOverridesNotExported | Z.151 Export: Contribution overrides (context groups, contexts and changes) will not be exported                    | grl::ContributionContextGroup        | 5.0.0 |
| KPINewEvalValueNotExported       | Z.151 Export: Indicator new/overriding values in evaluation strategies will not be exported                         | grl::Evaluation                      | 5.0.0 |
| RespBindingNotExported           | Z.151 Export: Responsibility bindings in stub will not be exported                                                  | ucm::map::Stub                       | 4.2.0 |
| SubActorsAsMetadata              | Z.151 Export: Associations to children actor references will be converted to metadata                               | grl::ActorRef                        | 4.2.0 |
| AspectStubsAsStubs               | Z.151 Export: Aspect-related stub will be converted to stub with metadata                                           | ucm::map::Stub                       | 4.2.0 |
| AnythingAsEmptyPoint             | Z.151 Export: Anything path node will be converted to empty point with metadata                                     | ucm::map::Anything                   | 4.2.0 |
| FailurePointAsEmptyPoint         | Z.151 Export: Failure point will be converted to empty point with metadata                                          | ucm::map::FailurePoint               | 4.2.0 |
| FailureSPasSP                    | Z.151 Export: Failure start point will be converted to start point with metadata                                    | ucm::map::StartPoint                 | 4.2.0 |
| OtherCompAsTeam                  | Z.151 Export: Component of kind Other will be converted to Team with metadata                                       | urncore::Component                   | 4.2.0 |
| DeprecatedOrientation            | Deprecated: The "orientation" attribute should no longer be used in forks/joins                                     | ucm::map::PathNode                   | 4.2.0 |
| DeprecatedTransaction            | Deprecated: The "transaction" attribute should no longer be used in plug-in bindings                                | ucm::map::Stub                       | 4.2.0 |
| DeprecatedPointcut               | Deprecated: The "pointcut" attribute should no longer be used in stubs. Use "aopointcut" instead.                   | ucm::map::Stub                       | 4.2.0 |
| DeprecatedPriority               | Deprecated: The "priority" attribute should no longer be used in intentional elements. Use "importance" instead.    | grl::IntentionalElementRef           | 4.2.0 |
| DeprecatedCriticality            | Deprecated: The "criticality" attribute should no longer be used in intentional elements. Use "importance" instead. | grl::IntentionalElementRef           | 4.2.0 |

## Measured Compliance

Constraints applicable to compliance models in GRL that use the
Conditional Algorithm for compliance assessment.

| Name | Description | Context | Updated |
| ---| --- | --- | ---|
| GRLincomingContributionsNotMoreThan100 | Contributions to an intentional element must not sum up to a value higher than 100            | grl::IntentionalElement | 4.4.0 |
| GRLconditionDependeeOfIE               | A GRL resource with a ST\_CONDITIONTYPE medatada must be a dependee of an intentional element | grl::IntentionalElement | 4.4.0 |
| GRLgoalsWithHyperlinks                 | Goals should have a hyperlink                                                                 | grl::IntentionalElement | 4.4.0 |
| GRLactorNoCLASSTYPE                    | ST\_CLASSTYPE stereotypes cannot be used on Actors                                            | grl::Actor              | 4.4.0 |
| GRLconditionNotADepender               | A GRL resource with a ST\_CONDITIONTYPE medatada cannot depend on anything else               | grl::IntentionalElement | 4.4.0 |

\-- Main.DanielAmyot - 15 Nov 2009
