package com.jane.pattern.commandPattern;

/**
 * Created by wang_gkun on 2017/7/25.
 */
public class SimpleRemoteControl {

    Command slot;
    public SimpleRemoteControl() {}
    public void setCommand(Command command) {
        slot = command;
    }
    public void buttonWasPressed() {
        slot.execute();
    }

}
