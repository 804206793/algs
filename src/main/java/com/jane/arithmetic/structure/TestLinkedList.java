package com.jane.arithmetic.structure;

import java.util.LinkedList;

/**
 * Created by wang_gkun on 2017/7/13.
 */
public class TestLinkedList {


    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.forEach(e -> System.out.println(e));
    }
}
