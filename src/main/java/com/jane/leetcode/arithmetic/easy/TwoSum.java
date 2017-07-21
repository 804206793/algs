package com.jane.leetcode.arithmetic.easy;

/**
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */


/**
 * Created by wang_gkun on 2017/7/19.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0, listSize = nums.length; i < listSize; i++) {
            int value1 = nums[i];
            int value2 = target -value1;
            for (int j = i+1; j <  nums.length; j++) {
                if ( nums[j] == value2) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] arr = {-1,-2,-3,-4,-5};
        int[] res = twoSum.twoSum(arr,-8);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }
}
