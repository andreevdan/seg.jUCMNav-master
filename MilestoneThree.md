# jUCMNav
## Quality Assurance Presentation 1

# jUCMNav
## Quality Assurance Presentation 1
## Team SoftwareEngineering.Ca
## **University of Ottawa**

# Our Team



## Team SoftwareEngineering.Ca

 -   Olivier Clift-Noël
 -   Jean-Philippe Daigle
 -   Jason Kealey
 -   Jordan McManus
 -   Étienne Tremblay

# System Definition



What is a Use Case Map?

 -   Tracing a path through a system of objects to explain a causal sequence 

# System Definition
Current editor looks like this:

[[img/ucmnav_pizza.png]]

# System Definition

Problems that need fixing

  -  Goal: Usability
  -  Goal: Maintainability
  -  Goal: Better documentation 

# System Definition
The new editor (mockups)

[[img/mockupUI2v2.png]]

# System Definition
The new editor (prototypes)
[[img/pizza.png]]

# System Definition


Framework

# QA Strategy And Process

Our goals vs requirements

Goals

  -  Generic
  -  Guide our vision
  -  Make client happy 

Requirements

  -  Specific
  -  Define functionality 

# QA Strategies



How do we test this?

Usability goals:

 -   Following Eclipse UI guidelines

 -   Formal usability testing is not required

 -   Evaluating usability: for first version, testing by a few users (Personas: programmers that may or may not know Eclipse / UCMs) and the client.

# QA Strategies



Maintainability goals:

  -  Eclipse framework: forces us into a few highly-maintainable patterns & coding standards.
  -  Evaluating maintainability: code reviews and a few metrics
      -  Time between assignment of an enhancement task -> resolution
      -  Repository stats for modifications: problem areas 

# QA Strategies



Documentation goals:

 -   Our client provides feedback allowing us to be assured that documentation meets quality requirements.
 -   We use TWiki to foster conversation between developers and the client
 -   Documents changes / history
 -   Place to put dev documentation / easy to maintain
 -   JavaDoc coding standards 

# Test Framework and Data 
[[img/development_testing_environment.png]]


# Test Framework and Data



Test data

  - Testing that requirements are met
  -  Question to answer: Can system support creation of existing UCMs with the new tool?
  -  We're lucky to have existing UCMs as a reference 

# Test Cases and Reporting


Functional Requirements: Model & Controller

  -  Diagram elements
       - Manipulating the model
       - JUnit tests are possible / a bit of scripting 

  -  Editor commands
      -  Manual testing
      -  Some automated unit tests possible
      -  Model serialization will help us with automated testing
          -  Guard against regressions
          -  Test undo / redo functionality 

# Test Cases and Reporting


Functional Requirements: View testing

   - View aspects
       - Mostly manual verification 

Help & Documentation

  -  Manual review by client, who provides timely feedback
  -  Quality is somewhat subjective 

# Test Cases and Reporting


Non-functional requirements

  -  Java version
      -  Building on J2 SE? 1.5 (Java 5.0)
      -  Other tests passing implies it works under this platform target. 

Reporting

  -  Remember we get automated notifications of tests having passed / failed on each build. 

# Test Plan


On an ongoing basis, our development process assigns QA tasks to all members.

  -  Business analyst, Jason: Requirements validation
  -  QA Manager, Olivier: Overall QA + Documentation
  -  UI Expert, J-P: Use Case verification
  -  Architect, Etienne: Ensure guidelines are followed.
  -  Programmer, Jordan: Ensure coding standards are followed. 

# Status Report

  -  As of today, our prototypes have covered 24/43 of our requirements.
  -  We've also implemented 7/50 of the optional and future requirements.
  -  No tests have been implemented as our particular application requires deep knowledge of the architecture. 


