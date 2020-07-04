package com.idukelu.design.pattern.java.observer.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题
 *
 * @author duke
 * @date 2020.06.28
 */
public class AbstractSubject implements Subject {

    private List<Observer<? extends Subject>> observerList;

    @Override
    public void registerObserver(Observer<? extends Subject> observer) {
        observerList = new ArrayList<>();
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer<? extends Subject> observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }
}
