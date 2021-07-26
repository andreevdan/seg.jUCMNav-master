| Name                  | Type     | Size | Values                                                        | Tooltip message                                                    |
| :-------------------- | :------- | :--- | :------------------------------------------------------------ | :----------------------------------------------------------------- |
| Req Name              | text     | 35   |                                                               | A Wiki name, starting with Req                                     |
| Description           | textarea | 60x4 |                                                               | Use SHALL or SHOULD statements                                     |
| Type                  | select   | 1    | Functional, Non Functional, GUI, Platform, Goal               | *Goal* is not a requirement but an objective                       |
| Importance            | select   | 1    | Mandatory, Optional, Future                                   | *Future* means to consider beyond this project                     |
| Priority              | select   | 1    | Urgent, Medium, Low                                           |                                                                    |
| Status                | select   | 1    | Proposed, Approved, Rejected, Started, Implemented, Completed | *Completed* means implemented ***and*** tested                     |
| Author                | text     | 35   |                                                               | Wiki name of the author (do not forget the Main. prefix)           |
| Dependencies          | text     | 60   |                                                               | List of requirement Wiki names (and optionally type of dependency) |
| Verification Approach | text     | 60   |                                                               | A few words about the strategy (or Wiki name)                      |
| Test Cases            | text     | 60   |                                                               | List of test case Wiki names, if any                               |
