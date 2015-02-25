package com.jahid.designpatterns.commands;

import com.jahid.designpatterns.appliances.Light;

/**
 * Created by jahidul.s on 2/25/2015.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
