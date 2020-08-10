package com.carlosbaston.javasandbox.amigos.javafunctionalprogramming.interfaces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionsDemo {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(FunctionsDemo.class.getName());


        // Function takes 1 arg and produces 1 result
        int increment = incrementByOne(1);
        logger.info("{}", increment);

        int increment2 = incrementByOneFunction.apply(1);
        logger.info("{}", increment2);

        int multiply = multiplyBy10.apply(2);
        logger.info("{}", multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10);
        logger.info("{}", addBy1AndThenMultiplyBy10.apply(4));

        // Function takes 2 arg and produces 1 result
        logger.info("{}", incrementByOneAndMultiply(4, 100));

        logger.info("{}", incrementByOneAndMultiplyBiFunction.apply(4, 100));

    }

    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static Function<Integer, Integer> multiplyBy10 = number -> number * 10;

    static int incrementByOne(int number) {
        return number + 1;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;


    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }

}
