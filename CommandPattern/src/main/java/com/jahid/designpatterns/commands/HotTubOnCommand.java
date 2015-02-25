package com.jahid.designpatterns.commands;

import com.jahid.designpatterns.appliances.Hottub;

/**
 * Created by jahidul.s on 2/25/2015.
 */
public class HotTubOnCommand implements Command {
    Hottub hottub;

    public HotTubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.jetsOn();
    }

    @Override
    public void undo() {
        hottub.jetsOff();
    }
}
