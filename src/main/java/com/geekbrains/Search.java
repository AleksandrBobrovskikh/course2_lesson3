package com.geekbrains;

import java.util.Arrays;
import java.util.HashSet;


public class Search {

    String[] array = {"one", "two", "three", "four", "five", "six", "three", "four", "five", "six", "two", "three", "four"};

    public void searching() {
        int count = 0;
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(array));
        System.out.print("Список уникальных значений: ");
        System.out.println(hashSet);

        for (String s : hashSet) {
            for (String value : array) {
                if (s.equals(value))
                    count++;
            }
            System.out.println(s + " встречается " + count + " раз.");
            count = 0;
        }
        System.out.println();
    }

}

