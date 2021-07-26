This pattern is supported by adding conditions to the branches of an AND-fork and allowing one or more of them to evaluate to true. Alternatively, more than one branch of an OR-fork could be allowed to evaluate to true. If all conditions evaluate to false, then the traversal stops. Note that if the branches of the AND-fork or OR-fork synchronize at some point, then a [synchronizing stub](SEMReqSynchronizingStub) should be used instead. This is to avoid having to remember how many branches left the AND-fork or OR-fork, so that we know how many are expected to arrive at the synchronization point.

Considering this, it may actually be better to not allow conditions on AND-forks at all because it would be intuitive to model AND-forks with multiple choice followed by an AND-join. However, this would not work with the traversal mechanism as it **always** expects all branches to arrive at the AND-join. Same reasoning applies for OR-forks with multiple choice. Therefore, implement Multiple Choice with a dynamic stub that allows one or more plug-ins to be activated (i.e. one or more conditions for plug-ins evaluate to true - see discussion in [synchronizing stub](SEMReqSynchronizingStub)). By default, plug-ins of a stub do not synchronize.

-- Main.GunterMussbacher - 22 Mar 2007

[[img/SEMReqMultipleChoice.PNG]]
