package com.jane.pattern.decoration;

/**
 * Created by wang_gkun on 2017/7/14.
 */
public class SteamedFood extends FoodDecoration {


    public SteamedFood(Food food) {
      super(food);
    }

    @Override
    public String getDesc() {
        return getDescoration()+super.getDesc();
    }

    private String getDescoration(){
        return "蒸";
    }
}
