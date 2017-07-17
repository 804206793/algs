package com.jane.common;

import edu.princeton.cs.algs4.StdOut;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 * Created by wang_gkun on 2017/7/14.
 */
public class CollectionUtils {

    /**
     * 获取指定范围内int数组
     * @param begin
     * @param end
     * @return
     */
    public static Integer[] getIntArr(int begin, int end) {
        List<Integer> list = IntStream.range(begin, end).boxed().collect(toList());
        Collections.shuffle(list);
        Integer[] arr = {};
        return list.toArray(arr);
    }

    /**
     * 打印数组
     * @param a
     */
    public static void printArr(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i]+" ");
        }
        StdOut.println();
    }
}
