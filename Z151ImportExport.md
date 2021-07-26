# Standard URN (Z.151) Import/Export Project

This project presents the implementation of the import/export of User
Requirements Notation (URN) models in Z.151 format with jUCMNav. The
current jUCMNav files are in EMF-based XML/XMI format complying with
jUCMNav’s metamodel. To better comply with the Z.151 standard, jUCMNav
needs to support importing/exporting of URN models in Z.151 XML files.

This project provides an import/export mechanism for URN models in Z.151
format with jUCMNav that has been implemented using JAXB. The
implementation supports a bi-directional transformation between the
standard Z.151 metamodel (November 2008) and the jUCMNav metamodel.
Through this project, jUCMNav becomes the first tool in the world to
support the Z.151 file format.

This feature is supported by jUCMNav version 4.2.0 and above.

[Yan Gao's report](UCM.VirLibGaoMastersProject) describes the
implementation as well as current limitations (which are very few).

## Documentation

  - Yan Gao, [Import/Export of URN Models in Z.151 XML File Format with
    jUCMNav](UCM.VirLibGaoMastersProject). Intensive Graduate Project
    Report, SITE, University of Ottawa, January 2010
  - OCL static verification rules for the export are described
    [here](PredefinedSemanticsRulesOverview#Z_151_Export).
  - The documented source code can be found in the
    *seg.jUCMNav.importexport.z151* package
  - Revised URN/Z.151 XML schema ([Z151.xsd](%ATTACHURL%/Z151.xsd)),
    which incorporates several corrections to the schema found in Z.151

## Instructions

### Exporting from jUCMNav

1.  Right click on the .jucm model from the Navigator view or on an
    empty part of an opened model in the editor view
2.  Select *Export*
3.  Select *Export to URN file* and click the *Next* button
4.  Select \_URN Standard Z151 (\*.z151) as file type (you can also
    change the target directory and default file name)
5.  Click on the *Finish* button (if the file already exists, it will
    simply be overwritten).
6.  A .z151 file will have been produced. Errors and warning messages
    may be displayed on the Console view.
7.  You can refresh the target directory in the Navigator view to see
    the newly created file.

Note that before exporting the file, you can check some or all of the
[predefined rules for Z.151
export](PredefinedSemanticsRulesOverview#Z_151_Export). These rules will
detect deprecated jUCMNav elements, elements that will not be exported,
and elements that will be transformed during the export. See this
[demonstration on how to check rules](JUCMNavRelease410#Video_Overviews)
in jUCMNav.

### Importing from jUCMNav

1.  Right click on the target directory in the Navigator view
    1.  Note: Doing so on a model Navigator view or on an empty part of
        an opened model in the editor view will **replace** the content
        of that file.
2.  Select *Import*
3.  Select *Import UCM / GRL / URN* in the Other category and click the
    *Next* button
4.  Select *URN Standard Z151 (\*.z151)* as file type (you can also
    change the target directory)
5.  Select the .z151 source file name
6.  Click on the *Finish* button
7.  A .jucm file will have been produced. Errors and warning messages
    may be displayed on the Console view.
8.  If the file already existed in the selected directory, a suffix (-1,
    -2...) will be added to the file name.

## Resources

  - [ITU-T, Recommendation Z.151
    (11/08)](http://www.itu.int/rec/T-REC-Z.151/en): User Requirements
    Notation (URN) - Language Definition ([Draft
    version](UCM.DraftZ151Standard))
  - UCM.DraftZ151Metamodel (standard)
  - URNMetaModel for jUCMNav
  - JAXB Reference Implementation. <https://jaxb.dev.java.net/>
  - Java Architecture for XML Binding - Binding Compiler (xjc).
    <http://java.sun.com/webservices/docs/1.6/jaxb/xjc.html>

## Contributors

  - Main.YanGao (2009-2010)
  - Main.DanielAmyot (2009-2010)

\-- Main.DanielAmyot - 09 Jan 2010
