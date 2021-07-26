# REQUIREMENTS

Using the Y.X.Zeng’s thesis and Professor Amyot’s suggestions, we gathered the following requirements for this part of the project:

1. The following two implicit CSM elements have to be considered:

    Resource Acquire - CSM element which is inserted at the intersection of an **incoming** path with the parent component of a Step or series of Steps [1].
    Resource Release - CSM element which is inserted at the intersection of an **outgoing** path with the parent component of a Step or series of Steps [1]. 

2. Each of the above elements must be inserted according to a specific insertion algorithm:

    - The Resource Acquisition algorithm inserts a Resource Acquire (RA) element by scanning either the original UCM or a duplicate UCM, looking for incoming paths “intersecting” with components. When such an intersection is detected, a Resource Acquisition element is inserted along with a “dummy” sequence.
    - The Resource Release algorithm inserts a Resource Release (RR) element by scanning either the original UCM or a duplicate UCM, looking for outgoing paths “intersecting” with components. When such an intersection is detected, a “dummy” sequence is inserted, followed by a Resource Release element. 

3. Each new “dummy” sequence must be assigned an id. The way in which this id is assigned is left at the discretion of the programmer/designer. The “dummy” sequence should also have a standard name as well as a link to the predecessor and successor elements [1].

4. Each new RA or RR element must also be assigned an id, by following a similar naming convention as for “dummy” sequences. Links to predecessor/successor nodes must also be established. Depending on the element type, it should also display the id of the component it acquires or releases [1].

5. The insertion algorithms can be implemented using the original UCM or a copy of it. This is left at the discretion of the programmer/designer [2].

6. CSM does not allow two consecutive step elements or two consecutive path connection elements [1].

7. Similarly to a “dummy” sequence, a “dummy” responsibility must be assigned an id, a name and a link to the target/source elements [1].

8. The CSM output should not contain two consecutive sequences. All additional sequences should be removed [1].

-- Yuliya Khomich? - 14 Apr 2006 