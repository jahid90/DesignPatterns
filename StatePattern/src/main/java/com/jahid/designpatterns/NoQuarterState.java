package com.jahid.designpatterns;

/**
 * Created by jahidul.s on 3/16/2015.
 */
public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Quarter inserted.");
        gumballMachine.setState(gumballMachine.HAS_QUARTER);
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No quarters have been inserted.");
    }

    @Override
    public void turnCrank() {
        System.out.println("You need to insert quarters first.");
    }

    @Override
    public void dispense() {
        System.out.println("No money, no honey!");
    }
}
