package com.jane.arithmetic.sort;

import com.jane.common.CollectionUtils;

/**
 * Created by wang_gkun on 2017/7/27.
 */
public class Exercise {

    public static void main(String[] args){
        Integer[] arr = CollectionUtils.getIntArr(1,5);
        CollectionUtils.printArr(arr);
        Exercise a = new Exercise();
        a.sort(arr);
        CollectionUtils.printArr(arr);
    }


    public void sort(Comparable[] a) {
        sort(a, 0, a.length-1);
    }

    private void sort(Comparable[] a, int lo, int hi) {
        if (lo >= hi) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi+1;
        Comparable v = a[lo];
        while (true) {
            while (less(a[++i], v)) if (i == hi) break;
            while (less(v, a[--j])) if (j == lo) break;
            if(i>=j) break;
            exch(a,i,j);
        }
        exch(a,lo,j);
        return j;
    }


    private boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    private void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


}
