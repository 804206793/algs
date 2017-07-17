package com.jane.arithmetic.sort;

import com.jane.common.CollectionUtils;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 * 选择排序
 * Created by wang_gkun on 2017/7/14.
 */
public class Selection {

    public static void main(String[] args) {

        Integer[] arr = CollectionUtils.getIntArr(2,50000);
        Stopwatch timer = new Stopwatch();
        sort(arr);
        System.out.println(timer.elapsedTime());

    }

    public static void sort(Comparable a[]){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (less(a[j],a[min]))
                  min = j;
            }
            exch(a,i,min);
        }

    }

    // exchange a[i] and a[j]
    private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    // is v < w ?
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }



}
