package com.jahid.designpatterns.variations.regional;

import com.jahid.designpatterns.ingredients.PizzaIngredientFactory;
import com.jahid.designpatterns.variations.VeggiePizza;

public class NYStyleVeggiePizza extends VeggiePizza {
    public NYStyleVeggiePizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }
}
