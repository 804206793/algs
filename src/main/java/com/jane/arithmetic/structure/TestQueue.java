package com.jane.arithmetic.structure;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by wang_gkun on 2017/7/13.
 */
public class TestQueue {
    public static void main(String[] args)
    {
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("one");
        queue.enqueue("two");
        queue.enqueue("three");
        while (!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
}
