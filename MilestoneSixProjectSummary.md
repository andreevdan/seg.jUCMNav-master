# Project Summary

This section provides an overview of the project and its evolution over
the seven months from planning to deployment.

## Table of contents

<span class="twiki-macro TOC"></span>

## Main objectives and requirements

### Replacing an existing tool

UCMNav, which stands for Use Case Map Navigator, is a tool written in
C++ allowing the editing and exploring of Use Case Map models (UCM). The
UCM notation is currently undergoing standardisation within ITU-T. The
current version requires an X Window server, the XForms libraries and a
Unix variant (Solaris, Linux, and Windows/Cygwin are supported).

The program presents several problems. Developed as a prototype, it has
greatly evolved over the years, mostly in an ad-hoc manner, and is now
impossible to maintain. In addition, the user interface is not very
friendly. As this is the only UCM editor available, its deficiencies are
slowing down the adoption of the notation.

Our project aims to fulfill the following goals:

1.  Break away from dependencies on XForms and X Window servers. 2.
    Re-architect the system with an eye towards maintainability. 3.
    Provide a user friendly interface to aid the adoption of the tool
    and the notation.

## Evolution

We are very glad to note that in this particular project, our
requirements and objectives were extremely stable and quite well defined
in advance. This is tremendously important for success, and the only
truly significant changes to mention is that we decided fairly early on
to drop the requirement to read / write our output files using the URN
DTD under development by our client. Though certainly not an
insurmountable task, writing the converter to map this unstable DTD to
our model was seen as a task that might potentially take so long it
would delay other, more important and visible feature points.

We therefore decided to save Use Case Maps by serializing the model as
XMI, and future development will include writing the I/O layer that will
convert to and from the upcoming URN DTD.

