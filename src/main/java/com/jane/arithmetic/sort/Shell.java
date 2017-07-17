package com.jane.arithmetic.sort;

import com.jane.common.CollectionUtils;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by wang_gkun on 2017/7/14.
 */
public class Shell {

    public static void main(String[] args) {
        Integer[] arr = CollectionUtils.getIntArr(2,50000);
        Stopwatch timer = new Stopwatch();
        sort(arr);
        System.out.println(timer.elapsedTime());

    }


    public static void sort(Comparable[] a){

        int N = a.length;
        int h =1;
        while (h <N/3) h=3*h+1;
        while (h>=1 ){
            for (int i = 0; i <N; i++) {
                for (int j = i; j>=h&&less(a[j],a[j-h]); j-=h) {
                    exch(a,j,j-h);
                }
            }
            h =h/3;
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
