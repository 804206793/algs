package com.jane.arithmetic.structure;

import java.util.Iterator;

/**
 * Created by wang_gkun on 2017/7/13.
 */
public class MyBag<Item> implements Iterable<Item>{

    private Node first;
    private class Node{
        Item item;
        Node next;
    }

    public void add(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item =item;
        first.next = oldfirst;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>{
        private Node current = first;
        @Override
        public boolean hasNext(){
            return current != null;
        }

        public void remove(){};
        @Override
        public Item next(){
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
