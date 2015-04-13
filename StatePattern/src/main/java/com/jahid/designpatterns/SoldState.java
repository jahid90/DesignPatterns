package com.jahid.designpatterns;

/**
 * Created by jahidul.s on 3/16/2015.
 */
public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Dispensing in progress...");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sell already made. Can't take back quarter now.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Dispensing in progress. Please wait for previous transaction to complete");
    }

    @Override
    public void dispense() {
        gumballMachine.setState(gumballMachine.NO_QUARTER);
        gumballMachine.releaseBall();
    }
}
