Components of a plug-in map may be defined as abstract. In this case, they are merged with parent components when the plug-in is used in a stub. Which component on the map of the stub is merged with an abstract component on the plug-in map is defined in the plug-in binding for the stub and plug-in. For continuity reasons to earlier versions of UCMs, the default behavior of stubs and plug-in maps should remain the same. Therefore, the following behavior is desired:

   1. If there are no abstract components specified in the plug-in map, then there is no need to specify plug-in bindings for components.
   1. If there are abstract components specified in the plug-in map, there is still no need to specify plug-in bindings for components. The traversal mechanism, however, should issue warnings if an abstract component is encountered for which merging information is not available.
   1. If there is only one abstract component on a plug-in map, the keyword **parent** can be used as the name for the component. In this case, there is still no need to specify plug-in bindings for components but the traversal mechanism will use the component to which the stub is bound for merging with the abstract component (i.e. the plug-in bindings are automatically inferred from the plug-in map and shown in the plug-in bindings UI).
   1. If there are more than one abstract component on the plug-in map, the plug-in binding for components is necessary to define which component is merged with an abstract component on the plug-in map.

-- Main.GunterMussbacher - 22 Mar 2007

[[img/SEMReqAbstractComponents.PNG]]
