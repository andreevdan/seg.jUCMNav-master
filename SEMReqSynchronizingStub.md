The synchronizing stub is a dynamic or static stub with plug-ins that must synchronize before continuing with the traversal past the stub. Therefore, dynamic stubs have the following behavior:

   1. A standard dynamic stub allows one plug-in to be chosen.
   1. The [Multiple Choice](SEMReqMultipleChoice) pattern extends the standard dynamic stub to allow more than one plug-in to be chosen. The plug-ins are executed in parallel but do not synchronize.
   1. The synchronized stub extends the standard dynamic stub even further by requiring the plug-ins to synchronize before continuing with the traversal past the stub. There are a number of variations in terms of the number of plug-ins required to finish before continuing on.
      1. One or more plug-ins can be chosen but all chosen plug-ins need to finish before continuing (this supports the Synchronizing Merge pattern).
      1. M plug-ins are chosen but only N need to finish before continuing (this supports the N-out-of-M join pattern).
      1. One or more plug-ins can be chosen but only one of them needs to finish before continuing (this supports the Discriminator pattern).
      1. Note that in cases 2 and 3, the remaining plug-ins finish but are ignored (they do not trigger another continuation of the traversal).

Therefore, static stubs have the following behavior:

   1. A standard static stub executes its only plug-in once.
   1. In addition to the N value discussed above, a synchronizing static stub specifies the number of parallel invocations for its plug-in (i.e. a replication factor for static stubs). Each invocation of the plug-in is executed in parallel when the traversal reaches the stub. Each invocation of the plug-in must finish before continuing the traversal past the stub. There are two cases in terms of how the number of invocations can be specified:
      1. The number can be hardcoded (this supports the Multiple Instances With A Priori Known Design Time Knowledge pattern).
      1. The number can be variable (this supports the Multiple Instances With A Priori Known Runtime Knowledge pattern). Variable numbers use integer scenario variables.

This requires stubs to be identified as synchronizing. Also for dynamic stubs, the number of plug-ins that need to finish before continuing must be specified (default is all that were chosen). The number of chosen plug-ins is defined by the selection criteria of the plug-ins. Also for static stubs, the number of parallel invocations needs to be specified.

Furthermore, the notation for a dynamic stub needs to at least indicate that the stub is synchronized (e.g. with the letter "S" inside the stub). Ideally, the number of plug-ins that must finish should also be shown inside the stub ("1/n" for Discriminator, "n/m" for N-out-of-M join, and nothing else for the default Synchronizing Merge). In terms of synchronizing static stubs, the same "S" inside a stub could be used with a number that indicates the number of parallel invocations (or "n" in case of variable invocations) followed by "x".

-- Main.GunterMussbacher - 22 Mar 2007
