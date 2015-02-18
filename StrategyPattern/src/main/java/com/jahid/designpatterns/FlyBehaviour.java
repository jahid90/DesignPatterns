package com.jahid.designpatterns;

/**
 * Created by jahidul.s on 2/18/2015.
 */
public interface FlyBehaviour {
    public String fly();
}

/*
 *       family of fly behaviours follow
 */
class FlyWithWings implements FlyBehaviour {
    @Override
    public String fly() { return "Flying high"; }
}

class FlyNoWay implements FlyBehaviour {
    @Override
    public String fly() { return "Can't fly"; }
}

class FlyRocketPowered implements FlyBehaviour {
    @Override
    public String fly() { return "Flying with a rocket"; }
}
