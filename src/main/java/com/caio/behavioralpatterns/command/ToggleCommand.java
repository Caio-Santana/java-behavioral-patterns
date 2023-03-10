package com.caio.behavioralpatterns.command;

public class ToggleCommand implements Command{

    private final Light light;

    public ToggleCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.toggle();
    }
}
