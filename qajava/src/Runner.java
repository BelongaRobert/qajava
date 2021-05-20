package com.qa.classes;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();

        Person Josha = new Person("Josha", 25, "Female");

        // System.out.println(Josha.age);
        // System.out.println(Josha.speak("hello"));

        Book test = new Book("Adventure Island", "Robert Louis Stevenson", "adventure");
        System.out.println(test.title);

    }
}
