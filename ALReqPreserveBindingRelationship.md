By default, this should also apply to empty points. The auto layout tool, however, could provide a setting to preserve or to not preserve bound empty points. Bound empty points only need to be preserved for a component if no other path nodes are bound to the same component. At the most one bound empty point needs to be preserved for each component.

The auto layout tool could offer three settings: 1) preserve all empty points, 2) do not preserve empty points, and 3) for each component preserve exactly one bound empty point if no other path nodes are bound to the same component.

-- Main.GunterMussbacher - 10 May 2005


Clarify 3 please.

-- Main.JasonKealey - 10 May 2005

Some users will use jUCMNav in a style where an empty point bound to a component has important semantics (e.g., this could imply communication with this component, or require that this resource be acquired and released, etc.). Option 1 means all the empty points are preserved (no matter if they are bound or not), with the same identifiers as before. Option 2 means the auto-layout mechanism can add/remove empty points as needed, and their identifiers could be different. Option 3 (which is likely to be the most useful for the aforementionned users) ensures that at least one path element in a sequence bound to a component remains bound to that component (this could be a responsibility, for instance, or an empty point if there are no other path elements bound to it). This is a bit tricky actually as one needs to check, for each empty point bound to a component, whether the next path element is also same component (if so, the first empty point can be removed). There is likely a need for something symmetrical if the empty point follows another path element in the same component.

-- Main.DanielAmyot - 10 May 2005

Just to clarify further: technically I was talking about component references, not components.

I agree with Daniel's explanation. I however would not perform a check for each empty point but perform a check for each component reference since a list of all elements bound to this component reference already exists in a UCM file.

BTW, option 3 does not mean that an empty point needs to be added to a component reference which has nothing bound to it. Such a component reference will remain empty.

-- Main.GunterMussbacher - 11 May 2005


