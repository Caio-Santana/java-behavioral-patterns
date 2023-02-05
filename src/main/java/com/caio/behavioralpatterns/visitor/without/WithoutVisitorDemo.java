package com.caio.behavioralpatterns.visitor.without;

public class WithoutVisitorDemo {

    public static void main(String[] args) {
        PartsOrder order = new PartsOrder();

        order.addPart(new Wheel());
        order.addPart(new Fender());
        order.addPart(new Oil());

        double cost = order.calculateShipping();
        System.out.println("Shipping Cost: " + cost);
    }
}
