package com.jane.arithmetic.Heap;

/**
 * Created by wang_gkun on 2017/7/17.
 */
public class MaxPQ<Key extends Comparable<Key>> {

    private Key[] pq;   //基于堆的完全二叉树
    private int N = 0;  //存储于pq[1..N]中,pq[0]没有使用

    public MaxPQ(int maxN) {
        pq = (Key[]) new Comparable[maxN + 1];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void insert(Key v) {
        pq[++N] = v;
        swim(N);
    }


    public Key delMax() {
        Key max = pq[1]; //从根节点得到最大的元素
        exch(1,N--);   //将其和最后一个节点交换
        pq[N+1] = null;  //防止越界
        sink(1);      //恢复堆的有序性
        return max;
    }



    /**
     * 由下至上的堆有序化的实现(上浮)
     * @param k
     */
    public void swim(int k) {
        while (k > 1 && less(k / 2, k)) {
            exch(k / 2, k);
            k = k / 2;
        }
    }

    /**
     * 由s上至下的堆有序化的实现(下沉)
     * @param k
     */
    public void sink(int k){
        while (2*k <= N){
            int j = 2*k;
            if (j<N&&less(j,j+1))j++;
            if (!less(k,j))break;
            exch(k,j);
            k =j;
        }
    }

    public void exch(int i, int j) {
        Key t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }

    private boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }




}