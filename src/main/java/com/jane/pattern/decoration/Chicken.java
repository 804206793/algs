package com.jane.pattern.decoration;

/**
 * Created by wang_gkun on 2017/7/14.
 */
public class Chicken extends Food {

    public Chicken() {
        desc = "鸡肉";
    }

    @Override
    public String getDesc() {
        return desc;
    }
}
