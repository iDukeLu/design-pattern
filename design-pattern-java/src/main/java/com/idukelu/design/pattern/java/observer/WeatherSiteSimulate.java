package com.idukelu.design.pattern.java.observer;

import com.idukelu.design.pattern.java.observer.improve.CurrentConditionsDisplayObserver;
import com.idukelu.design.pattern.java.observer.improve.WeatherDataSubject;

/**
 * 气象站样例测试
 *
 * @author duke
 * @date 2020.06.28
 */
public class WeatherSiteSimulate {
    public static void main(String[] args) {
        WeatherDataSubject weatherDataSubject = new WeatherDataSubject();
        new CurrentConditionsDisplayObserver(weatherDataSubject);
        weatherDataSubject.setMeasurements(27D, 28D, 29D);
        weatherDataSubject.setMeasurements(28D, 29D, 30D);
        weatherDataSubject.setMeasurements(29D, 30D, 31D);
    }

    public static void custWeatherSiteSimulate() {
        com.idukelu.design.pattern.java.observer.cust.WeatherData weatherData =
                new com.idukelu.design.pattern.java.observer.cust.WeatherData();
        new com.idukelu.design.pattern.java.observer.cust.CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(27D, 28D, 29D);
        weatherData.setMeasurements(28D, 29D, 30D);
        weatherData.setMeasurements(29D, 30D, 31D);
    }

    public static void javaWeatherSiteSimulate() {
        com.idukelu.design.pattern.java.observer.java.WeatherData weatherData =
                new com.idukelu.design.pattern.java.observer.java.WeatherData();
        new com.idukelu.design.pattern.java.observer.java.CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(27D, 28D, 29D);
        weatherData.setMeasurements(28D, 29D, 30D);
        weatherData.setMeasurements(29D, 30D, 31D);
    }
}
