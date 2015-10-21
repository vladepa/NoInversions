/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;

/**
 *
 * @author vpavlovic
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> testList = new ArrayList();

//        for (int i = 100; i > 0; i--) {
//            testList.add((int)(Math.random() * 100));
//        }
        testList.add(4);
        testList.add(3);
        testList.add(2);
        testList.add(1);

        CountInversions ci = new CountInversions();

        int inversions = ci.count(testList);

        System.out.println("Number of inversions: " + inversions);
    }
}
