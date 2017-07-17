package com.jane.pattern.strategy;

/**
 * Created by wang_gkun on 2017/7/12.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
