package com.jahid.designpatterns;

/**
 * Created by jahidul.s on 3/16/2015.
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Machine is out of gumballs. Ejecting quarter.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No quarters in machine. Machine is out of gumballs.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Machine is out of gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("Machine is out of gumballs.");
    }
}
