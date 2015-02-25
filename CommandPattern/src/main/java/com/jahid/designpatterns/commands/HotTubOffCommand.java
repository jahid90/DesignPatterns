package com.jahid.designpatterns.commands;

import com.jahid.designpatterns.appliances.Hottub;

/**
 * Created by jahidul.s on 2/25/2015.
 */
public class HotTubOffCommand implements Command {
    Hottub hottub;

    public HotTubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.jetsOff();
    }

    @Override
    public void undo() {
        hottub.jetsOn();
    }
}
