package com.jahid.designpatterns;

/**
 * Created by jahidul.s on 2/18/2015.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        super();
        setName("Rubber Duck");

        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new Squeak());
    }

    @Override
    public void display() {
        System.out.println("Displaying Rubber Duck");
    }
}
