package com.jane.pattern.decoration;

/**
 * Created by wang_gkun on 2017/7/14.
 */
public class Duck extends Food{

    public Duck() {
        desc = "鸭肉";
    }

    @Override
    public String getDesc() {
        return desc;
    }
}
