package com.jahid.designpatterns.commands;

import com.jahid.designpatterns.appliances.Stereo;

/**
 * Created by jahidul.s on 2/25/2015.
 */
public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(Stereo.DEFAULT_VOLUME);
    }
}
