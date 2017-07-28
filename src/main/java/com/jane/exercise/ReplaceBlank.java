package com.jane.exercise;

/**题目：请实现一个函数，把字符串中的每个空格替换成“%20”。
 * Created by wang_gkun on 2017/7/25.
 */
public class ReplaceBlank {
    public static String replaceBlank(String input){
        return  input.replaceAll("\\s+","%20");
    }

    public static void main(String[] args) {
        String test = "这 是测试   吗? ";
        System.out.println(replaceBlank(test));
    }

}
