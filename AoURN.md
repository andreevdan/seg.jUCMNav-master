# Aspect-oriented User Requirements Notation

The Aspect-oriented User Requirements Notation (AoURN) is a framework
that combines goal-oriented, scenario-based, and aspect-oriented
modeling in support of requirements engineering activities.

## Overview

AoURN extends the User Requirements Notation (URN) with aspect-oriented
concepts, allowing modelers to better encapsulate crosscutting concerns
which are hard or impossible to encapsulate with URN models alone. AoURN
adds aspect concepts to URN’s sub-languages, leading to and integrating
Aspect-oriented GRL (AoGRL) and Aspect-oriented UCMs (AoUCM). The three
major aspect-oriented concepts that have to be added to URN are
concerns, composition rules, and pointcut expressions. Note that the
term aspect refers to a crosscutting concern, while the term concern
encompasses both crosscutting and non-crosscutting concerns. These are
core concepts of many aspect-oriented modeling (AOM) techniques. In
terms of aspect-oriented programming (AOP), the concept of a
crosscutting concern in AOM relates to the concept of an aspect and the
aspect’s advice in AOP, the concept of composition rules in AOM
encompasses the common before/after/around operators in AOP, and the
concept of pointcut expressions is the same in AOM and AOP.

A *concern* is a new unit of encapsulation that captures everything
related to a particular idea, feature, quality, etc. AoURN treats
concerns as first-class modeling elements, regardless of whether they
are crosscutting or not. Typical concerns in the context of URN are
stakeholders’ intentions, NFRs, and use cases. AoURN groups all relevant
properties of a concern such as goals, behavior, and structure, as well
as pointcut expressions needed to apply new goal and scenario elements
to a URN model or to modify existing elements in the URN model.

*Pointcut expressions* are patterns that are specified by an aspect and
matched in the URN model (often referred to as the base model). If a
match is found, the aspect is applied at the matched location in the
base model. The *composition rule* defines how an aspect transforms the
matched location. AoURN uses standard URN diagrams to describe pointcut
expressions and composition rules (therefore AoURN is only limited by
the expressive power of URN itself as opposed to a particular
composition language). AoURN’s aspect composition technique can fully
transform URN models.

Finally, aspects may depend on or conflict with each other. AoURN models
dependencies and conflicts among concerns and the resolution thereof
with the help of the *concern interaction graph* (CIG). Many aspect
interactions can be resolved with precedence rules. The CIG is a
specialized GRL goal graph that uses dependencies, correlations, and
intentional elements to model such precedence rules. The precedence
rules then govern the order in which concerns are applied to a URN
model.

## Publications

