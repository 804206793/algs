package com.jane.pattern.oberver;

/**
 * Created by wang_gkun on 2017/7/13.
 */
public class TestObserver {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ServerManager sm = new ServerManager();
        AObserver a = new AObserver(sm);
        BObserver b = new BObserver(sm);
        sm.setData(5);
        sm.deleteObserver(a);//注销观察者，以后被观察者有数据变化就不再通知这个已注销的观察者
        sm.setData(10);

    }
}
