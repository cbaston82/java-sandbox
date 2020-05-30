package com.carlosbaston.javasandbox;

import com.carlosbaston.javasandbox.common.InterfaceOneMethod;

/**
 * Showing difference between anonymous innerclass 'this' and lambda 'this'
 */
class AnonymousInnerClassDemo3 {

    int x = 999;

    public void method1() {

        // Here 'this' is a inner class member x = 888
        // Able to declare instance variable in anonymous inner class
        InterfaceOneMethod smi1 = new InterfaceOneMethod() {
            int x = 888;
            public void method1() {
                System.out.println(this.x);
            }
        };

        // Here 'this' is outer class member x = 999
        // Not possible to declare instance variables in lambda expressions
        InterfaceOneMethod smi2 = () -> {
            int x = 1000;
            System.out.println(this.x);
        };

        smi1.method1();
        smi2.method1();
    }

    public static void main(String[] args) {
        AnonymousInnerClassDemo3 aicd2 = new AnonymousInnerClassDemo3();
        aicd2.method1();
    }


}
