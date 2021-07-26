Scenario definitions can become quite complex themselves. As the model evolve (by adding/removing start points and variables), much effort may be spent on modifying scenario definitions as well. Extending scenario definitions should minimize such maintenance issues. -- Daniel Amyot - 29 Jan 2005

We will need a quick demo to explain what you really mean here. -- Jason Kealey - 03 Feb 2005

This is not supported by UCMNav right now, so the demo will have to wait...! In essence, a scenario definition has a name (ex: ScenarioA), a description, a list of variable initializations (ex: X=T, Y=F), a list of start points (ex: S1, S2), and (optionally) a postcondition. What I would like is to be able to "inherit" the definition of a scenario to create another scenario (by adding initializations and start points). For instance, ScenarioB is ScenarioA but where Z=F, and where we add S3 to the list of start points. In a sense, ScenarioA is a prefix of ScenarioB. This can help manage long scenarios and complex groups of scenarios. -- Daniel Amyot - 13 Feb 2005 

[[img/ReqGoalCompositeScenarios.PNG]]