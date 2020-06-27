package com.idukelu.design.pattern.java.strategy.duck;

import com.idukelu.design.pattern.java.strategy.behavior.Quack;
import com.idukelu.design.pattern.java.strategy.behavior.FlyWithWings;

/**
 * TODO: 编辑说明信息
 *
 * @author duke
 * @date 2020.06.26
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        super.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }
}
