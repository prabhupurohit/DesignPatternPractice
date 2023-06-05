package com.pattern.behavioral.state;

public class OrderDelivered implements OrderState {
    @Override
    public void nextState(Order order) {
        throw new IllegalStateException("No next state for delivered!");
    }

    @Override
    public void prevState(Order order) {
        if (order.getState() instanceof OrderDelivered) {
            order.setState(new OrderShipped());
        }
    }

    @Override
    public void displayStatus(Order order) {
        System.out.println("Order Id: " + order.getOrderId() + " Delivered!");
    }
}
