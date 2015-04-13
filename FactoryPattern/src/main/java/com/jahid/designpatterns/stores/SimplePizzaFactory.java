package com.jahid.designpatterns.stores;

import com.jahid.designpatterns.ingredients.PizzaIngredientFactory;
import com.jahid.designpatterns.variations.*;

import static com.jahid.designpatterns.variations.Pizza.*;

/**
 * Created by jahidul.s on 2/23/2015.
 */
public class SimplePizzaFactory {
    PizzaIngredientFactory ingredientFactory;

    public SimplePizzaFactory(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public Pizza createPizza(int type) {
        Pizza pizza = null;

        if (CHEESE == type) {
            pizza = new CheesePizza(ingredientFactory);
        }
        else if (PEPPERONI == type) {
            pizza = new PepperoniPizza(ingredientFactory);
        }
        else if (CLAM == type) {
            pizza = new ClamPizza(ingredientFactory);
        }
        else if (VEGGIE == type) {
            pizza =  new VeggiePizza(ingredientFactory);
        }

        return pizza;
    }
}
