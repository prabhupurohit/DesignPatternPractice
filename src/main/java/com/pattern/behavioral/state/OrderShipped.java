package com.pattern.behavioral.state;

public class OrderShipped implements OrderState {
    @Override
    public void nextState(Order order) {
        if (order.getState() instanceof OrderShipped) {
            order.setState(new OrderDelivered());
        }
    }

    @Override
    public void prevState(Order order) {
        if (order.getState() instanceof OrderShipped) {
            order.setState(new OrderPlaced());
        }
    }

    @Override
    public void displayStatus(Order order) {
        System.out.println("Order Id: " + order.getOrderId() + " Shipped!");
    }
}
