package com.jahid.designpatterns;

/**
 * Created by jahidul.s on 2/18/2015.
 */
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        super();
        setName("Decoy Duck");

        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("Displaying Decoy Duck");
    }
}
