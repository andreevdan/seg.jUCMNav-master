## Download the latest releases for AoUrnToRam and TouchRam

  - [AoUrnToRam Release 1.0.1](att/aoUrnToRam_release_1.0.1.zip)
  - [TouchRam
    Release 2012Sep10](http://site.uottawa.ca/~gunterm/TouchRAM_releases/TouchRAM_release_2012Sep10.zip)

## Installation Instructions for AoURNtoRAM tool

  - **Download the Eclipse Modeling Tools \<br /\>** Note: Use the
    64-bit version if your CPU/OS supports it. \<br /\>Latest tested
    version: 3.7 Indigo \<br
    /\><http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/indigosr2>
  - **Install "jUCMNav: URN Editor (UCM and GRL)" from the Eclipse
    update site \<br /\>**Latest tested version: 5.4.0 \<br
    /\><http://jucmnav.softwareengineering.ca/jucmnav/updatesite/>
  - **Install "Kermeta IDE/Kermeta compiler" from the Eclipse update
    site \<br /\>**Latest tested version: Kermeta compiler 1.4.0 \<br
    /\><http://www.kermeta.org/update>
  - ** For performance reasons, Kermeta requires more memory than
    standard eclipse applications. \<br /\>**In order to increase the
    heap size, set -Xmx3000M in $EclipseDir$\\eclipse.ini. \<br /\>On
    32bits CPU/OS, the maximum value is -Xmx1200M. Note: if you cannot
    save $EclipseDir$\\eclipse.ini because it is located under "Program
    Files", just copy $EclipseDir$\\eclipse.ini to your desktop, update
    it, and overwrite $EclipseDir$\\eclipse.ini with the updated
    version.
  - **Install AoUrnToRam Release**
      - Close Eclipse
      - Unzip aoUrnToRamRelease\_1.0.x.zip (see top of the page) to
        eclipse/dropins\<br /\> The eclipse/dropins folder should look
        as follows:
          - eclipse/dropins/seg.jUCMNav.aoUrnToRamPlugin\_1.0.x.jar
          - eclipse/dropins/aoUrnToRam/
      - Start Eclipse
  - \*You are ready to export from AoURN to RAM\*
      - Create a new Use Case Map
      - Right click export on the Use Case Map diagram
      - Export whole URN file
      - Ram Reactive Workflows
      - Finish\<br /\> Note: The first export from AoURN to RAM takes an
        extra 30 secs. Please be patient.

## Installation Instructions for TouchRam

  - Extract the TouchRam\_release\_x.zip (see top of the page) to a
    directory of your choice
  - In a Windows environment, start the TouchRam tool by double clicking
    on ramtool.bat
  - In a Mac environment, start the TouchRam tool by double clicking on
    ramtool.jar
  - Note: Just like the AoURNtoRAM tool, TouchRam requires Java to be
    installed.
