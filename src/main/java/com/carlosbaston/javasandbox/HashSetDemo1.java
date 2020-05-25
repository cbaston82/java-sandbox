package com.carlosbaston.javasandbox;

import java.util.HashSet;

public class HashSetDemo1 {

    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        h.add("Shinny");
        h.add("Sunny");
        h.add("Rainy");
        h.add("Gloomy");
        h.add("Sunny");
        System.out.println(h);
    }
}
