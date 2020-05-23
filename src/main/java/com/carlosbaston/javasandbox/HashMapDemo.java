package com.carlosbaston.javasandbox;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("A", "Adam");
        hm.put("B", "Bobby");
        hm.put("C", "Courtney");
        hm.put("D", "Derek");
        hm.put("B", "Britney");
        System.out.println(hm);
    }
}
