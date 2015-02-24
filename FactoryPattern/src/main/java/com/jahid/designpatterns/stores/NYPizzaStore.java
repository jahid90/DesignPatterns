package com.jahid.designpatterns.stores;

import com.jahid.designpatterns.ingredients.NYPizzaIngredientFactory;
import com.jahid.designpatterns.ingredients.PizzaIngredientFactory;
import com.jahid.designpatterns.variations.*;

import static com.jahid.designpatterns.variations.Pizza.*;

/**
 * Created by jahidul.s on 2/23/2015.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(int type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (CHEESE == type) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        else if (PEPPERONI == type) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        else if (CLAM == type) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        else if (VEGGIE == type) {
            pizza =  new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }

        return pizza;
    }
}
