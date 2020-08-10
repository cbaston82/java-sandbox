package com.carlosbaston.javasandbox.javacleancode.builder;

import com.google.common.collect.ImmutableList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class.getName());

        Name name = new Name
                .Builder()
                .firstName("Carlos")
                .middleNames(ImmutableList.of("Big West"))
                .surName("Baston")
                .build();

        Address address = new Address
                .Builder()
                .houseNumber(4937)
                .street("Drifting Pebble St")
                .city("Las Vegas")
                .zipCode("89081")
                .build();

        Account account = new Account.Builder()
                .id(1)
                .address(address)
                .name(name)
                .email("carlos.baston@gmail.com")
                .build();

        logger.info("{}", account);

    }
}
