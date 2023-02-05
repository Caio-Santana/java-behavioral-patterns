package com.caio.behavioralpatterns.visitor.without;

public class Fender implements AtvPart {

    @Override
    public double calculateShipping() {
        return 3;
    }
}
