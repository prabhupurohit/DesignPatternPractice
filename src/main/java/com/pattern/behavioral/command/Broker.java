package com.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    List<Order> orders;

    public Broker() {
        this.orders = new ArrayList<>();
    }

    public void takeOrders(Order order) {
        orders.add(order);
    }

    public void placeOrder() {
        orders.stream().forEach(order -> order.execute());
        //Remove all the orders from the list after placing order
        orders.clear();
    }
}
