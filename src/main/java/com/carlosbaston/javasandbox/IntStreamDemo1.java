package com.carlosbaston.javasandbox;

public class IntStreamDemo1 {

    public static void main(String[] arg) {
        int[] numbers = {11, 2, 2, 6, 76, 45, 23, 6, 15, 33, 65};

        java.util.stream.IntStream.of(numbers)
                .sorted()
                .distinct()
                .limit(3)
                .forEach(System.out::println);

        int asInt = java.util.stream.IntStream.of(numbers)
                .min()
                .getAsInt();
        System.out.println(asInt);

        java.util.stream.IntStream.of(numbers)
                .min()
                .ifPresent(System.out::println);

        java.util.stream.IntStream.of(numbers)
                .min()
                .ifPresent(min -> System.out.println(min));

        java.util.stream.IntStream.of(numbers)
                .min()
                .ifPresent(System.out::println);

        java.util.stream.IntStream.of(numbers)
                .sorted()
                .forEach(number -> System.out.println(number));
    }
}
