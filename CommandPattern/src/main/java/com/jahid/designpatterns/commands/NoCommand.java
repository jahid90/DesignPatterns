package com.jahid.designpatterns.commands;

/**
 * Created by jahidul.s on 2/25/2015.
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("No Command assigned");
    }

    @Override
    public void undo() {

    }
}
