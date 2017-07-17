package com.jane.pattern.oberver;

import java.util.Observable;

/**
 * Created by wang_gkun on 2017/7/13.
 */
public class ServerManager extends Observable{
    private int data = 0;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        if (this.data != data){
            this.data = data;
            setChanged();
        }
        notifyObservers();
    }
}
