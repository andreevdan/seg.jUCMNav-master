# EMF for dummies

The following instructions are outdated and only apply to URN metamodel
version 0.26 and earlier. Please see [Dev Doc How To Update Metamodel](DevDocHowToUpdateMetamodel) for
later versions.

## Easy way:

  - Make sure you have the latest version from SVN
  - Go into seg.jUCMNav.emf, right click on URN.genmodel, select reload.
  - Choose the \*.mdl file, select all packages and click finish.
  - Once done, open the URN.genmodel
  - Check the Property View of the URN tree, make sure that the *Model /
    Model Directory* attribute is set to /seg.jUCMNav/src (and not just
    /jUCMNav/src)
  - Right click on the URN tree item. Select Generate Model Code.
  - Done.

## If all else fails way:

  - Make sure you have the last version from SVN
  - Delete the grl, ucm, urn, urncore packages.
  - Delete all files in the seg.jUCMNav.emf package.
  - After selecting the seg.jUCMNav.emf package, create a new EMF model.
    Name it URN.genmodel and choose load from Rose class model. Select
    all packages and click finish.
  - Go into seg.jUCMNav.emf, right click on URN.genmodel, select reload.
  - Choose the \*.mdl file, select all packages.
  - Once done, open the URN.genmodel and right click on the URN tree
    item. Select Generate Model Code.
  - Done.
