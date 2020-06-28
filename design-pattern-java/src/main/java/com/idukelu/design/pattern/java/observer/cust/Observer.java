package com.idukelu.design.pattern.java.observer.cust;

/**
 * 观察者
 *
 * @author duke
 * @date 2020.06.27
 */
public interface Observer {
    /**
     * 更新主题通知的数据
     *
     * @param temperature 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    void update(double temperature, double humidity, double pressure);
}
