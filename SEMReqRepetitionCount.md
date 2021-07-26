In order to support loops, the repetition counts of responsibilities is used. If the traversal mechanism encounters a responsibility with a repetition count greater than 1 then the responsibility is executed that many times in a loop. The repetition count of a responsibility can currently be defined. However, a repetition count for stubs cannot be defined. In order to support structured loops more efficiently, stubs should also have this attribute and the traversal mechanism should execute the plug-ins of a stub in a loop. Note that all types of stubs are supported (i.e. whatever is "inside" a stub is repeated as many times as specified by the repetition count).

-- Gunter Mussbacher - 22 Mar 2007

[[img/SEMReqRepetitionCount.PNG]]