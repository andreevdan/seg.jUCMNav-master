# How To Update the URN and/or CORE Metamodel

Starting with version 0.27 of the URN metamodel, URN now depends on the
core.ecore metamodel, which is defined in the core.jar library file.

Unfortunately, the Rational Rose mdl file cannot deal with
references to this core.jar file. We therefore faked a local core
package in Rational Rose, which only contains the minimal set of classes
required in URN from CORE. The ecore files generated from the mdl file
therefore have to be manually changed, so that all references to the
classes in core.ecore point to the correct file in the library.

## If the URN metamodel has changed:

1. update mdl file in Rational Rose 
1. generate ecore files from mdl file
     - reload the URN.genmodel file (with Rose class model; select all
    packages including core; this generates the new ecore files)
     - remove the generated core.ecore file
     - update references to "core.ecore" in the generated ecore files with
    "../../../../../ca.mcgill.sel.core/model/CORE.ecore" (unless
    something related to CORE has changed in the new URN metamodel, this
    needs to be done: three times in fm.ecore, three times in grl.ecore,
    once in ucm.ecore, twice in urncore.ecore, and not at all in
    asd.ecore, ucmscenarios.ecore, and urn.ecore)
     - go to the ID property of the id attribute of URNmodelElement in
    urncore.ecore and change the property from false to true (this is
    necessary, because the id attribute of URNmodelElement is now used
    for referencing elements in the .jucm file) 
1. save non-generated code to backup: FeatureImpl.isSelectable() 
1. open CORE projects (so that CORE.genmodel and CORE.ecore is available):
    ca.mcgill.sel.commons and ca.mcgill.sel.core; another option is to
    import the "core.jar" file present in "seg.jUCMNav\\lib" folder as a
    project in the current workspace
     - click on "File -\> Import"
     - choose "General -\> Existing Projects into Workspace" and click on
    "Next"
     - in "Select archive file", browse to the location of "core.jar" and
    click on "Finish" 
1. delete fm.genmodel and delete fm package in jUCMNav 
1. regenerate fm.genmodel
     - select fm.ecore
     - New/Other/Eclipse Modeling Framework/EMF generator model (use the
    Ecore Model importer and not the Ecore Model (CDO Native) importer)
     - load the fm.ecore file
     - select everything except for core in root packages
     - add CORE.genmodel from CORE project (if it is not already listed)
     - select CORE in referenced generator models 
1. generate code
     - select root fm in fm.genmodel
     - change Java compliance level from 6.0 to 1.4
     - save
     - select root fm and right click to generate model code
     - ignore the errors for UCMmapImpl about parameterized types being
    available only in version 1.5 or greater 
1. the code generation also updates the META-INF/MANIFEST.FM file with a reference to the CORE project: revert this file as seg.jUCMNav\\lib\\core.jar will be used
1. put non-generated code back (this will require adding a few new
    imports)

## If the CORE project has changed:

1. download the latest CORE projects 
1. you may have to install the "OCL Examples and Editors" plugin from the Modeling group of the Eclipse
repository 
1. generate a new core.jar file:
     - select ca.mcgill.sel.commons and ca.mcgill.sel.core
     - Export - jar file (do not include the .settings folders; include
    only the META-INF, src, and model folders; check only "Export
    generated class files and resources")
     - ignore the warnings about duplicate files and the newly generated
    MANIFEST.FM 
1. replace seg.jUCMNav\\lib\\core.jar with the new
    core.jar file

## If the CORE project has not changed:

1. keep using seg.jUCMNav\\lib\\core.jar
