package com.carlosbaston.javasandbox;

import com.carlosbaston.javasandbox.common.InterfaceDefaultMethod1;
import com.carlosbaston.javasandbox.common.InterfaceDefaultMethod2;
import com.carlosbaston.javasandbox.common.InterfaceStaticMethod1;

/**
 * Calling a static method from interface
 */
public class InterfaceStaticMethodDemo1 implements InterfaceStaticMethod1 {

    public static void main(String[] args) {

        // Only way to call interface static method is directory from the
        // static Interface
        InterfaceStaticMethod1.method1();

    }
}
