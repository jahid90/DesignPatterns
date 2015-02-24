package com.jahid.designpatterns.variations.regional;

import com.jahid.designpatterns.ingredients.PizzaIngredientFactory;
import com.jahid.designpatterns.variations.ClamPizza;

public class ChicagoStyleClamPizza extends ClamPizza {
    public ChicagoStyleClamPizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }
}
