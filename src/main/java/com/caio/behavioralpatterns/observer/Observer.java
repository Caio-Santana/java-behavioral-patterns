package com.caio.behavioralpatterns.observer;

public abstract class Observer {

    protected Subject subject;
    abstract void update();
}
