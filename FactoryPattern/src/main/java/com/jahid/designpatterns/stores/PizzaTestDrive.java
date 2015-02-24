package com.jahid.designpatterns.stores;

import com.jahid.designpatterns.stores.ChicagoPizzaStore;
import com.jahid.designpatterns.stores.NYPizzaStore;
import com.jahid.designpatterns.stores.PizzaStore;
import com.jahid.designpatterns.variations.Pizza;

import static com.jahid.designpatterns.variations.Pizza.CHEESE;
import static com.jahid.designpatterns.variations.Pizza.PEPPERONI;
import static com.jahid.designpatterns.variations.Pizza.VEGGIE;

/**
 * Created by jahidul.s on 2/24/2015.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza(CHEESE);
        System.out.println("Ethan ordered a " + pizza.getName());
        System.out.println();

        pizza = chicagoPizzaStore.orderPizza(VEGGIE);
        System.out.println("Joel ordered a " + pizza.getName());
        System.out.println();
    }
}
