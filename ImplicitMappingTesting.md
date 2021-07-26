# IMPLICIT MAPPING TESTING

Acceptance Testing

Acceptance testing consists of converting various test maps, some of which are derived straight from Zeng’s thesis, and checking the output, making sure that all the RA, RR and Dummy Step attributes are accurate. Although we tried to cover as many test cases as possible, further testing with more complicated maps should be conducted to identify any special cases that may have been omitted.

One of the things that could be improved in the near future would be to try and automate the testing process. This could be accomplished by creating yet another plug-in for the UCM Navigator, that would automatically create a number of maps based on some criteria given by the user. Example of such criteria would be the number of maps to create and the type of nodes to include in each map.

The testing process could also be improved by creating a bug repository. A bug repository allows programmers and testers to coordinate their efforts, by keeping track of all the bugs discovered since the inception of the software. When a tester discovers a bug, he/she submits it to the repository, along with a detailed description of the test cases used to identify it [3]. Once the bug is resolved, the programmer can mark it as resolved in the repository. However, if that bug resurfaces, the programmer is always able to go back and check the tester’s comments on the issue. A good example of such a free repository is Bugzilla [3]. Details can be found at http://www.bugzilla.org/about/.

CSM-compliancy Testing

As with Explicit mappings, we had to make sure that the newly inserted nodes were CSM-compliant. Therefore, we used Apache Xerces once again to check the XML syntax of all inserted nodes.

    Xerces Documentation 

Test Cases

-- Yuliya Khomich? - 14 Apr 2006 