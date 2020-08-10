package com.carlosbaston.javasandbox.builderpractice;

public enum Gender {
    MALE("Boy"),
    FEMALE("Girl"),
    RATHER_NOT_SAY("Not sure");

    private String type;

    Gender(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
