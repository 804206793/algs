package com.jane.pattern.commandPattern;

/**
 * Created by wang_gkun on 2017/7/25.
 */
public class LightOnCommand implements Command {
    Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        light.on();
    }
}
