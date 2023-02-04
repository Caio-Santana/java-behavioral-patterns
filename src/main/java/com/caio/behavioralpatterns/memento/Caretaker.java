package com.caio.behavioralpatterns.memento;

import java.util.Stack;

// caretaker
public class Caretaker {

    private Stack<PersonMemento> personHistory = new Stack<>();

    public void save(Person person) {
        personHistory.push(person.save());
    }

    public void revert(Person person) {
        person.revert(personHistory.pop());
    }
}
