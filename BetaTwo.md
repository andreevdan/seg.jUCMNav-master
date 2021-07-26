# jUCMNav Beta2

<img align = "right" src="<img/logoFinal.gif">

## Download

Get the beta 2 release
[here](att/seg.jUCMNav_1.0.0_beta2.zip)
(zip).  
Includes source code.  
[Changelog](att/changelog_since_beta1.txt) since beta1.

## Requirements

### Operating Systems

  - Windows XP (tested)
  - Linux (tested)
  - Any other O/S on which you can run [Eclipse](http://www.eclipse.org)
    (currently untested - please report your success)

### JDK

  - [J2SE 5.0 (1.5)](http://java.sun.com/j2se/1.5.0/index.jsp)

### Prerequisites

  - Eclipse
      - jUCMNav was developed for 3.0.1
      - Older/newer builds might work, but have not tested.
      - <http://download.eclipse.org/eclipse/downloads/drops/R-3.0.1-200409161125/index.php>
      - We recommend you download the Eclipse SDK.
  - The Graphical Editing Framework
      - jUCMNav was developed for GEF 3.0.1
      - <http://download.eclipse.org/tools/gef/downloads/drops/R-3.0.1-200408311615/index.php>
      - We recommend you download the SDK or runtime.
  - The Eclipse Modeling Framework (EMF and SDO)
      - jUCMNav was developed for EMF 2.0.1 (yes, 2.0.1 accompanies
        Eclipse 3.0.1)
      - <http://download.eclipse.org/tools/emf/scripts/downloads-viewer.php?s=2.0.1/R200409171617>
      - We recommend you download the SDK or runtime, but make sure you
        get EMF and SDO; the plugin will not work otherwise.
  - \[Optional\] GraphViz dot
      - For autolayout purposes, you may want to download GraphViz dot.
      - <http://graphviz.org/Download.php>

## Release Notes

### Installation

From binaries:  
Download and install all prerequisites, then extract the file
seg.jUCMNav\_1.0.0.zip into the directory containing your eclipse/
directory. We certainly plan to make installation easier by the time
jUCMNav is out of beta.

Building the source:  

  - Go to the installation directory
    (ECLIPSE\_HOME/plugins/seg.jucmnav\_1.0.0/) and extract the source
    zip file.
  - Open a shell into the extracted source directory
  - Issue the command 'ant'
  - Output is in the ./build/ directory

### Online Help

An early help document is available here: HelpOnLine

### Beta Testing

  - We will not be providing you with specific use case maps to
    reproduce during our testing phase. You’ll have to have a bit of
    creativity :)
  - If you experience an error during saving, try to mitigate the
    situation by undoing a few operations and then saving again. You’ll
    help us discover what actions broke the build.
  - Eclipse provides an Error Log view that stores all errors that have
    occurred. When describing bugs, please include any error messages
    that have been logged. To activate this view, use the menus: Window,
    Show View, Other, PDE Runtime, Error Log.

### The application’s weak spots:

*Feel free to test everything but here is a list of the features we
believe will contain the most bugs:*

  - Loops are new in BetaTwo. Try to create illegal UCM loops by any
    means you can find; try to delete branches/elements and make the
    application crash or have hidden paths.
  - Timer/wait/connects: These features were added right before the
    release of BetaOne and have not been tested extensively.
  - Actions performed on newly added maps. When working in new maps
    (using the contextual menu on the URNspec in the outline), we have
    experienced some bugs. Look out for elements external to the editor
    not being in synch with the contents.
  - Deletions in general will cause the most problems:
      - Deletion of elements related to plugin bindings: start point,
        end point, node connections. Directly or indirectly.
      - Deletion of elements that have many types of association
          - Deletion of paths are a good tests (delete the start/end):
            especially true for the previously mentioned
            timer/wait/connects.
          - Deletion of elements with conditions, labels, component
            bindings, multiple in/outs.
      - Note that one must not only watch out for explicit deletions for
        these bugs to occur but also other actions that make elements
        disappear such as mergers, joins, forks. Asynchronous
        connections will probably have many bugs concerning indirect
        ways of removing empty points.
      - A good test is to create a complex map, hit ctrl-a and delete
        everything (you might have to repeat this action a few times to
        remove all path segments). If you can’t undo your operation,
        something went wrong.
  - Quick repetition of undo/redo commands has been known to sometimes
    cause errors.
  - Auto-layout is just a prototype but any feedback is welcomed.

### Reporting Bugs / Usability Requests

  - Send your bug reports to \<a
    href="[mailto:seg4910@softwareengineering.ca](mailto:seg4910@softwareengineering.ca)"\><seg4910@softwareengineering.ca>\</a\>.
  - Include reproduction steps, sample .jucm files and, if applicable,
    copy-paste the error log messages.
  - If you're zealous enough, we'll create a BugZilla account for you :)

\-- Main.JeanPhilippeDaigle - 27 Jun 2005
