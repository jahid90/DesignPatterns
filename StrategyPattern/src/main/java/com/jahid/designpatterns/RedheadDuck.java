package com.jahid.designpatterns;

/**
 * Created by jahidul.s on 2/18/2015.
 */
public class RedheadDuck extends Duck {

    public RedheadDuck() {
        super();
        setName("Redhead Duck");

        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new Quack());
    }

    @Override
    public void display() {
        System.out.println("Displaying a Redhead Duck");
    }
}
