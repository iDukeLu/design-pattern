package com.idukelu.design.pattern.java.observer.improve;

/**
 * 抽象观察者
 *
 * @author duke
 * @date 2020.06.28
 */
public abstract class AbstractObserver<S extends Subject> implements Observer<S> {

    private S s;

    protected AbstractObserver(S s) {
        this.s = s;
        s.registerObserver(this);
    }

    protected S getSubject() {
        return this.s;
    }
}
