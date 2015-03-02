package com.jahid.designpatterns;

/**
 * Created by jahidul.s on 2/27/2015.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
