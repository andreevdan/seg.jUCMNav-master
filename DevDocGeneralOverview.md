# General Overview

jUCMNav is built using the Eclipse structure, the Eclipse Modeling
Framework (EMF) and the Graphical Editing Framework (GEF).

## EMF

  - The EMF packages [generated from the URN
    metamodel](DevDocGenerateEMFModel) are urn, urncore, ucm, grl.
  - EMF generates an interface for all our packages, classes, interfaces
    and places it in the appropriate packages.
  - EMF generates implementations for all of these interfaces and saves
    them in the **impl** subdirectory of the folder where the interface
    is stored. For example, urn.URNspec is an interface, implemented by
    urn.impl.URNspecImpl.
  - jUCMNav code is located in the seg.jUCMNav package.
  - The seg.jUCMNav.model package contains low level commands and
    algorithms that traverse and manipulate the model which is an
    instance of the urncore.URNspec.
      - seg.jUCMNav.model.commands are [covered separately
        here](DevDocCommandGeneration).
      - seg.jUCMNav.model.util contains utilities that are used
        throughout the code base. A sub-package contains the model
        explorer, used mainly for path traversal.
  - The seg.jUCMNav.emf package is for the regeneration of the
    automatically generated code. No code is contained here.

## Eclipse

  - Simply put, jUCMNav is a collection of views and an editor, working
    on an instance of the metamodel. It is registered with the Eclipse
    framework using the plugin.xml file.
  - Classes directly pertaining to the editor are located in the
    seg.jUCMNav.editors package.
  - Classes directly pertaining to the views are located in the
    seg.jUCMNav.views package. These are mostly GEF specific.
  - Our JUnit tests are located in the seg.jUCMNav.tests package.
  - The seg.jUCMNav.actions and seg.jUCMNav.editors.actionContributors
    packages contain actions and action contributions that are used to:
      - Build toolbars
      - Build menus
      - Build contextual menus

## GEF & Draw2D

  - The remaining packages are mostly GEF specific.
  - GEF uses a model-controller-view architecture.
  - As stated previously, an instance of URNspec is the model part.
  - Simply put, seg.jUCMNav.figures represents the (low level) view part
      - These are Draw2D figures that are rendered on a pane. They
        should not do much more that draw themselves.
  - Simply put, seg.jUCMNav.editparts represents the controller part
      - As editparts are asked for their figure, it can be
        self-contained. However, we keep all the figures in the
        seg.jUCMNav.figures.
      - Editparts can be selected, manipulated, etc.
      - Each edit part is linked to one and only one model element. (We
        have exceptions). It is a listener of this element (an adapter
        in EMF terms).
      - One model element can have multiple editparts associated to it.
        This way, multiple views can listen to the same object.
      - Each editpart can list its model children to allow for the
        creation of other editparts.
      - GEF recommends that an editpart's behaviour be contained in an
        edit policy (seg.jUCMNav.editpolicies) which is attached to it
        at runtime. This is very useful when multiple editparts have the
        same behaviour: PathNodeEditPart (in the editor) and
        PathNodeTreeEditPart (in the outline view) can therefore share
        the same behaviour while extending different classes.
  - Path splines are generated and managed by the [connection
    router](DevDocConnectionRouter) that is registered. See
    seg.jUCMNav.figures.router
