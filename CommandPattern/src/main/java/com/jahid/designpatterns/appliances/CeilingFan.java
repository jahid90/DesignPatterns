package com.jahid.designpatterns.appliances;

/**
 * Created by jahidul.s on 2/25/2015.
 */
public class CeilingFan {
    private String room;
    private int speed;

    public static final int OFF = 0;
    public static final int LOW = 1;
    public static final int MEDIUM = 2;
    public static final int HIGH = 3;

    public CeilingFan(String room) {
        this.room = room;
        speed = OFF;
    }

    public void high() {
        System.out.println("Ceiling Fan set to High in " + room);
        speed = HIGH;
    }

    public void medium() {
        System.out.println("Ceiling Fan set to Medium in " + room);
        speed = MEDIUM;
    }

    public void low() {
        System.out.println("Ceiling Fan set to Low in " + room);
        speed = LOW;
    }

    public void off() {
        System.out.println("Turning Off Ceiling Fan in " + room);
        speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }
}
