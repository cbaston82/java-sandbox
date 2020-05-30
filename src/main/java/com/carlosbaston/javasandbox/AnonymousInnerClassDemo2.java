package com.carlosbaston.javasandbox;

import com.carlosbaston.javasandbox.common.InterfaceThreeMethod;

/**
 * Anonymous Inner Class that implements an interface which contains multiple
 * methods. Here Lambda cannot be used.
 */
class AnonymousInnerClassDemo2 {
    public static void main(String[] args) {

        InterfaceThreeMethod t = new InterfaceThreeMethod() {

            @Override
            public void method1() {
                System.out.println("test1");
            }

            @Override
            public void method2() {
                System.out.println("test2");
            }

            @Override
            public void method3() {
                System.out.println("test3");
            }
        };

        t.method1();
        t.method2();
        t.method3();
    }
}

