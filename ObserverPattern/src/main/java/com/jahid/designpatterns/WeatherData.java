package com.jahid.designpatterns;

import com.jahid.designpatterns.utils.Bundle;
import com.jahid.designpatterns.utils.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.jahid.designpatterns.utils.Constants.HUMIDITY;
import static com.jahid.designpatterns.utils.Constants.PRESSURE;
import static com.jahid.designpatterns.utils.Constants.TEMPERATURE;

/**
 * Created by jahidul.s on 2/18/2015.
 */
class WeatherData implements Subject {

    private List<Observer> observers;
    private double temperature;
    private double pressure;
    private double humidity;

    public WeatherData() {
        observers = new ArrayList<Observer>();

        Random randomGenerator = new Random();

        temperature = randomGenerator.nextDouble() * 30.0;      // temperature in degrees Celsius
        pressure = randomGenerator.nextDouble() * 760.0;        // pressure in mm Hg
        humidity = randomGenerator.nextDouble() * 90.0;         // humidity in percentage
    }

    @Override
    public void registerObserver(Observer addObserver) {
        observers.add(addObserver);
    }

    @Override
    public void removeObserver(Observer removeObserver) {
        observers.remove(removeObserver);
    }

    @Override
    public void notifyObservers() {
        Bundle weatherData = getWeatherData();

        for (Observer observer : observers) {
            observer.update(weatherData);
        }
    }

    private Bundle getWeatherData() {
        Bundle bundle = new Bundle();

        bundle.put(TEMPERATURE, temperature);
        bundle.put(PRESSURE, pressure);
        bundle.put(HUMIDITY, humidity);

        return bundle;
    }

    public void measurementChanged(Bundle change) {
        temperature += (Double)change.get(TEMPERATURE);
        pressure += (Double)change.get(PRESSURE);
        humidity += (Double)change.get(HUMIDITY);

        notifyObservers();
    }
}
