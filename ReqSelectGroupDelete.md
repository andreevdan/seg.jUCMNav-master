Some of the elements may be undeletable at some point, so this should be checked first.

-- Daniel Amyot - 29 Jan 2005

All changes to the model are made via commands, including deleting. The information needed to undo a delete would be stored in the delete command and could be undone after. The problem I see here is when you select a group of element and press the delete key. Delete commands are generated for each selected element and the commands are executed. But I don't know if we have a way to know the order of the deletes and if it could impacts the relations in our model.

I don't think it could really cause problems, but should be tested a lot since EMF always make sure the integrety of it's links are maintained and I read in an article to be more carefull in this situation.

-- Etienne Tremblay - 04 Feb 2005

As discussed, our support of deletion will be fairly limited because the order of deletion has to be known and it is hard to do without proper graph navigation, attained when scenarios are implemented. 


[[img/ReqSelectGroupDelete.PNG]]