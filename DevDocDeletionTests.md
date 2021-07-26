# Deletion Tests

## Overview

  - This document presents the critical scenarios to be tested when
    changing deletion. Ideally, these would be implemented as automated
    tests.
  - Unless otherwise specified the general behaviour is:
      - delete the element with the test name
      - make sure doesn’t crash while deleting
      - save + make sure doesn’t crash
      - undo + make sure doesn’t crash
      - (move something so that the editor is dirty)
      - save + make sure doesn’t crash

<span class="twiki-macro TOC"></span>

# deletion\_tests1.jucm: basic tests. Everything is inside a component to make sure ComponentRef bindings are broken.

## Test1: simple path node

Node should be removed from spline.

## Test2: responsibility reference

Node should be removed from spline.

## Test3: simple path, from start point. Path should be deleted. Verify that all elements are bound to parent when undone.

## Test4: simple path, from end point. Path should be deleted.

## Test 5: multi node, direct deletion

Make sure their deletion removes the fork and disconnects all branches

## Test 6: multi node, direct deletion

Make sure their deletion removes the join and disconnects all branches

## Test 7: Simple remove branch

The branch should be removed. Verify that all elements are bound to
parent when undone.

## Test 8: Downgrade to empty point

Remove all branches (both Test8 + Test7) and verify that the fork is
transformed into an empty point. Verify that all elements are bound to
parent when undone.

## Test 9: Implicit delete from start

Delete the path and verify that the or fork is deleted and paths are
disconnected. Verify that all elements are bound to parent when undone.

## Test 10: Implicit delete from end

Delete the path and verify that the or join is deleted and paths are
disconnected.

## Test 11: Simple remove branch

The branch should be removed.

## Test 12: Downgrade to empty point

Remove all branches (both Test11 + Test12) and verify that the join is
transformed into an empty point.

## Test 13: Delete the inner component

When undeleted, verify that it is bound to the parent.

## Test 14: Delete the outer component

When undeleted, verify that the inner component is bound to the parent.

## Test 15: Select all and delete

Ctrl-a + delete.

# deletion\_tests2.jucm: conditions + stubs

## Test 1: Conditions + explicit deletion

Verify that all conditions disappear on the outgoing connections and
reappears in correct order on undo.

## Test 2: Conditions + implicit deletion

Verify that all conditions disappear on the fork’s outgoing connections
and reappears in correct order on undo. Verify that the pre condition
reappears after deletion.

## Test 3: Conditions Verify that the post condition reappears after deletion. Verify that the Test9 stub is not deleted. Verify that no OUT1 label remains.

## Test 4: Implicit deletion of timers.

Verify that the right most timer gets deleted and that its timeout path
no longer has the timeout icon on it. Verify that the conditions
reappear and that the path order is preserved after undo.

## Test 5: Remove timeout path.

Verify that the timeout path is disconnected and that the timer is not
deleted.

## Test 6: Timeout Verify that the timeout path icon still remains after deletion.

## Test 7: Conditions

Verify that the condition still remains after deletion.

## Test 8: SplitLink

Insert a PathNode (for example responsibility reference) onto the node
connections with conditions or timeout path icons. Verify that the
conditions and timeout path icons remain on the appropriate node
connection.

## Test 9: Stub deletion

Make sure no IN/OUT labels remain after deletion. Verify that the stub
is not replaced with an empty point because it may cause illegal loops
later on. Repeat Test 8 but on the connections with in/out labels. Make
sure that the labels aren’t inversed from connection to connection.

## Test 10: Stub as both in-out. Delete both paths, verify that you get a loop with a stub in it.

## Test 11: loop breaking

Perform test 10 then delete the stub. Verify that no illegal loop is
formed.

## Test 12: implicit loop deletion

Delete all PathNodes on the loop and verify that you don’t see any stub
labels. Delete the stub afterwards to make sure there isn’t a tiny path
hidden behind it.

## Test 13: loops

Make sure first loop is broken

## Test 14: loops 2

Make sure second loop is not broken.

## Test 15: Select all and delete

Ctrl-a + delete.

# deletion\_tests3.jucm

## Test 1: stub bindings, implicit, from input

Before the test, observe the stub bindings. After, Test3 stub should
have 1in/1out and its bindings should show IN1 (instead of previous
IN2). If you see IN0, there is an error. After undo, observe that the
node connection label have returned back to the normal. Make sure
conditions are back in the stub bindings and that the ordering of
InBindings/OutBindings is correctly.

## Test 2: stub bindings, implicit, from output

Same as Test 1 but for the other stub. There are good reasons for
testing it separately. Please be very attentive.

## Test 3: stub bindings, explicit

Verify that paths are disconnected and that plugin bindings return after
undo

## Test 4: stub bindings, explicit 2

Verify that paths are disconnected and that plugin bindings return after
undo

## Test 5: stub bindings, delete previous node

Verify that bindings remain unchanged on left stub after redo and after
undo

## Test 6: stub bindings, delete next node

Verify that bindings remain unchanged on right stub after redo and after
undo

## Test 7: Select all and delete

Ctrl-a + delete.

# deletion\_tests4.jucm

## Synchronous tests.

### Test 1: Connect; End/Start

Make sure deletion stops at start point.

### Test 2: Connect; End/Waiting

Verify deletion stops at waiting place.

### Test 3: Connect; End/Timer without timeout path

Verify deletion stops at timer

### Test 4: Connect; End/Timer with timeout path

Verify deletion stops at timer

### Test 5: Path having connections

Select Test5 from the outline if you can’t select directly in the map.
Verify deletion ends at the second timer, which is deleted. (Timer
without timeout path isn’t affected)

### Test 6: Select all and delete

Ctrl-a + delete.

## Asynchronous tests

### Test 1: path having connections

Verify that the topmost curve is removed.

### Test 2: empty point / start

Verify path is deleted until timer with timeout path and that everything
is disconnected.

### Test 3: empty point / timer without timeout path

Verify disconnection

### Test 4: empty point / timer with timeout path

Verify disconnection and deletion

### Test 5: empty point / waiting place

Verify disconnection

### Test 6: Select all and delete

Ctrl-a + delete.

# Other tests

\* Combine the previous tests and make try to screw with node
connections that have both conditions and bindings. \* Delete node
connections directly. \* Delete component refs \* Delete the map and its
internals from the outline, simultaneously. We want to see what happens
when, in a compound command, we want to delete something that was
removed with its parent map. \* Delete all maps and undo some; make sure
that after doing this repetitively, it doesn’t crash the application.

\-- Main.JasonKealey - 29 Jul 2005

  - [deletion\_tests1.jucm](%ATTACHURL%/deletion_tests1.jucm): basic
    deletion

<!-- end list -->

  - [deletion\_tests2.jucm](%ATTACHURL%/deletion_tests2.jucm): loop
    deletion

<!-- end list -->

  - [deletion\_tests3.jucm](%ATTACHURL%/deletion_tests3.jucm): stub
    binding deletion

<!-- end list -->

  - [deletion\_tests4.jucm](%ATTACHURL%/deletion_tests4.jucm): connects
    deletion
