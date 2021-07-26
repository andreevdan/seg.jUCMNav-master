# MilestoneOne UI mockup\!

## Menu items


1.  File
2.  Edit
3.  Navigate
4.  Use Case Maps (to contain utilities, scenarios, etc)
5.  Window
6.  Help

*Note that most current menu items end up in preference pages or properties view*

\-- Main.DanielAmyot - 18 Jan 2005:

  - OK for File, Edit, Window, Help.
  - Many tools have "View" instead of Navigate
  - Many tools have a "Tool" menu as well (for utilities, performance,
    scenario definitions). Might be a better alternative to "Use Case
    Maps".

\-- Main.JasonKealey - 19 Jan 2005:

  - Those come from an empty Eclipse but I agree with you entirely.
  - We should strive to modify Eclipse for:
    1.  File
    2.  Edit
    3.  View
    4.  Tools
    5.  Window
    6.  Help

## Views

1.  Navigator/Package Explorer (ET: Recommend a name)
      - Contains our UCM project. Because one file may contain multiple
        diagrams, show this seperation in the view.
      - Main.DanielAmyot recommends that our "projects" be
        self-contained in one .ucm file.
      - At first glance, we will have a one level tree view. Package =
        file, children = all diagrams.
      - Investigate to see if all .ucm files have at least one diagram.
      - Investigate to see if all diagrams must have a name; if not,
        what is the default name
      - When you double click on a diagram, it is opened in the editor.
        The typical metaphore seems to be one file, one editor. Do we
        have to break this or are there other solutions?
      - Location: top left
2.  Outline
      - Contains the view of all items on a diagram
      - Investigate if we can have them grouped by type and sorted
        alphabetically (toggle between both views with an icon)
      - When you select an item in the editor, it is highlighted in the
        outline.
      - When you select an item in the outline, it is selected in the
        editor.
      - This should be a treeview, in my opinion, investigate
        alternatives.
      - I say treeview because I expect stubs to list their different
        alternatives.
      - Location: bottom left
3.  Responsibilities Panel
      - Functionally similar to the outline.
      - Lists all responsibilities in the diagram with textual
        description.
      - See UCMNav 2 for an idea of what the view should contain.
      - Location: bottom left, tabbed with outline. You usually only
        need to see one at a time.
4.  Properties
      - Like VS.NET properties.
      - Investigate if we can have custom editors for special fields,
        like in VS.NET. \[sort of a wizard\]
      - Will contain the following appearance information for all (?)
        items:
          - Height
          - Width
          - Top
          - Left
          - Foreground color
          - Background color
      - The properties of specific items have yet to be listed.
        Main.DanielAmyot will help with this as we are not to rely too
        much on the DTD 0.23.
      - All items will have: \* name (is the name unique?) \*
        description
      - Location: bottom right
5.  Panel Description
      - When you select an item in the editor, you clearly see its name,
        type and description here.
      - Idea: if the item has wizards associated with it to do
        complicated tasks, maybe add a few buttons to open them here.
      - The type might be a SWT style form.
      - Location: bottom
6.  ToolBox/Palette (this is a draft... might need help from
    Main.DanielAmyot on defining this at the moment)
      - Type: grouped list of icons + textual name, like the VS.NET
        toolbox.
      - Location: top right 1. Selection tool 1. Components
        1.  Team
        2.  Object
        3.  Process
        4.  ISR
        5.  Pool
        6.  Agent
        7.  Other
        8.  Stub (static vs dynamic) 1. Path (paradigm: click, release,
            see line follow mouse, click makes new point, right click
            releases path)
        9.  Loop?
        10. Point
        11. Goal Tag
        12. Failure point 1. Time related items (find better name)
        13. Timer
        14. Wait
        15. Timestamp Point 1. Forks
        16. And fork
        17. Or fork

\-- Main.DanielAmyot - 18 Jan 2005: Note: a stub is not a component. It
is a path element (like responsibilities). I'm not sure why you suggest
Loop, Goal Tag, and Failure point above (do not get too inspired from
the current UCMNav and its DTD for this part...).

## Items in contextual menu (Applicable Transformations) .. reorder

1.  Add Responsibility
2.  Add Or Fork
3.  Add And fork
4.  Add Stub
5.  Add Timer
6.  Add Loop
7.  Add Timestamp point
8.  Add Goal Tag
9.  Add Point
10. Cut Path (not sure if should keep)
11. Enable Path Label (not sure if should keep.. properties)
12. Add Direction Arrow (not sure if should keep.. properties)
13. Add Failure Point
14. Add Shared Responsibility (what's this again?)

\-- Main.DanielAmyot - 18 Jan 2005: Cut Path should probbaly belong
there (it is point dependent). I agree that Enable path label and
Direction Arrow may not need to be there. Shared responsibilities will
not be required in your project.

\-- Main.JasonKealey - 13 Jan 2005
