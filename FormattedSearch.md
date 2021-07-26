<span class="twiki-macro STARTINCLUDE"></span>

# Formatted Search

*Inline search feature allows flexible formatting of search result*

The default output format of a `[[VarSEARCH][%<nop>SEARCH{...}%]]` is a
table consisting of topic names and topic summaries. Use the
`format="..."` parameter to customize the search result. The format
parameter typically defines a bullet or a table row containing macros,
such as `%<nop>SEARCH{ "food" format="| $topic | $summary |" }%`. See
`[[VarSEARCH][%<nop>SEARCH{...}%]]` for other search parameters, such as
`separator=""`.

<span class="twiki-macro TOC"></span>

## Syntax

Two parameters can be used to specify a customized search result:

### 1\. `header="..."` parameter

Use the header parameter to specify the header of a search result. It
should correspond to the format of the format parameter. This parameter
is optional. \<br /\> Example: `header="| <nop>*Topic:*<nop> |
<nop>*Summary:*<nop> |"`

Format tokens that can be used in the header string:

| Name:  | Expands To:     |
| :----- | :-------------- |
| `$web` | Name of the web |

<span class="twiki-macro INCLUDE">FormatTokens</span>

### 2\. `footer="..."` parameter

Use the footer parameter to specify the footer of a search result. It
should correspond to the format of the format parameter. This parameter
is optional. \<br /\> Example: `footer="| <nop>*Topic*<nop> |
<nop>*Summary*<nop> |"`

Format tokens that can be used in the footer string:

| Name:      | Expands To:                                                                                                                    |
| :--------- | :----------------------------------------------------------------------------------------------------------------------------- |
| `$web`     | Name of the web                                                                                                                |
| `$ntopics` | Number of topics found in current web                                                                                          |
| `$nhits`   | Number of hits if `multiple="on"`. Cumulative across all topics in current web. Identical to `$ntopics` unless `multiple="on"` |

<span class="twiki-macro INCLUDE">FormatTokens</span>

### 3\. `format="..."` parameter

Use the format parameter to specify the format of one search hit. \<br
/\> Example: `format="| $topic | $summary |"`

Format tokens that can be used in the format string:

