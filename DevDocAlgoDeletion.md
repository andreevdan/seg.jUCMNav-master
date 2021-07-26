# Deletion Algorithms

## Overview 
\* Our delete uses custom algorithms to achieve its goals. 

## DeletePathCommand

\* Command to delete a path, starting with a StartPoint or EndPoint. 
\*General algorithm: \* Given a StartPoint, traverse path in the proper
direction until you find a path node with something else than 1 in / 1
out. \* This new PathNode is either an EndPoint or a PathNode with
multiple connections. \* If its not an EndPoint, disconnect your branch
from it. \* This may cause the other extremity to be deleted or
transformed into an empty point. \* You then have a path containing only
simple nodes. Remove all of these nodes from the model one by one. \*
You end up with a small start-\>nc-\>end path that can be easily
removed. \* Algorithm can be done in inverse directionfor EndPoint. \*
What is fun about this algorithm is that it is possible to keep the UCM
valid during the deletion. \* Special consideration has to be given to
removing Connects and InBindings/OutBindings. \* You might end up with
newly created paths if you have a NodeConnection that is hooked onto two
PathNodes that were deleted.

\-- Main.JasonKealey - 14 Jul 2005
