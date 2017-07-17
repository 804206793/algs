package com.jane.pattern.oberver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by wang_gkun on 2017/7/13.
 */
public class AObserver implements Observer{
    public AObserver(Observable serverManager) {
        super();
        serverManager.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("AObserver receive:Data has changed to "+((ServerManager) o).getData());
    }
}
