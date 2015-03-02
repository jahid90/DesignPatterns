package com.jahid.designpatterns;

/**
 * Created by jahidul.s on 3/2/2015.
 */
public class Tea extends CaffeineBeverage {

    /*void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }*/

    @Override
    void brew() {
        steepTeaBag();
    }

    @Override
    void addCondiments() {
        addLemon();
    }

    /*void boilWater() {
        System.out.println("Boiling water");
    }*/

    private void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    /*void pourInCup() {
        System.out.println("Pouring into cup");
    }*/

    private void addLemon() {
        System.out.println("Adding Lemon");
    }
}
