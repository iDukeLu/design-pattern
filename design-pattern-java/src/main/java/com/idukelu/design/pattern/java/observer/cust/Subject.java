package com.idukelu.design.pattern.java.observer.cust;

/**
 * 主题
 *
 * @author duke
 * @date 2020.06.27
 */
public interface Subject {

    /**
     * 注册观察者
     *
     * observer 观察者
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer 观察者
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObservers();
}
