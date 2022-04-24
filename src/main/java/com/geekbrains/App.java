package com.geekbrains;

public class App {
    public static void main(String[] args) {
        Search s = new Search();
        s.searching();

        PhoneBook b = new PhoneBook();
        b.add( 89199888700L, "Bobrovskih");
        b.add( 89199888701L, "Bobrovsk");
        b.add( 89199888702L, "Bobrovs");
        b.add( 89199888733L, "Bobr");
        b.add( 89199888744L, "Bobr");

        b.get("Bobr");
    }
}
