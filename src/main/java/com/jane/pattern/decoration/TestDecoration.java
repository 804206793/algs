package com.jane.pattern.decoration;

/**
 * Created by wang_gkun on 2017/7/14.
 */
public class TestDecoration {
    public static void main(String[] args) {
        // 测试单纯的食物
        Food f1 = new Chicken();
        System.out.println(f1.getDesc());

        System.out.println("----------------------");
        // 测试单重修饰的食物
        RoastFood rf = new RoastFood(f1);

        System.out.println("----------------------");
        // 测试多重修饰的食物
        SteamedFood sf = new SteamedFood(rf);
        System.out.println(sf.getDesc());
    }
}
