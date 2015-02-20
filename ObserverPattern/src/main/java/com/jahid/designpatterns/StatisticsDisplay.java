package com.jahid.designpatterns;

import com.jahid.designpatterns.utils.Bundle;

import java.util.Random;

import static com.jahid.designpatterns.utils.Constants.HUMIDITY;
import static com.jahid.designpatterns.utils.Constants.TEMPERATURE;

/**
 * Created by jahidul.s on 2/20/2015.
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private Subject weatherData;

    private double temperature;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;

        weatherData.registerObserver(this);
    }

    @Override
    public void update(Bundle bundle) {
        temperature = (Double)bundle.get(TEMPERATURE);
        temperature += (new Random().nextDouble() - 0.5);

        display();
    }

    @Override
    public void display() {
        System.out.println(String.format("Statistics: %.2f degrees Celsius average for the last 7 days", temperature));
    }
}
