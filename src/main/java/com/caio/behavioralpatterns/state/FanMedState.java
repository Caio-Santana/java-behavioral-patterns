package com.caio.behavioralpatterns.state;

public class FanMedState extends State {
    private NewFan fan;

    public FanMedState(NewFan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to high.");
        fan.setState(fan.getFanHighState());
    }

    @Override
    public String toString() {
        return "Fan is on med.";
    }
}
