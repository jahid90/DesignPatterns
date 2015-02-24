package com.jahid.designpatterns.variations.regional;

import com.jahid.designpatterns.ingredients.PizzaIngredientFactory;
import com.jahid.designpatterns.variations.CheesePizza;

public class ChicagoStyleCheesePizza extends CheesePizza {
    public ChicagoStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }
    /*public ChicagoStyleCheesePizza() {
        setName("Chicago Style Deep Dish Cheese Pizza");
        setDough("Extra Thick Crust Dough");
        setSauce("Plum Tomato Sauce");

        addToppings("Shredded Mozzarella Cheese");
    }*/

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
