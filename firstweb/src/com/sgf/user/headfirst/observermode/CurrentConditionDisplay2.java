package com.sgf.user.headfirst.observermode;

import java.util.Observable;

/**
 * Created by yuers on 2018/11/22.
 */
public class CurrentConditionDisplay2 implements java.util.Observer,DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay2(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature +
                "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object obs) {
        if (obs instanceof WeatherData2){
            WeatherData2 weatherData2 = (WeatherData2) obs;
            this.temperature = weatherData2.getTemperature();
            this.humidity = weatherData2.getHumidity();
            display();
        }
    }
}
