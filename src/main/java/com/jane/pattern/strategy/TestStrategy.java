package com.jane.pattern.strategy;

/**
 * Created by wang_gkun on 2017/7/12.
 */
public class TestStrategy {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
