package com.pattern.behavioral.state;

public class OrderPlaced implements OrderState {

    @Override
    public void nextState(Order order) {
        if (order.getState() instanceof OrderPlaced) {
            order.setState(new OrderShipped());
        }
    }

    @Override
    public void prevState(Order order) {
        if (order.getState() instanceof OrderPlaced) {
            order.setState(new OrderCancelled());
        }
    }

    @Override
    public void displayStatus(Order order) {
        System.out.println("Order Id: " + order.getOrderId() + " Placed!");
    }
}
