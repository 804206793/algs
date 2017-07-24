package com.jane.leetcode.arithmetic.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * <p>
 * <p>
 * Created by wang_gkun on 2017/7/21.
 */
public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {

        String[] arr = s.trim().split("");
        List<String> stringList = new ArrayList<>();

        int res=0,len = 0,index,size;

        for (int i = 0; i < arr.length; i++) {

            if ("".equals(arr[i])) continue;

            if (!stringList.contains(arr[i])) {
                stringList.add(arr[i]);
                len++;
            }else {
                index = stringList.indexOf(arr[i]);
                size = stringList.size();
                stringList = new ArrayList(stringList.subList(index+1,size));
                stringList.add(arr[i]);
                len = stringList.size();
            }
            res = res>len?res:len;
        }

        return res;
    }

    public static void main(String[] args) {
        LongestSubstring longestSubstring = new LongestSubstring();
        int length = longestSubstring.lengthOfLongestSubstring("dvdf");
        System.out.println(length);
    }


}
