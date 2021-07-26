## ProjectSEG Web Preferences

The following settings are ***web preferences*** of the
[ProjectSEG](Home) web. These
preferences overwrite the ***site-level preferences*** in [Default Preferences](DefaultPreferences) and can be overwritten by ***user preferences*** (your personal topic,
eg: <span class="twiki-macro MAINWEB"></span>.TWikiGuest in the
[<span class="twiki-macro MAINWEB"></span>](%MAINWEB%.%HOMETOPIC%) web).

***Preferences:***

  - Corner logo preferences
      - Set WIKILOGOIMG =
        <http://cserg0.site.uottawa.ca/twiki/pub/ProjetSEG/WebHome/LogoFinal_small.gif>
      - Set WIKILOGOURL = WebHome
      - Set WIKILOGOALT = jUCMNav Home
  - List of topics of the
    <span class="twiki-macro WIKITOOLNAME"></span>.<span class="twiki-macro WEB"></span>
    web:
      - Set WEBTOPICLIST = [Changes](WebChanges)
        <span class="twiki-macro SEP"></span> [Index](WebIndex)
        <span class="twiki-macro SEP"></span> [Search](WebSearch)
        <span class="twiki-macro SEP"></span> Go \<input type="text"
        name="topic" size="16" /\>

<!-- end list -->

  - Web specific background color: (Pick a lighter one of the
    <span class="twiki-macro TWIKIWEB"></span>.StandardColors)
      - Set WEBBGCOLOR = \#3864a0

<!-- end list -->

  - List this web in the
    <span class="twiki-macro TWIKIWEB"></span>.SiteMap:
      - If yes, set SITEMAPLIST to `on`, do not set NOSEARCHALL, and add
        the "what" and "use to..." description for the site map. Make
        sure to list only links that include the name of the web, e.g.
        %WEB%.Topic links.
      - Set SITEMAPLIST = on
      - Set SITEMAPWHAT = jUCMNav
      - Set SITEMAPUSETO = ...collaborate on the jUCMNav Eclipse Plugin

<!-- end list -->

  - Exclude web from a `web="all"` search: (Set to `on` for hidden webs)
      - Set NOSEARCHALL =

<!-- end list -->

  - Prevent automatic linking of [WikiWords](%TWIKIWEB%.WikiWords) and
    acronyms (if set to `on`); link WikiWords (if empty); can be
    overwritten by web preferences:
      - Set NOAUTOLINK =
      - ***Note:*** Use the `[<nop>[...][...]]` syntax to link topics in
        case you disabled WikiWord linking. The `<noautolink> ...
        </noautolink>` syntax can be used to prevents links within a
        block of text.

<!-- end list -->

  - Default template for new topics and form(s) for this web:
      - WebTopicEditTemplate: Default template for new topics in this
        web. (Site-level is used if topic does not exist)
      - [%TWIKIWEB%.WebTopicEditTemplate](%TWIKIWEB%.WebTopicEditTemplate):
        Site-level default template
      - <span class="twiki-macro TWIKIWEB"></span>.TWikiForms: How to
        enable form(s)
      - Set WEBFORMS = FormForReq, FormForChangeReq

<!-- end list -->

  - Users or groups who ***are not*** / ***are*** allowed to ***view***
    / ***change*** / ***rename*** topics in the %WEB% web: (See
    <span class="twiki-macro TWIKIWEB"></span>.TWikiAccessControl)
      - Set DENYWEBVIEW =
      - Set ALLOWWEBVIEW =
      - Set DENYWEBCHANGE =
      - Set ALLOWWEBCHANGE =
      - Set DENYWEBRENAME =
      - Set ALLOWWEBRENAME =

<!-- end list -->

  - Users or groups allowed to change or rename this %TOPIC% topic:
    (I.e. <span class="twiki-macro MAINWEB"></span>.TWikiAdminGroup)
      - Set ALLOWTOPICCHANGE =
      - Set ALLOWTOPICRENAME =
        <span class="twiki-macro MAINWEB"></span>.TWikiAdminGroup

<!-- end list -->

  - Web preferences that are **not** allowed to be overridden by user
    preferences:
      - Set FINALPREFERENCES = NOSEARCHALL, ATTACHFILESIZELIMIT,
        WIKIWEBMASTER, WEBCOPYRIGHT, WEBTOPICLIST, DENYWEBVIEW,
        ALLOWWEBVIEW, DENYWEBCHANGE, ALLOWWEBCHANGE, DENYWEBRENAME,
        ALLOWWEBRENAME

***Notes:***

  - A preference is defined as: \<br /\> =6 spaces \* Set NAME = value=
    \<br /\> Example:
      - Set WEBBGCOLOR = \#FFFFC0
  - Preferences are used as
    <span class="twiki-macro TWIKIWEB"></span>.TWikiVariables by
    enclosing the name in percent signs. Example:
      - When you write variable `%WEB<nop>BGCOLOR%` , it gets expanded
        to `%WEBBGCOLOR%` .
  - The sequential order of the preference settings is significant.
    Define preferences that use other preferences first, i.e. set
    `<nop>WEBCOPYRIGHT` before `<nop>WIKIWEBMASTER` since
    `%<nop>WEBCOPYRIGHT%` uses the `%<nop>WIKIWEBMASTER%` variable.
  - You can introduce new preferences variables and use them in your
    topics and templates. There is no need to change the
    <span class="twiki-macro WIKITOOLNAME"></span> engine (Perl
    scripts).

***Related Topics:***

  - <span class="twiki-macro TWIKIWEB"></span>.<span class="twiki-macro WIKIPREFSTOPIC"></span>
    has site-level preferences.
  - <span class="twiki-macro MAINWEB"></span>.<span class="twiki-macro WIKIUSERSTOPIC"></span>
    has a list of user topics. User topics can have optional user
    preferences.
  - <span class="twiki-macro TWIKIWEB"></span>.TWikiVariables has a list
    of common `%<nop>VARIABLES%`.
  - <span class="twiki-macro TWIKIWEB"></span>.TWikiAccessControl
    explains how to restrict access by users or groups.
