This supports the Multiple Instances Without Synchronization pattern. The replication factor can already be defined. When the traversal mechanism encounters a component with a replication factor greater than 1, the path segment bound to that component is executed in parallel as many times as indicated by the replication factor. The parallel paths do not synchronize. If synchronization is required use a [synchronizing stub](SEMReqSynchronizingStubs) instead.

-- Main.GunterMussbacher - 22 Mar 2007

[[img/SEMReqReplicationFactor.PNG]]
