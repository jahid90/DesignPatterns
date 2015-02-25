package com.jahid.designpatterns;

import com.jahid.designpatterns.commands.Command;
import com.jahid.designpatterns.commands.NoCommand;

/**
 * Created by jahidul.s on 2/25/2015.
 */
public class RemoteControl {
    public static final int MAX_SLOTS = 7;

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[MAX_SLOTS];
        offCommands = new Command[MAX_SLOTS];

        Command noCommand  = new NoCommand();
        for (int i = 0; i < MAX_SLOTS; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();

        buffer.append("\n-------Remote Control-------\n");
        for (int i = 0; i < MAX_SLOTS; i++) {
            buffer.append("[slot " + i + "] " + onCommands[i].getClass().getSimpleName() + "    " + offCommands[i].getClass().getSimpleName() + "\n");
        }
        buffer.append("[undo] " + undoCommand.getClass().getSimpleName() + "\n");

        return buffer.toString();
    }
}
