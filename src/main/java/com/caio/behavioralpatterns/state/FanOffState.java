package com.caio.behavioralpatterns.state;

public class FanOffState extends State {
    private NewFan fan;

    public FanOffState(NewFan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to low.");
        fan.setState(fan.getFanLowState());
    }

    @Override
    public String toString() {
        return "Fan is off.";
    }
}
