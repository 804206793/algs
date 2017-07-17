package com.jane.arithmetic.structure;

import edu.princeton.cs.algs4.Bag;

/**
 * Created by wang_gkun on 2017/7/13.
 */
public class TestBag {

    public static void main(String[] args) {
        MyBag<String> bag = new MyBag<>();
        bag.add("one");
        bag.add("two");
        bag.add("three");
        bag.forEach(e -> System.out.println(e));
        for (String s : bag) {
            System.out.println(s);
        }
    }

}
