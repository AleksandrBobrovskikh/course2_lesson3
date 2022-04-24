package com.geekbrains;

import java.util.HashMap;

public class PhoneBook {
    HashMap <Long, String> book = new HashMap<>();

    public void add (Long number, String lastname){
        book.put(number, lastname);
    }

    public void get (String lastname){
        for (String s : book.values()) {
            System.out.println(book.get(89199888701L));

        }


        }
    }

