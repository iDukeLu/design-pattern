package com.idukelu.design.pattern.java.observer.java;

import lombok.Getter;

import java.util.Observable;

/**
 * 天气（主题）
 *
 * <p>使用 Java 提供的 Observable 类，但不推荐，这个类已经非常老了。
 * 底层采用 Vector 作为容器，且面向类编程，导致这种方法的扩展性较差
 *
 * @author duke
 * @date 2020.06.27
 */
@Getter
public class WeatherData extends Observable {

    private double temperature;
    private double humidity;
    private double pressure;

    /**
     * 天气测量数据改变
     */
    private void measurementsChanged() {
        setChanged();
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
