package com.idukelu.design.pattern.java.observer.cust;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气（主题，使用自定义的主题接口）
 *
 * @author duke
 * @date 2020.06.27
 */
public class WeatherData implements Subject{

    private List<Observer> observerList;

    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData() {
        observerList = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 天气测量数据改变
     */
    private void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 设置天气测量数量，模拟数据改变
     */
    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