The following papers give a good first introduction to AoURN:

  - Mussbacher, G. and Amyot, D. (2009) [Extending the User Requirements
    Notation with Aspect-oriented
    Concepts](http://jucmnav.softwareengineering.ca/twiki/bin/view/UCM/VirLibSDL09AoURN).
    *14th SDL Forum (SDL 2009)*, Bochum, Germany, September 2009. Reed,
    R., Bilgic, A., Gotzhein, R. (Eds.), *SDL 2009: Design for Motes and
    Mobiles*, [Springer,
    LNCS 5719:115–132](http://www.springerlink.com/content/m7076070166p8447)
  - Mussbacher, G., Amyot, D., Araújo, J., and Moreira, A. (2010)
    Requirements Modeling with the Aspect-oriented User Requirements
    Notation (AoURN): A Case Study. Katz, S., Mezini, M., and Kienzle,
    J. (Eds.), *Transactions on Aspect-Oriented Software Development
    (TAOSD) VII*, Springer, LNCS 6210:23–68.

For papers more specific to AoUCM, try

  - Mussbacher, G., Amyot, D., and Weiss, M. (2007) [Visualizing Early
    Aspects with Use Case
    Maps](http://jucmnav.softwareengineering.ca/twiki/bin/view/UCM/VirLibTaosd07).
    Rashid, A. and Aksit, M. (Eds.), *Transactions on Aspect-Oriented
    Software Development (TAOSD) III*, [Springer,
    LNCS 4620:105-143](http://www.springerlink.com/content/83157t064v7x76hl),
  - Mussbacher, G., Amyot, D., and Whittle, J. (2009) [Refactoring-Safe
    Modeling of Aspect-Oriented
    Scenarios](http://jucmnav.softwareengineering.ca/twiki/bin/view/UCM/VirLibModels09).
    *ACM/IEEE 12th International Conference on Model Driven Engineering
    Languages and Systems (MODELS 2009)*, Denver, USA, October 2009.
    Schürr, A. and Selic, B. (Eds.), *Model Driven Engineering
    Languages and Systems*, [Springer,
    LNCS 5795:286-300](http://www.springerlink.com/content/w14614412gx4q8lm),
    and
  - Mussbacher, G., Amyot, D., Whittle, J., and Weiss, M. (2007)
    [Flexible and Expressive Composition Rules with Aspect-oriented Use
    Case Maps
    (AoUCM)](http://jucmnav.softwareengineering.ca/twiki/bin/view/UCM/VirLibRoyAosd07).
    *10th International Workshop on Early Aspects (EA 2007)*, Vancouver,
    Canada, March 13, 2007. Moreira, A. and Grundy, J. (Eds.), *Early
    Aspects: Current Challenges and Future Directions*, [Springer,
    LNCS 4765:19-38](http://www.springerlink.com/content/g2g365420t026881).

A complete listing of all papers related to AoURN is available as a
[search of the URN Virtual Library](UCM.URNVirtualLibraryAoURN) and on
[Gunter's publication
page](http://www.site.uottawa.ca/~gunterm/publications/index.shtml).

## Tool Support

Tool support for the matching and composition of AoURN models is
available starting with [version 4.3 of jUCMNav](WebHome). The following
three demos explain

  - how to create an aspect-oriented scenario model with AoURN, and

\<OBJECT CLASSID="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000"
WIDTH="1016" HEIGHT="747"
CODEBASE="<http://active.macromedia.com/flash5/cabs/swflash.cab#version=5,0,0,0>"\>
\<PARAM NAME=movie VALUE="%ATTACHURL%/AoURN-Create-Aspect.swf"\> \<PARAM
NAME=play VALUE=true\> \<PARAM NAME=loop VALUE=false\> \<PARAM
NAME=quality VALUE=low\> \<EMBED
SRC="%ATTACHURL%/AoURN-Create-Aspect.swf" WIDTH=1016 HEIGHT=747
quality=low loop=false TYPE="application/x-shockwave-flash"
PLUGINSPAGE="<http://www.macromedia.com/shockwave/download/index.cgi?P1_Prod_Version=ShockwaveFlash>"\>
\</EMBED\> \</OBJECT\>

  - how to manage concerns and assign URN diagrams to a concern,

\<OBJECT CLASSID="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000"
WIDTH="955" HEIGHT="740"
CODEBASE="<http://active.macromedia.com/flash5/cabs/swflash.cab#version=5,0,0,0>"\>
\<PARAM NAME=movie VALUE="%ATTACHURL%/AoURN-Manage-Concern.swf"\>
\<PARAM NAME=play VALUE=true\> \<PARAM NAME=loop VALUE=false\> \<PARAM
NAME=quality VALUE=low\> \<EMBED
SRC="%ATTACHURL%/AoURN-Manage-Concern.swf" WIDTH=955 HEIGHT=740
quality=low loop=false TYPE="application/x-shockwave-flash"
PLUGINSPAGE="<http://www.macromedia.com/shockwave/download/index.cgi?P1_Prod_Version=ShockwaveFlash>"\>
\</EMBED\> \</OBJECT\>

  - how to match/compose an aspect with an AoURN model (this can be
    undone/redone by going to the aspect map and clicking the undo/redo
    buttons).

\<OBJECT CLASSID="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000"
WIDTH="955" HEIGHT="740"
CODEBASE="<http://active.macromedia.com/flash5/cabs/swflash.cab#version=5,0,0,0>"\>
\<PARAM NAME=movie VALUE="%ATTACHURL%/AoURN-Compose-Aspect.swf"\>
\<PARAM NAME=play VALUE=true\> \<PARAM NAME=loop VALUE=false\> \<PARAM
NAME=quality VALUE=low\> \<EMBED
SRC="%ATTACHURL%/AoURN-Compose-Aspect.swf" WIDTH=955 HEIGHT=740
quality=low loop=false TYPE="application/x-shockwave-flash"
PLUGINSPAGE="<http://www.macromedia.com/shockwave/download/index.cgi?P1_Prod_Version=ShockwaveFlash>"\>
\</EMBED\> \</OBJECT\>

## Test Suite

A list of all current test cases for AoURN including their up-to-date
fail/success status is available on the [AoURN Test
Suite](AoURNTestSuite) page.
