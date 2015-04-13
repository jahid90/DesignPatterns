package com.jahid.designpatterns.stores;

import com.jahid.designpatterns.variations.Pizza;

/**
 * Created by jahidul.s on 2/23/2015.
 */
public abstract class PizzaStore {
    /*SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }*/

    public Pizza orderPizza(int type) {
        Pizza pizza = createPizza(type);    // Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(int type);
}
