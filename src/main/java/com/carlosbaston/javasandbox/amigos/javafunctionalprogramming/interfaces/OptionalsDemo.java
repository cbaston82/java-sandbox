package com.carlosbaston.javasandbox.amigos.javafunctionalprogramming.interfaces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalsDemo {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(OptionalsDemo.class.getName());

        Object value = Optional.ofNullable("Hello")
                .orElseGet(() -> "Default value");

        Supplier<IllegalStateException> exception = () -> new IllegalStateException("exception");

        String value2 = Optional.ofNullable("Hello")
                .orElseThrow(exception);

        Optional.ofNullable("carlos@gmail.com")
                .ifPresent(email -> logger.info("Sending email to {}", email));

        Optional.ofNullable(null)
                .ifPresentOrElse(
                        email -> logger.info("Sending email to {}", email),
                        () -> logger.info("Cannot send email"));

        logger.info("{}", value);
        logger.info(value2);
    }
}
