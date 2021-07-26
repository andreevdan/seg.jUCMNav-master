# Quick facts on Ant & Using it to Build Projects In Eclipse

Short tutorial (from onjava.com, sample chapter):
[attached](att/AntEclipse.pdf).

Sample project: in CVS under `projetseg/samples/building/DummyProject`

You can generate a basic build script by right-clicking on `plugin.xml`
and selecting `PDE Tools > Generate Ant Build File`. There are catches
to this approach, which I'll cover next meeting.

We can have our update packages built with Ant easily too. That means
usecasemaps.org can become an Eclipse update site at some point in the
future and users just have to click `Help > Software Updates` to get the
latest version of jUCMNav.

\-- Main.JeanPhilippeDaigle - 18 Jan 2005

  - Might have to change a few things when using CVSNT.: 

    [[img/cvsnt_problem.jpg]]

<!-- end list -->

  - The ant script given requires bin to be created (not a major
    problem)

\-- Main.JasonKealey - 19 Jan 2005
