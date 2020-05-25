package com.carlosbaston.javasandbox;

import com.carlosbaston.javasandbox.common.InterfaceAddNumbers;

/**
 * Lambda Expression Demo 1. Using Interface with single method.
 */
public class LambdaExpressionDemo1 {
    public static void main(String[] args) {

        InterfaceAddNumbers an = (a, b) -> a + b;
        int addNumbersResult = an.addNumbers(10, 20);
        System.out.println(addNumbersResult);
    }
}
