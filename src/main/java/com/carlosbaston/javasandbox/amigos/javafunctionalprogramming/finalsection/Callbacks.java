package com.carlosbaston.javasandbox.amigos.javafunctionalprogramming.finalsection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Consumer;

public class Callbacks {

    private static Logger logger =
            LoggerFactory.getLogger(Callbacks.class.getName());

    public static void main(String[] args) {
        Consumer<String> callback = value -> logger.info("Last " +
                        "Name Missing {}", value);

        hello("Carlos", null, callback);

    }

    static void hello(String fname, String lname,
                      Consumer<String> callback) {

        logger.info(fname);

        if (lname != null) {
            logger.info(lname);
        } else {
           callback.accept(fname);
        }
    }
}
