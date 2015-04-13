package com.jahid.designpatterns;

/**
 * Created by jahidul.s on 2/27/2015.
 */
public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(new Amplifier(), new Tuner(), new DVDPlayer(),
                new CDPlayer(), new Projector(), new TheaterLights(), new Screen(), new PopcornPopper());

        homeTheater.watchMovie();
        homeTheater.endMovie();
    }
}
