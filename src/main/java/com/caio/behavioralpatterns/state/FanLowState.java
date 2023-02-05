package com.caio.behavioralpatterns.state;

public class FanLowState extends State {
    private NewFan fan;

    public FanLowState(NewFan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to med.");
        fan.setState(fan.getFanMedState());
    }

    @Override
    public String toString() {
        return "Fan is on low.";
    }
}