The high-level deployment of the system is as follows. This chart was
created at the beginning of the project and still completely describes
our external dependencies and deployment. However, with the [very recent
release](http://download.eclipse.org/eclipse/downloads/drops/R-3.1-200506271435/index.php)
of Eclipse 3.1, and new versions of GEF and EMF, we will probably be
making a few changes in the near future to support this new "gold
standard" as an installation platform.  
  
\<img
src="/twiki/pub/ProjetSEG/MilestoneThree/proposition\_UseCases.png"
alt="deployment diagram (high level)"\>

## Major successes

We firmly believe we have met the goals we had set out at the start of
the project, and in some respects exceeded them as well. Major success
points to mention include:

  - Addressing user experience goals: Our software conforms, where
    appropriate, to the standard Eclipse user interface guidelines. We
    have incorporated user feedback into our user experience design and
    have aligned our tool's behaviour with expected behaviour from other
    modelling tools. The tool is much more user friendly than the
    original UCMNav.

<!-- end list -->

  - Development tools: our development team is able to compile the
    system, generate documentation, and compile installer files for
    distribution with a single command. Builds are also compiled
    automatically on every commit.

<!-- end list -->

  - The software allows easy creation and exchange of UCM files; files
    are stored as text (XML) and are easy to checkin to a revision
    control system and to compare using diff tools embedded in Eclipse.

<!-- end list -->

  - Maintenance is greatly simplified, adding new features is fast and
    quite easy. We are able to respond to enhancement requests from
    users much faster than possible with the old UCMNav tool.

<!-- end list -->

  - The tool uses a URN metamodel and can be extended to support the
    full URN notation (i.e., the GRL language and links between GRL and
    UCM elements).

<!-- end list -->

  - Informally, we can state that the architecture 'feels' cleaner than
    the implementation we are replacing. More formal metrics can be
    found by referring to our published QA reports.

<!-- end list -->

  - Users are happy to see that our software runs under every platform
    supported by Eclipse: GNU/Linux, MacOS X, and Microsoft Windows have
    been successfully tested, and the tool is expected to be usable
    under Solaris as well.

<!-- end list -->

  - Key aspects of our design and processes are documented and publicly
    viewable. Anyone can setup an account on the developer wiki and
    modify topics.

<!-- end list -->

  - This application is highly likely to see some use in an academic
    setting, for instance in software engineering courses.

<!-- end list -->

  - A forthcoming article, *jUCMNav: une nouvelle plateforme ouverte
    pour l'édition et l'analyse de modèles UCM*, summarising the design
    choices and development of jUCMNav, was accepted for publication at
    [NOTERE 2005](http://w3.uqo.ca/notere05/).

## Challenges and lessons learned

  - Nearly from the beginning of development, we have been using
    [CruiseControl](http://cruisecontrol.sourceforge.net/) to handle
    automatic building of our source code and running our automated test
    suite. Though the advantages are numerous, we have experienced a
    peculiar number of problems related to our CruiseControl
    installation:
      - File ACL problems led to hard-to-track issues occuring when the
        scripts were running under CruiseControl, and were not
        reproducible when running by hand.
      - Our installed version of CruiseControl seems to have some
        reliability issues, and has a tendency to silently stop its
        compiling queue.
      - In at least one instance, our checked-out version of the project
        used by CruiseControl got corrupted (CVS housekeeping files went
        missing). Investigation never revealed exactly what had happened
        and the problem was irreproducible.

<!-- end list -->

  - We have benefited immensely from relying on a mature underlying
    platform for graphics, user interaction and command execution.
    However, bugs in our platform and dependencies have been a pain
    point on several occasions:
      - The graphical saving functions we call are implemented by the
        platform and have presented some color flipping / palette issues
        under Linux.
      - Some on-screen SWT widgets have presented a few irregular
        behaviours under Linux, leading to crashes only on this
        platform. We had to implement workarounds for these bugs.

<!-- end list -->

  - Complicated architecture
      - GEF is quite complex to learn and neophytes can easily get
        scared away from development until they have mastered the
        basics.
      - Early prototypes using GEF were **very** difficult to get up and
        running.

<!-- end list -->

  - Quality control
      - Defining automated tests for a graphical editor is not the
        simplest of tasks. When unaware of the architecture of an
        application built with GEF, one defines tests that often end up
        testing the framework instead of the new code.
      - Running a PDE (Plugin Development Environment) test suite from
        the command line (for integration with build scripts) proved
        very challenging, and documentation was not readily available.

<!-- end list -->

  - Keeping up to date: Eclipse provides a facility for updating plugins
    online, with wizards that make installation easy for even the most
    novice users. Producing an automatically updated update site for our
    plugin, however, is a challenging undertaking (and still in
    progress). This is due to a few facts:
      - Available documentation is aimed at beginners and glosses over
        more technical aspects (ie: versioning schemes, archive internal
        layouts). A precise layout of the plugin JAR files must be
        required, but the specifications of what constitutes a compliant
        archive file are not known in detail.
      - Allowable formats for versioning plugins are seemingly
        undocumented. Even worse, there are inconsistencies between what
        the core application will accept as valid version identifiers
        and what the update wizards will parse correctly.
      - The recommended archive layout has changed for Eclipse 3.1
        (recently released), and we will be updating to conform to the
        new, more user-friendly standards.

General lessons to be learned are that any new libraries or platforms
should be thoroughly tested before relying on them too much. We have
also learned that it is absolutely crucial that all members of a
development team start working on the development of the architecture at
the same time, and early on, otherwise the learning curve can be
daunting and seriously hampering progress.

## Future recommendations

Let us adopt a less verbose style and go through a short list in point
form, for maximum chance of being read by future developers:

  - Keep improving the deployment and update story; easy installs will
    drive adoption.
  - Be familiar with GEF, EMF and the subset of the URN metamodel in
    use.
  - Keep project up to date with new stable releases of GEF, EMF and the
    Eclipse Platform. A reasonable way to do this would be to create a
    stable branch each time a core dependency is updated and keep the
    trunk synced with the latest versions of core dependencies.
  - Be wary of creating several small, fine-grained commands that do
    almost the same thing. Experience shows that building a 'chunkier'
    command that handles the same action for several different cases is
    superior.
      - Using Compound Commands is even better.
  - Always think about other operating systems, especially when writing
    scripts.
  - Windows developers: **NEVER** use Windows paths (C:\\blabla\\), the
    Eclipse platform provides classes to abstract away platform-specific
    path styles.

\-- Main.JeanPhilippeDaigle - 10 Jul 2005
