package com.jahid.designpatterns.commands;

import com.jahid.designpatterns.appliances.GarageDoor;

/**
 * Created by jahidul.s on 2/25/2015.
 */
public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {

    }
}
