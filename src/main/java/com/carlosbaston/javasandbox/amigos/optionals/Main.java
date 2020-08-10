package com.carlosbaston.javasandbox.amigos.optionals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Logger logger =
                LoggerFactory.getLogger(Main.class.getName());

        Optional<Object> empty = Optional.empty();
        logger.info("{}", empty.isPresent());

        logger.info("{}", empty.isEmpty());

        Optional<String> string = Optional.of("Carlos");
        logger.info("{}", string);
        logger.info("{}", string.isEmpty());
        logger.info("{}", string.isPresent());

        Optional<String> string2 = Optional.ofNullable("Carlos");
        String orElseGet = string2
                .map(String::toLowerCase)
                .orElseGet(() -> "orElseGet");
        logger.info("{}", orElseGet);
    }
}
