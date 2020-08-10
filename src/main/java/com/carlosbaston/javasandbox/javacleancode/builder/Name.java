package com.carlosbaston.javasandbox.javacleancode.builder;

import java.util.List;

public class Name {
    private final String firstName;
    private final List<String> middleNames;
    private final String surName;

    private Name(Builder builder) {
        this.firstName = builder.firstName;
        this.middleNames = builder.middleNames;
        this.surName = builder.surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public List<String> getLastName() {
        return middleNames;
    }

    public String getSurName() {
        return surName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", middleNames=" + middleNames +
                ", surName='" + surName + '\'' +
                '}';
    }

    public static class Builder {

        private String firstName;
        private List<String> middleNames;
        private String surName;

        public Builder firstName(final String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder middleNames(final List<String> middleNames) {
            this.middleNames = middleNames;
            return this;
        }

        public Builder surName(final String surName) {
            this.surName = surName;
            return this;
        }

        public Name build() {
            return new Name(this);
        }
    }
}
