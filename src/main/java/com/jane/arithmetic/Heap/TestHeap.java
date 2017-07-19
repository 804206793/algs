package com.jane.arithmetic.Heap;

import com.jane.common.CollectionUtils;

import java.util.PriorityQueue;

/**
 * Created by wang_gkun on 2017/7/17.
 */
public class TestHeap {
    public static void main(String[] args) {

//        MaxPQ<Integer> heap = new MaxPQ<>(10);
        PriorityQueue<Integer> heap = new PriorityQueue<>();//java 优先队列
        Integer[] arr = CollectionUtils.getIntArr(2,12);
        for (Integer integer : arr) {
//            heap.insert(integer);
            heap.add(integer);
        }
        while (heap.size()>0){
//            System.out.println(heap.delMax());
            System.out.println(heap.poll());
        }


    }

}
