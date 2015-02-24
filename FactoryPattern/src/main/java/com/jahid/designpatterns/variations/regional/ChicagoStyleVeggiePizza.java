package com.jahid.designpatterns.variations.regional;

import com.jahid.designpatterns.ingredients.PizzaIngredientFactory;
import com.jahid.designpatterns.variations.VeggiePizza;

public class ChicagoStyleVeggiePizza extends VeggiePizza {
    public ChicagoStyleVeggiePizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }
}
