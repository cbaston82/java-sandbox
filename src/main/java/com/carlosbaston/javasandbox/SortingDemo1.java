package com.carlosbaston.javasandbox;

import com.carlosbaston.javasandbox.common.TestData;
import com.carlosbaston.javasandbox.common.CustomSorterDescending;
import com.carlosbaston.javasandbox.common.Person;

import java.util.*;

public class SortingDemo1 {

    public static void main(String[] args) {

        // ArrayList of Strings sorts by the order created by default
        ArrayList<String> arrayListOfStrings = TestData.getArrayListOfStrings();
        System.out.println("arrayListOfStrings in default sorting order \n" +
                arrayListOfStrings + "\n");

        // ArrayList of Integers sorts by the order created by default
        ArrayList<Integer> arrayListOfIntegers = TestData.getArrayListOfIntegers();
        System.out.println("arrayListOfIntegers in default " +
                "sorting order\n" + arrayListOfIntegers + "\n");

        // ArrayList of Integers sorting using Collections.sort default
        // ascending
        Collections.sort(arrayListOfIntegers);
        System.out.println("arrayListOfIntegers after sorting using " +
                "Collections.sort\n" + arrayListOfIntegers + "\n");

        // using custom class CustomSorterDescending to sort descending
        Collections.sort(arrayListOfIntegers, new CustomSorterDescending());
        System.out.println("arrayListOfIntegers sorted in " +
                "descending order using " +
                "CustomSorterDescendig()\n" + arrayListOfIntegers +
                "\n");

        // Using lambda to compare and print in desc, using lambda expressino
        Collections.sort(arrayListOfIntegers, (a, b) -> b.compareTo(a));
        System.out.println("arrayListOfIntegers sorted in " +
                "descending order using a Lambda " +
                "Expression and compareTo\n" + arrayListOfIntegers +
                "\n");

        // List of Persons in default sorting order
        List<Person> listOfPersons = TestData.getArrayListOfPersons();
        System.out.println("listOfPersons sorted in default " +
                "natural order\n" + listOfPersons + "\n");

        // By default TreeMap is ascending order on the keys if no sorting
        // object is passed
        TreeMap<Integer, String> getTreeMapOfKeysIntegers = TestData.getTreeMapOfKeysIntegers();
        System.out.println("getTreeMapOfKeysIntegers sorted in default " +
                "order on 'key'\n" + getTreeMapOfKeysIntegers +
                "\n");

        // TreeMap in descending order using Lambda Expression 'Comparator<Integer>'
        TreeMap<Integer, String> getTreeMapOfKeysIntegers2 =
                TestData.getTreeMapOfKeysIntegers2();
        System.out.println("getTreeMapOfKeysIntegers sorted in descending " +
                "order using 'Comparator<Integer> Lambda Expressing'\n" + getTreeMapOfKeysIntegers2 +
                "\n");

       // ArrayList of people in default created order
        ArrayList<Person> arrayListOfPersons = TestData.getArrayListOfPersons();
        System.out.println("ArrayList of people in default " +
                        "created order\n" + arrayListOfPersons + "\n");

        // ArrayList of people sorted using Lambda Expression on Collections
        // .sort
        Comparator<Person> personLambdaComparator =
                (a, b) -> (a.getAge() > b.getAge()) ? -1 :
                (a.getAge() < b.getAge()) ? 1 : 0;
        Collections.sort(arrayListOfPersons, personLambdaComparator);
        System.out.println("ArrayList of people in " +
                        "descending order using 'lambda " +
                        "expression on Comparator\n" + arrayListOfPersons +
                "\n");

        /**
         * By default TreeSet is ascending order on the keys if no sorting
         * object is passed
         */
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(5);
        ts.add(20);
        ts.add(15);
        ts.add(0);
        System.out.println(ts);

        /**
         * Sorting TreeSet in descending with Comparator
         */
        Comparator<Integer> integerComparator = (a, b) -> (a > b) ? -1 : (a < b) ? 1 : 0;
        TreeSet<Integer> ts2 = new TreeSet<>(integerComparator);
        ts2.add(10);
        ts2.add(5);
        ts2.add(20);
        ts2.add(15);
        ts2.add(0);
        System.out.println(ts2);

    }
}
