# Figures

## Overview

Figures are the view part of GEF's MVC architecture. They rely on the
draw2d package which GEF is built upon.

## Setup and general discussion

  - Each EditPart in our graphical editor has one figure associated with
    it. They are instanciated in createFigure().
  - They can later be accessed using getFigure()
  - Taking a peek at the IFigure interface, we notice that IFigures can
    contain other IFigures. Therefore, a figure hierarchy is created,
    similar to the [edit part hierarchy](DevDocEditPartCreation).
  - jUCMNav's figures are composed of figures already in the draw2d
    package.
  - All of our pathnodes are figures that are contained in one square
    (otherwise empty) figure. This gives us the possibility to be able
    to click anywhere on the square instead of precisely on the figure
    to select it.
  - Figures have connection anchors that are used by the GEF framework
    in point-to-point connections. We don't use them (at least not yet).
  - Look into methods such as translateToRelative(),
    translateFromParent(), translateToAbsolute(), translateToParent(),
    useLocalCoordinates() to convert points relative to the figure's
    bounds to and from absolute locations. This is especially necessary
    for zooming.
  - I do not know how to make it so processes or other non-rectangular
    components have a non-rectangular clickable area.

## SplineConnection

  - The most complex figure we have is the SplineConnection, a
    descendant of PolylineConnection.
  - It is used by the connection router.
  - One can obtain its PointList.
  - The spline's points is managed by the
    seg.jUCMNav.figures.router.UCMConnectionRouter

\-- Main.JasonKealey - 28 Jun 2005
