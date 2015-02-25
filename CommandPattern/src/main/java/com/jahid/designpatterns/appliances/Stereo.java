package com.jahid.designpatterns.appliances;

/**
 * Created by jahidul.s on 2/25/2015.
 */
public class Stereo {
    public static final int DEFAULT_VOLUME = 11;

    public void on() {
        System.out.println("Stereo is On");
    }

    public void off() {
        System.out.println("Turning Off Stereo");
    }

    public void setCd() {
        System.out.println("Stereo set to play CD");
    }

    public void setDvd() {
    }

    public void setRadio() {
    }

    public void setVolume(int volumeLevel) {
        System.out.println("Stereo Volume set to " + volumeLevel);
    }
}
