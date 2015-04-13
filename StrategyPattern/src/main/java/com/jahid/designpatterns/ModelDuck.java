package com.jahid.designpatterns;

/**
 * Created by jahidul.s on 2/18/2015.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        super();
        setName("Model Duck");

        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new Quack());
    }

    @Override
    public void display() {
        System.out.println("Displaying a Model Duck");
    }
}