<table>
<thead>
<tr class="header">
<th style="text-align: left;">Name:</th>
<th style="text-align: left;">Expands To:</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td style="text-align: left;"><code>$web</code></td>
<td style="text-align: left;">Name of the web</td>
</tr>
<tr class="even">
<td style="text-align: left;"><code>$topic</code></td>
<td style="text-align: left;">Topic name</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><code>$topic(20)</code></td>
<td style="text-align: left;">Topic name, "&lt;tt&gt;- &lt;/tt&gt;" hyphenated each 20 characters</td>
</tr>
<tr class="even">
<td style="text-align: left;"><code>$topic(30, -&lt;br /&gt;)</code></td>
<td style="text-align: left;">Topic name, hyphenated each 30 characters with separator "&lt;tt&gt;-&lt;br /&gt;&lt;/tt&gt;"</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><code>$topic(40, ...)</code></td>
<td style="text-align: left;">Topic name, shortended to 40 characters with "&lt;tt&gt;...&lt;/tt&gt;" indication</td>
</tr>
<tr class="even">
<td style="text-align: left;"><code>$parent</code></td>
<td style="text-align: left;">Name of parent topic; empty if not set</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><code>$parent(20)</code></td>
<td style="text-align: left;">Name of parent topic, same hyphenation/shortening like <code>$topic()</code></td>
</tr>
<tr class="even">
<td style="text-align: left;"><code>$text</code></td>
<td style="text-align: left;">Formatted topic text. In case of a <code>multiple="on"</code> search, it is the line found for each search hit.</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><code>$locked</code></td>
<td style="text-align: left;">LOCKED flag (if any)</td>
</tr>
<tr class="even">
<td style="text-align: left;"><code>$date</code></td>
<td style="text-align: left;">Time stamp of last topic update, e.g. <code>%GMTIME{"$day $mon $year - $hour:$min"}%</code></td>
</tr>
<tr class="odd">
<td style="text-align: left;"><code>$isodate</code></td>
<td style="text-align: left;">Time stamp of last topic update, e.g. <code>%GMTIME{"$year-$mo-$dayT$hour:$minZ"}%</code></td>
</tr>
<tr class="even">
<td style="text-align: left;"><code>$rev</code></td>
<td style="text-align: left;">Number of last topic revision, e.g. <code>4</code></td>
</tr>
<tr class="odd">
<td style="text-align: left;"><code>$username</code></td>
<td style="text-align: left;">Login name of last topic update, e.g. <code>jsmith</code></td>
</tr>
<tr class="even">
<td style="text-align: left;"><code>$wikiname</code></td>
<td style="text-align: left;">Wiki user name of last topic update, e.g. <code>&lt;nop&gt;JohnSmith</code></td>
</tr>
<tr class="odd">
<td style="text-align: left;"><code>$wikiusername</code></td>
<td style="text-align: left;">Wiki user name of last topic update, like <code>%USERSWEB%.&lt;nop&gt;JohnSmith</code></td>
</tr>
<tr class="even">
<td style="text-align: left;"><code>$createdate</code></td>
<td style="text-align: left;">Time stamp of topic revision 1</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><code>$createusername</code></td>
<td style="text-align: left;">Login name of topic revision 1, e.g. <code>jsmith</code></td>
</tr>
<tr class="even">
<td style="text-align: left;"><code>$createwikiname</code></td>
<td style="text-align: left;">Wiki user name of topic revision 1, e.g. <code>&lt;nop&gt;JohnSmith</code></td>
</tr>
<tr class="odd">
<td style="text-align: left;"><code>$createwikiusername</code></td>
<td style="text-align: left;">Wiki user name of topic revision 1, e.g. <code>%USERSWEB%.&lt;nop&gt;JohnSmith</code></td>
</tr>
<tr class="even">
<td style="text-align: left;"><code>$summary</code></td>
<td style="text-align: left;">Topic summary, just the plain text, all formatting and line breaks removed; up to 162 characters</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><code>$summary(50)</code></td>
<td style="text-align: left;">Topic summary, up to 50 characters shown</td>
</tr>
<tr class="even">
<td style="text-align: left;"><code>$summary(showvarnames)</code></td>
<td style="text-align: left;">Topic summary, with <code>%&lt;nop&gt;SOMEMACRO{...}%</code> macros shown as <code>SOMEMACRO{...}</code></td>
</tr>
<tr class="odd">
<td style="text-align: left;"><code>$summary(noheader)</code></td>
<td style="text-align: left;">Topic summary, with leading <code>---+ headers</code> removed<br />
<strong>Note:</strong> The tokens can be combined, for example <code>$summary(100, showvarnames, noheader)</code></td>
</tr>
<tr class="even">
<td style="text-align: left;"><code>$changes</code></td>
<td style="text-align: left;">Summary of changes between latest rev and previous rev</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><code>$changes(n)</code></td>
<td style="text-align: left;">Summary of changes between latest rev and rev n</td>
</tr>
<tr class="even">
<td style="text-align: left;"><code>$formname</code></td>
<td style="text-align: left;">The name of the form attached to the topic; empty if none</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><code>$formfield(name)</code></td>
<td style="text-align: left;">The field value of a form field; for example, <code>$formfield(&lt;nop&gt;TopicClassification)</code> would get expanded to <code>PublicFAQ</code>. This applies only to topics that have a <a href="DataForms">DataForm</a></td>
</tr>
<tr class="even">
<td style="text-align: left;"><code>$formfield(name, 10)</code></td>
<td style="text-align: left;">Form field value, "&lt;tt&gt;- &lt;/tt&gt;" hyphenated each 10 characters</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><code>$formfield(name, 20, -&lt;br /&gt;)</code></td>
<td style="text-align: left;">Form field value, hyphenated each 20 characters with separator "&lt;tt&gt;-&lt;br /&gt;&lt;/tt&gt;"</td>
</tr>
<tr class="even">
<td style="text-align: left;"><code>$formfield(name, 30, ...)</code></td>
<td style="text-align: left;">Form field value, shortended to 30 characters with "&lt;tt&gt;...&lt;/tt&gt;" indication</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><code>$pattern(reg-exp)</code></td>
<td style="text-align: left;">A regular expression pattern to extract some text from a topic (does not search meta data; use <code>$formfield</code> instead). In case of a <code>multiple="on"</code> search, the pattern is applied to the line found in each search hit.<span class="twiki-macro BB"></span> Specify a RegularExpression that covers the whole text (topic or line), which typically starts with <code>.*</code>, and must end in <code>.*</code> <span class="twiki-macro BB"></span> Put text you want to keep in parenthesis, like <code>$pattern(.*?(from here.*?to here).*)</code> <span class="twiki-macro BB"></span> Example: <code>$pattern(.*?\*.*?Email\:\s*([^\n\r]+).*)</code> extracts the e-mail address from a bullet of format <code>* Email: ...</code> <span class="twiki-macro BB"></span> This example has non-greedy <code>.*?</code> patterns to scan for the first occurance of the Email bullet; use greedy <code>.*</code> patterns to scan for the last occurance <span class="twiki-macro BB"></span> Limitation: Do not use <code>.*)</code> inside the pattern, e.g. <code>$pattern(.*foo(.*)bar.*)</code> does not work, but <code>$pattern(.*foo(.*?)bar.*)</code> does <span class="twiki-macro BB"></span> Note: Make sure that the integrity of a web page is not compromised; for example, if you include an HTML table make sure to include everything including the table end tag</td>
</tr>
<tr class="even">
<td style="text-align: left;"><code>$count(reg-exp)</code></td>
<td style="text-align: left;">Count of number of times a regular expression pattern appears in the text of a topic (does not search meta data). Follows guidelines for use and limitations outlined above under <code>$pattern(reg-exp)</code>. Example: <code>$count(.*?(---[+][+][+][+]) .*)</code> counts the number of &lt;H4&gt; headers in a page.</td>
</tr>
<tr class="odd">
<td style="text-align: left;"><code>$ntopics</code></td>
<td style="text-align: left;">Number of topics found in current web. This is the current topic count, not the total number of topics</td>
</tr>
<tr class="even">
<td style="text-align: left;"><code>$nhits</code></td>
<td style="text-align: left;">Number of hits if <code>multiple="on"</code>. Cumulative across all topics in current web. Identical to <code>$ntopics</code> unless <code>multiple="on"</code></td>
</tr>
</tbody>
</table>

