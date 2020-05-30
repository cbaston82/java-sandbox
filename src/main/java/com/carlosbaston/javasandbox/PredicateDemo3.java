package com.carlosbaston.javasandbox;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * using Predicate to return true if string is null or empty
 */
public class PredicateDemo3 {
    public static void main(String[] args) {

        String[] names = {"Carlos", "", null, "Tiffany", "Maiya"};
        ArrayList<String> list = new ArrayList<>();

        Predicate<String> checkIfNullOrEmpty =
                s -> s != null && s.length() != 0;

        for(String name: names) {
            if (checkIfNullOrEmpty.test(name)) {
                list.add(name);
            }
        }
        System.out.println("The list of names is: " + list);
    }


}
