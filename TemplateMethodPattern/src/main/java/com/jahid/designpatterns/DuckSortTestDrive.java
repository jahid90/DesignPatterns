package com.jahid.designpatterns;

import java.util.Arrays;

/**
 * Created by jahidul.s on 3/2/2015.
 */
public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huey", 2)
        };

        System.out.println("Before sorting...");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nAfter sorting...");
        display(ducks);
    }

    private static void display(Duck[] ducks) {
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }
}
