package com.jane.pattern.SingleTon;

/**线程不安全的懒汉模式
 * Created by wang_gkun on 2017/7/19.
 */
public class LazySingleTon {

    private static LazySingleTon lazySingleTon;

    private LazySingleTon(){

    }

    public static LazySingleTon getInstance(){
        if (lazySingleTon == null) {
            lazySingleTon =  new LazySingleTon();
        }
        return lazySingleTon;
    }


}
