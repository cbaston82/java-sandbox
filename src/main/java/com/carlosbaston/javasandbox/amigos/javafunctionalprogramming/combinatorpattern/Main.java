package com.carlosbaston.javasandbox.amigos.javafunctionalprogramming.combinatorpattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;

import static com.carlosbaston.javasandbox.amigos.javafunctionalprogramming.combinatorpattern.CustomerRegistrationValidator.*;

public class Main {

    static Logger logger = LoggerFactory.getLogger(Main.class.getName());

    public static void main(String[] args) {

        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+087678987689",
                LocalDate.of(2010, 1, 1)
        );

        // Using combinator pattern
        ValidationResult result = isEmailValid()
                .and(isAdult())
                .and(isPhoneNumberValid())
                .apply(customer);

        logger.info("{}", result);

        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }


    }
}
