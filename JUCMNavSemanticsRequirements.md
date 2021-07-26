# jUCMNav Semantics Requirements

The following requirements are compiled from the WER 2007 paper on [Use
Case Maps Semantics](UCM.VirLibWer2007Semantics), the TAOSD 2007 journal
paper on [Aspect-Oriented Use Case Maps](UCM.VirLibTaosd07), and
discussions about component instances, plug-in instances, and abstract
components. The list still needs to be compared and coordinated with the
requirements for the [current traversal mechanism](UcmScenarios) and the
requirements for the [UCM2CSM conversion](CoreScenarioModel).

| Name | Description | Type | Importance | Priority | Status | Dependencies | Date |
| --- | --- | --- | --- | --- | --- | --- | --- |
| [SEMReq Abstract Components](SEMReqAbstractComponents)| jUCMNav shall support abstract components that are merged dynamically with components of the parent map. | Functional | Mandatory | Urgent | Proposed |  | 22 Mar 2007 - 10:45  |
| [SEMReq Ao UCMTraversal](SEMReqAoUCMTraversal)| jUCMNav shall support the traversal of AoUCM. | Functional | Mandatory | Urgent | Proposed |  | 22 Mar 2007 - 10:28  |
| [SEMReq Component Instances](SEMReqComponentInstances)| jUCMNav shall support the traversal of component instances. | Functional | Mandatory | Urgent | Proposed |  | 22 Mar 2007 - 10:52  |
| [SEMReq Deferred Choice](SEMReqDeferredChoice)| jUCMNav shall support the Deferred Choice workflow pattern. | Functional | Mandatory | Urgent | Proposed |  | 22 Mar 2007 - 08:45  |
| [SEMReq Inter leaving](SEMReqInterleaving)| jUCMNav shall support the traversal of interleaved paths in a component. | Functional | Mandatory | Urgent | Proposed |  | 22 Mar 2007 - 10:19  |
| [SEMReq Multiple Choice](SEMReqMultipleChoice)| jUCMNav shall support the Multiple Choice workflow pattern. | Functional | Mandatory | Urgent | Proposed |  | 22 Mar 2007 - 15:36  |
| [SEMReq Plugin Instances](SEMReqPluginInstances)| jUCMNav shall support the traversal of plug-in instances. | Functional | Mandatory | Urgent | Proposed |  | 22 Mar 2007 - 10:56  |
| [SEMReq Repetition Count](SEMReqRepetitionCount)| jUCMNav shall support the traversal of repeated responsibilities and stubs. | Functional | Mandatory | Urgent | Proposed |  | 22 Mar 2007 - 09:53  |
| [SEMReq Replication Factor](SEMReqReplicationFactor)| jUCMNav shall support the traversal of components with a replication factor greater than one. | Functional | Mandatory | Urgent | Proposed |  | 22 Mar 2007 - 09:46  |
| [SEMReq Synchronizing Stubs](SEMReqSynchronizingStubs)| jUCMNav shall support synchronizing stubs. | Functional | Mandatory | Urgent | Proposed |  | 22 Mar 2007 - 23:22  |


The following requirements impacts the definition or traversal of:

  - OR-forks: [SEM Req Deferred Choice](SEMReqDeferredChoice)
  - stubs: [SEM Req Deferred Choice](SEMReqDeferredChoice), [SEM Req Multiple Choice](SEMReqMultipleChoice),
    [SEM Req Repetition Count](SEMReqRepetitionCount), [SEM Req Synchronizing Stub](SEMReqSynchronizingStub)
  - responsibilities: [SEM Req Repetition Count](SEMReqRepetitionCount)
  - scenario definitions: [SEM Req Deferred Choice](SEMReqDeferredChoice)
  - components: [SEM Req Abstract Components](SEMReqAbstractComponents), [SEM Req Component Instances](SEMReqComponentInstances),
    [SEM Req Inter leaving](SEMReqInterleaving), [SEM Req Replication Factor](SEMReqReplicationFactor)
  - plug-in bindings: [SEM Req Abstract Components](SEMReqAbstractComponents), [SEM Req AoUCM Traversal](SEMReqAoUCMTraversal)
  - plug-in maps: [SEM Req Plugin Instances](SEMReqPluginInstances)
