package com.sgf.user.headfirst.observermode;

/**
 * Created by yuers on 2018/11/22.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(90,55,28.4f);
        weatherData.setMeasurements(86,75,34.4f);
    }

}
