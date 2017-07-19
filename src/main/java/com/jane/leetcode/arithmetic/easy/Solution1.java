package com.jane.leetcode.arithmetic.easy;

/**
 * Input: "1+1i", "1+1i"
 * Output: "0+2i"
 * Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.
 * <p>
 * Input: "1+-1i", "1+-1i"
 * Output: "0+-2i"
 * Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
 */


/**
 * Created by wang_gkun on 2017/7/18.
 */
public class Solution1 {

    public  String complexNumberMultiply(String a, String b) {
        String[] a1 = a.trim().split("\\+");
        String[] b1 = b.trim().split("\\+");
        a1[1] = a1[1].replace("i","");
        b1[1] = b1[1].replace("i","");
        int afirst = Integer.valueOf(a1[0]);
        int alast = Integer.valueOf(a1[1]);
        int bfirst = Integer.valueOf(b1[0]);
        int blast = Integer.valueOf(b1[1]);
        String result = (afirst*bfirst - alast*blast) +"+"+ (afirst*blast+alast*bfirst)+"i";
        return result;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
//        String result = solution1.complexNumberMultiply("1+1i","1+1i");
        String result = solution1.complexNumberMultiply("1+-1i","1+-1i");
        System.out.println(result);
    }

}
