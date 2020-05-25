package com.carlosbaston.javasandbox;

import com.carlosbaston.javasandbox.common.InterfaceAddNumbers;
import com.carlosbaston.javasandbox.common.InterfaceAddNumbersImpl;

/**
 * This is sorting pre lambda. Pre Java 1.8
 * Demo of showing non lambda alternative. Pre java 1.8
 */
public class SortingDemo2 {
    public static void main(String[] args) {

        InterfaceAddNumbers l = new InterfaceAddNumbersImpl();
        int addResults = l.addNumbers(10, 20);
        System.out.println(addResults);
    }
}
