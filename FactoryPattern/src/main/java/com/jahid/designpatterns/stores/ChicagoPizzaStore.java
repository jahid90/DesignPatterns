package com.jahid.designpatterns.stores;

import com.jahid.designpatterns.ingredients.ChicagoPizzaIngredientFactory;
import com.jahid.designpatterns.ingredients.PizzaIngredientFactory;
import com.jahid.designpatterns.variations.*;

import static com.jahid.designpatterns.variations.Pizza.*;

/**
 * Created by jahidul.s on 2/23/2015.
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(int type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (CHEESE == type) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }
        else if (PEPPERONI == type) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        else if (CLAM == type) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }
        else if (VEGGIE == type) {
            pizza =  new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        }

        return pizza;
    }
}
