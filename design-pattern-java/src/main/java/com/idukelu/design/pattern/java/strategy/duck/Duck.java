package com.idukelu.design.pattern.java.strategy.duck;

import com.idukelu.design.pattern.java.strategy.behavior.QuackBehavior;
import com.idukelu.design.pattern.java.strategy.behavior.FlyBehavior;
import lombok.Data;

/**
 * 鸭子类
 *
 * @author duke
 * @date 2020.06.26
 */
@Data
public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public void preformFly() {
        flyBehavior.fly();
    }

    public void preformQuack() {
        quackBehavior.quack();
    }
}
