package com.carlosbaston.javasandbox;

public class LambdaImplementingRunnerInterfaceRunMethod {

    public static void main(String[] args) {

        Runnable r = () -> {
            for (int i = 0; i < 4; i++) {
                System.out.println("Child Thread");
            }
        };


        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 4; i++) {
            System.out.println("Main Thread");
        }
    }
}
