package com.jahid.designpatterns;

/**
 * Created by jahidul.s on 3/2/2015.
 */
public class StarbuzzCafe {
    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        CaffeineBeverageWithHook coffee = new Coffee();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
    }
}
