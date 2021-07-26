# Setting up CruiseControl & Command Line PDE JUnit Tests

Setting up CruiseControl and automatically running the test suite
appears easy, conceptually, but in practice it is a whole different
story. This guide is intended to assist you in this process and was
written when re-installing CruiseControl on a Windows Server 2008 R2
server.

## Download

  - Download the zip file for all of these. Don't use the update site.
    Don't use the easily to find links on the homepage, you have to
    really look for these to find the right versions.
  - At time of writing, there are two parallel streams of releases 3.7.1
    which seems to be the last official release, whereas 4.\* also
    include stable versions but appear to be intended for Developers.
    3.8 and 4.2 are both scheduled for June 2012.
  - [Eclipse SDK 3.7.1 (SDK: not the regular Eclipse)
    ](http://download.eclipse.org/eclipse/downloads/drops/R-3.7.1-201109091335/index.php#EclipseSDK)
  - [Eclipse Test
    Framework 3.7.1](http://download.eclipse.org/eclipse/downloads/drops/R-3.7.1-201109091335/index.php#EclipseSDK)
  - [Eclipse Automated
    Tests 3.7.1](http://download.eclipse.org/eclipse/downloads/drops/R-3.7.1-201109091335/index.php#EclipseSDK)
  - [EMF and XSD All-In-One
    SDK 2.7.1](http://www.eclipse.org/modeling/emf/downloads/)
  - [Draw2D, GEF and Zest All-In-One
    SDK 3.7.2](http://download.eclipse.org/tools/gef/downloads/)
  - [UML2
    SDK 3.2.1](http://www.eclipse.org/modeling/mdt/downloads/?project=uml2)
  - [OCL
    SDK 3.1.1](http://www.eclipse.org/modeling/mdt/downloads/?project=ocl)
  - [Hand-crafted Bundle from the jUCMNav Wiki for
    WTP](http://jucmnav.softwareengineering.ca/ucm/pub/ProjetSEG/DevDocCheckoutCode/WPTbundle.zip)
      - [I assume this would work too, but did not try it:
        WTP 3.3.1](http://download.eclipse.org/webtools/downloads/)
  - I put all of these files in c:\\work\\eclipse-testing

## Initial setup (Tests)

  - Extract the test framework into a directory; for me it was
    c:\\work\\eclipse-testing
  - Ensure you have the Eclipse SDK zip file (and all other zip files)
    in that same folder. The test framework will extract these.
  - Ensure that "unzip" is on your path. Unzip comes with cygwin. (As
    specified by the testing framework's readme.html)
      - I already had my c:\\cygwin\\bin folder in my path.
  - There is a runtests.bat file in the folder. Don't run it just yet.
      - What this file does is it extracts the current version of
        eclipse into the test-eclipse folder (creating
        c:\\work\\eclipse-testing\\test-eclipse\\eclipse\\\*).
      - Then, it extracts the tests (which are contained in a zip file
        that was in the automated testing framework, now in
        c:\\work\\eclipse-testing).
      - Then, it will look at its command line arguments. You pass an
        ant task (referring to a test to be executed) as an argument.
  - You're ready to run a simple test but it will take a few minutes to
    run, as it needs to extract a bunch of things.
      - SETUP: Set JAVA\_HOME to point to a 1.6 32-bit JDK (1.7 does not
        work with CruiseControl. JRE does not work for compilation. 64
        bit does not work with Eclipse) but write the path is like
        c:\\progra\~2\\java\\... instead of c:\\program files (x86)\\ -
        ant will crash for no reason otherwise.
      - In the dos prompt, type: runtests jdttext
      - Specifying a test will save you from having to execute the whole
        test suite, as we don't care about that one.
      - (Not 100% sure) I think this extracts into
        c:\\work\\eclipse-testing\\eclipse\* and then copies everything
        into c:\\work\\eclipse-testing\\test-eclipse \* If all goes
        well, your unit test will run, Eclipse will open and close, and
        your tests will pass. However, it won't, as this testing
        framework is a masochist. See troubleshooting below.
      - Once the c:\\work\\eclipse-testing\\test-eclipse\\eclipse\\\*
        folder exists (after a partial test run), you should always run
        this, as it is faster: runtests -noclean jdttext.
      - In my case, the test doesn't pass for a number of reasons which
        I describe below. However, at this point, I always run with
        -noclean and the c:\\work\\eclipse-testing\\eclipse version
        becomes useless (unless you accidentally delete test-eclipse by
        forgetting the -noclean option). Everything occurs in the
        c:\\work\\eclipse-testing\\test-eclipse\\eclipse folder.
        Apologies for the horrible folder names.
  - Troubleshooting:
      - Expect a gazillion different types of errors. Be patient.
      - The first error I got with this release was the testing tool
        looking for an exact filename
        (eclipse-SDK-M20110909-1335-win32.zip) so I renamed my SDK to
        have this exact filename instead of the cleaner filename (aka
        eclipse-SDK-3.7.1.zip) I originally had.
      - Then, on one of my machines, it was looking for
        c:\\buildtest\\M20110909-1135\\\\eclipse-testing\\eclipse-platform-3.6.2-win32.zip
        so I downloaded that zip and put it in the desired folder and
        did not (quickly) find why it wasn't looking in the right
        folder. Did not happen in my second test.
      - At this point
        c:\\work\\eclipse-testing\\test-eclipse\\eclipse\\\* existed so
        I manually extracted all the plugins downloaded above into this
        test version. You don't need these for the PDE Unit Tests, but
        you do for jUCMNav later on.
      - Other types of errors:
          - 'I can't find junit.framework.SomethingOrOther' - Delete the
            JUnit 3.\* plug-ins from your
            c:\\work\\eclipse-testing\\test-eclipse\\eclipse\\\* folder.
            Delete both the org.junit.**.jar files for version 3 in the
            plugins folder and any org.junit.** subfolders for version
            3. (version 4 includes the version number in the file or
            folder name)
          - "Unable to find org.eclipse.jdt.text.test.xml " or "Looking
            for " or something similar: the test framework only works on
            extracted JARs, for some reason. Rename the plugin .jar to
            zip. Extract the zip into a folder with the same name. It
            should then find the files it is looking for inside the
            subfolder.
          - Can't find such and such \*.jar file even if you have the
            plug-in installed. Often, it is looking for a file such as
            junit.jar which is typically included in another jar (and
            sometimes inside the lib folder of that other jar). I had to
            copy a bunch of these (especially for compilation in
            CruiseControl) into the root of the plugins folder.

### Testing Work Flow

  - This may help you understand what is going on under the hood. This
    is all relative to c:\\work\\eclipse-testing. 1 runtests.bat runs
    test.xml via some fancy techniques. 1 test.xml lists all of the unit
    tests that can be executed and invokes the test.xml inside of a
    plugin via some fancy techniques. the plugin's test.xml must be on
    the disk (not inside a jar file).
      - Ex: test-eclipse\\eclipse\\plugins\\seg.jUCMNav\_2.0.0\\test.xml
        1 test-eclipse\\eclipse\\plugins\\seg.jUCMNav\_2.0.0\\test.xml
        defines the java classes to be executed as a ui test. the
        framework runs it in the context of a new Eclipse Instance.

## CruiseControl 

1. Install CruiseControl (I got version 2.8.4 which doesn't work properly with Java 1.7) into c:\\work\\CruiseControl. 
1. Checkout <svn://cserg0.site.uottawa.ca/projetseg/trunk/cruisecontrol> into some folder, as it gives you the scripts we've modified. 
1. Copy c:\\work\\eclipse-testing\\ (all of it) into c:\\work\\cruisecontrol\\testing\\. Read all of the above about testing before doing so. 
1. Checkout jUCMNav into c:\\work\\cruisecontrol\\checkout\\get\\seg.jUCMNav

1.  Create c:\\work\\cruisecontrol\\logs\\seg.jUCMNav
2.  In our example, we're publishing our builds on the r:\\ drive -
    ensure that this is present by running map\_ccbuilds.vbs
3.  I had ant 1.8.2 installed and on my path, but I think you could use
    the one that comes with CruiseControl if you change the script.
4.  Troubleshooting:
      - This new version of CruiseControl includes a web interface at
        <http://localhost:8080/dashboard>. It lets you start builds and
        monitor progress.
      - See the testing troubleshooting section for details about what
        could go wrong (compilation and testing).
      - The CruiseControl service will not work by default if
        map-ccbuilds.vbs is not executed beforehand. (still to be
        resolved)
      - I discovered that the htmlemail publisher did not work because
        it was sending from cruisecontrol AT softwareengineering.ca
        (which does not exist) to jucmnav-dev AT softwarenegineering.ca
        (which does exist).

### CruiseControl WorkFlow

1.  Run cruisecontrol.bat to launch CC
2.  CC looks at its config.xml file to discover the seg.jUCMNav project.
3.  This project says monitor this folder for svn modifications, call
    build-seg.jUCMNav.xml when it happens, and publish the results via
    email and a copy to the r:\\ drive.
4.  build-seg.jUCMNav.xml builds, packages and tests jUCMNav.
5.  build-seg.jUCMNav.xml calls ccbuild.xml in the checked out version
    of jUCMNav to build & package it.
6.  ccbuild.xml compiles the application, creates a few jar files and a
    few zip files.
7.  the compilation points to a location which includes a bunch of jar
    files (hence the importance of having all these \*.jar files in the
    root of the plugin directory)
8.  build-seg.jUCMNav.xml then calls the testing platform with -noclean
    jUCMNav to run a special test we've added inside testing\\test.xml
    for this purpose. (extracts the zip, runs the test suite, gathers
    the results)

# Below are reminders from previous version of this guide.

  - I deleted lots content from this page which no longer appears
    relevant. View the version history of this page for more
    information.
  - When running the tests, my script used to stop after 3 seconds,
    saying message 13. I didn't know what this was so I enabled ant
    assertions in the batch file. Still nothing good.
  - After reading posts on eclipse.org for an hour, I was told to check
    the C:\\work\\eclipse-testing\\workspace\\.metadata\\.log file. I
    found this root exception:

<!-- end list -->

    Root exception:
    java.lang.UnsatisfiedLinkError: C:\work\eclipse-testing\eclipse\plugins\org.eclipse.swt.win32_3.0.1\os\win32\x86\swt-win32-3063.dll: Access is denied

  - I changed my filesystem properties on the folder containing this
    file and, recursively, its children. For some reason, no one had
    read access.
  - This problem is windows specific.

\-- Main.JasonKealey - 31 Jan 2012
