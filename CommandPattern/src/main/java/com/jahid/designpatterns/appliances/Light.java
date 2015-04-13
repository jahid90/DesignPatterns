package com.jahid.designpatterns.appliances;

/**
 * Created by jahidul.s on 2/25/2015.
 */
public class Light {
    private String room;

    public Light(String room) {
        this.room = room;
    }

    public void on() {
        System.out.println("Light is On in " + room);
    }

    public void off() {
        System.out.println("Light is Off in " + room);
    }
}
