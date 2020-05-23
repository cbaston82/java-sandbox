package com.carlosbaston.javasandbox;

/**
 * Lamda Expression using @FunctionalInterface
 */

@FunctionalInterface
interface AddNumbers {
    int addNumbers(int a, int b);
}

public class LambdaExpressionFunctionalInterface {
    public static void main(String[] args) {
        AddNumbers an = (a, b) -> a + b;
        int addNumbersResult = an.addNumbers(10, 20);
        System.out.println(addNumbersResult);
    }
}
