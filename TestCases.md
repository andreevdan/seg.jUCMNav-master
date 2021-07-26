## TEST CASES

### RA/RR Insertions

<TABLE BORDER=1>

<TR> <TH BGCOLOR="#FF6600" ALIGN=CENTER>Test Case #</TH> <TH BGCOLOR="#FF6600" ALIGN=CENTER>Description</TH> <TH BGCOLOR="#FF6600">RA Results</TH> <TH BGCOLOR="#FF6600">RR Results</TH> <TH BGCOLOR="#FF6600">Reason for failure, if any</TH> </TR>

<TR> <TD ALIGN=CENTER>1</TD> <TD>No components, 1 step.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="green">Pass</font></TD> <TD> </TD> </TR>
 
<TR> <TD ALIGN=CENTER>2</TD> <TD>One component containing 1 step.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="green">Pass</font></TD> <TD> </TD> </TR>

<TR> <TD ALIGN=CENTER>3</TD> <TD>One component containing 2 steps.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="green">Pass</font></TD> <TD> </TD> </TR>

<TR> <TD ALIGN=CENTER>4</TD> <TD>Two components each containing one step.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="green">Pass</font></TD> <TD> </TD> </TR>

<TR> <TD ALIGN=CENTER>5</TD> <TD>Two nested components containing one step.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="green">Pass</font></TD> <TD> </TD> </TR>

<TR> <TD ALIGN=CENTER>6</TD> <TD>Two nested components. C0 containing one step, <br> C1 contains another step.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="green">Pass</font></TD> <TD> </TD> </TR>

<TR> <TD ALIGN=CENTER>7</TD> <TD>Two nested components. C0 containing one step, <br> C1 contains another two step.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="green">Pass</font></TD> <TD> </TD> </TR>

<TR> <TD ALIGN=CENTER>8</TD> <TD>Three components, each containing one step.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="green">Pass</font></TD> <TD> </TD> </TR>

<TR> <TD ALIGN=CENTER>9</TD> <TD>Three nested components, each containing one step.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="green">Pass</font></TD> <TD> </TD> </TR>

<TR> <TD ALIGN=CENTER>10</TD> <TD>Three components. Two components nested in a third, <br>each containing one step.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="green">Pass</font></TD> <TD> </TD> </TR>

<TR> <TD ALIGN=CENTER>11</TD> <TD>Two components nested in a third. Each step of the <br> nested components contains a step.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="green">Pass</font></TD> <TD> </TD> </TR>

<TR> <TD ALIGN=CENTER>12</TD> <TD>One component containing a stub step. <br> Same results as test case 2.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="green">Pass</font></TD> <TD> </TD> </TR>

<TR> <TD ALIGN=CENTER>13</TD> <TD>One component containing a stub step. <br>Sub-map also contains a component which <br> is the parent of a responsibility. 2 RA and RRs <br> should be created, one for each component.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="green">Pass</font></TD> <TD> </TD> </TR>

<TR> <TD ALIGN=CENTER>14</TD> <TD>A simple path with a start point and an end-point. <br> Both start point and end point have a parent component.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="green">Pass</font></TD> <TD> </TD> </TR>

<TR> <TD ALIGN=CENTER>15</TD> <TD>Create an OrFork and on it put a step within a component. <br> One RA and one RR should appear in CSM file.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="green">Pass</font></TD> <TD> </TD> </TR>

<TR> <TD ALIGN=CENTER>16</TD> <TD>Repeat Test # 15, with AndFork.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="green">Pass</font></TD> <TD> </TD> </TR>

<TR> <TD ALIGN=CENTER>17</TD> <TD>Repeat Test # 15, with OrJoin.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="green">Pass</font></TD> <TD> </TD> </TR>

<TR> <TD ALIGN=CENTER>18</TD> <TD>Repeat Test # 15, with OrFork.</TD> <TD><font color="green">Pass</font></TD> <TD><font color="green">Pass</font></TD> <TD> </TD> </TR>

</TABLE> 
<br>

###  Empty Point Deletion/Insertion of Dummy Steps 

<TABLE BORDER=1>

<TR> <TH BGCOLOR="#FF6600" ALIGN=CENTER>Test Case #</TH> <TH BGCOLOR="#FF6600" ALIGN=CENTER>Description</TH> <TH BGCOLOR="#FF6600" ALIGN=CENTER>Expected Results</TH> <TH BGCOLOR="#FF6600">Results</TH> <TH BGCOLOR="#FF6600">Description of failure</TH> </TR>

<TR> <TD ALIGN=CENTER>1</TD> <TD>A map with 4 Empty Points.</TD> <TD> All but one Empty Point should remain. <br> This EmptyPoint should be converted to a "Dummy" step.</TD> <TD><font color="green">Pass</font></TD> <TD> </TD> </TR>
 
<TR> <TD ALIGN=CENTER>2</TD> <TD>A map with 2 Steps with an  <br> Empty Point in the middle.</TD> <TD>Empty point should remain.</TD> <TD><font color="green">Pass</font></TD> <TD> </TD> </TR>

<TR> <TD ALIGN=CENTER>3</TD> <TD>A map with 1 Steps with and  <br> an Empty Point.</TD> <TD>Empty point should be deleted.</TD> <TD><font color="green">Pass</font></TD> <TD> </TD> </TR>

<TR> <TD ALIGN=CENTER>4</TD> <TD>A map with a single Empty Point.</TD> <TD>Empty point should be replaced by a dummy step.</TD> <TD><font color="green">Pass</font></TD> <TD> </TD> </TR>

</TABLE>

-- Main.YuliyaKhomich - 15 Apr 2006
