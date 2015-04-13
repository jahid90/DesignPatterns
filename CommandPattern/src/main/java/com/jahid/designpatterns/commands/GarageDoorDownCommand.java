package com.jahid.designpatterns.commands;

import com.jahid.designpatterns.appliances.GarageDoor;

/**
 * Created by jahidul.s on 2/25/2015.
 */
public class GarageDoorDownCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {

    }
}
