I read through the chapter on resources in the Eclipse book I have here.
Here are the main discoveries.

  - The term 'workspace' has two definitions
    1.  file system folder 2. the main UI container in Eclipse

<!-- end list -->

  - A workspace contains 0 to many projects. A workspace cannot contain
    anything else than projects.
  - Projects contain folders and files.
  - Folders contain folders and files.

<!-- end list -->

  - When dealing with resources in Eclipse, you have to deal with
    (simultaneously):
    1.  The file system
    2.  The resource API
  - The resource API contains a set of interfaces and classes to manage
    the workspace.
  - Everything starts with the IWorkspaceRoot. All resources (including
    the workspace root) are IResources.
  - There can only be one workspace root at a time in Eclipse.
  - You must always use the resource API to take advantage of the event
    notifications.

<!-- end list -->

  - The file system and resource API are not synchronized automatically.
    A file can exist on disk but not be in the workspace and an IFile
    can be in the navigator but not yet exist on disk.
  - Your goal is to manage both, in a consistent fashion.
  - There are function calls to refresh/synchronize both.

<!-- end list -->

  - An example (imperfect but acceptable) workflow would be:
    1.  get file handle (IFile f = folder.getFile("blah.txt");)
    2.  if (f.exists()) // in workspace
          - write to it (stream of bytes)
    3.  else if (file exists in file system)
          - error .. blind overwrite? synch?
    4.  else
          - create the file in the workspace (will create for you on
            disk)

<!-- end list -->

  - the .getFile() method above will always return an IFile, even if it
    isn't in the workspace.
  - if you want to know if something is in the workspace, use the
    findXXX() methods (which returns null if not found).

<!-- end list -->

  - Resources can be derived, meaning built by something else. Won't be
    stored in the repository.
  - Resources can be read only. File system properties will be
    propagated automatically.

\* Resources have properties. 1. Session: until the resource is deleted,
the project is closed or eclipse is closed 1. Persistent: until deleted.
\* From my (limited) understanding, neither are versioned. They are
stored in the .metadata folder.

  - There exists an extensive framework for change listeners, change
    deltas, visitors for change delta trees.

\-- Main.JasonKealey - 31 Jan 2005
