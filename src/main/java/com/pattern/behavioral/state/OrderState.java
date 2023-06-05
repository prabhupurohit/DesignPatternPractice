package com.pattern.behavioral.state;

public interface OrderState {

    public void nextState(Order order);

    public void prevState(Order order);

    public void displayStatus(Order order);

}
