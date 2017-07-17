package com.jane.arithmetic.structure;

/**
 * Created by wang_gkun on 2017/7/13.
 */
public class TestStack {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

}



