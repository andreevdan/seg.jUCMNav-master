Now, this one is rather simple for path elements with one input and one output (responsibility, goal tag, timestamp, etc.), but more complex when:

   * many input or outputs are used (AND/OR fork/join, connected timer/wait/start, stub...) 
   * removing this element would make the UCM invalid (start or end point)
   * there are dependencies to/from other parts of the model (beware of dangling/invalid references)

-- Main.DanielAmyot - 15 Feb 2005

How do we handle those issues? Discuss.
-- Main.JeanPhilippeDaigle - 16 Feb 2005

Right now in UCMNav (not necessarily how we should do it for jUCMNav):
   * AND/OR fork/join
      * One cannot delete them directly. One needs to delete N-1 input path segments of an N-input join (then it becomes an empty point). Similarly, one needs to delete N-1 output path segments (branches) of an N-output fork (then it becomes an empty point).
   * Timer
      * The timeout path of a timer (if any) needs to be deleted first. If the timer is connected to an end/empty point, the connection should be deleted as well (right now, I think UCMNav crashes on such an operation...)
   * Stub
      * Cannot be deleted until there is only one input and one output path (the other path segments need to be decomposed from the stub first). Whether we should make sure a stub is empty before being deleted (no plug-in) or not is an issue.
   * Start points
      * Right now, the option is to remove the whole path. However, if there is a stub (with more than one input) a or AND/OR join on the path, then this is not allowed.
   * End points
      * Cannot be deleted, except when deleting the path.
   * Responsibilities, goal tags, timestamps, waiting places (unconnected): can be removed anytime.

-- Main.DanielAmyot - 17 Feb 2005


[[img/ReqElemDelete.PNG]]
