package com.jahid.designpatterns.variations;

import com.jahid.designpatterns.ingredients.Cheese;
import com.jahid.designpatterns.ingredients.Clams;
import com.jahid.designpatterns.ingredients.Dough;
import com.jahid.designpatterns.ingredients.Sauce;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jahidul.s on 2/23/2015.
 */
public abstract class Pizza {
    public static final int CHEESE = 0;
    public static final int PEPPERONI = 1;
    public static final int CLAM = 2;
    public static final int VEGGIE = 3;

    private String name;
    private Dough dough;
    private Sauce sauce;
    private Cheese cheese;
    private List<String> toppings = new ArrayList<String>();

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza into official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void setDough(Dough dough) {
        this.dough = dough;
    }

    protected void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    protected void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    protected void addToppings(String topping) {
        toppings.add(topping);
    }
}
