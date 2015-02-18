package com.jahid.designpatterns;

/**
 * Created by jahidul.s on 2/18/2015.
 */
public abstract class Duck {

    private String name;

    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void swim() {
        System.out.println(this.getName() + " is Swimming");
    }

    public void makeSound() {
        System.out.println(this.getName() + " says " + quackBehaviour.quack());
    }

    public void tryToFly() {
        System.out.println(this.getName() + ": " + flyBehaviour.fly());
    }

    public abstract void display();

}
