package com.caio.behavioralpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEverydayDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Bryan");
        names.add("Aaron");
        names.add("Jason");

        Iterator<String> nameItr = names.iterator();

        while (nameItr.hasNext()) {
            String name = nameItr.next();
            System.out.println(name);
            nameItr.remove();
        }

        System.out.println("Names size: " + names.size());

    }
}
