package com.caio.behavioralpatterns.state;

public class FanHighState extends State {
    private NewFan fan;

    public FanHighState(NewFan fan) {

        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan off.");
        fan.setState(fan.getFanOffState());
    }

    @Override
    public String toString() {
        return "Fan is on high.";
    }
}
