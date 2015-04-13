package com.jahid.designpatterns;

/**
 * Created by jahidul.s on 2/18/2015.
 */
public interface QuackBehaviour {
    public String quack();
}

class Quack implements QuackBehaviour {
    @Override
    public String quack() { return "quack!"; }
}

class Squeak implements QuackBehaviour {
    @Override
    public String quack() { return "squeak!"; }
}

class MuteQuack implements QuackBehaviour {
    @Override
    public String quack() { return "nothing!"; }
}
