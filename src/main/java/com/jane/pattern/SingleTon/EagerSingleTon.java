package com.jane.pattern.SingleTon;

/**饿汉模式
 * Created by wang_gkun on 2017/7/19.
 */
public class EagerSingleTon {

    private static EagerSingleTon eagerSingleTon = new EagerSingleTon();

    private EagerSingleTon(){

    }

    public static EagerSingleTon getInstance(){
        return eagerSingleTon;
    }

}
