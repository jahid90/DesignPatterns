package com.jahid.designpatterns;

import com.jahid.designpatterns.utils.Bundle;
import com.jahid.designpatterns.utils.Constants;

import static com.jahid.designpatterns.utils.Constants.HUMIDITY;
import static com.jahid.designpatterns.utils.Constants.TEMPERATURE;

/**
 * Created by jahidul.s on 2/20/2015.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private Subject weatherData;

    private double temperature;
    private double humidity;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;

        weatherData.registerObserver(this);
    }

    @Override
    public void update(Bundle bundle) {
        temperature = (Double)bundle.get(TEMPERATURE);
        humidity = (Double)bundle.get(HUMIDITY);

        display();
    }

    @Override
    public void display() {
        System.out.println(String.format("Current Conditions: %.2f degrees Celsius and %.2f%% humidity", temperature, humidity));
    }
}
