## IMPLICIT MAPPING DESIGNER INFORMATION

The following discussion assumes a thorough reading of *Yong Xiang
Zeng’s thesis*, entitled ***“Transforming UCMs to the CSM
representation”***. As described in Zeng’s thesis, the implicit design
may be divided into 3 stages \[1\]:

  - Create a duplicate map;
  - Transform the above map by inserting new RA/RR nodes, Dummy Steps
    and by eliminating adjacent Empty Points;
  - Save the transformed map in the appropriate XML representation.

**Implementing a duplicate map**

Our duplicate map is implemented under the form of two lists. The first
list contains a series of node references to the original UCM nodes
\[2\]. The second list contains a series of node connections, emulating
the connections between the nodes in the original map \[2\]. Populating
these two lists with elements from the original map was an easy task.
All one had to do was to traverse the map and retrieve the appropriate
nodes and connections and then add them to the list. The real problem
intervened when it came time to make the appropriate RA and RR
insertions.

**Creating and Inserting RA and RR nodes**

One of the key elements of our design was to distinguish between the
original UCM nodes and the new RA, RR, Dummy Sequence and Dummy Step
nodes. Without such a distinction, we would not be able to differentiate
between the original nodes and the newly inserted ones. Thus, we created
the CSMDupNode class. An instance of this class can be either an
original UCM node (i.e., a PathNode), or a newly created node (we will
call it simply CSMDupNode).

Thus, our list of nodes is populated with CSMDupNodes. The list of
connections may have up to four different types of entries. Assuming
that a connection is formed of a source node being linked to a target
node, the different entries are:

  - CSMDupNode \<--\> PathNode
  - PathNode \<--\> CSMDupNode
  - CSMDupNode \<--\> CSMDupNode
  - PathNode \<--\> PathNode (original connection as in the UCM)

The insertion process is defined by the execution of two algorithms:
Resource Acquisition and Resource Release. These algorithms are
described in detail in Zeng’s thesis and need no further elaboration in
this report. Our implementation follows the same logic as described in
the thesis.

When the time comes to create a new node there are several things to
take into consideration. First, we have to assign a unique ID to each of
these nodes. Under the current implementation, all new nodes have IDs
starting with the letter “G” for “generated”. RA nodes can be assigned
an ID starting at G100 and ending at G199. Dummy sequences which are
inserted after the RA node, have IDs that start at G200 up to G299. RR
nodes start at G300 and end at G399. Dummy Sequences that are inserted
prior to RR nodes start at G400 and end at G499. Finally, all Dummy
Steps start at G500. Unfortunately, this naming convention is rather
primitive and does not allow more than 99 insertions of each type of new
node.

When we insert a new node, we also have to update the links in the
connections list to accommodate these insertions. Therefore, the typical
insertion would delete an existing connection linking two PathNodes and
create two new connections: from the original source node to the node to
be inserted, and from the node to be inserted to the original target
node. Once these links have been updated, we are able to obtain our
predecessor/successor attributes.

As described in the thesis, consecutive empty points are not allowed in
a map. If two or more consecutive empty points are found, all but one of
them must be deleted. To accomplish this, we follow a similar process as
with RA/RR insertions. We first identify a connection linking two Empty
Points. We then delete the target node and all subsequent target nodes
that are Empty Points. At each iteration, we re-establish the links in
the connections list.

A similar algorithm is used to insert a Dummy step between two
PathConnections or between two Steps. Our algorithm searches for an
empty point. If that empty point is located between two PathConnections,
it is replaced with a Dummy Step. Otherwise, it may be either deleted
(if it is found in between a Step and a PathConnection), or kept (if it
is found between two Steps).

**Printing the final XML file**

Once all the insertions and deletions are done, we can finally generate
the CSM file. To do so, we simply scan the node list and print out every
node that we encounter, be it a PathNode or a newly inserted node.

\-- Main.YuliyaKhomich - 14 Apr 2006
