---+ As discussed May 18th
   * Must be in palette.
   * uses responsibility's new empty boolean attribute added in the new [URN Meta Model](URNMetaModel) (version 6+)
   * One can convert an empty responsibility to a regular one but cannot do the opposite. 
   * figure: small filled square, size of empty point.
   * empty responsibilities can reference one and only one Responsibility
   * their reference can never be changed (no dropdown selection)
   * empty responsibilities will be automatically converted to regular ones when:
      * one adds a label
      * one changes the name
      * one flips the boolean flag in the properties view
   * the boolean flag should not be visible for regular responsibilities as they cannot revert back to an empty responsibility. 
   * no label appears by default because as soon as one exists, it is replaced by a regular responsibility.
   * a convert to responsibility option should appear in its contextual menu

low priority.
 
-- Main.JasonKealey - 19 May 2005

[[img/ReqElemEmptyResponsibility.PNG]]
