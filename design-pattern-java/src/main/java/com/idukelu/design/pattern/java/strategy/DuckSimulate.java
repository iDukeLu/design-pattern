package com.idukelu.design.pattern.java.strategy;

import com.idukelu.design.pattern.java.strategy.behavior.Squeak;
import com.idukelu.design.pattern.java.strategy.duck.MallardDuck;

/**
 * TODO: 编辑说明信息
 *
 * @author duke
 * @date 2020.06.26
 */
public class DuckSimulate {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.preformQuack();

        // 动态改变鸭叫行为
        mallardDuck.setQuackBehavior(new Squeak());
        mallardDuck.preformQuack();
    }
}
