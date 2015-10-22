/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author vpavlovic
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> testList = new ArrayList();

        try {
            BufferedReader fr = new BufferedReader(new FileReader("/tmp/IntegerArray.txt"));
            String line;

            while ((line = fr.readLine()) != null) {
                testList.add(Integer.parseInt(line));
            }

            System.out.println("Reading file finished\nNumber of lines: " + testList.size());

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        CountInversions ci = new CountInversions();

        long inversions = ci.count(testList);

        System.out.println("Array sorted: " + TestSort.isSorted(testList));

        System.out.println("Number of inversions: " + inversions);
    }
}
