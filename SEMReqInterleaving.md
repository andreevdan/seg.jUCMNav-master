This supports the Interleaved Parallel Routing pattern. If parallel branches within the same component exist, then the traversal mechanism should interpret this as interleaved parallel routing. This may be irrelevant to the traversal mechanism since the algorithm is either breadth-first or depth-first and as such interleaved by default. May have some impact on the conversion to MSC and CSM, though.

-- Gunter Mussbacher - 22 Mar 2007 

[[img/SEMReqInterleaving.PNG]]