package com.carlosbaston.javasandbox;

import com.carlosbaston.javasandbox.common.TestData;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

/**
 *
 */
public class PredicateDemo1 {
    public static void main(String[] args) {

        // Anonymous inner function overriding Predicate.test
        Predicate<Integer> p1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
               if (integer > 10)
                   return true;
               else
                   return false;
            }
        };
        System.out.println(p1.test(8));

        // Lambda Expression with predicate.test
        Predicate<Integer> p2 = i -> i > 10;
        System.out.println(p2.test(7));
        System.out.println(p2.test(100));

        // Lambda Expression with predicate.test checking ArrayList
        Predicate<Collection> pc = c -> c.isEmpty();
        System.out.println(pc.test(TestData.getArrayListOfPersons()));

        // Negate
        System.out.println(pc.negate().test(TestData.getArrayListOfPersons()));

        // Checking if string starts with 'w'
        ArrayList<String> arrayListOfStrings = TestData.getArrayListOfStrings();
        Predicate<String> startsWithW = s -> s.toLowerCase().charAt(0) == 'w';
        for(String name: arrayListOfStrings) {
            if(startsWithW.test(name)) {
                System.out.println(name);
            }
        }
    }
}
