package com.idukelu.design.pattern.java.observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * 当前天气测量布告板（观察者）
 *
 * @author duke
 * @date 2020.06.28
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private double temperature;
    private double humidity;
    private double pressure;
    private Observable weatherData;

    public CurrentConditionsDisplay(Observable weatherData) {
        // 保留主题，为了以后能移除自己观察者的身份
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.err.println(String.format("天气：%s, 湿度：%s，气压：%s",
                this.temperature, this.humidity, this.pressure));
    }

    @Override
    public void update(Observable o, Object arg) {
        // 任何主题更新都通知观察者，故需判断主题是不是我们观察的主题
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            // 改变即展示
            display();
        }
    }
}
