package com.carlosbaston.javasandbox.amigos.javafunctionalprogramming.streams;

import com.carlosbaston.javasandbox.common.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.function.Predicate;

import static com.carlosbaston.javasandbox.common.Gender.FEMALE;
import static com.carlosbaston.javasandbox.common.Gender.MALE;

public class Main {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class.getName());

        List<Person> people = List.of(
                new Person("Carlos", "c@gmail.com", 38, MALE),
                new Person("Tiffany", "t@gmail.com", 30, FEMALE),
                new Person("Maiya", "mj@gmail.com", 1, FEMALE),
                new Person("Assianna", "a@gmail.com", 22, FEMALE),
                new Person("Lalah", "l@gmail.com", 14, FEMALE),
                new Person("Jersey", "j@gmail.com", 16, FEMALE),
                new Person("Mijoi", "m@gmail.com", 23, FEMALE)
        );

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.getGender());

        boolean containsOnlyFemales = people.stream()
                .noneMatch(personPredicate);

        logger.info("{}", containsOnlyFemales);
    }
}
