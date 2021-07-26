Usually, file association is platform-dependent. Yet, this requirement may lead to additional programming to handle the different ways file parameters are provided by the various OSes (Windows, Linus, Solaris, Mac OS). For instance, file paths may use "\" or "/". Maybe Eclipse can help...

-- Daniel Amyot - 30 Jan 2005

.jacm or .jucm? I'm not sure we can event link to eclipse as a default editor because all files must be in projects. We'll have to investigate. For file paths, in the Resource API, they use a common scheme that is mapped to the file system. At the file system level, we might have to deal differently with these but probably the Java VM will help.

-- Jason Kealey - 31 Jan 2005

.jucm

-- Jason Kealey - 31 Jan 2005

GEF can provide native drag and drop from the OS to Eclipse. GEF allows access to the operating system's underlying drag and drop infrastructure through SWT.

Using Native Drag and Drop with GEF

That do not answer the question if we can associate certain file type to eclipse with the jucmnva perspective, but it's a start... We know we can access the underlying api for such functionnalities.

-- Etienne Tremblay - 03 Feb 2005

This one is not a priority. This might be easier with a standalone app than with an Eclipse plug-in. This could perhaps be done by associating the extension with a batch file that would start Eclipse with the appropriate file or project.

-- Daniel Amyot - 13 Feb 2005

I don't think we can do it. If I open a Java file with Eclipse, it just load Eclipse and show my workspace. It doesn't open the file. Furthermore, Rational Software Architect is not associated with their file extensions. The second point in my mind is that if we use the update site approach to deploy JUCMNav, it's hard to detect the OS and, in the case of Windows change the registry, or in the case of Linux/Unix/*BSD, detect the window manager and create an association there.

-- Olivier Clift Noel? - 16 Feb 2005

Rejected -- Jason Kealey - 16 Feb 2005

http://help.eclipse.org/help30/topic/org.eclipse.platform.doc.user/reference/ref-13.htm?resultof=%22%46%69%6c%65%22%20%22%66%69%6c%65%22%20

We might end up doing it anyways smile

-- Jason Kealey - 10 Apr 2005

This file association seems to be from the Eclipse Workbench, not the OS... But i'll take whatever is offered smile

-- Daniel Amyot - 12 Apr 2005 

[[img/ReqFileAssociation.PNG]]