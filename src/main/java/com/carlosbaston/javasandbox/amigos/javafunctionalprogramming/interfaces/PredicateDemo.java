package com.carlosbaston.javasandbox.amigos.javafunctionalprogramming.interfaces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Predicate;

public class PredicateDemo {

    static Logger logger = LoggerFactory.getLogger(PredicateDemo.class.getName());

    public static void main(String[] args) {
        String validPhoneNumber = "07000003000";
        String invalidPhoneNumber1 = "0700000000";
        String invalidPhoneNumber2 = "09000000000";

        // Without Predicate
        logger.info("{}", isPhoneNumberValid(validPhoneNumber));
        logger.info("{}", isPhoneNumberValid(invalidPhoneNumber1));
        logger.info("{}", isPhoneNumberValid(invalidPhoneNumber2));

        // With Predicate
        logger.info("{}", isPhoneNumberValidPredicate.test(validPhoneNumber));
        logger.info("{}", isPhoneNumberValidPredicate.test(invalidPhoneNumber1));
        logger.info("{}", isPhoneNumberValidPredicate.test(invalidPhoneNumber1));

        logger.info("Is phone number valid and contains 3 {}",
                        isPhoneNumberValidPredicate.and(containsNumber3).test(validPhoneNumber)
        );

        logger.info("Is phone number valid and contains 3 {}",
                        isPhoneNumberValidPredicate.and(containsNumber3).test(invalidPhoneNumber1)
        );

    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> containsNumber3 =
            phoneNumber -> phoneNumber.contains("3");
}
