package com.jahid.designpatterns.variations.regional;

import com.jahid.designpatterns.ingredients.PizzaIngredientFactory;
import com.jahid.designpatterns.variations.ClamPizza;

public class NYStyleClamPizza extends ClamPizza {
    public NYStyleClamPizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }
}
