# Milestone Six: Impact Assessment report

Presented to Dr Liam Peyton
For the software engineering capstone project course (SEG4911)
by
Olivier Clift Noel?
Jean Philippe Daigle?
Jason Kealey
Jordan Mc Manus?
Etienne Tremblay

# Credit Sheet
Contributors to this report include the above-mentioned authors

and

Daniel Amyot
School of Information Technology and Engineering (SITE)
University of Ottawa
800 King Edward St.,
Ottawa, Ontario, Canada, K1 N? 6N5

# Summary
jUCMNav is a graphical Use Case Map editor developed as a plugin to the Eclipse universal tool platform. This report analyses the adoption and impact of the release of this tool on society and the software engineering community. 

## Project Accomplished
Please see earlier milestones for a recap of what jUCMNav is.

## Analysis of Impact
Here follows a multi-faceted analysis of issues impacting our application, as well as a discussion of our project's community impact.

## Legal considerations
Our software being released under the open-source Eclipse Public License, interesting legal issues revolve around license compliance. Briefly, our source code is made available along with precompiled binaries, and license is granted to its users to themselves distribute, sell and reproduce the original work and / or derivatives, under the conditions set forth in the EPL.

In order to make our software available under this license, we declare that we are the authors of, or have the rights to make available under the EPL, all parts of the application. A small part of the source code is actually comprised of modified sources from IBM, made available to us under the EPL and thus granting us the right to distribute derivatives.

The only other creation not originating from our team is the jUCMNav logo and icon set, drawn by artist Steve Hutchison (steve@shade.ca) and graciously made available by him under the EPL for distribution with our plugin.

As for any other patent and third-party considerations, the EPL states that we, individual contributors to the project, accept no responsibility in this area and the onus is on the licensee (end-user) to secure any needed rights to use the software. Though this may sound scary, we are confident our application does not infringe on any third party's intellectual property and thus this point is moot.

## Liability considerations
Closely related to legal considerations are potential liabilities stemming from the distribution or misuse of the created software. The authors and their client disclaim any responsibility or warranty through the choice of the Eclipse Public License. Refer to sections (5) and (6) of the aforementioned text, which protect project contributors from potential liabilities related to the software.

## Standards
As with any modelling tool developed for a specific domain, we must adhere to the standards comprising this application domain. In our case, our software implements a subset of the meta-model for representing the User Requirements Notation, and allows graphical editing of Use Case Maps, which are documented on usecasemaps.org.

Of note is the fact that the jUCMNav user experience is designed to disallow the creation of invalid Use Case Maps. Compliance with the standards was reached through very close cooperation with a prominent member of the UCM community, Dr Daniel Amyot of SITE.

## User and societal issues
Our system is a software engineering tool, and thus useful to the software engineering community as a modelling tool for documenting / designing systems with "causal paths cutting across organizational structures" [usecasemaps.org]. In the best-case scenario, we can expect a widely-adopted jUCMNav to become the foremost UCM modelling tool and see its pleasing, crisp graphical output gracing upcoming publications. The tool is very likely to be used in academic and research settings, for instance in software engineering courses. Future adoption of a URN DTD for saving UCMs as XML files unlocking interoperability with other tools will improve chances of adoption.

We take no measures to restrict the use of jUCMNav, and as a freely downloadable tool it could potentially be used by spyware authors, virus writers and other such folk to aid in their software design. Though unpleasant, this is an improbable outcome and one we must accept.

Thankfully, our system presents no environmental or health hazards to its users or their communities.

## Financial considerations
The financial costs of deploying the system are quite low - ie: disk space and bandwidth are already available on usecasemaps.org. The costs associated with using and improving the tool, in the form of time spent by Dr Amyot, are significant. Thankfully, as this is not a shipping commercial product, our client may choose to allocate as little or as much time as he feels is necessary to this project.

## Recommendations
To ensure development continues smoothly and a wider deployment does not negatively impact our client or the software's users, we recommend that:

 -   New developers be familiar with the EPL and its implications.
 -   New developers familiarize themselves with our development and release processes.
 -   New developers read the extensive documentation targeted at them and available online on our TWiki site.
 -   Work commenced on providing a smoother deployment / upgrade experience be continued. 

-- Jean Philippe Daigle? - 10 Jul 2005 