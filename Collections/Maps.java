package com.gamingz.Collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<String ,Integer> contacts = new HashMap<>();
        contacts.put("Harsh",210091);
        contacts.put("Aryan",813223);
        contacts.put("Ayan",823222);

        System.out.println(contacts.get("Aryan"));

        contacts.remove("Ayan");

        contacts.replace("Aryan",813223,788721);

        System.out.println(contacts.get("Aryan"));
    }
}
