# Wizards

## Overview

  - Eclipse uses wizards in many locations and creating your own is
    easy.
  - Wizards extend org.eclipse.jface.wizard.Wizard
  - Certain generic wizards used in plugins such as the new file wizard
    define their own interface (org.eclipse.ui.INewWizard)

## Wizards and wizard pages.

  - You create an instance of a wizard. Wizards don't have anything
    graphical in them, they are simple containers for wizard pages.
  - The wizard baseclass handles page navigation (back/next) and finish.
  - When finish is clicked, performFinish() is called.
  - Wizard pages extend org.eclipse.jface.wizard.WizardPage
  - They incorporate visual elements; you can build them with SWT,
    Swing, AWT or anything else you like. We even tried Eclipse Forms.
  - GUI creation ends up as boring/redundant as always; seems to be a
    lack of good SWT/Eclipse Forms WYSIWYG editors.
  - Wizard pages can bring up problems that will be taken by the wizard
    to disallow the finish button until the problems are solved.
  - Wizard pages don't know when the user presses next/previous/finish.
    It's your responsibility to query the pages (from the editor) in
    performFinish() if you need to read values, for example.

\-- Main.JasonKealey - 11 Jul 2005
