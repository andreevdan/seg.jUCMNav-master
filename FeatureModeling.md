# Feature Modeling

jUCMNav supports combined feature and goal modeling as well as analysis
by defining feature models as a special case of goal models. Feature and
goal models are analyzed together at the same time using the *Feature
Model Strategy Algorithm*. First, select the "Feature Model Strategy
Algorithm" in the jUCMNav preferences (top menu: Window - Preferences -
jUCMNav - GRL Strategy Evaluation Algorithm - GRL Evaluation Algorithm
Select = Feature Model Strategy Algorithm; GRL Evaluation Algorithm
Tolerance = 0; check Automatically select mandatory features). Right
click the background of the editor and select "Add Feature Model
diagram" to create a feature model diagram. Then, add models elements to
the feature model with the help of the new palette:


The contribution values of mandatory or optional links are not set by
the modeler. The *Feature Model Strategy Algorithm* will set these
values automatically to preserve the semantics of mandatory and optional
links.

Features can be used directly in goal models to capture the impact of
features on high-level goals and system qualities:


Scenario models describe features in more detail (e.g., the Password
feature is added to this scenario model):


The variable "\_GRL\_Password" enables feature configurations to be
synchronized with scenario models. In this case, if the feature Password
is selected (i.e., its evaluation value equals 100), then the branch
with the Password stub is chosen when traversing the scenario model.
Feature configurations are defined with the help of GRL strategies.
Switch to the jUCMNav Execution perspective to define and evaluate
strategies. When a strategy is evaluated, the strategy algorithm
verifies whether the configuration is valid:


Several strategies can be compared against each other in terms of
whether the feature configuration is valid and in terms of the impact of
the configuration on goal model elements:


With the help of the variables mentioned earlier, the feature
configuration also influences the traversal of the scenario model:


The *Feature Model Strategy Algorithm* can be set to automatically
select mandatory features:


