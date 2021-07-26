Navigating the editor input If you want to implement a navigation
history in your editor, you should implement
INavigationLocationProvider. This provides a mechanism for the workbench
to request a current navigation location (INavigationLocation) as needed
to keep a navigation history. The workbench handles the mechanics of the
navigation user interface. Your INavigationLocation will be notified
when it needs to restore the editor to the location that it represents.

\-- Main.JasonKealey - 30 Jan 2005

Sounds interesting. Do we need further discussion?

\-- Main.DanielAmyot - 13 Feb 2005

Seems easy to do according to this website:
<http://www.eclipsefaq.org/chris/faq/html/faq214.html>

\-- Main.OlivierCliftNoel - 14 Feb 2005

  - History of different files opened: supported automatically by the
    framework
  - Must be able to remember multiple locations in same file: for
    plug-ins.
  - Completion:
      - When the navigation locations are remembered for all diagrams
        contained in one UCM file


[[img/ReqBrowseHistory.PNG]]