package com.jahid.designpatterns;

import com.jahid.designpatterns.commands.Command;

/**
 * Created by jahidul.s on 2/25/2015.
 */
public class SimpleRemoteControl {
    Command slot;

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonPressed() {
        slot.execute();
    }
}
