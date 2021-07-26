# Icons

## Overview

  - Icons are SWT objects that aren't fun to manage because we're
    usually responsible for their disposal.
  - It is usually best to have static instances of images and reference
    these throughout the application. However, these may consume memory
    unnecessarily.
  - In jUCMNav, we haven't put much thought in our image management and
    this an an area where the application could be improved.

## seg.jUCMNav.JUCMNavPlugin

    ImageDescriptor.createFromFile(JUCMNavPlugin.class, "icons/Component16.gif")

  - When asked for icons or other images, we usually need to pass an
    ImageDescriptor (a reference to the image). We simply need to invoke
    ImageDescriptor.createFromFile() where the first argument is a class
    that is to be used as the root folder containing the relative path
    passed as a second argument.

<!-- end list -->

  - Note: there is a /icons folrder in CVS and a /src/seg.jUCMNav/icons
    folder. The one used by the above actions is the second, the first
    is simply to allow our plugin.xml to see icons when developing (the
    ones loaded are in the second folder). (At least that's what I
    think.)

## Improvements

  - If we ever start creating static instances of images instead of
    creating them using ImageDescriptor, we should invest some time in
    creating central convenience methods that return an Image from a
    certain model element class or instance. That way, we'll have a
    central location to assign which icons go with which types. The
    palette, outline and other views could use these icons directly.

\-- Main.JasonKealey - 05 Jul 2005
