/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.util.List;

/**
 *
 * @author vpavlovic
 */
public class TestSort {
    
    public static boolean isSorted(List<Integer> list) {
        
        Integer base  = null;
        boolean ok = true;
        
        for(Integer i: list) {
            if (base == null) {
                base = i;
                continue;
            }
            
            if (base.compareTo(i) >= 0) {
                ok = false;
                break;
            
            } else {
                base = i;
            }
        }
        
        return ok;
    }
    
}
