package com.jahid.designpatterns;

/**
 * Created by jahidul.s on 2/23/2015.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    double[] costForSize = new double[] {0.10, 0.15, 0.20};

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + costForSize[getSize()];
    }
}
