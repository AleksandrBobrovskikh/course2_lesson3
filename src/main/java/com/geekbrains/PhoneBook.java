package com.geekbrains;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    HashMap<Long, String> book = new HashMap<>();

    public void add(Long number, String lastname) {
        book.put(number, lastname);
    }

    public void get(String lastname) {
        System.out.println("Телефоны с фамилией " + lastname + ": ");
        for (Map.Entry<Long, String> o : book.entrySet()) {
            if (o.getValue().equals(lastname))
                System.out.println(o.getKey());
        }
    }
}

