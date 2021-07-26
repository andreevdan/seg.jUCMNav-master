# Query Infrastructure

## Overview

  - Basically, our mechanism is to send requests to a singleton pattern
    that returns responses.
  - The singleton pattern uses a linked list of query processors to
    determine who should run the query and obtain the response.
  - TODO: explicit class naming

## Usage

  - TODO w/ example

## Extension

  - TODO w/ example

## Issues

  - Right now, all our QueryRequests/\!QueryResponses are inner classes
    of the query processors, meaning we need to know who will process
    the request before sending it to a generic structure that will run
    it indirectly.
  - I propose creating convenience methods in GraphExplorer that will
    encapsulate this complicated structure. Basically, for most
    purposes, a simple:

public static Vector GraphExplorer.getReachableEndPoints(\!PathNode pn)
is sufficient.

  - More complex queries/responses will justify creating/manipulating
    these objects directly. Their real purpose is to retain preprocess
    queries and cache results.
  - Working with inner classes is terrible. Forces the user to know
    exactly what query processor he will use. Extending them is even
    worse.
  - Maybe we can create a nice (non-inner) class hierarchy for
    queries/responses.
  - We would simply have to create a new instance of a query/response
    using a constant of RequestObject to determine the work to be done.
  - Without such methods, the GraphExplorer is pretty useless as we can
    run our queries much faster by creating the processors ourselves.
  - Can't we make GraphExplorer's run() static, using its only instance
    to run? Avoid calls to getInstance().

\-- Main.JasonKealey - 12 Jul 2005