<span class="twiki-macro INCLUDE">FormatTokens</span>

## Examples

Here are some samples of formatted searches. The SearchPatternCookbook
has other examples, such as [creating a picklist of
usernames](SearchPatternCookbook#SearchUsernames), [searching for topic
children](SearchPatternCookbook#SearchTopicChildren) and more.

\#SearchBulletList

### Bullet list showing topic name and summary

**Write this:**

`%<nop>SEARCH{ "VarREMOTE" scope="topic" nosearch="on" nototal="on"
header="| <nop>*Topic* | <nop>*Summary* |" format="| [<nop>[$topic]] |
$summary |" footer="| <nop>*Topics found* | <nop>*$ntopics* |" }%`

**To get this:**

<span class="twiki-macro SEARCH" scope="topic" data-nosearch="on" data-nototal="on" data-header="| *Topic* | *Summary* |" data-format="| [[$topic]] | $summary |" data-footer="| *Topics found* | *$ntopics* |">VarREMOTE</span>

### Table showing form field values of topics with a form

In a web where there is a form that contains a
`Topic<nop>Classification` field, an `Operating<nop>System` field and an
`Os<nop>Version` field we could write:

`| <nop>*Topic:*<nop> | <nop>*<nop>OperatingSystem:*<nop> |
<nop>*<nop>OsVersion:*<nop> |` \<br /\> `%<nop>SEARCH{
"[T]opicClassification.*?value=\"[P]ublicFAQ\"" scope="text"
type="regex" nosearch="on" nototal="on" format="| [<nop>[$topic]] |
$formfield(<nop>OperatingSystem) | $formfield(<nop>OsVersion) |" }%`

To get this:

\<table border="1" cellspacing="0" cellpadding="1"\> \<tr\> \<th
bgcolor="\#99CCCC"\> **Topic:** \</th\> \<th bgcolor="\#99CCCC"\>
**OperatingSystem:** \</th\> \<th bgcolor="\#99CCCC"\> **OsVersion:**
\</th\>\</tr\> \<tr\> \<td\> \<a
href="<span class="twiki-macro SCRIPTURLPATH">view</span>/Sandbox/IncorrectDllVersionW32PTH10DLL"\>IncorrectDllVersionW32PTH10DLL\</a\>
\</td\>\<td\> \<a
href="<span class="twiki-macro SCRIPTURLPATH">view</span>/Sandbox/OsWin"\>OsWin\</a\>
\</td\>\<td\> 95/98 \</td\>\</tr\> \<tr\> \<td\> \<a
href="<span class="twiki-macro SCRIPTURLPATH">view</span>/Sandbox/WinDoze95Crash"\>WinDoze95Crash\</a\>
\</td\> \<td\> \<a
href="<span class="twiki-macro SCRIPTURLPATH">view</span>/Sandbox/OsWin"\>OsWin\</a\>
\</td\> \<td\> 95 \</td\>\</tr\> \</table\>

### Extract some text from a topic using regular expression

**Write this:**

`%<nop>SEARCH{ "\*Back to:\* <nop>FrequentlyAskedQuestions" scope="text"
type="regex" nosearch="on" nototal="on" header="FAQs:" format=" *
$pattern(.*?FAQ\:[\n\r]*([^\n\r]+).*) [<nop>[$topic][Answer...]]"
footer="Found $ntopics FAQ topics" }%`

**To get this:**

<span class="twiki-macro SEARCH" scope="text" type="regex" data-nosearch="on" data-nototal="on" data-header="FAQs:" data-format="&quot;">\\\*Back
to:\\\* FrequentlyAskedQuestions \*
$pattern(.\*?FAQ\\:\[\\n\\r\]\*(\[^\\n\\r\]+).\*)
\[\[$topic\]\[Answer...\]\]" footer="Found $ntopics FAQ topics" </span>

### Nested Search

Search can be nested. For example, search for some topics, then form a
new search for each topic found in the first search. The idea is to
build the nested search string using a formatted search in the first
search.

Here is an example. Let's search for all topics that contain the word
"culture" (first search), and let's find out where each topic found is
linked from (second search).

  - First search:
      - `%<nop>SEARCH{ "culture" format=" * $topic is referenced by:
        (list all references)" nosearch="on" nototal="on" }%`
  - Second search. For each hit we want this search:
      - `%<nop>SEARCH{ "(topic found in first search)" format="$topic"
        nosearch="on" nototal="on" separator=", " }%`
  - Now let's nest the two. We need to escape the second search, e.g.
    the first search will build a valid second search string. Note that
    we escape the second search so that it does not get evaluated
    prematurely by the first search:
      - Use `$percnt` to escape the leading percent of the second search
      - Use `\"` to escape the double quotes
      - Use `$dollar` to escape the `$` of `$topic`
      - Use `$nop` to escape the `}%` sequence

**Write this:**

`%<nop>SEARCH{ "culture" format=" * $topic is referenced by:$n *
$percntSEARCH{ \"$topic\" format=\"$dollartopic\" nosearch=\"on\"
nototal=\"on\" separator=\", \" }$nop%" nosearch="on" nototal="on" }%`

**To get this:**

%SEARCH{ "culture" format=" \* $topic is referenced by:$n \*
$percntSEARCH{ \\"$topic\\" format=\\"$dollartopic\\" nosearch=\\"on\\"
nototal=\\"on\\" separator=\\", \\" }$nop%" nosearch="on" nototal="on"
}%

**Note:** Nested search can be slow, especially if you nest more then 3
times. Nesting is limited to 16 levels. For each new nesting level you
need to "escape the escapes", e.g. write `$dollarpercntSEARCH{` for
level three, `$dollardollarpercntSEARCH{` for level four, etc.

### Most recently changed pages

**Write this:**

`%<nop>SEARCH{ "\.*" scope="topic" type="regex" nosearch="on"
nototal="on" order="modified" reverse="on" format="| [<nop>[$topic]] |
$wikiusername | $date |" limit="7" }%`

**To get this:**

<span class="twiki-macro SEARCH" scope="topic" type="regex" data-nosearch="on" data-nototal="on" data-order="modified" data-reverse="on" data-format="| [[$topic]] | $wikiusername  | $date |" data-limit="7">\\.\*</span>

### Search with conditional output

A regular expression search is flexible, but there are limitations. For
example, you cannot show all topics that are up to exactly one week old,
or create a report that shows all records with invalid form fields or
fields within a certain range, etc. You need some additional logic to
format output based on a condition:

1.  Specify a search which returns more hits then you need
2.  For each search hit apply a spreadsheet formula to determine if the
    hit is needed
3.  If needed, format and output the result
4.  Else supress the search hit

This requires the Foswiki:Extensions.SpreadSheetPlugin. The following
example shows all topics that are up to exactly one week old.

**Write this:**

`%<nop>CALC{$SET(weekold, $TIMEADD($TIME(), -7, day))}%`  
`%<nop>SEARCH{ "." scope="topic" type="regex" nosearch="on" nototal="on"
order="modified" reverse="on" format="$percntCALC{$IF($TIME($date) <
$GET(weekold), <nop>, | [<nop>[$topic]] | $wikiusername | $date | $rev
|)}$percnt" limit="100" }%`

  - The first line sets the `weekold` variable to the serialized date of
    exactly one week ago
  - The SEARCH has a deferred CALC. The `$percnt` makes sure that the
    CALC gets executed once for each search hit
  - The CALC compares the date of the topic with the `weekold` date
  - If topic is older, a `<nop>` is returned, which gets removed at the
    end of the rendering process
  - Otherwise, the search hit is formatted and returned

**To get this:**

<span class="twiki-macro CALC">$SET(weekold, $TIMEADD($TIME(), -7,
day))</span>
<span class="twiki-macro SEARCH" scope="topic" type="query" data-nosearch="on" data-nototal="on" data-order="modified" data-reverse="on" data-format="$percntCALC{$IF($TIME($date) &lt; $GET(weekold), &lt;nop&gt;, | [[$topic]] | $wikiusername | $date | $rev |)}$percnt" data-limit="100">'1'</span>

### Embedding search forms to return a formatted result

Use an HTML form and an embedded formatted search on the same topic. You
can link them together with an `%<nop>URLPARAM{"..."}%` macro. Example:

**Write this:**

    <form action="%SCRIPTURLPATH{"view"}%/%WEB%/%TOPIC%">
    Find Topics: 
    <input type="text" name="q" size="32" value="%URLPARAM{"q" encode="entity"}%" />&nbsp;<input type="submit" class="foswikiSubmit" value="Search" />
    </form>
    Result:
    %SEARCH{ search="%URLPARAM{"q" encode="quote"}%" type="keyword" format="   * $web.$topic: %BR% $summary" nosearch="on" }%

**To get this:**

\<form
action="<span class="twiki-macro SCRIPTURLPATH">view</span>/%WEB%/%TOPIC%"\>
Find Topics: \<input type="text" name="q" size="32"
value="<span class="twiki-macro URLPARAM" data-encode="entity">q</span>"
/\> \<input type="submit" class="foswikiSubmit" value="Search" /\>
\</form\> Result:
<span class="twiki-macro SEARCH" data-search="%URLPARAM{">q"
encode="quote"</span>" type="keyword" format=" \* $web.$topic:  
$summary" nosearch="on" }%

-----

**Related Topics:** UserDocumentationCategory, SearchHelp,
[Macros\#VarSEARCH](%SYSTEMWEB%.Macros#VarSEARCH),
SearchPatternCookbook, RegularExpression
