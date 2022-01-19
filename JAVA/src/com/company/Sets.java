package com.company;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();

        set1.add(1);
        set1.add(1);
        System.out.println(set1);

        set1.add(2);
        set1.add(4);
        set1.add(5);
        set1.add(3);
        System.out.println(set1);

        for(Integer i:set1){
            System.out.println(i);
        }

        Set<Integer> set2 = new HashSet<>();

        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        set2.addAll(set1);
        System.out.println(set2);

        System.out.println(set1.size());


        System.out.println(set1.contains(6));

       System.out.println(set1.containsAll(set1));







    }
}
