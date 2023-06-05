package com.pattern.behavioral.state;

public class StateDemo {

    public static void main(String[] args) {

        try {
            //Create an Order first
            Order order1 = new Order();
            order1.placeOrder();
            order1.printStatus();

            order1.cancelOrder();
            order1.printStatus();

            //Create another order
            Order order2 = new Order();
            order2.placeOrder();
            order2.printStatus();

            order2.fulfilOrder();
            order2.printStatus();

            //This operation will throw an exception
            order2.cancelOrder();
            order2.printStatus();

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }


}
