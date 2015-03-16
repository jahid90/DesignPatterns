package com.jahid.designpatterns;

/**
 * Created by jahidul.s on 3/16/2015.
 */
public class GumballMachine {
    State state;
    int count = 0;

    public final State SOLD_OUT;
    public final State NO_QUARTER;
    public final State HAS_QUARTER;
    public final State SOLD;
    public final State WINNER;

    public GumballMachine(int count) {
        SOLD_OUT        = new SoldOutState(this);
        NO_QUARTER      = new NoQuarterState(this);
        HAS_QUARTER     = new HasQuarterState(this);
        SOLD            = new SoldState(this);
        WINNER          = new WinnerState(this);

        this.count = count;

        if (count > 0) {
            state = NO_QUARTER;
        }
        else {
            state = SOLD_OUT;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        if (count > 0) {
            --count;
            System.out.println("A gumball comes rolling out.");
        }
        else {
            System.out.println("Oops, out of gumballs!");
            System.out.println("Ejecting the quarter.");
            setState(SOLD_OUT);
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "\nMighty Gumball Inc.\nInventory: " + count + " gumballs\nWaiting for quarter...\n";
    }
}
