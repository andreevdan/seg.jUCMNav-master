---++ EXPLICIT TEST CASES

<TABLE BORDER=1>

<TR> <TH BGCOLOR="#FF6600" ALIGN=CENTER>Test Case #</TH> <TH BGCOLOR="#FF6600" ALIGN=CENTER>Description</TH> <TH BGCOLOR="#FF6600" ALIGN=CENTER>CSM Results</TH> <TH BGCOLOR="#FF6600" ALIGN=CENTER>Compliancy Results</TH> <TH BGCOLOR="#FF6600">Reason for failure, if any</TH> </TR>

<TR> <TD ALIGN=CENTER>1</TD> <TD>Map with one OrFork.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="green">Pass</font></TD> <TD> </TD> </TR>
 
<TR> <TD ALIGN=CENTER>2</TD> <TD>Map with one AndFork.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="green">Pass</font></TD> <TD> </TD> </TR>

<TR> <TD ALIGN=CENTER>3</TD> <TD>Map with one OrJoin.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="green">Pass</font></TD> <TD> </TD> </TR>

<TR> <TD ALIGN=CENTER>4</TD> <TD>Map with one AndJoin.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="green">Pass</font></TD> <TD> </TD> </TR>

<TR> <TD ALIGN=CENTER>5</TD> <TD>Map with one Responsibility.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="green">Pass</font></TD> <TD> </TD> </TR>

<TR> <TD ALIGN=CENTER>6</TD> <TD>Map with one Stub.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="green">Pass</font></TD> <TD> </TD> </TR>

<TR> <TD ALIGN=CENTER>7</TD> <TD>Map with one Component.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="red">Failed</font></TD> <TD>ScenarioElement missing in component. <br> Value of host (class needed to retrieve this value is not <br> implemented) ‘ ‘ is not a valid value for 'NCName'.</TD> </TR>

<TR> <TD ALIGN=CENTER>8</TD> <TD>Map containing one component, inside <br> comp there’s an empty point and after <br> comp. there’s responsibility.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="red">Failed</font></TD> <TD>ScenarioElement missing in component. <br> Value of host (class needed to retrieve this value is not <br> implemented) ‘ ‘ is not a valid value for 'NCName'.</TD> </TR>

<TR> <TD ALIGN=CENTER>9</TD> <TD>Map with component containing two <br> other components one of them has <br> responsibility, the other ,object <br> component , has responsibility and empty <br> point; their parent comp. has another <br> responsibility and empty point; there’s <br> also or join.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="red">Failed</font></TD> <TD>ScenarioElement missing in component. <br> Value of host (class needed to retrieve this value is not <br> implemented) ‘ ‘ is not a valid value for 'NCName'.</TD> </TR>

<TR> <TD ALIGN=CENTER>10</TD> <TD>Map with an OrFork. One of the branches <br> contains a responsibility reference withing two <br> different components, a team and a process.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="red">Failed</font></TD> <TD>ScenarioElement missing in component. <br> Value of host (class needed to retrieve this value is not <br> implemented) ‘ ‘ is not a valid value for 'NCName'.</TD> </TR>

<TR> <TD ALIGN=CENTER>11</TD> <TD>Map with an OrJoin and a Stub linked <br> to another map.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="red">Failed</font> </TD> <TD>"Invalid content was found starting with element <br> 'Refinement'. One of '{"""":ScenarioElement}' is expected. <br> There is no ID/IDREF binding for IDREF 'h125'"</TD> </TR>

</TABLE> 

-- Main.YuliyaKhomich - 16 Apr 2006
