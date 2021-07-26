# Edit Policies

## Overview

As you know, the controller in GEF's MVC architecture is the EditPart.
In a nutshell, edit policies are attached to editparts to provide
behaviour. Because multiple edit parts can reference the same model
element (in different views), edit policies are useful in the sense that
they can be re-used for different editparts.

## Setup

One usually attaches an editpolicy on an editpart by implementing its
createEditPolicies() method and invoking installEditPolicy().

Example from PathNodeEditPart:

``` 
    protected void createEditPolicies() {
        // install the edit policy to handle connection creation
        installEditPolicy(EditPolicy.COMPONENT_ROLE, new PathNodeComponentEditPolicy());
        installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, new PathNodeNonResizableEditPolicy());
        installEditPolicy(EditPolicy.LAYOUT_ROLE, new PathNodeXYLayoutEditPolicy());
    }
```

Note that when installing an edit policy, one needs to specify a role.
The help contents provides a good overview for all the different roles.
Here are a few useful definitions extracted from the help.

  - EditPolicy

An EditPolicy provides a specific editing role to an EditPart. A Role
might be something like "layout management". That policy's role is
loosely defined by the Requests which it understands. An EditPart
iterates over all of its EditPolicies to handle Requests. EditPolicies
ignore the Requests that don't apply to them.

  - Roles

An EditPolicy is installed into its EditPart using a String identifier
key which GEF refers to as a Role. A role is nothing more than the
String used when installing an EditPolicy. The purpose of the key or
Role is to allow the EditPolicy to be swapped or replaced. Since an
EditPart implementation installs its policies, a subclass may need to
override a policy added by its superclass. Or, the dynamic state of the
model may determine the set of installed EditPolicies. "Role" and
"EditPolicy" are used interchangeably.

  - Requests

Requests are used to communicate with an EditPart. As mentioned before,
the EditPart delegates all Requests to its installed EditPolicies. Each
Request has a type identifier which is used to route/filter requests.
Once this is done, Requests are sometimes cast to a more specific type
to obtain additional information. A typed Request will be referred to as
just a "Request" in this document.

## Uses in jUCMNav

I must admit we have not researched edit policies very deeply. They are
still a bit obscure for us and we use only a small subset of their
power. We might be able to clean up the code using more editpolicies but
we have concentrated on three main roles. Some of the text that follows
has been extracted from the help. *Quick note: jUCMNav doesn't use the
typical connection mechanisms in place in GEF because we are drawing
splines and not point to point connections. Therefore, that may be why
we aren't using some of the roles*

\* COMPONENT\_ROLE : The fundamental role that most EditParts should
have. A component is something that is in a parent, and can be deleted
from that parent. More generally, it is anything that involves only this
EditPart (and doesn't involve the view, since it is non-graphical).

  - Our editpolicies to be attached to this role are in
    seg.jUCMNav.editpolicies.element.
  - By subclassing ComponentEditPolicy, we add our behaviour for when
    deletion has been requested (see getDeleteCommand()) \*
    LAYOUT\_ROLE: The Layout role is placed on a container EditPart that
    has a graphical layout. If the layout has constraints, it will
    handle calculating the proper constraints for the input, or it may
    have no constraints other than the index where children will be
    placed.
  - Our editpolicies to be attached to this role are in
    seg.jUCMNav.editpolicies.layout
  - MapXYLayoutEditPolicy converts requests into commands that move
    elements in createChangeConstraintCommand().
  - NodeConnectionXYLayoutEditPolicy allows the creation from the
    palette by implementing getCreateCommand()
  - PathNodeXYLayoutEditPolicy and NodeConnectionXYLayoutEditPolicy
    allow drag\&drop of PathNodes on PathNodes && NodeConnections (*see
    \*\* note below*) \* SELECTION\_FEEDBACK\_ROLE: This role is a
    feedback only. The SelectionTool will send two types of requests to
    parts as the mouse enters and pauses over objects. EditPolicies
    implementing this role may alter the EditPart's view in some way, or
    popup hints and labels and the like.
  - Our editpolicies to be attached to this role are in
    seg.jUCMNav.editpolicies.feedback
  - eraseTargetFeedback() and showTargetFeedback() are used to perform
    changes on hover
  - showSelection() and hideSelection(0 are used to perform changes on
    selection

We also use the DIRECT\_EDIT\_ROLE (edit policy's
getDirectEditCommand()) to be able to edit labels directly in the
editor.

\*\* Note: jUCMNav allows the user to drag\&drop a pathnode on a path
segment or another pathnode and witness a transformation. I am not sure
how one is supposed to do this cleanly but since dragging is supported
by the framework already, I don't think we did it properly. We
registered our pathnodes and node connections as editparts that could
have children. Therefore, when one drags a path node over another one,
the framework fires an event informing the map edit part that it has
lost a child, and another to inform the recipient that it has gained
one. If you refer to [Dev Doc Edit Part Creation](DevDocEditPartCreation), I believe this is to allow
children to be moved from one parent to the other. However, we don't
want this to happen at all. We're simply taking this notification and
returning commands that transform the model but have nothing to do with
adding/removing children. Hopefully we are doing it the right way and we
won't run into problems down the line.

\-- Main.JasonKealey - 28 Jun 2005
