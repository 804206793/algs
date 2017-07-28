package com.jane.exercise;

/**
 * Created by wang_gkun on 2017/7/25.
 */
public class EagerSingletonClass {

    private static final EagerSingletonClass eagerSingletonClass = new EagerSingletonClass();

    private EagerSingletonClass(){}

    public static EagerSingletonClass getInstance(){
        return  eagerSingletonClass;
    }


}
