#### Overview

For this project, the task is to add functionality to the export wizard.
Given a UCM instance, we need to generate a text file containing the DXL
script. The class ExportDXL was already in jUCMNav code, as a
placeholder. Thus, we only need to implement one method: public void
export(URNspec urn, FileOutputStream fos); Given a URNspec instance
(urn), we need to write to a file output stream (fos).

#### Getting started

*Check out the code*

Checkout takes the code from the repository and saves it on my machine.
It doesn't run anything. Jacques created a repository called jUCMtoDOORS
on host CSERG0 for my project, and it is blank by default. For both the
jUCMNav repository and mine, no access it needed to checkout the code.
However, I needed a login/password to commit.

We can checkout the code from jUCMNav as stated here:
<http://cserg0.site.uottawa.ca/twiki/bin/view/ProjetSEG/DevDocCheckoutCode>

These steps were required before I started programming. After these
steps, I modified ExportDXL, IURNExport, and ExportWizard in order to
export DXL script.

#### seg.jUCMNav.importexport.ExportDXL

*export(URNspec urn, FileOutputStream fos, String Path)* calls three
methods writeComponents(), writeResponsibilities(), and writeMaps().

*writeComponents(URNspec urn, FileOutputStream fos)* writes the
following information about components:

  - ID: the id of the component instance
  - Name: the name of the component instance
  - Type: the type of the component instance
  - Description: the description of the component instance
  - DeviceID: the id of the device (not implemented yet)

*writeResponsibilities(URNspec urn, FileOutputStream fos)* writes the
following information about responsibilities

  - ID: the id of the responsibility instance
  - Name: the name of the responsibility instance
  - Description: the description of the responsibility instance
  - ProcessorDemand: the processor demand (not implemented yet)

*writeMaps(URNspec urn, FileOutputStream fos, String Path)* writes the
following information about maps:

  - ID: the id of the map instance
  - Name: the name of the map instance
  - MapFileName: the file name of the map instance. Map file name
    consists of "UCM design name"-Map"ID"-"MapName"
  - MapTitle: the title of the map instance
  - Description: the description of the map instance

and calls three methods writeRespRef(), writeStub(), and writeCompRef().

*writeRespRef(UCMmap ucmmap, FileOutputStream fos)* writes the following
information about responsibility references:

  - ID: the id of the responsibility reference instance
  - Fx: the x coordinate of the responsibility reference instance
  - Fy: the y coordinate of the responsibility reference instance
  - EnclosingComponent: the id of the component reference instance which
    includes this responsibility reference instance in it
  - DefinitionID: the id of the responsibility instance that corresponds
    to this responsibility reference instance
  - Name: the name of the responsibility reference instance
  - Description: the description of the responsibility reference
    instance

*writeStub(UCMmap ucmmap, FileOutputStream fos)* writes the following
information about stubs:

  - ID: the id of the stub instance
  - Fx: the x coordinate of the stub instance
  - Fy: the y coordinate of the stub instance
  - Name: the name of the stub instance
  - StubType: the type of the stub instance
  - PluginIDs: the id of the plug-in map that is bound to this stub

*writeCompRef(UCMmap ucmmap, FileOutputStream fos)* writes the following
information about component references:

  - ID: the id of the component reference instance
  - Fx: the x coordinate of the component reference instance
  - Fy: the y coordinate of the component reference instance
  - Width: the width of the component reference instance
  - Height: the height of the component reference instance
  - Anchored: the Boolean value that represents whether this component
    reference is anchored or not
  - DefinitionID: the id of the component instance that corresponds to
    this component reference instance
  - Name: the name of the component reference instance
  - ComponentRole: the role of the component reference instance
  - ParentComponent: the name of the component reference instance that
    includes this component reference instance in it

#### seg.jUCMNav.extensionpoints.IURNExport

In order to get the map file name, we need to get the UCM design name.
In the interface IURNExport, I added an additional parameter "String
Path" to the method export for accessing the UCM design name.

#### seg.jUCMNav.views.wizards.importexport.ExportWizard

Since I added an additional parameter to the method export() of
IURNExport, I added an another parameter to the call for the method
export of IRUNExport in the method ExportURN of the class ExportWizard.

#### Validation Information

To check whether the generated DXL script contains correct information,
we need to check

  - if each element of component, responsibility, map, respRef, stub,
    and compRef is correct;
  - if the number of component, responsibility, map, respRef, stub, and
    compRef is correct.

I used PizzaDelivery example to test the DXL script while I was
programming. [PizzaDelivery.jucm](%ATTACHURL%/PizzaDelivery.jucm)
[PizzaDelivery.dxl](%ATTACHURL%/PizzaDelivery.dxl)

I made two additional test cases to test different UCM models that have
various types of components and path nodes.

  - case1 contains book store example which covers different types of
    components, such as team, process, agent, and actor. It covers
    different types of path nodes, such as static stub, dynamic stub,
    and fork, or fork, and responsibility. It also covers binding
    relationships between stubs and plug-in maps.
    [case1.jucm](%ATTACHURL%/case1.jucm)

<!-- end list -->

  - We can generate case1.dxl with jUCMNav:
    [case1.dxl](%ATTACHURL%/case1.dxl) In case1.dxl, we can see that all
    the requirements correspond to those in UCM model.

<!-- end list -->

  - case2 contains commuting example which covers differnt components,
    such as team and object. It covers different types of
    responsibilities, such as timer, responsibility, static stub,
    dynamic stub, and fork, and join, or fork, or join and direction
    arrow. It also covers binding relationships between stubs and
    plug-in maps. [case2.jucm](%ATTACHURL%/case2.jucm)

<!-- end list -->

  - We can generate case2.dxl with jUCMNav:
    [case2.dxl](%ATTACHURL%/case2.dxl) In case2.dxl, we can see that all
    the requirements correspond to those in UCM model.

\-- Main.YongdaeKim - 19 Dec 2005

\-- Main.SepidehGhanavati - 04 Jul 2007
