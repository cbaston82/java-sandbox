package com.carlosbaston.javasandbox.common;

public interface InterfaceDefaultMethod {
    default void method1() {
        System.out.println("Default Method");
    }
}
