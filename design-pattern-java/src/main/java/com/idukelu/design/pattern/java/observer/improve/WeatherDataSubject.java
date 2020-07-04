package com.idukelu.design.pattern.java.observer.improve;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气（主题，使用自定义的主题接口）
 *
 * @author duke
 * @date 2020.06.27
 */
@Getter
public class WeatherDataSubject extends AbstractSubject {

    private double temperature;
    private double humidity;
    private double pressure;

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
