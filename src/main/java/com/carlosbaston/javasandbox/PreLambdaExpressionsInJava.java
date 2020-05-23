package com.carlosbaston.javasandbox;

/**
 * Demo of showing non lambda alternative. Pre java 1.8
 * See LambdaExpressionFunctionalInterface for java 1.8+ example
 */


@FunctionalInterface
interface AddNumbers2 {
    int add(int a, int b);
}

class test implements AddNumbers2 {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

public class PreLambdaExpressionsInJava {
    public static void main(String[] args) {
        AddNumbers2 l = new test();
        int addResults = l.add(10, 20);
        System.out.println(addResults);
    }
}
