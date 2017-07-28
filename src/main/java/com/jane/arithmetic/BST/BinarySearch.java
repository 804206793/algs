package com.jane.arithmetic.BST;

/**
 * Created by wang_gkun on 2017/7/28.
 */
public class BinarySearch {

    public static int rank(int key, int[] a) {
        //        array is sorted
        int lo = 0;
        int hi = a.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;

        }
        return -1;
    }

}
