package com.idukelu.design.pattern.java.observer.improve;

/**
 * 当前天气测量布告板
 *
 * @author duke
 * @date 2020.06.28
 */
public class CurrentConditionsDisplayObserver extends AbstractObserver<WeatherDataSubject> implements DisplayElement {

    public CurrentConditionsDisplayObserver(WeatherDataSubject weatherDataSubject) {
        super(weatherDataSubject);
    }

    @Override
    public void display(double temperature, double humidity, double pressure) {
        System.err.println(String.format("天气：%s, 湿度：%s，气压：%s", temperature, humidity, pressure));
    }

    @Override
    public void update(WeatherDataSubject weatherDataSubject) {
        display(weatherDataSubject.getTemperature(), weatherDataSubject.getHumidity(), weatherDataSubject.getPressure());
    }
}


