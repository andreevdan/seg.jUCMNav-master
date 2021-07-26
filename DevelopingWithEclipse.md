# Developing With Eclipse

*for the May 18th meeting*

The following is a list of concepts/techniques that are good to know
before starting to develop with the Eclipse platform. They aren't
presented in much detail because the Eclipse documentation covers these
subjects in more depth. The list is more or less a reminder of concepts
to be taught to a developer new to Eclipse by someone already familiar
with the platform.

  - What is Eclipse?
      - A open source framework that allows developers to build great
        tools (plugins) at low cost.
      - A single application needs to be installed on the client
        computer. Offers a uniform user experience.
      - Portable: Most of the code is Java, with a thin layer of native
        controls allowing for the development of an application that
        looks and feels like a native app. \*(Research SWT)
      - An IDE for Java. As a proof of concept of the power of their
        framework, the Java Development Tools (JDT) were built.
      - Number one rule: Don't just read the documentation when
        something doesn't work. Read up as much as you can; your
        efficiency will be greatly improved.
  - Installation
      - <http://www.eclipse.org/downloads/index.php>
      - Simply extract the archive to a folder on your computer.
      - Other plugins are installed in the plugins subdirectory.
      - Recommended plug-ins (needed for jUCMNav):
          - GEF: Graphical Editing Framework
              - Needed by most graphical editors.
          - EMF: Eclipse Modeling Framework
              - Convert a UML model (created in Rational Rose for
                example) into code.
      - Other interesting plugins:
          - C/C++ IDE
          - SVN
          - Too many to list.
  - Eclipse environment
      - Perspectives
      - Views
      - Editors
      - Help
      - Preferences
      - Manage configuration
      - Resources
      - Workspace + Import/Export
      - Integrated CVS support (Actually, general source control
        repository support)
      - Local history
      - Compare with / Replace with
  - Java Development
      - Read the tips and tricks in the help\!
      - Many wizards
      - Great refactoring
          - Pull method up, push down.
          - alt-shift-r: Rename (with all references)
          - Moving classes from a package to another
          - alt-shift-m: Extract method
      - Source changes
          - Generate getters and setters
          - Overwrite/Implement method
          - Sort members
      - Great content assist
          - Ctrl-space
      - Solving problems.
          - Quick correct
              - ctrl-1
          - Project clean
          - Problems view
          - Error view (PDE development)
          - Markers (Red == error, Yellow == Warning, Blueish white ==
            Task)
      - Auto code format (SHIFT-CTRL-F)
      - Auto organize imports (SHIFT-CTRL-O)
      - Last edit location, Last file.
      - External Javadoc
      - Powerful search
      - Jason's most frequently used shortcuts :)
          - F3: Open declaration
          - Shift-Ctrl-G: References in workspace.
              - (And I found the Call hierarchy yesterday: Ctrl-Alt-H)
          - Ctrl-space: content assist
          - ctrl-1: quick correct
          - ctrl-/: comment/uncomment block of lines. (using //)
          - ctrl-shift-/, ctrl-shift-\\: comment/uncomment block (using
            /\* \*/)
          - shift-ctrl-space: tooltip on method parameters.
          - aforementioned alt-shift-r, alt-shift-m (refactoring)
      - MANY shortcuts but most use content assist or quick correct.
        Read the help, look in contextual menus. Show examples.
        Customizable. Very powerful.
      - localization
  - Java Run/Debug
      - Incremental building; don't need to explicitely compile
      - Managing run configuration
      - Run as: Java Applet, Java Application, Java Bean, JUnit test,
        JUnit Plug-in test, Run-time workbench.
      - Debug: same as above, but with attached debugger; can modify
        code while running.
      - Debug perspective.
          - Call stack
          - Variables
          - Breakpoints (normal, conditional, exception)
          - Expressions view
      - Another shorcut:
          - Shift-Ctrl-I: inspect

\-- Main.JasonKealey - 17 May 2005
