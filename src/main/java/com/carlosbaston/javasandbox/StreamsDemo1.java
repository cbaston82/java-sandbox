package com.carlosbaston.javasandbox;

import com.carlosbaston.javasandbox.common.TestData;
import com.carlosbaston.javasandbox.common.Gender;
import com.carlosbaston.javasandbox.common.Person;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsDemo1 {

    public static void main(String[] args) {
        List<Person> people = TestData.getArrayListOfPersons();

        // streams.filter
        List<Person> filter = people.stream()
                .filter(person -> person.getGender().equals(Gender.MALE))
                .collect(Collectors.toList());
        System.out.println("ArrayList of people being filtered with " +
                "'stream.filter'\n" + filter + "\n");

        // streams.sorted
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());
        System.out.println("ArrayList of people being sorted with 'stream" +
                ".sorted'\n" + sorted + "\n");

        // streams.allMatch
        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() >= 7);
        System.out.println("Using allMatch to check if all people are " +
                "greater or equal to the age of 7 using 'stream" +
                ".allMatch'\n" + allMatch + "\n");

        // streams.anyMatch
        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge() == 120);
        System.out.println("Using anyMatch to check if any person in people " +
                " are the age of 120 using 'stream.anyMatch'\n" + anyMatch +
                "\n");

        // streams.nonMatch
        boolean nonMatch = people.stream()
                .noneMatch(person -> person.getAge() == 121);
        System.out.println("Using noneMatch to check that no people are the " +
                "age of 121 using 'stream.anyMatch'\n" + nonMatch +
                "\n");

        // Max
        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        // Min
        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        // Group
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        groupByGender.forEach((gender, person) -> {
            System.out.println(gender);
            person.forEach(System.out::println);
        });

        Optional<String> oldestMale = people.stream()
                .filter(person -> person.getGender().equals(Gender.MALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);

        oldestMale.ifPresent(System.out::println);
    }

}


