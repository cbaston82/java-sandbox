package com.carlosbaston.javasandbox;

import com.carlosbaston.javasandbox.common.User;

import java.util.Scanner;
import java.util.function.Predicate;

/**
 * Using predicate to check username and password
 */
public class PredicateDemo4 {

    public static void main(String[] args) {
        Predicate<User> predicate = user -> user.getPassword().equals(
                "password") && user.getUsername().equals("userOne");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your username");
        sc.next();
        System.out.println("Please enter password");
        sc.next();

        User user = new User("userOne", "password");

        if (predicate.test(user)) {
            System.out.println("Valid credentials you are now logged in.");
        } else {
            System.out.println("Invalid credentials. Please try again");
        }
    }
}
