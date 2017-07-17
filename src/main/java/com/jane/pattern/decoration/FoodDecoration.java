package com.jane.pattern.decoration;

/**
 * 装饰者基类
 * Created by wang_gkun on 2017/7/14.
 */
public abstract class FoodDecoration extends Food{

    private Food food;

    public FoodDecoration(Food food) {
        this.food = food;
    }

    @Override
    public  String getDesc(){
        return food.getDesc();
    }

}
