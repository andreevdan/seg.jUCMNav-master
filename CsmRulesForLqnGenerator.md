# CSM Rules for Input to the CSM2LQN Generator

Originally proposed by Dorin B. Petriu, Ph.D. candidate, Carleton
University (March 30, 2007)

<span class="twiki-macro TOC"></span>

## Basic Rules

1. All Scenarios must begin with a Start path connection 
1. All top-level
Scenarios must begin with a Start path connection that includes a
Workload 
1. Conversely, all Scenarios that begin with a Start path
connection with a Workload are treated as top-level Scenarios

  - so a sub-scenario with a Workload will be traversed every time it is
    included in a complex Step as well as once as a stand-alone
    top-level Scenario, sub-scenarios that should not be traversed on
    their own should not have any Workload attached 
1. All CSM Scenarios
    must finish with an End path connection
1. All Steps (and
    Resource Acquire/Release) must be connected to predecessor and
    successor path connections *mutliple Steps without*
  - *DA: Not sure about the last part* 
1. Conversely, all path
    connections must be connected to source and target Steps (or
    Resource Acquire/Release). However: 
   1. Start path connections cannot
    have source Steps and must have 
   1. target Step 1. End path connections
    must have 1. source Step and cannot have target Steps 
   1. Sequence path
    connections must have 1 source Step and 1 target Step 
   1. Fork and
    Branch path connections must have 1 source Step and 2 or more target
    Steps 
   1. Join and Merge path connections must have 2 or more source
    Steps and 1 target Step\1 Mutliple Steps without path
    connections are not allowed 
1. Multiple path connections without
    Steps are not allowed
  - *DA: For the two above, you mean sequences of Steps without path
    connections and vice-versa? This is redundant with the previous
    info. Also, this is already enforced by the XSD schema* 
 1. All
    Resource Acquire/Release elements must be contained in the Scenario
1. Resource Acquire/Release elements must not be contained inside
    Steps, even though the schema allows for them to be so
    contained.
1. All resources that are not ProcessingResources
    must be acquired/released explicitly with Resource Acquire/Release
    elements 
1. Active Components must have a host relationship with a
    ProcessingResource 
1. The host ProcessingResource for a Component is
    *implicitly* acquired when the Component is acquired 1. The host
    ProcessingResource for a Component is *implicitly* released when the
    Component is released 
1. ProcessingResources must not be explicitly
    acquired/released 
1. Complex Steps with sub-Scenarios with multiple
    Start/End path connections must have Input and Output Bindings to
    indicate which Start/End path connections are connected to the main
    flow of the path

## Advanced Rules

1. All Steps should have a hostDemand attribute 
1. The target Steps of a
Branch path connection should have a probability 
1. That probability is
the probability for that particular branch 
1. It is preferable that Steps
have a component attribute that points to the Component in whose context
the Step executes

  - *DA: Otherwise?* 
1. The number of resourceUnits acquired over the
    traversal of a top-level Scenario must equal the number of
    resourceUnits released through the traversal of a top-level Scenario
  - *DA: Otherwise? This might be difficult to enforce at the UCM level.
    Is this detected by the tool and does this prevent the LQN from
    being generated?* 
1. It is not permissible at any point in the
    traversal of a Scenario to release more units of a resource than
    were previously acquired along that Scenario
  - *DA: ditto* 
1. The End path connection of a Scenario with a
    ClosedWorkload must occur in the same Component execution context as
    the Start path connection
  - *DA: Why?*

## Attributes and Default Values

1. There are no defaults for Workload attributes 
1. The Step hostDemand
attribute has a default value of 0 
1. The Step probability attribute has
a default value of 1. 
1. The Step repCount attribute has a default value
of 1.

  - *DA: Any defaults for RA/RR quantities, for component
    multiplicities...*

## Known Limitations of the CSM2LQN Generator

1. Does not properly handle sequences of successive Resource
Acquire/Release elements that do not have at least one execution Step in
between them 
1. Need to insert a "dummy" execution Step (with hostDemand
of 0) between any sequence of successive Resource Acquire/Release
elements 
1. Does not properly handle Fork-Join or Branch-Merge constructs
where the Fork/Branch and Join/Merge occur in the execution context of
different Components 
1. Does not handle at all Scenarios where Join/Merge
occurs before Fork/Branch

## Concepts Still To Be Resolved

1. How are resources used after a Fork? 
1. Assume that all parallel
branches of a Fork share the resources held at the Fork? 
1. How to interpret unmatched ResourceReleases along a parallel branch? 
1. Assume that the resource is released for all the parallel branches? 
1. At what point along the other parallel branches do they lose the use of the
resource? 
1. What is the meaning of resources passed at a Fork? 
1. Assume that the parallel branch which get passed a resource owns it
exclusively? 
1. What about all the other resources? 
1. Does the parallel branch own any of them? 
1. Does the parallel branch own only the resources it is passed? 
1. Does the parallel branch share all resources that have not been explicitly passed to it or any other parallel branch?

\-- Main.DanielAmyot - 30 Mar 2007
