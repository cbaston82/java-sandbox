package com.carlosbaston.javasandbox.builderpractice;

import java.util.UUID;

import static com.google.common.base.Preconditions.checkNotNull;

public class Person {
    private final UUID uuid;
    private String fname;
    private final String lname;
    private final Gender gender;

    public Person(Builder builder) {
        this.uuid = builder.uuid;
        this.fname = checkNotNull(builder.fname);
        this.lname = builder.lname;
        this.gender = builder.gender;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public Gender getGender() {
        return gender;
    }

    public static class Builder {

        private UUID uuid;
        private String fname;
        private String lname;
        private Gender gender;

        public Builder uuid(final UUID uuid) {
           this.uuid = uuid;
           return this;
        }

        public Builder fname(String fname) {
            this.fname = fname;
            return this;
        }

        public Builder lname(final String lname) {
            this.lname = lname;
            return this;
        }

        public Builder gender(final Gender gender) {
            this.gender = gender;
            return this;
        }

        public Person build() {
            return new Person (this);
        }
    }
}
