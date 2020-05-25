package com.carlosbaston.javasandbox;

import com.carlosbaston.javasandbox.common.InterfaceOneMethod;

/**
 * Anonymous Inner Class that implements an interface witch contains only one
 * abstract method. Here lambda can be used
 */
class AnonymousInnerClassDemo4 {

    public static void main(String[] args) {

        InterfaceOneMethod t = () -> System.out.println("test1");

        t.method1();
    }
}

