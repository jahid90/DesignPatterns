package com.jahid.designpatterns.commands;

import com.jahid.designpatterns.appliances.TV;

/**
 * Created by jahidul.s on 2/25/2015.
 */
public class TvOnCommand implements Command {
    TV tv;

    public TvOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
