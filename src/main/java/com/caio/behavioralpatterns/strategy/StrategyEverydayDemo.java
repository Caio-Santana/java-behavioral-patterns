package com.caio.behavioralpatterns.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyEverydayDemo {

    public static void main(String[] args) {
        Person bryan = new Person("Bryan", 39, "321-545-1771");
        Person mark = new Person("Mark", 41, "654-225-4815");
        Person chris = new Person("Chris", 38, "880-789-4710");

        List<Person> people = new ArrayList<>();

        people.add(bryan);
        people.add(mark);
        people.add(chris);

        System.out.println("Not sorted");
        printContents(people);

        System.out.println("\nSorted by age");
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {

                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else if (o1.getAge() < o2.getAge()) {
                    return -1;
                }

                return 0;
            }
        });
        printContents(people);

        System.out.println("\nSorted by name");
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        printContents(people);
    }

    private static void printContents(List<Person> people) {
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}
