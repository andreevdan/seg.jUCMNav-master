# Internationalization

## Overview

  - It is easy to extract strings from jUCMNav into a central location
    for easy translation.
  - See [Internationalization And Localization](InternationalizationAndLocalization) for a good overview.

## Usage

  - Source -\> Find Strings to Externalize
  - Choose file; don't select metamodel files.
  - Find the Configure button.
      - Source folder: seg.jUCMNav/src (both locations)
      - Package: seg.jUCMNav (both locations)
      - Property filename: messages\_en.properties (use browse wizard;
        don't type directly or some bugs occur)
  - Remove the filter all existing ignored and externalized entries
    checkbox. See problem below.
  - Enter a good key for new entries, make sure you don't overwrite old
    ones.
  - Existing strings will get marked as errors for some dumb reason. Use
    the revert button (not icon), not externalize or ignore. See problem
    below.

## Problems we've encountered 
- The internationalization wizard (Eclipse 3.0 at least) isn't very intuitive at first. You have to play with it a bit to understand how it works.

 - **\*Warning: Please verify what it has done before committing. It**
    **sometimes replaces entries in the messages file with empty**
    **strings\!\!\!***
 - The wizard doesn't load the existing string, accepting will flush
    the existing entry.

\-- Main.JasonKealey - 14 Jul 2005
