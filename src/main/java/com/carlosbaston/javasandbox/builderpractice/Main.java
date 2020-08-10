package com.carlosbaston.javasandbox.builderpractice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;
import java.util.UUID;
import java.util.function.Supplier;

import static com.carlosbaston.javasandbox.builderpractice.Gender.*;

public class Main {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class.getName());

        Person person1 = new Person.Builder()
                .uuid(UUID.randomUUID())
                .fname("Carlos")
                .lname("Baston")
                .build();

        Supplier<Gender> genderSupplier = () -> RATHER_NOT_SAY;
        Gender gender = Optional.ofNullable(person1.getGender()).orElseGet(genderSupplier);

        logger.info(
                "My name is {} {} and I'am a {}",
                person1.getFname(),
                person1.getLname(),
                gender);
    }
}
