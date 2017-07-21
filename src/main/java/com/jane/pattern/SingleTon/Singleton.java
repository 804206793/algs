package com.jane.pattern.SingleTon;

/**双锁单例模式
 * Created by wang_gkun on 2017/7/19.
 */
public class Singleton {

    private volatile static Singleton singleton;

    private Singleton(){}

    public static Singleton getInstance(){
        if (singleton == null) {
            synchronized (Singleton.class){
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }


}
