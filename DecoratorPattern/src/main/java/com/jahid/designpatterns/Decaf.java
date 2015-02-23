package com.jahid.designpatterns;

/**
 * Created by jahidul.s on 2/23/2015.
 */
public class Decaf extends Beverage {

    public Decaf() {
        super();
        setDescription("Decaf");
        setSize(Beverage.GRANDE);
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
