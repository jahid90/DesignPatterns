package com.jahid.designpatterns;

/**
 * Created by jahidul.s on 3/2/2015.
 */
public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsBeverage()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    final void boilWater() {
        System.out.println("Boiling water");
    }

    final void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // a hook, subclass may override if it wishes so
    boolean customerWantsBeverage() {
        return true;
    }
}
