package com.pattern.behavioral.state;

import java.util.Random;

/**
 * This is the Context Class.
 */
public class Order {

    private int orderId;

    //Order has a state
    private OrderState state;

    public Order() {
        Random random = new Random();
        this.orderId = random.nextInt(1000);
    }

    public void placeOrder() {
        setState(new OrderPlaced());
    }

    public void fulfilOrder() {
        //Order shipped
        if (state instanceof OrderPlaced) {
            state.nextState(this);
            state.nextState(this);
        } else {
            throw new IllegalStateException("Order can't be fulfilled: Incorrect state!");
        }
    }

    public void cancelOrder() {
        if (state instanceof OrderPlaced) {
            state.prevState(this);
        } else {
            throw new IllegalStateException("Order can't be cancelled: Incorrect state!");
        }
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void printStatus() {
        state.displayStatus(this);
    }

    public int getOrderId() {
        return orderId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                '}';
    }
}
