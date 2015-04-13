package com.jahid.designpatterns;

/**
 * Created by jahidul.s on 2/23/2015.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        super();
        setDescription("Dark Roast Coffee");
        setSize(Beverage.GRANDE);
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
