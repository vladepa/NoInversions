/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vpavlovic
 */
public class CountInversions {
    
    int inversions = 0;
    
    public int count(ArrayList al) {
        
        divide(al);
        
        System.out.println(al);
        
        return inversions;
    }

    private void divide(List al) {
        if (al.size() > 2) {
            int point = al.size() / 2;
            
            divide(al.subList(0, point));
            divide(al.subList(point, al.size()));
        }
        
        inversions += merge(al);  
    }

    private int merge(List<Integer> al) {
        int point = al.size() / 2;
        int i = 0;
        int j = point;
        int inversions = 0;
        int tmp;
        
        if (point == 0) {
            return 0;
        }
        
        while (i <= j && j < al.size()) {
            if (al.get(i) > al.get(j)) {
                tmp = al.get(j);
                al.remove(j);
                al.add(i, tmp);
                i++;
                j++;
                inversions++;
            
            } else {
                i++;
            }
        }
        
        return inversions;
    }
    
    
    
}
