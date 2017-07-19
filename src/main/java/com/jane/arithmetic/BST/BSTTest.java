package com.jane.arithmetic.BST;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * Created by wang_gkun on 2017/7/18.
 */
public class BSTTest {

    public static void main(String[] args) {
        BST<Double,String> bst = new BST<>();
        bst.put(1d,"one");
        bst.put(2d,"two");
        bst.put(3d,"three");
        bst.put(4d,"four");
        bst.put(5d,"five");

        System.out.println(bst.get(1d));
        System.out.println(bst.get(2d));
        System.out.println(bst.get(3d));
        System.out.println(bst.get(4d));
        System.out.println(bst.get(5d));
        System.out.println(bst.min());
        System.out.println(bst.floor(2.9));


    }

}
