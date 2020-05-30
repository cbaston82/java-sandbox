package com.carlosbaston.javasandbox;

import java.util.function.Function;

/**
 * Using Function >>> functional interface that returns back the function result
 */
public class FunctionDemo1 {

    public static void main(String[] args) {

        // Return back length
        Function<String, Integer> f = s -> s.length();
        System.out.println(f.apply("Carlos"));

        // Return back square root
        Function<Integer, Integer> f2 = i -> i * i;
        System.out.println(f2.apply(5));

        // Return input string without spaces
        Function<String, String> f3 = s -> s.replaceAll(" ", "");
        System.out.println(f3.apply("James Johnson was here"));

        // Get a count of all the spaces in a string
        Function<String, Integer> f4 = s -> s.length() - s.replaceAll(" ",
                "").length();
        System.out.println(f4.apply("James Johnson was here"));

    }

}
