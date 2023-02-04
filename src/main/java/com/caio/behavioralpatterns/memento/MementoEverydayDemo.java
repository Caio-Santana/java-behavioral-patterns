package com.caio.behavioralpatterns.memento;

import java.io.*;

public class MementoEverydayDemo {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Bryan Hansen");
        employee.setAddress("111 Main Street");
        employee.setPhone("555-889-8484");

        serialize(employee);

        Employee newEmployee = deserialize();

        System.out.println(newEmployee.getName());

    }

    private static void serialize(Employee employee) {
        try {
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(employee);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Employee deserialize() {
        Employee employee = null;
        try {
            FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream( fileIn);
            employee = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        return employee;
    }

}
