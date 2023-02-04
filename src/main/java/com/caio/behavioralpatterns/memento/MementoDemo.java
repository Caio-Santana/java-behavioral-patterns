package com.caio.behavioralpatterns.memento;

public class MementoDemo {

    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();

        Person person = new Person();

        person.setName("John Wick");
        person.setAddress("111 Main Street");
        person.setPhone("555-999-7145");

        System.out.println("Person before save:                     " + person);

        caretaker.save(person);

        person.setPhone("888-258-4120");

        caretaker.save(person);

        System.out.println("Person after changed phone number save: " + person);

        person.setPhone("222-111-3232"); // we haven't called save

        caretaker.revert(person);

        System.out.println("Reverts to last save point:             " + person);

        caretaker.revert(person);

        System.out.println("Reverted to original:                   " + person);

    }
}
