package com.jane.arithmetic.structure;

/**
 * Created by wang_gkun on 2017/7/13.
 */
public class MyStack<Item> {
    private Node first;
    private int N;

    private class Node{
        Item item;
        Node next;
    }
    public boolean isEmpty(){return first == null;}

    public int size(){return N;}

    public void push(Item item){
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    public Item pop(){
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }
}
