package com.jahid.designpatterns.commands;

import com.jahid.designpatterns.appliances.TV;

/**
 * Created by jahidul.s on 2/25/2015.
 */
public class TvOffCommand implements Command {
    TV tv;

    public TvOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
