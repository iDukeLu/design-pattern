package com.idukelu.design.pattern.java.observer.cust;

/**
 * 当前天气测量布告板
 *
 * @author duke
 * @date 2020.06.28
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private double temperature;
    private double humidity;
    private double pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        // 保留主题，为了以后能移除自己观察者的身份
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.err.println(String.format("天气：%s, 湿度：%s，气压：%s",
                this.temperature, this.humidity, this.pressure));
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        // 改变即展示
        display();
    }
}
