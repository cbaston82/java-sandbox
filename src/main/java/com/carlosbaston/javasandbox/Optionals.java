package com.carlosbaston.javasandbox;


import com.carlosbaston.javasandbox.model.Gender;
import com.carlosbaston.javasandbox.model.Person;

import java.util.Optional;

public class Optionals {

    public static void main(String[] arg) {

        Optional<Object> empty = Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isPresent());
        System.out.println(empty.isEmpty());

        Optional<String> string = Optional.of("A random string test");
        System.out.println(string);
        System.out.println(string.isPresent());
        System.out.println(string.isEmpty());

        // orElse return a string
        Optional<String> hello = Optional.ofNullable("Hello");
        String helloString = hello.orElse("World");
        System.out.println(helloString);

        // orElse >>> will print orElse value
        Optional<String> hello1 = Optional.ofNullable(null);
        String hello1String2 = hello1.orElse("orElse kicked in");
        System.out.println(hello1String2);

        // orElseGet >>> will return orElseGet value
        Optional<String> hello2 = Optional.ofNullable(null);
        String hello1String3 = hello2
                .map(String::toUpperCase)
                .orElseGet(() -> {
                    // Some logic ....
                    return "orElseGet kicked in";
                });
        System.out.println(hello1String3);

        // orElse >>> will print email
        Person userCarlos = new Person("James Johnson", "JamesJohnson@gmail" +
                ".com", 33, Gender.MALE);
        String email = userCarlos
                .getEmail()
                .map(String::toLowerCase)
                .orElse("The user has no email");
        System.out.println(email);

        // orElse >>> will print 'The user has no email'
        Person userCarlos2 = new Person("James Johnson", null, 33, Gender.MALE);
        String email2 = userCarlos2
                .getEmail()
                .map(String::toLowerCase)
                .orElse("The user has no email");
        System.out.println(email2);
    }
}

