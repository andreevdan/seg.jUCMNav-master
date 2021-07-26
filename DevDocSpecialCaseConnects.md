# Special Case : Connects

  - Connects have no visual aspects, even if they are PathNodes.
  - Connects are still moved (x/y) when their connected elements move.
  - Obviously, the connected elements move together.
  - Path traversal algorithms must stop when reaching connects
    (ReachablePathFinder, DeletionPathFinder, ConnectionSplineFinder)
  - The [Auto Layout](AutoLayout) must special case its treatment of Connects because
    the connected nodes actually only take up one graphical space.
  - A decision has been taken to disallow binding of Connects to the
    containing ComponentRef. Not doing so has no known implications.

\-- Main.JasonKealey - 14 Jul 2005
