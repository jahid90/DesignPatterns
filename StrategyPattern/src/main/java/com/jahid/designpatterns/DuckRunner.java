package com.jahid.designpatterns;

import java.util.ArrayList;

/**
 * Created by jahidul.s on 2/18/2015.
 */
public class DuckRunner {
    public static void main(String[] args) {
        ArrayList<Duck> ducks = new ArrayList<Duck>();
        ducks.add(new MallardDuck());
        ducks.add(new RedheadDuck());
        ducks.add(new RubberDuck());
        ducks.add(new DecoyDuck());

        for (Duck duck : ducks) {
            duck.display();
            duck.makeSound();
            duck.swim();
            duck.tryToFly();

            System.out.println();
        }

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.tryToFly();
        modelDuck.makeSound();

        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.tryToFly();
    }
}
