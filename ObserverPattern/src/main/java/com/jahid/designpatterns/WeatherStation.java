package com.jahid.designpatterns;

import com.jahid.designpatterns.utils.Bundle;
import com.jahid.designpatterns.utils.Constants;

import java.util.Random;

import static com.jahid.designpatterns.utils.Constants.HUMIDITY;
import static com.jahid.designpatterns.utils.Constants.PRESSURE;
import static com.jahid.designpatterns.utils.Constants.TEMPERATURE;

/**
 * Created by jahidul.s on 2/20/2015.
 */
public class WeatherStation {
    public static void main(String[] args) {
        final WeatherData weatherData = new WeatherData();

        final Random randomGenerator = new Random();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; ++i) {
                    try {
                        Thread.sleep(1000);

                        Bundle change = new Bundle();

                        change.put(TEMPERATURE, randomGenerator.nextDouble() - 0.5);
                        change.put(PRESSURE, randomGenerator.nextDouble() * 10.0 - 5.0);
                        change.put(HUMIDITY, randomGenerator.nextDouble() * 3.0 - 1.5);

                        weatherData.measurementChanged(change);
                    }
                    catch(Exception e) {
                        // do something here
                    }
                }
            }
        }).start();

        try {
            Thread.sleep(8000);
        }
        catch (Exception e) {
            // do something here
        }

        weatherData.removeObserver(statisticsDisplay);
    }
}
