package com.carlosbaston.javasandbox;

public class AnonymousInnerClassDemo1 {

    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("From Child ");
                }
            }
        };

        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("From Main");
        }

    }
}
