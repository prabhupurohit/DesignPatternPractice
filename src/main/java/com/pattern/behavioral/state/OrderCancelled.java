package com.pattern.behavioral.state;

public class OrderCancelled implements OrderState {
    @Override
    public void nextState(Order order) {
        throw new IllegalStateException("No next state for Cancelled!");
    }

    @Override
    public void prevState(Order order) {
        if (order.getState() instanceof OrderCancelled) {
            order.setState(new OrderPlaced());
        }
    }

    @Override
    public void displayStatus(Order order) {
        System.out.println("Order Id: " + order.getOrderId() + " Cancelled!");
    }
}
