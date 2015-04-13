package com.jahid.designpatterns;

import java.util.Random;

/**
 * Created by jahidul.s on 3/16/2015.
 */
public class HasQuarterState implements State {
    GumballMachine gumballMachine;
    Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Machine already has a quarter!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter ejected.");
        gumballMachine.setState(gumballMachine.NO_QUARTER);
    }

    @Override
    public void turnCrank() {
        System.out.println("Crank turned");
        int winner = randomWinner.nextInt(10);
        if (winner == 0 && gumballMachine.count > 1) {
            gumballMachine.setState(gumballMachine.WINNER);
        }
        else {
            gumballMachine.setState(gumballMachine.SOLD);
        }
    }

    @Override
    public void dispense() {
        System.out.println("You need to turn the crank.");
    }
}
