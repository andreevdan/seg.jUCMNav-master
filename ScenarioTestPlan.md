# Scenario Test Plan
## Parser Tests
   * The syntax tests are performed by the jUCMNavParserTests and were defined & implemented during the course of the winter 2006. 

## Scenario UI Tests
   * UI tests are left as future work.

## Scenario Traversal Tests
   * Definitions: 
      * SPEP (start point, end point) 
      * SPREP (start point, respref, end point)
      * SPOFEP (start point, or fork, end point)
      * you get the idea. 

### Tests for any traversal engine
   1. Given SPEP, launch SP, reach EP. Pre/post conditions true. 
   1. Given SPEP with a few empty points in middle, launch SP, reach EP. Pre/post conditions true. 
   1. Given SPREP, launch SP, reach EP. R sets boolean condition to false, verified in post condition.
   1. Given SPREP, launch SP, reach EP. R sets integer condition to a certain non-zero value, verified in post condition.
   1. Given SPREP, launch SP, reach EP. R increments integer. R has repetition count. Total count verified in post condition.
   1. Given SPREP, launch SP, reach EP. R sets enum condition to a certain value, verified in post condition.
   1. Given SPOFEP, launch SP, reach appropriate EP given varying boolean condition. (two tests). 
   1. Given SPOFEP, launch SP, reach appropriate EP given varying integer condition. (two tests). 
   1. Given SPOFEP, launch SP, reach appropriate EP given varying enumeration condition. (two tests). 
   1. Given SPAF(EP|EP), launch SP, reach both EP. 
   1. Given (SP|SP)AJEP, launch both SP, reach EP. 
   1. Given (SP|SP)OJEP, launch both sp, reach EP twice. 
   1. Given SPEPCSPEP, launch first sp, reach both EP. 
   1. Given SPWPEP, where WP is released on arrival by condition, EP is reached.
   1. Given SPTEP, where T is released on arrival by condition, EP is reached.
   1. Given SPTEP, where T timeout path is released on arrival by condition, EP is reached.
   1. Given SPREP and SPWPEP, where R sets a condition that unblocks waiting place, verify both EP fired regardless of start order. 
   1. Given SPREP and SPTEP, where R sets a condition that unblocks timer (no timeout path), verify both EP fired regardless of start order.  
   1. Given SPREP and SPTEP, where R sets a condition that unblocks timeout path, verify 2/3 EP fired regardless of start order.  
   1. Given (SPEPC|SP)WPEP where WP is blocked, verify both EP are reached if SPEP is fired after SP. 
   1. Given (SPEPC|SP)TEP where T is blocked, verify both EP are reached if SPEP is fired after SP. 
   1. Given (SPC|SP)EMPTY EP (asynch connect), verify that EP is fired even if you launch only SPC. Verify that if you launch both, the EP is reached twice. 
   1. Given SPSTEP where ST bound to SPEP, fire top SP, verify both EP reached. 
   1. Given SPSTEP where ST bound to SPEP, fire bottom SP, verify only bottom EP reached. 
   1. Given (SP|SP)STEP, where ST bound to (SP|SP)AJEP, verify that both EP reached. (don't verify if top level is fired only once, see specific implementation)
   1. Given SPSTEP where ST bound to two different maps with SPEP, given varying boolean condition, verify the appropriate two EP are reached. 
   

### Scenario Inclusion tests. 
   1. Pick any test and define all pre/post conditions, initializations, start point / end point in the included scenario. Run the parent scenario and verify same output as child. 
   1. Could write tests to verify works recursively, move up/down behaviour, initialization overridding, start/end point merging, pre/post condition merging, but we don't like our included/inherited tests so we won't do these tests for now (as we may be changing the implementation soon). 

### Tests for our specific implementation
   1. Given (SPST|SPST)EP, where two stubs are bound to same plugin with (SP|SP)AJEP, verify that both EP reached. 
   1. Given (SPEPC|SP)WPEP where WP is blocked, verify second EP is not reached if SPEP is fired before SP.
   1. Given (SPEPC|SP)TEP where T is blocked, verify second EP is not reached if SPEP is fired before SP.
   1. Given (SPEPC|SP)T(EP|EP) where T is blocked, verify timeout EP is reached if SPEP is fired before SP.
   1. Given (SP|SP)AJEP, fire each SP twice in succession. Verify EP fired twice. (and join memory)
   1. Given (SP|SP)STEP, where ST bound to (SP|SP)AJEP, verify that both EP reached. Verify top level EP only fired once (our implementation)
   1. Given SPEPCSPEP, where middle EP has false postcondition, verify reach both EP anyways. 
   1. Given SPEPCSPEP, where middle SP has false precondition, verify only reach first EP. 
   1. Given SPOF(EP,EP) with multiple true branches, only one will be active. 
   1. Given SPSTEP where ST bound to two different maps with SPEP, both having true condition, verify that only one stub is traversed. 
   1. Given SPSTEP, with no plug-in, verify EP reached. 
   1. Given SPTEP with both true conditions, verify continuation path EP is reached. 
   1. Given SPWPEP, fired twice, then SPC to this WP, verify EP is only reached once. 

### Notes
   * Could test patient / impatient
   * Could test deterministic / non-deterministic
   * Could test component bindings
   * Could test MSC generation

-- Main.JasonKealey - 25 Jan 2007