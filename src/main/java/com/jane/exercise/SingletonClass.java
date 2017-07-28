package com.jane.exercise;

import com.jane.pattern.SingleTon.Singleton;

/**
 * Created by wang_gkun on 2017/7/25.
 */
public class SingletonClass {
    private static volatile SingletonClass singletonClass;


    private SingletonClass(){

    }

    public static SingletonClass getInstance(){
        if (singletonClass == null) {
            synchronized(SingletonClass.class){
                if (singletonClass == null) {
                    singletonClass = new SingletonClass();
                }
            }
        }
        return singletonClass;
    }


}
