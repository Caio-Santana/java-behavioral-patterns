package com.caio.behavioralpatterns.state;

public abstract class State {

    public void handleRequest() {
        System.out.println("We shouldn't be able to get here.");
    }

    @Override
    public String toString() {
        return "Invalid state.";
    }
}
