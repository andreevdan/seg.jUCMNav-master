# Aspect-oriented User Requirements Notation (!AoURN) Test Suite
The complete test suite can be downloaded as a [zip files](att/AoURN_Tests_201009141132.zip). The test suite contains a series of jucm files which typically contain a base map, an aspect map, and a pointcut map. The test is run by right-clicking on the background of the aspect map and selecting "Apply Concern". The expected test results are also indicated on the aspect map.

The table below shows the name of the jucm file in the first column. The second column shows the name of the aspect map. As some jucm files may contain more than one test case, more than one name may be shown in this column for one jucm file. The third column indicates the result of the test case.




| *Test File* | *Aspect Map* | *Result* |
| --- | --- | --- |
| Test Anything 001 | Aspect | Success |
| Test Anything 002 | Aspect | Success |
| Test Anything 003 | Aspect | Success |
| Test Anything 004 | Aspect | Success |
| Test Anything 005 | Aspect | Success |
| Test Anything 006 | Aspect | Failed (anything pointcut element is not matched against empty sequence) |
| Test Anything 007 | Aspect | Success |
| Test Anything 008 | Aspect | Success |
| Test Anything 009 | Aspect | Success |
| Test Anything 010 | Aspect | Success |
| Test Anything 011 | Aspect | Success |
| Test Anything 012 | Aspect | Success |
| Test Anything 013 | Aspect | Success |
| Test Anything 014 | Aspect | Failed (requires postprocessing to prune out the longer match) |
| Test Anything 015 | Aspect | Success (potential second match to be discussed) |
| Test Anything 016 | Aspect | Success |
| Test Anything 017 | Aspect | Failed (requires postprocessing to prune out the longer match) |
| Test Anything 018 | Aspect | Success |
| Test Anything 019 | Aspect | Success |
| Test Anything 020 | Aspect | Failed (anything pointcut element is not matched against empty sequence) |
| Test Aspect Map Scanning 001 | Aspect | Success |
| Test Aspect Map Scanning 002 | Aspect | Success |
| Test Aspect Map Scanning 003 | Aspect | Success |
| Test Aspect Map Scanning 004 | Aspect | Success |
| Test Aspect Map Scanning 005 | Aspect | Success |
| Test Aspect Map Scanning 006 | Aspect | Success |
| Test Aspect Map Scanning 007 | Aspect | Success |
| Test Aspect Map Scanning 008 | Aspect | Success |
| Test Aspect Map Scanning 009 | Aspect | Success |
| Test Aspect Map Scanning 010 | Aspect | Success |
| Test Aspect Map Scanning 011 | Aspect | Success |
| Test Aspect Map Scanning 012 | Aspect | Success |
| Test Aspect Map Scanning 013 | Aspect | Success |
| Test Aspect Map Scanning 014 | Aspect | Success |
| Test Aspect Map Scanning 015 | Aspect | Success |
| Test Aspect Map Scanning 016 | Aspect | Success |
| Test Aspect Map Scanning 017 | Aspect | Success |
| Test Aspect Map Scanning 018 | Aspect | Success |
| Test Aspect Map Scanning 019 | Aspect | Success |
| Test Aspect Map Scanning 020 | Aspect | Success |
| Test Aspect Map Scanning 021 | Aspect | Success |
| Test Aspect Map Scanning 022 | Aspect | Success |
| Test Aspect Map Scanning 023 | Aspect | Success |
| Test Aspect Map Scanning 024 | Aspect | Success |
| Test Aspect Map Scanning 025 | Aspect | Success |
| Test Aspect Map Scanning 026 | Aspect | Success |
| Test Aspect Map Scanning 027 | Aspect | Success |
| Test Aspect Map Scanning 028 | Aspect | Success |
| Test Aspect Map Scanning 029 | Aspect | Success |
| Test Aspect Map Scanning 030 | Aspect | Success |
| Test Aspect Map Scanning 031 | Aspect | Success |
| Test Aspect Map Scanning 032 | Aspect | Success |
| Test Aspect Map Scanning 033 | Aspect | Success |
| Test Aspect Map Scanning 034 | Aspect | Success |
| Test Aspect Map Scanning 035 | Aspect | Success |
| Test Aspect Map Scanning 036 | Aspect | Success |
| Test Aspect Map Scanning 037 | Aspect | Success |
| Test Aspect Map Scanning 038 | Aspect | Success |
| Test Aspect Map Scanning 039 | Aspect | Success |
| Test Aspect Map Scanning 040 | Aspect | Success |
| Test Aspect Map Scanning 041 | Aspect | Success |
| Test Aspect Map Scanning 042 | Aspect | Success |
| Test Aspect Map Scanning 043 | Aspect | Success |
| Test Aspect Map Scanning 044 | Aspect | Failed (does not give warning that end point should be local) |
| Test Aspect Map Scanning 045 | Aspect | Success |
| Test Aspect Map Scanning 046 | Aspect | Success |
| Test Aspect Map Scanning 047 | Aspect | Success |
| Test Aspect Map Scanning 048 | Aspect | Success |
| Test Aspect Map Scanning 049 | Aspect | Success |
| Test Aspect Map Scanning 050 | Aspect | Success |
| Test Aspect Map Scanning 051 | Aspect | Success |
| Test Aspect Map Scanning 052 | Aspect | Success |
| Test Aspect Map Scanning 053 | Aspect | Success |
| Test Aspect Map Scanning 054 | Aspect | Success |
| Test Aspect Map Scanning 055 | Aspect | Success |
| Test Aspect Map Scanning 056 | Aspect | Success |
| Test Aspect Map Scanning 057 | Aspect | Success |
| Test Aspect Map Scanning 058 | Aspect | Success |
| Test Basic 001 | Aspect | Success |
| Test Basic 002 | Aspect | Success |
| Test Basic 003 | Aspect | Success |
| Test Basic 004 | Aspect | Success |
| Test Basic 005 | Aspect | Success |
| Test Basic 006 | Aspect | Success |
| Test Interleaving 001 | Aspect | Success |
| Test Interleaving 002 | Aspect | Success |
| Test Interleaving 003 | Aspect | Success |
| Test Labels vs Names 001 | Aspect | Success |
| Test Labels vs Names 002 | Aspect | Success |
| Test Loops 001 | Aspect | Success |
| Test Loops 002 | Aspect | Success |
| Test Loops 003 | Aspect | Success |
| Test Loops 004 | Aspect | Success |
| Test Loops 005 | Aspect | Success |
| Test Loops 006 | Aspect | Success |
| Test No !PointcutMap 001 | Aspect | Success |
| Test No !PointcutStub 001 | Aspect | Success |
| Test No !PointcutStub Bindings 001 | Aspect | Success |
| Test No !PointcutStub Bindings 002 | Aspect | Success |
| Test No !PointcutStub Bindings 003 | Aspect | Success |
| Test No !PointcutStub Bindings 004 | Aspect | Success |
| Test No !PointcutStub Bindings 005 | Aspect | Success |
| Test OVS.jucm | Movie Points | Success |
| Test Permutations 001 | Aspect | Success |
| Test Permutations 002 | Aspect | Success |
| Test Permutations 003 | Aspect | Success |
| Test Permutations 004 | Aspect | Success |
| Test Replacement 001 | Aspect | Success |
| Test Replacement 002 | Aspect | Success |
| Test Replacement 003 | Aspect | Success |
| Test Replacement 004 | Aspect | Success |
| Test Replacement 005 | Aspect | Success |
| Test Semantics Static Stubs 001 | Aspect | Success %N% - Resolved (duplicate match is not removed) |
| Test Semantics Static Stubs 002 | Aspect | Success |
| Test Semantics Static Stubs 003 | Aspect | Success |
| Test Semantics Static Stubs 004 | Aspect | Success |
| Test Timer-Waiting Place Special Case 001 | Aspect | Success |
| Test Timer-Waiting Place Special Case 002 | Aspect | Success |
| Test Timer-Waiting Place Special Case 003 | Aspect | Failed (problem with connect – aspect markers on asynchronous path are switched) |
| Test Timer-Waiting Place Special Case 004 | Aspect | Failed (problem with timeout path) |
| Test Timer-Waiting Place Special Case 005 | Aspect | Failed (connect bug) |
| Test Timer-Waiting Place Special Case 006 | Aspect | Success |
| Test Timer-Waiting Place Special Case 007 | Aspect | Success |
| Test Timer-Waiting Place Special Case 008 | Aspect | Success |
| Test Timer-Waiting Place Special Case 009 | Aspect | Failed (problem with timeout path) |
| Test Timer-Waiting Place Special Case 010 | Aspect | Success |
| Test Types of Neighbors 001 | Aspect | Success |
| Test Types of Neighbors 002 | Aspect | Success |
| Test Types of Neighbors 003 | Aspect | Success |
| Test Types of Neighbors 004 | Aspect | Success |
| Test Whitespace 001 | Aspect | Success |
| Test Whitespace 002 | Aspect | Success |
| Test Whitespace 003 | Aspect | Success |
| Test Whitespace 004 | Aspect | Success |
| Test Whitespace 005 | Aspect | Success |
| Tests !UCMModelElements 001 | Aspect: responsibility | Success |
| ^ | Aspect: OR-fork | Success |
| ^ | Aspect: OR-join | Success %N% - Resolved (same problem as for Test Semantics Static Stubs 001) |
| ^ | Aspect: AND-fork | Success |
| ^ | Aspect: AND-join | Success |
| ^ | Aspect: timer 1 | Success |
| ^ | Aspect: timer 2 | Success |
| ^ | Aspect: timer 3 | Success |
| ^ | Aspect: timer 4 | Success |
| ^ | Aspect: waiting place 1 | Success |
| ^ | Aspect: waiting place 2 | Success |
| ^ | Aspect: failure point | Success |
| Tests !UCMModelElements 002 | Aspect: static stub | Failed (still matches against pointcut stub) |
| ^ | Aspect: dynamic stub | Failed (type not taken into account) |
| ^ | Aspect: synchronizing stub | Failed (type not taken into account) |
| ^ | Aspect: synchronizing+blocking stub | Failed (type not taken into account) |
| Total | 151 test cases |  Success: 138; Failed: 13 |
