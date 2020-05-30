package com.carlosbaston.javasandbox;

import com.carlosbaston.javasandbox.common.TestData;

import java.util.ArrayList;
import java.util.Date;
import java.util.function.Supplier;

/**
 * Using Supplier get()
 */
public class SupplierDemo {

    public static void main(String[] args) {

        // Printing current date
        Supplier<Date> s1 = () -> new Date();
        System.out.println(s1.get());
        System.out.println(s1.get());
        System.out.println(s1.get());

        // getting a random string from array
        Supplier<String> s2 = () -> {
            ArrayList<String> arrayListOfStrings = TestData.getArrayListOfStrings();
            int index = (int) (Math.random() * arrayListOfStrings.size());
            return arrayListOfStrings.get(index);
        };
        System.out.println(s2.get());
    }
}
