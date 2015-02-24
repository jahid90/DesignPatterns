package com.jahid.designpatterns.variations.regional;

import com.jahid.designpatterns.ingredients.PizzaIngredientFactory;
import com.jahid.designpatterns.variations.CheesePizza;

public class NYStyleCheesePizza extends CheesePizza {
    public NYStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    /*public NYStyleCheesePizza() {
        setName("NY Style Sauce and Cheese Pizza");
        setDough("Thin Crust Dough");
        setSauce("Marinara Sauce");

        addToppings("Grated Reggiano Cheese");
    }*/
}
