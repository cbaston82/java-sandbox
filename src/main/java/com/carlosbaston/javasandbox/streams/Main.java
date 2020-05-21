package com.carlosbaston.javasandbox.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> people = getPeople();

        // Imperative approach ❌

        // Declarative approach ✅

        //Filter
        List<Person> filter = people.stream()
                .filter(person -> person.getGender().equals(Gender.MALE))
                .collect(Collectors.toList());
        // filter.forEach(System.out::println);

        // Sort
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());
        // sorted.forEach(System.out::println);

        // All match
        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() >= 7);
        // System.out.println(allMatch);

        // Any match
        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge() == 120);
        System.out.println(anyMatch);

        // None match
        boolean nonMatch = people.stream()
                .noneMatch(person -> person.getAge() == 121);
        System.out.println(nonMatch);

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

//        Optional<String> oldestMale = people.stream()
//                .filter(person -> person.getGender().equals(Gender.MALE))
//                .max(Comparator.comparing(Person::getAge))
//                .map(Person::getName);

//        oldestMale.ifPresent(System.out::println);

    }

    private static List<Person> getPeople() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Antonio", 20, Gender.MALE));
        people.add(new Person("Alina Smith", 33, Gender.FEMALE));
        people.add(new Person("Helen White", 57, Gender.FEMALE));
        people.add(new Person("Alex Boz", 14, Gender.MALE));
        people.add(new Person("Jamie Goa", 99, Gender.MALE));
        people.add(new Person("Anna Cook", 7, Gender.FEMALE));
        people.add(new Person("Zelda Brown", 120, Gender.FEMALE));
        return people;
    }

}