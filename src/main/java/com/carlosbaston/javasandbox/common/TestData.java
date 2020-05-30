package com.carlosbaston.javasandbox.common;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;

public class TestData {

    public static ArrayList<Person> getArrayListOfPersons() {
        ArrayList<Person> getArrayListOfPersons = new ArrayList<Person>();
        getArrayListOfPersons.add(new Person("Antonio", "a@gmail.com", 22, Gender.MALE));
        getArrayListOfPersons.add(new Person("Alina Smith", "as@gmail.com", 33,
                Gender.FEMALE));
        getArrayListOfPersons.add(new Person("Helen White", "hw@gmail.com", 57,
                Gender.FEMALE));
        getArrayListOfPersons.add(new Person("Alex Boz", "ab@gmail.com", 14, Gender.MALE));
        getArrayListOfPersons.add(new Person("Jamie Goa", "jg@gmail.com", 99, Gender.MALE));
        getArrayListOfPersons.add(new Person("Anna Cook", "ac@gmail.com", 33,
                Gender.FEMALE));
        getArrayListOfPersons.add(new Person("Zelda Brown", "zb@gmail.com", 120, Gender.FEMALE));
        return getArrayListOfPersons;
    }

    public static ArrayList<String> getArrayListOfStrings() {
        ArrayList<String> arrayListOfStrings = new ArrayList();
        arrayListOfStrings.add("Shinny");
        arrayListOfStrings.add("Windy");
        arrayListOfStrings.add("Rainy");
        arrayListOfStrings.add("Gloomy");
        arrayListOfStrings.add("Rainy");
        arrayListOfStrings.add("Shinny");
        arrayListOfStrings.add("Windy");
        arrayListOfStrings.add("Rainy");
        arrayListOfStrings.add("Gloomy");
        arrayListOfStrings.add("Rainy");
        return arrayListOfStrings;
    }

    public static ArrayList<Integer> getArrayListOfIntegers() {
        ArrayList<Integer> arrayListOfIntegers = new ArrayList<>();
        arrayListOfIntegers.add(10);
        arrayListOfIntegers.add(0);
        arrayListOfIntegers.add(15);
        arrayListOfIntegers.add(20);
        arrayListOfIntegers.add(5);
        return arrayListOfIntegers;
    }

    public static TreeMap<Integer, String> getTreeMapOfKeysIntegers() {
        TreeMap<Integer, String> getTreeMapOfKeysIntegers = new TreeMap<>();
        return getIntegerStringTreeMap(getTreeMapOfKeysIntegers);
    }

    public static TreeMap<Integer, String> getTreeMapOfKeysIntegers2() {

        Comparator<Integer> integerComparator = (a, b) -> (a > b) ? -1 :
                (a < b) ? 1 : 0;
        TreeMap<Integer, String> getTreeMapOfKeysIntegers =
                new TreeMap<>(integerComparator);
        return getIntegerStringTreeMap(getTreeMapOfKeysIntegers);
    }

    private static TreeMap<Integer, String> getIntegerStringTreeMap(TreeMap<Integer, String> getTreeMapOfKeysIntegers) {
        getTreeMapOfKeysIntegers.put(500, "String 1");
        getTreeMapOfKeysIntegers.put(100, "String 2");
        getTreeMapOfKeysIntegers.put(300, "String 3");
        getTreeMapOfKeysIntegers.put(400, "String 4");
        getTreeMapOfKeysIntegers.put(200, "String 5");
        return getTreeMapOfKeysIntegers;
    }

    public static ArrayList<Student> getArrayListOfStudents() {
        ArrayList<Student> arrayListOfStudents = new ArrayList<>();
        arrayListOfStudents.add(new Student("Mike Miller", 35));
        arrayListOfStudents.add(new Student("Ester Gonzales", 90));
        arrayListOfStudents.add(new Student("Will jackson", 55));
        arrayListOfStudents.add(new Student("Steven Williams", 65));
        arrayListOfStudents.add(new Student("Kelly Higgins", 70));
        arrayListOfStudents.add(new Student("Donald Cooper", 25));
        return arrayListOfStudents;
    }

}
