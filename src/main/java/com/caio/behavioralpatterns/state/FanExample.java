package com.caio.behavioralpatterns.state;

// if-else "state-like"
public class FanExample {

    public static void main(String[] args) {
        Fan fan = new Fan();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);
    }
}
