package com.jahid.designpatterns.commands;

import com.jahid.designpatterns.appliances.Stereo;
import com.jahid.designpatterns.commands.Command;

/**
 * Created by jahidul.s on 2/25/2015.
 */
public class StereoOnWithCdCommand implements Command {
    Stereo stereo;

    public StereoOnWithCdCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(Stereo.DEFAULT_VOLUME);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
