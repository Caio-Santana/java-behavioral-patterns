package com.caio.behavioralpatterns.state;

public class StateDemo {

    public static void main(String[] args) {
        NewFan newFan = new NewFan();

        System.out.println(newFan);

        newFan.pullChain();

        System.out.println(newFan);

        newFan.pullChain();

        System.out.println(newFan);

        newFan.pullChain();

        System.out.println(newFan);

        newFan.pullChain();

        System.out.println(newFan);
    }
}
