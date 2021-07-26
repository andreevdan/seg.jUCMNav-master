# Z.151 Metamodel

This page contains the URN/Z.151 metamodel (version 2, October 2012) in
a form compatible with the [Z.111 standard
meta-metamodel]((http://www.itu.int/rec/T-REC-Z.111-200811-I/en) and
independent from jUCMNav's implementation. The jUCMNav metamodel differs
from the URN (Z.151) standard in a number of ways. See:

  - [jUCMNav metamodel](jUCMNavMetamodel)
  - [Key differences](KeyDifferences)
    between the standard metamodel and jUCMNav's.

## Download the Latest Version

  - [URN-20120905.zip](%ATTACHURL%/URN-20120905.zip): Z.151 metamodel,
    in zipped *IBM Rose EE* format (September 5, 2012)
  - [Documentation](http://www.site.uottawa.ca/~damyot/urn/Z151MetamodelHTML/index.html)
    in HTML (for all browsers)
  - [Documentation](http://www.site.uottawa.ca/~damyot/urn/Z151MetamodelHTML/roseindex.html)
    in HTML (original applet-based Rose index, see \<a href
    ="<http://jucmnav.softwareengineering.ca/ucm/bin/view/ProjetSEG/URNMetaModel#WARNING>"\>WARNING\</a\>)
  - All HTML documentation (for a local copy) as a [ZIP
    file](http://www.site.uottawa.ca/~damyot/urn/Z151MetamodelHTML.zip)

### Important Notes

  - Classes in **gray** and their associations and attributes are part
    of the concrete syntax metamodel, whereas the classes in **white**
    are part of both the abstract syntax and concrete syntax metamodels.
  - Diagrams whose names end with *Abstract* are for the abstract syntax
    metamodel, whereas those that end with *Concrete* extend the
    abstract syntax metamodel with additional classes and relationships
    (associations, inheritance, and aggregations) to produce the
    concrete syntax metamodel.
  - Diagrams whose names end with *Unused* are not being used in the
    Z.151 URN standard document; they are just included for information.
  - "Nat" data type is for natural numbers ([Z.111 standard
    meta-metamodel](http://www.itu.int/rec/T-REC-Z.111-200811-I/en)),
    and "String" is a presentation of the Z.111 Token data type.

## XML Schema

The following is the XML schema generated from the metamodel. This
schema is used as the interchange format of Z.151 models.

  - [XML Schema in XSD
    format](http://jucmnav.softwareengineering.ca/twiki/pub/UCM/Z151Metamodel2012/Z151.xsd)
    (September 2, 2012)

## Issues

No so far...

## Older Versions

See DraftZ151Metamodel.

\-- Main.DanielAmyot - 18 Sep 2013
