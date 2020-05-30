package com.carlosbaston.javasandbox;

import com.carlosbaston.javasandbox.common.InterfaceDefaultMethod1;
import com.carlosbaston.javasandbox.common.InterfaceDefaultMethod2;

/**
 * Implementing multiple Interfaces with same default method. Choosing a
 * default method
 */
public class DefaultMethodDemo2 implements InterfaceDefaultMethod1, InterfaceDefaultMethod2 {

    // Option: Override completely
//    @Override
//    public void method1() {
//        System.out.println("My own implementation");
//    }

   // Option: Choose which interface you want to use
    @Override
    public void method1() {
        InterfaceDefaultMethod1.super.method1();
    }

    public static void main(String[] args) {

        DefaultMethodDemo2 dmd2 = new DefaultMethodDemo2();
        dmd2.method1();

    }
}
