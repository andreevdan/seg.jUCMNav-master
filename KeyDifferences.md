# Key Differences between Z.151 and jUCMNav

This is work in progress... Section numbers refer to the Z.151 (URN)
standard.

## Mismatches

  - 6: GRL Beliefs are IntentionalElements in Z.151, whereas they are
    not in jUCMNav (they are a type of GRLNode, and hence cannot be
    associated with a value in a strategy)
  - 6.1.5: Concern: Z.151 targets URNmodelElement, jUCMNav targets them
    now but also targets IURNDiagram
  - 7.4.6: DecompositionType is different. Z.151 has {AND, XOR, IOR},
    and jUCMNav has {And, Or, Xor}.
  - 7.5.2: EvaluationStrategy in Z.151 may be associated to many
    StrategiesGroup in Z.151, but to only one in jUCMNav.
  - 7.6.13 Comment: Z.151 has Comment (comment boxes) attached to UCMmap
    and GRLspec, jUCMNav has it attached to IURNdiagram (with a
    different role name)
  - 9: Handling of URN data model (syntax) by jUCMNav (I believe there
    are small differences, e.g. postconditions in Z.151, "else" in
    jUCMNav)
  - Many mismatches related to how indicators are supported
  - Many mismatches related to how contribution contexts are supported

## In Z.151 but not in jUCMNav

  - GRLnode has a size (width/heigth) in Z.151 but not in jUCMNav
    (stored as metadata)
  - NodeConnection is a URNmodelElement (whereas it is not in jUCMNav)
  - 7.6.1 ConcreteGRLspec: Z.151 supports visualization of XOR/IOR as
    means-end
  - 8.2.1: UCMmap singletons (in the metamodel but unused)
  - 8.4.2: ComponentType (in the metamodel but unused and no GUI)
  - 8.6.1: Workload decomposed in Z.151 but not in jUCMNav
  - 9: Syntax for previous values of variables in post-conditions

## In jUCMNav but not in Z.151

  - ScenarioStartPoint and ScenarioEndPoint
  - An EvaluationStrategy can include other ones
  - EvaluationRange in strategy evaluations
  - Everything related to aspects
  - Everything related to failure points
  - Everything related to Feature Models, CORE, Activity Theory diagrams
    (ASD)
  - Interfaces for nodes, diagrams, containers, connections, container
    references

## Deprecated features in jUCMNav

  - GRL IntentionalElement's *priority* and *criticality* attributes
  - UCM PluginBinding's *transaction* attribute
  - UCM Stub's *pointcut* attribute
  - UCM *orientation* attribute in AND/OR forks/joins

## Others...

  - Use of interfaces in jUCMNav's metamodel
  - Use of packages in jUCMNav's metamodel

\-- Main.DanielAmyot - 28 Mar 2012
