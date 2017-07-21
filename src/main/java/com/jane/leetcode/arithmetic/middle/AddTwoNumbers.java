package com.jane.leetcode.arithmetic.middle;

/**
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * <p>
 * Created by wang_gkun on 2017/7/20.
 */
public class AddTwoNumbers {


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int first = l1.val + l2.val;
        int temp = 0;
        if (first >= 10) {
            first =first -10;
            temp =1;
        }
        ListNode result = new ListNode(first);
        ListNode next1 = l1.next,next2 = l2.next;
        ListNode res = null;
        while (null!=next1||null!=next2||temp>0){
            if (res == null)
                res = result;
            else
                res =res.next;

           int n1 = next1==null?0:next1.val;
           int n2 = next2==null?0:next2.val;

           int s = n1+n2+temp;
           temp = 0;
            if (s>=10) {
                s= s-10;
                temp = 1;
            }
            res.next =  new ListNode(s);
            if (next1 != null)
                next1 = next1.next;
            if (next2 != null)
                next2 = next2.next;


        }
        return result;

    }

    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode listNode1 = addTwoNumbers.new ListNode(1);
        listNode1.next = addTwoNumbers.new ListNode(8);
        listNode1.next.next = addTwoNumbers.new ListNode(3);

        ListNode listNode2 = addTwoNumbers.new ListNode(0);
        listNode2.next = addTwoNumbers.new ListNode(6);
        listNode2.next.next = addTwoNumbers.new ListNode(4);

        ListNode listNode3 = addTwoNumbers.addTwoNumbers(listNode1,listNode2);
            System.out.println(listNode3.val);
            System.out.println(listNode3.next.val);
            System.out.println(listNode3.next.next.val);

    }

}
