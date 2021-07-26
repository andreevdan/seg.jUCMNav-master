# Special Case: Timeout Paths

  - As a convention, it is assumed that a timeout path's position in the
    timer's .getSucc() list is 1. (Meaning the second).
  - Usually, we don't pay attention to connection order, but for timeout
    paths, we can't do otherwise.
      - Our commands usually remove a node connection from the list then
        add it back at the end; we don't remember its position in the
        list.
  - It is assumed that timeout paths do not have conditions. The
    condition is supposed to be inferred from the condition on the
    normal path exiting the timer.

\-- Main.JasonKealey - 14 Jul 2005
