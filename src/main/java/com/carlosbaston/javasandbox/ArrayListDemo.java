package com.carlosbaston.javasandbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList();
        l.add("Shinny");
        l.add("Windy");
        l.add("Rainy");
        l.add("Gloomy");
        l.add("Rainy");
        // System.out.println(l);

        ArrayList<Integer> n = new ArrayList<Integer>();
        n.add(10);
        n.add(0);
        n.add(15);
        n.add(20);
        n.add(5);
        System.out.println(n); // Before sorting
        Collections.sort(n);
        System.out.println(n); // After sorting default

        // using custom class myComparator to print desc, using custom object
        // Collections.sort(n, new myComparator());
        // System.out.println(n);

        // Using lambda to compare and print in desc, using lambda expressino
        Collections.sort(n, (a, b) -> b.compareTo(a));
        System.out.println(n);

    }
}

// Compare non lambda way
class myComparator implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        if (a > b) {
            return -1;
        } else if (a < b) {
            return +1;
        } else {
            return 0;
        }
    }
}

