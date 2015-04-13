package com.jahid.designpatterns;

import com.jahid.designpatterns.utils.Bundle;

import static com.jahid.designpatterns.utils.Constants.HUMIDITY;
import static com.jahid.designpatterns.utils.Constants.PRESSURE;
import static com.jahid.designpatterns.utils.Constants.TEMPERATURE;

/**
 * Created by jahidul.s on 2/20/2015.
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private Subject weatherData;

    private double pressure;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;

        weatherData.registerObserver(this);
    }

    @Override
    public void update(Bundle bundle) {
        pressure = (Double)bundle.get(PRESSURE);

        display();
    }

    @Override
    public void display() {
        System.out.println(String.format("Forecast: %.2f mm Hg pressure expected tomorrow", pressure));
    }
}
