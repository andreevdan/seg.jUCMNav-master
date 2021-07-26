# Generation of CSM models from UCM models with jUCMNav

## Overview
In this project (part of the larger [PUMA](http://www.sce.carleton.ca/rads/puma/)) effort), we are adding a plug-in to jUCMNav that generates Core Scenario Model (CSM) specifications from URN/UCM models where the performance annotations are used. UCMs support performance annotations that enable the generation of performance models in early development phases. CSM is used as an intermediate representation for the generation of performance models in Queueing Networks, LQN, Stochastic Petri Nets, etc. CSM has a syntax defined as a XML schema.

## Download

 -   The source code of the plug-in is now integrated with the main jUCMNav trunk and can be obtained from our SVN server: svn://cserg0.site.uottawa.ca/projetseg/trunk/seg.jUCMNav
 -   In Eclipse, you will need the [Subclipse]() plug-in to access the code.
 -   To obtain write access to the code, please contact damyot@site.uottawa.ca 

## Documentation

  - [Csm User Guide](CsmUserGuide) (export plug-in) old, needs major update
  - [Csm Developer Guide](CsmDeveloperGuide) (export plug-in) old, needs major update
  - [Csm Rules For Lqn Generator](CsmRulesForLqnGenerator) (CSM rules for input to the CSM2 LQN? generator) NEW 

## Resources

 -   Specification of the [Core Scenario Model]
 -   Performance from Unified Model Analysis (PUMA) project at Carleton University
 -   Original transformation from UCM to CSM (v0.25) in UCMNav documented in Yong Xiang Zeng's thesis, 2005
 -   General background on [scenario-based performance engineering with UCMNav](img/abs.PNG)
 -   Layered Queueing Networks Web site 

-- Daniel Amyot - 30 Mar 2007 