package com.carlosbaston.javasandbox;


/**
 * Here Runnable is used as Lambda Expression
 */
public class AnonymousInnerClassDemo5 {

    public static void main(String[] args) {

//        Runnable r = () -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("From Child ");
//            }
//        };

        Thread t = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("From Child ");
            }
        });

        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("From Main");
        }

    }
}

