package com.jane.exercise;

/**
 * 题目描述：一个二维数组，每一行从左到右递增，每一列从上到下递增．输入一个二维数组和一个整数，判断数组中是否含有整数。
 * Created by wang_gkun on 2017/7/25.
 */
public class Find {
    public static boolean find(int[][] array, int number) {
        boolean isContent = false;
        if(null == array) return isContent;
        for (int i = 0; i < array.length&&!isContent; i++) {
            for(int j = 0; j< array[i].length;j++){
                if(array[i][j] == number){
                    isContent = true;
                    break;
                }
            }
        }
        return isContent;
    }


    public static void main(String[] args) {
          int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(find(arr,1));
}


}
