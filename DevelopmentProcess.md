# Typical Developer Work Flow

 1.   Sit down at computer with coffee.
 1.   Open Eclipse
 1.   Open !BugZilla
 1.   Using your saved search, find bugs assigned to you ( %MYBUGS{jkealey@shade.ca}% )
 1.   Pick a bug to work on (or start thinking about).
 1.   Change its Status from NEW to ASSIGNED
 1.   Update files from SVN in Eclipse.
 1.   Refer to UCMNav Requirements or UCMNav Change Requests if in doubt exactly what has to be done.
 1.   Perform work.
 1.   Verify plug-in using test suite.
 1.   Commit. Identify the bug number in the commit text.
 1.   Within half an hour, a new build will be generated and tested. Email notification will be sent out to the team.
 1.   Change bug's status in BugZilla to FIXED RESOLVED.
 1.   If no more bugs are assigned to you, look for bugs that are assigned but new. 

# Typical Manager Tasks

  1.  Review patch for bugs with status FIXED RESOLVED.
      1.  If everything is approved, mark as CLOSED.
      1.  If the bug is an enhancement, change status in UCMNav Requirements 
 1.   Review change requests
      1.  If necessary, delegate research.
      1.  Negociate repercussions of change.
      1.  Approve/Reject change.
      1.  Create bug in BugZilla, mark as Enhancement. 
 1.    Create enchancements in BugZilla for all requirements.
 1.   When discrepancies are found between the requirements and the current build, file bugs in BugZilla. 

-- Jason Kealey - 08 Mar 2005 