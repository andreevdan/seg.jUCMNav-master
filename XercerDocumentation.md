# XERCES

Apache’s Xerces is an XML validation tool that compares one or multiple given XML files against a Schema and outputs any discrepancies between the two. You can download Xerces at http://xml.apache.org/.

To run Xerces, you must first open a MS-DOS window and set its classpath like so:

SET CLASSPATH=.;C:\Project\Xerces\xerces-2_5_0\xml-apis.jar;C:\Project\Xerces\xerces-2_5_0\xercesImpl.jar;C:\Project\Xerces\xerces-2_5_0\xercesSamples.jar

You can then run it by entering the following:

java dom.ASBuilder -f -a CSMSCHEMAV2.xml -i RATest11.csm

OR

java dom.ASBuilder -f -a CSMSCHEMAV2.xml -i RATest*.csm

OR

java dom.ASBuilder -f -a CSMSCHEMAV2.xml -i RATest11.csm RATest12.csm

-- Yuliya Khomich? - 14 Apr 2006 