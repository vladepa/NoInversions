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
    
    long inversions = 0;
    
    public long count(ArrayList al) {
        
        divide(al);
        
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

    private long merge(List<Integer> al) {
        int point = al.size() / 2;
        int i = 0;
        int j = point;
        long inversions = 0;
        int over = point;
        int tmp;
        
        if (point == 0) {
            return 0;
        }
        
        while (i <= j && j < al.size()) {
            if (al.get(i) > al.get(j)) {
                tmp = al.get(j);
                al.remove(j);
                al.add(i, tmp);
                inversions += over;
                i++;
                j++;
            
            } else {
                i++;
                over--;
                if (over < -1) 
                    System.out.println("ALERT");
            }
        }
        
        return inversions;
    }
    
    
    
}
