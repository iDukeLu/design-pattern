package com.idukelu.design.pattern.java.observer.improve;

/**
 * 展示
 *
 * @author duke
 * @date 2020.06.27
 */
public interface DisplayElement {
    /**
     * 布告板展示
     */
    void display(double temperature, double humidity, double pressure);
}
