package com.jane.arithmetic.sort;

import com.jane.common.CollectionUtils;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.Comparator;

/**
 * Created by wang_gkun on 2017/7/14.
 */
public class Insertion {



    public static void main(String[] args) {
        Integer[] arr = CollectionUtils.getIntArr(2,50000);
        Stopwatch timer = new Stopwatch();
        sort(arr);
        System.out.println(timer.elapsedTime());

//        CollectionUtils.printArr(arr);

    }


    public static void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
                exch(a, j, j-1);
            }

        }
    }

    private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }



}
