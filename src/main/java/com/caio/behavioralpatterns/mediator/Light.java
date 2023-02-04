package com.caio.behavioralpatterns.mediator;

// receiver
public class Light {

    private boolean isOn = false;

    private String location = "";

    public Light() {
    }

    public Light(String location) {
        this.location = location;
    }

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        if (isOn) {
            off();
        } else {
            on();
        }
    }

    public void on() {
        System.out.println(location + " - Light switched on.");
        isOn = true;
    }

    public void off() {
        System.out.println(location + " - Light switched off.");
        isOn = false;
    }
}