After studying the problem a bit more, here are my thoughts.

   * OK for the three options, I understand why all three should exist. 
   * Should the empty nodes inserted by the auto-layout be bound to the components over which they are put? 
      * Following your discussion, I would think not, but this is not jUCMNav's default behaviour. 
      * If we think of the autolayout for trace-generated UCMs, this is not a problem, but if people use it for general purpose layout, it might be. If they use empty nodes for the aforementioned purposes, then the new empty nodes will have a special meaning for these users, and for the layout engine. If we don't bind them, the typical user will find it weird that a bunch of empty points were added but weren't bound.
   * strategy:
      * Daniel suggests graph traversal, looking for sequences of pathnodes that are bound to the same parent. 
      * Gunter suggests traversing the binding hierarchy. Take ComponentRef's children, filter out all but the empty points, check if is deletable (no properties set), look at immediate neighbours, if one of them is bound to the same parent, delete empty node.
         * (I didn't see this solution at first; am I seeing it correctly?)
   * Should preserve binding relationship between components and other components as well. 


-- Main.JasonKealey - 16 May 2005

The more I think about this, the more I believe this approach is doomed to fail. New empty points need to be bound somewhere (or not), and I think this will create problems no matter what solution is retained. The problem here is that we are trying to use empty points to make the layout easier on the eyes, and then we also want them to have semantics. I still think these are incompatible goals. Perhaps what we need is:

   * Empty points with no semantics (and no requirement to have at least one empty point between pairs of path elements)
   * Some sort of EmptyResponsibility path element (in essence, the type of node requested by Gunter but without all the overhead of real responsibility references), with its own symbol.

Comments?

-- Main.DanielAmyot - 17 May 2005

i agree that anything which falls into a component should be bound to it by default. in that sense, new empty points should be bound to the component over which they are put. there is one exception to that rule. if a component did not have anything bound to it, then there should not be anything bound to it after the auto-layout. in other words, it does not matter how many new emtpy points are being bound to a component as long as the component had something bound to it before!

this relates to what the auto-layout does with a component to which nothing is bound. what will happen in such a case? if we can guarantee that such a component would not have a path going through it than there is no problem.

i am not sure if it is necessary to define a new EmptyResponsibility path element. from my point of view, this is the empty point. i have been trying to think about a case where i had to draw a path through a component i did not want to. i can't think of one case in all the UCMs i have drawn. this may be different when auto-layout is applied to traces, but still as a user i would not want to see a path going through a component if nothing is happening in the trace with that component.

i agree, however, that the requirement to have at least one empty point between pairs of path elements is outdated. it seems that the major reason for such a requirement for UCMNav was to have something to click on if one needed to add another path node. this does not apply to jUCMNav which allows adding of path nodes at any place on the spline. there may be a need for empty points in some cases (e.g. i don't know how jUCMNav deals with forks. UCMNav stores information about the branches with empty points and not with the fork).

jason's description of the strategy "traversing the binding hierarchy" is what i had in mind.

i agree, the binding relationship between components and components should be preserved as well. i updated the requirement description.

-- Main.GunterMussbacher - 17 May 2005

Right now, any element I insert on a path will be bound to its parent but I could code in this rule for auto-layout purposes, if it was desired.  

I cannot guarantee that no path will fly over a component even though no path elements aren't bound to it. I think dot tries to achieve this but there is no guarantee. Furthermore, the splines generated by dot are cubic and those used by jUCMNav are Bezier.... We don't have exactly the same curves (and that's the whole point of adding empty points: making the curve appear more like the cubic one), so one might overlap a component. 

If this is what we want, I can at least ensure that I don't add any empty points on curves that pass over components.

I have to agree with Daniel about the EmptyResponsibilities. As a newcomer to UCMs, I have trouble understanding why one would not simply use a responsibility to achieve this purpose but my second pick would be Daniel's solution. Imagine the documentation for the empty point if used as described by Gunter ... "it does absolutely nothing except guide the path .. unless it is bound to a component, in which case it indicates the path goes through the component and performs such work that is too trivial to add a responsibility but that you still want to show." 

The simple solution, in my mind, is to simply have "Manipulate empty points? (true/false)" in the auto-layout wizard. If true, I remove all empty points with no properties (name/label), layout, insert a couple of empty points here and there to try and respect the cubic spline, binding them to the component they pass over. If false, I do as my first prototype does: treat all empty points as regular path nodes, don't add any new ones. 

-- Main.JasonKealey - 17 May 2005

What should we do with plug-in maps?  Assume 3 components C1, C2, C3.  Start and Resp1 are in C1, Empty1 in C2, and Resp2 and End in C3.  If new empty points are added, can they be added outside the components? If so, does this mean something w.r.t. the component of the parent map that contains the stub where this plug-in is used?

-- Main.DanielAmyot - 17 May 2005

i agree with jason that we do not need another type of responsibility. if the action is that important, than one can always use a proper responsiblity. however, it's not quite that simple. the case i am talking about is where it is important to show that there is another component involved but what the component does is either so well understood or trivial or not understood at all that it does not warrant a responsibility. it just clutters the diagram. in this case, the empty point is important because it is the only technical way to convey that the path through the component has been drawn on purpose.

i understand that this causes problems for the auto-layout. my suggestion is to keep the three options, bind all newly created empty points to whichever components they fall into, BUT highlight components which did not have anything bound to them before but now do, so that the user can make a decision on whether to keep certain empty points or not. how difficult would this be?

regarding the plug-in problem: i think the proper way to deal with this problem is to explicitly show the "parent" component on the plug-in map. then, the same rules apply (if there is no path node bound to the parent component then there should not be any after auto-layout).

BTW, if component A contains only components then empty points still should not be bound to component A.

-- Main.GunterMussbacher - 17 May 2005

regarding the plug-in problem: I think this will severely restrict the auto-layout capabilities to generate something useful and readable.

-- Main.DanielAmyot - 17 May 2005

[[img/ALReqPreserveBindingRelationship.PNG]]
