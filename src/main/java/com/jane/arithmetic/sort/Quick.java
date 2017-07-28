package com.jane.arithmetic.sort;

import com.jane.common.CollectionUtils;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by wang_gkun on 2017/7/14.
 */
public class Quick {

    public static void main(String[] args) {
        Integer[] arr = CollectionUtils.getIntArr(1,6);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        Stopwatch timer = new Stopwatch();
        sort(arr);
        System.out.println(timer.elapsedTime());
    }

    public static void sort(Comparable[] a){
        sort(a,0,a.length-1);
    }

    private static void sort(Comparable[] a, int lo, int hi){
        if (hi <= lo)return;
        int j = partition(a,lo,hi);
        System.out.println(lo+"--"+j+"--"+hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        Comparable v = a[lo];
        while (true) {
            // find item on lo to swap
            while (less(a[++i], v))
                if (i == hi) break;
            // find item on hi to swap
            while (less(v, a[--j]))
                if (j == lo) break;      // redundant since a[lo] acts as sentinel
            // check if pointers cross
            if (i >= j) break;

            exch(a, i, j);
            System.out.println();
            CollectionUtils.printArr(a);
        }
        exch(a, lo, j);
        return j;
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }


}
