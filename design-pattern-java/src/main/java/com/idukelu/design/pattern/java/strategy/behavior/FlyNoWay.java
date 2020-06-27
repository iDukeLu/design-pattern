package com.idukelu.design.pattern.java.strategy.behavior;

/**
 * TODO: 编辑说明信息
 *
 * @author duke
 * @date 2020.06.26
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.err.println("我不能飞！");
    }
}
