# URN (jUCMNav) Metamodels

<span class="twiki-macro TOC"></span>

## NOTES

### New XMI Serialization

As of jUCMNav 5.5, the XMI serialization of URN models (in `.jucm`
files) uses identifiers (ID field) as pointers rather than XPath
expressions, whenever IDs are available. For example:

    <links xsi:type="grl:Decomposition" id="63" name="Decomposition63" refs="//@urndef/@specDiagrams.0/@connections.0" 
                                                                                         dest="//@grlspec/@intElements.0" src="//@grlspec/@intElements.2"/>

    <links xsi:type="grl:Decomposition" name="Decomposition63" id="63" refs="//@urndef/@specDiagrams.0/@connections.0" dest="22" src="41"/>

because connections do not have IDs whereas intentional elements do.

### jUCMNav Metamodel vs. URN Standard Metamodel

The jUCMNav metamodel differs from the URN (Z.151) standard in a number
of ways. See:

  - [Z.151 URN standard
    metamodel](Z.151URNStandardMetamodel)
  - [Key Differences](KeyDifferences) between the standard metamodel and jUCMNav's.

## Download the Latest jUCMNav Metamodel, Version (0.29)

  - In [Rational Rose (.mdl)](%ATTACHURL%/URN_29.mdl) format
  - [Documentation](http://www.site.uottawa.ca/~damyot/urn/URNMetamodelHTML/index.html)
    in HTML (for all browsers)
  - [Documentation](http://www.site.uottawa.ca/~damyot/urn/URNMetamodelHTML/oldindex.html)
    in HTML (original applet-based Rose index, see \<a href
    ="\#WARNING"\>WARNING\</a\>)
  - All documentation as a [ZIP
    file](http://www.site.uottawa.ca/~damyot/urn/URNMetamodelHTML.zip)
  - *Note*: Several colours for classes are used in this model:
      - Green: New in this version (since the last major release)
      - Blue: Interface
      - Yellow: Not used by jUCMNav at the moment
      - Pink: Deprecated
      - Additional comments identify deprecated attributes.

# Recent Changes to the jUCMNav Metamodel

### URN\_29.mdl

Major updates to the ASD, FM, and CORE packages ASDspec is now optional
in URNspec

\-- Main.DanielAmyot - 23 Sep 2015

### URN\_28.mdl

EvaluationStrategy now has a type:StrategyType attribute, defaulted to
Private (other possible values: Default, Public, Selected)

\-- Main.DanielAmyot - 29 Jun 2015

### URN\_27.mdl

Added CORE, FM, and ASD packages, and all their content. Also connected
the new model elements of these packages to the ones previously existing
in the metamodel.

\-- Main.DanielAmyot - 05 Aug 2014

### URN\_26.mdl

Skipped (internal development).

### URN\_25.mdl

KPIEvalValueSet can now support qualitative KPIs \* Added KPIConversion,
QualitativeMappings, and QualitativeMapping (in package GRL::KPIModel)
\* Added qualitativeEvaluationValue attribute to KPIEvalValueSet \*
Added exceeds attribute to Evaluation.

Added importance and importanceQuantitative attributes to Actor

\-- Main.DanielAmyot - 22 Sep 2012

### URN\_24.mdl

EvaluationStrategy (in package GRL) can now include other strategies
(similar to scenarios)

  - Added self-association (parentStrategies, 0..\* --
    includedStrategies, 0..\*)

ContributionContext (in package GRL) can now include other contexts
(similar to scenarios)

  - Added self-association (parentContexts, 0..\* -- includedContexts,
    0..\*)

Added in package GRL:

  - EvaluationRange (for sensitivity analysis).
  - Composition from Evaluation (eval, 1) to EvaluationRange (evalRange,
    0..1)
  - ContributionRange (for sensitivity analysis).
  - Composition from ContributionChange (change, 1) to ContributionRange
    (contribRange, 0..1)
  - KPINewEvalValue (for strategy inclusion)
  - Composition from Evaluation (eval, 1) to KPINewEvalValue
    (kpiNewEvalValue, 0..1)

\-- Main.DanielAmyot - 06 Apr 2012

### URN\_23.mdl

Concern (in package URNcore), for better alignment with Z.151

  - Added new association between Concern (inconcern, 0..1) and
    URNmodelElement (elements, 0..\*)

Responsibility Bindings (in package UCM.map), to allow any
responsibility definition to be used in such bindings

  - Removed association between RespRef (parentResp, 0..1) and
    ResponsibilityBinding (parentBindings, 0..\*)
  - Added association between Responsibility (parentResp, 0..1) and
    ResponsibilityBinding (parentBindings, 0..\*)

Performance (in package UCM.Performance), for better alignment with
Z.151

  - Added enumeration class TimeUnit
  - Added new attribute unit:TimeUnit=ms to Workload
  - Added new attribute unit:TimeUnit=ms to ActiveResource

\-- Main.DanielAmyot - 21 Dec 2009

### URN\_22.mdl

Aspects (in package UCM.map)

  - Removed FailureStartPoint class and its association to Condition (no
    deprecation needed)
  - Added None value to FailureKind
  - Added new attribute failureKind:FailureKind=None to StartPoint

\-- Main.DanielAmyot - 07 Dec 2009

### URN\_21.mdl

Diagram (in package UCM.map)

  - Split Maplinks into two diagrams (Maplinks and PluginBindings)
  - Updated color coding and commented deprecated attributes/classes

Aspects (in package UCM.map)

  - Added enumeration classes AspectKind and PointcutKind
  - Added class Anything (subclass of PathNode)
  - Added new aopointcut and aspect attributes to Stub
      - Note: the old pointcut attribute (boolean) is now deprecated
  - Added new threshold attribute to NodeConnection
  - Added new association between InBinding (inBindingsPlugin, 0..\*)
    and NodeConnection (pointcutExit, 0..1)
  - Added new association between OutBinding (outBindingsPlugin, 0..\*)
    and NodeConnection (pointcutEntry, 0..1)
  - Changed multiplicity of association between InBinding and StartPoint
    (role startPoint) from 1 to 0..1
  - Changed multiplicity of association between OutBinding and EndPoint
    (role endPoint) from 1 to 0..1
  - Added new local attribute to StartPoint and EndPoint

Failures (in package UCM.map)

  - Added enumeration class FailureKind
  - Added classes FailurePoint and FailureStartPoint (subclasses of
    PathNode)
  - Added aggregation from FailureStartPoint to Condition

Responsibility bindings (in packages URNcore and UCM.map)

  - Added new context attribute to Responsibility
  - Added class ResponsibilityBinding
  - Added aggregation from PluginBinding to ResponsibilityBinding
  - Added 2 associations between ResponsibilityBinding and RespRef

\-- Main.DanielAmyot - 03 Dec 2009

### URN\_20.mdl

Small modifications for better alignment with Z.151

  - Added new class Comment (comment box) for GRL and UCM diagrams
    (connected to IURNdiagram)
  - Added WaitKind enumeration (used by WaitingPlace)
  - Added Xor to GRL DecompositionType.

\-- Main.DanielAmyot - 29 Jun 2009

### URN\_19.mdl

  - Many modifications were done to clean the metamodel and align it
    with the draft URN standard.
  - See
    <http://jucmnav.softwareengineering.ca/twiki/bin/view/UCM/DraftRevisedMetamodel>
    for details

\-- Main.DanielAmyot - 15 Feb 2008

See also the discussions and changes to [older URN metamodel
versions](URNMetaModelOld).

## Rose Files for EMF Conversion from URN Metamodel

A few things need to be considered when updating this metamodel:

  - Multiplicities and (private) role names are required for all
    navigatable association ends
  - Java data types for the attributes (Etienne seems to infer that Date
    does not work)
  - All classes have to be included (aggregation) directly or indirectly
    in the URNspec class.

# UCM Scenarios Metamodel

This is the metamodel (Rose file) used in the MSC export / MSC viewer
based on the UCM scenario definitions and traversal mechanism.

Version 2 now has Metadata that can optionally be included in
ModelElement objects.

\<img src="%ATTACHURLPATH%/ScenariosMetamodel-2.png"
alt="ScenariosMetamodel-2.png" width='502' height='548' /\> \<img
src="%ATTACHURLPATH%/ScenariosMetamodel-1.png"
alt="ScenariosMetamodel-1.png" width='618' height='292' /\>

  - [Scenarios2.mdl](%ATTACHURL%/Scenarios2.mdl): UCM Scenarios
    Metamodel
  - [Documentation](http://www.site.uottawa.ca/~damyot/urn/ScenariosMetamodelHTML/index.html)
    in HTML (for all browsers)
  - [Documentation](http://www.site.uottawa.ca/~damyot/urn/ScenariosMetamodelHTML/oldindex.html)
    in HTML (original applet-based Rose index, see \<a href
    ="\#WARNING"\>WARNING\</a\>)
  - All documentation as a [ZIP
    file](http://www.site.uottawa.ca/~damyot/urn/ScenariosMetamodelHTML.zip)

## WARNING

There has been reports that the original (Rational Rose) HTML version of
these metamodels cannot be read properly by common browsers. One issue
is that these files include a Java applet. Be sure that your JRE is
compatible with your browser (i.e., 32-bit versions of IE9 and Firefox
require a 32-bit Java Runtime Environment). If you have a 64-bit JRE,
one option that works well is to use
[Waterfox](http://waterfoxproject.org/).

In addition, you may have to adjust the settings of your Java
environment (JRE security) to let the applet run, either locall, or from
uOttawa:

1\) Go to your Configure Java application:

\<img src="%ATTACHURLPATH%/Java-sec-menu.png" alt="Java-sec-menu.png"
width='243' height='122' /\>

2\) Add <http://www.site.uottawa.ca> (or whatever site where the
documentation is located):

\<img src="%ATTACHURLPATH%/java-security.png" alt="Java-sec-dialog.png"
width='528' height='568' /\>

3\) When accessing the documentation, you will also need to let the
application run:

\<img src="%ATTACHURLPATH%/Java-sec-dialog.png"
alt="Java-sec-dialog.png" width='901' height='406' /\>

\-- Main.DanielAmyot - 02 Aug 2014
