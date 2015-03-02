package com.jahid.designpatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jahidul.s on 3/2/2015.
 */
public class Coffee extends CaffeineBeverageWithHook {

    /*void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }*/

    @Override
    void brew() {
        brewCoffeeGrinds();
    }

    @Override
    void addCondiments() {
        addSugarAndMilk();
    }

    /*void boilWater() {
        System.out.println("Boiling water");
    }*/

    private void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }

    /*void pourInCup() {
        System.out.println("Pouring into cup");
    }*/

    private void addSugarAndMilk() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    boolean customerWantsBeverage() {
        if (getUserInput().toLowerCase().startsWith("y")) {
            return true;
        }
        else {
            return false;
        }
    }

    private String getUserInput() {
        String response = null;

        System.out.print("Would you like milk and sugar with your coffee (y/n)? ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            response = br.readLine();
        } catch (IOException e) {
            System.out.println("IOException while trying to read response");
            response = "no";
        }

        return response;

    }
}
