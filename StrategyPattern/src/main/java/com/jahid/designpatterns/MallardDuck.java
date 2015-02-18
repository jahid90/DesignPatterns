package com.jahid.designpatterns;

/**
 * Created by jahidul.s on 2/18/2015.
 */
public class MallardDuck extends Duck {
    
    public MallardDuck() {
        super();
        setName("Mallard Duck");

        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new Quack());
    }

    @Override
    public void display() {
        System.out.println("Displaying a Mallard Duck");
    }
}
