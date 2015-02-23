package com.jahid.designpatterns;

/**
 * Created by jahidul.s on 2/23/2015.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        super();
        setDescription("House Blend Coffee");
        setSize(Beverage.GRANDE);
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
