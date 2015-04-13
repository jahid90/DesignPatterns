package com.jahid.designpatterns.commands;

import com.jahid.designpatterns.appliances.Light;
import com.jahid.designpatterns.commands.Command;

/**
 * Created by jahidul.s on 2/25/2015.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
