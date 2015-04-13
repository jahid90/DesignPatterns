package com.jahid.designpatterns;

/**
 * Created by jahidul.s on 2/23/2015.
 */
public class Espresso extends Beverage {

    public Espresso() {
        super();
        setDescription("Espresso");
        setSize(Beverage.GRANDE);
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
