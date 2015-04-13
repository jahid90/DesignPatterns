package com.jahid.designpatterns;

/**
 * Created by jahidul.s on 3/16/2015.
 */
public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
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
        System.out.println("You're a winner! You get two gumballs for your quarter.");
        gumballMachine.setState(gumballMachine.NO_QUARTER);
        gumballMachine.releaseBall();

        if (gumballMachine.count > 0) {
            gumballMachine.setState(gumballMachine.NO_QUARTER);
            gumballMachine.releaseBall();
        }
    }
}
