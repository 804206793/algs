package com.jane.pattern.strategy;

/**
 * Created by wang_gkun on 2017/7/12.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
