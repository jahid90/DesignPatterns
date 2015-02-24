package com.jahid.designpatterns.variations;

import com.jahid.designpatterns.ingredients.Clams;
import com.jahid.designpatterns.ingredients.PizzaIngredientFactory;

/**
 * Created by jahidul.s on 2/23/2015.
 */
public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    private Clams clams;

    public void setClams(Clams clams) {
        this.clams = clams;
    }

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());

        setDough(ingredientFactory.createDough());
        setSauce(ingredientFactory.createSauce());
        setCheese(ingredientFactory.createCheese());
        setClams(ingredientFactory.createClams());
    }
}

