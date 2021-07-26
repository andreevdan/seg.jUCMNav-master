This subproject explains how to create compliance links in DOORS between
two URN models and their source documents.

## Import URN Models

In the jUCMNav, create two URN models, one for **Legislation** and one
for **Organization**. It is recommended to have the name of these models
as **Legislation** and **Organization**.

After building these URN model of the legislation and the URN model of
the organization, export both of them to DOORS (as explained before). In
DOORS, create a project (name can be chosen by the user) and import both
URN models in this project.

The URN models contain several formal and link modules. However, the
only formal and link modules which are necessary for verifying
compliance, are: actors, intentional elements, components and
responsibility modules and URNlinks link module.

## Setup Compliance Modules

Open either the **Legislation** or **Organization** folder and click on
one of the formal module in that folder. A new window will pop-up as
follows.

<img src="img/setup_compliance.PNG">

Click on URN --\> Setup Compliance Modules

[[img/setupdone.PNG]]

Now you have to see the new, and necessary formal and link modules in
both folders as follows:

**Legislation**

Sources Link Module, and Definitions and Clauses Formal Module.

**Organization**

Sources, Complies, Traces, Resps Link Module, and Documents Formal
Module.

## Import Legislation and Organization documents

Now import legislation and organization documents to DOORS from the
Microsoft Word documents.

## Creating Manual Links

**Creating source links**

Open **intentional elements** and **law document** formal modules from
the legislation folder.

1\) Click on File --\> Module Properties...

[[img/moduleproperties.PNG]]

2\) Click on the tab **linkset**. Select "Add...".

3)Click on the **Browse** , select the Target module and then Links
module (source link) from the correct path.

[[img/compliance.PNG]]

4\) Choose the right intentional element and drag and drop towards the
corresponding law.

5\) Click on "Make Link From Start"

[[img/source_link2.PNG]]

Repeat steps 4 and 5 until all of the links are created.

Close the **intentional elements** formal module and open **actors**
formal module of the legislation folder.

Repeat steps 1 to 5 to create all the necessary links.

Close **actors** and **law documents** formal module.

Open **intentional elements** and **policy,procedure document** formal
modules from the organization folder.

Repeat step 1 to 5 until all the links are created.

Close the **intentional elements** formal module and open **actors**
formal module of the organization folder.

Repeat step 1 to 5 until all the links are created.

Now you have all the source links.

**Creating traces links**

Open **intentional elements** formal modules of both the legislation and
organization folders.

Click on the **organization intentional elements** formal module
windows.

Repeate step 1 to 5 until you have all the necessary links with the
exception of:

In step 3, choose the **traces** link module in "Add Linkset" ---\>
"Link Module"

[[img/traces.PNG]]

In step 4, drag and drop from **intentional elements** of the
organization towards corresponding **intentional elements** of the
legislation.

Close both **intentional elements** formal modules.

Open **actors** formal modules of both the legislation and organization
folders.

Click on the **organization actors** formal module windows.

Repeate step 1 to 5 until you have all the necessary links with the
exception of:

In step 3, choose the **traces** link module in "Add Linkset" ---\>
"Link Module".

In step 4, drag and drop from **actors** of the organization towards
corresponding **actors** of the legislation.

Close both actors formal modules.

Now you have all the *traceability* links.

## Creating automated links

Open **intentional elements** formal module of the organization folder.

In the menu, click on the **Compliance** --\> Auto Complete Links.

[[img/autocomplete.PNG]]

Click on **Complete** button.

[[img/autocomplete2.PNG]]

After completing the links, DOORS will open the DXL Interaction window.

Click on **OK** button.

[[img/autocomplete4.PNG]]

Both *compliance* and *responsibility* links have been created in their
corresponding link modules.

[[img/autocomplete3.PNG]]

\-- Main.SepidehGhanavati - 04 Jul 2007
