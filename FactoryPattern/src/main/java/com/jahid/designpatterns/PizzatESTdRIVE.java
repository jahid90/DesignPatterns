package com.jahid.designpatterns;

import static com.jahid.designpatterns.Pizza.CHEESE;

/**
 * Created by jahidul.s on 2/24/2015.
 */
public class PizzatESTdRIVE {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYStylePizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza(CHEESE);
    }
}
