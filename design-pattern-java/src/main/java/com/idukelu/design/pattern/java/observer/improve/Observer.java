package com.idukelu.design.pattern.java.observer.improve;

/**
 * 观察者
 *
 * @author duke
 * @date 2020.06.27
 */
public interface Observer<S extends Subject> {
    /**
     * 更新主题通知的数据
     *
     * @param s 主题
     */
    void update(S s);
}
