package com.idukelu.design.pattern.java.strategy.behavior;

/**
 * TODO: 编辑说明信息
 *
 * @author duke
 * @date 2020.06.26
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.err.println("我不能叫！");
    }
}
