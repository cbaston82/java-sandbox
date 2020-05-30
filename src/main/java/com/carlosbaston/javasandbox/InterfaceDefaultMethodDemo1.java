package com.carlosbaston.javasandbox;

import com.carlosbaston.javasandbox.common.InterfaceDefaultMethod1;

/**
 * Overriding 'default' method
 */
public class DefaultMethodDemo1 implements InterfaceDefaultMethod1 {

    @Override
    public void method1() {
        System.out.println("My own implementation");
    }

    public static void main(String[] args) {

       DefaultMethodDemo1 t = new DefaultMethodDemo1();
       t.method1();
    }
}
