I suggest the use of TWiki.TWikiForms for managing requirements. It
takes a while to figure them out, but once this is done they become very
powerful.

1. To create a Wiki form, you first need to create a table (in a new
topic page) that defines the fields, their types, etc.

  - Documentation: TWiki.TWikiForms
  - Example: [Form For Req](FormForReq) 
1. To enable this form, you need to add its name
    to the WEBFORMS field by editing WebPreferences (in your Wiki Web).
    Then, each time you edit a page, you will have the opportunity to
    add a form (there is a new button) from a list of forms and then
    input values for its fields.
  - See the current [Web Preferences](WebPreferences) 
1. To create an index table (with a
    subset of the fields), you need to write a SEARCH query. Note that
    the resulting table can be sorted by clicking (once or twice) on a
    column header.
 --  Documentation: TWiki.TWikiVariables\#VarSEARCH
 --  Example: [UCMNav Requirements](UCMNavRequirements) 
1. In such a query, one needs to provide
    the headers and format of the table and access the fields of the
    filled forms.
  - Documentation: [Formatted Search](FormattedSearch) 
1. Editing a form can only be
    done in a topic page. What is interesting is that we can use the
    Wiki topic page for capturing a discussion and the rationale for
    this requirement, on top of the form. The discussion can then be
    summarized by providing another search query. For instance:
  - Example: [Summary Of Req Discussions](SummaryOfReqDiscussions)

\-- Main.DanielAmyot - 16 Jan 2005
