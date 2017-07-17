package com.jane.pattern.strategy;

/**
 * Created by wang_gkun on 2017/7/12.
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
