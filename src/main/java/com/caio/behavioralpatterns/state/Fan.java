package com.caio.behavioralpatterns.state;

public class Fan {

    private final int OFF = 0;
    private final int LOW = 1;
    private final int MED = 2;

    int state = OFF;

    public Fan() {
    }

    public void pullChain() {
        if (state == OFF) {
            System.out.println("Turning fan on to low.");
            state = LOW;
        } else if (state == LOW) {
            System.out.println("Turning fan on to med.");
            state = MED;
        } else if (state == MED) {
            System.out.println("Turning fan off.");
            state = OFF;
        }

    }

    @Override
    public String toString() {
        if (state == OFF) {
            return "Fan is off.";
        } else if (state == LOW) {
            return "Fan is on low.";
        } else if (state == MED) {
            return "Fan is on med.";
        }
        return "Invalid state.";
    }
}
