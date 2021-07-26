We are dropping empty points and adding them back later. We should verify that we at least add one empty point between all elements.

-- Jason Kealey - 06 May 2005

I see this requirement as being linked to ALReq Setting Input Empty Point. If we substitute a sequence of empty points bound to the same component (or unbound) by one empty point, that should be an existing empty point (say, the first one, or the one with a label), and the identifier should be preserved.

Empty points with labels should perhaps be kept.

-- Daniel Amyot - 06 May 2005 