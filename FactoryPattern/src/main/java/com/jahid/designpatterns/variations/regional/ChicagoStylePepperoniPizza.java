package com.jahid.designpatterns.variations.regional;

import com.jahid.designpatterns.ingredients.PizzaIngredientFactory;
import com.jahid.designpatterns.variations.PepperoniPizza;

public class ChicagoStylePepperoniPizza extends PepperoniPizza {
    public ChicagoStylePepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }
}
