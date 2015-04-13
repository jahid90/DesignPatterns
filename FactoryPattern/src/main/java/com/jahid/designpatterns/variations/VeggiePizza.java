package com.jahid.designpatterns.variations;

import com.jahid.designpatterns.ingredients.PizzaIngredientFactory;
import com.jahid.designpatterns.ingredients.Veggies;

/**
 * Created by jahidul.s on 2/23/2015.
 */
public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    Veggies[] veggies;

    public void setVeggies(Veggies[] veggies) {
        this.veggies = veggies;
    }

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());

        setDough(ingredientFactory.createDough());
        setSauce(ingredientFactory.createSauce());
        setCheese(ingredientFactory.createCheese());
        setVeggies(ingredientFactory.createVeggies());
    }
}

