package com.carlosbaston.javasandbox.amigos.javafunctionalprogramming.finalsection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Lambdas {

    public static void main(String[] args) {
        Logger logger =
                LoggerFactory.getLogger(Lambdas.class.getName());

        BiFunction<String, String, Integer> printNameAndLast =
                (name, last) -> name.length() + last.length();

        int fullNameLength = printNameAndLast.apply("Carlos", "Baston");
        logger.info("{}", fullNameLength);

        BinaryOperator<String> fullNameConverter =
                (fname, lname) -> fname + " " + lname;

        String fullNameString = fullNameConverter.apply("Carlos", "Baston");
        logger.info(fullNameString);
    }

}
