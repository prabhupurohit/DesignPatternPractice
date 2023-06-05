package com.pattern.behavioral.strategy;

//If there is one interface method which is pure, we can very well name it as a functional interface
@FunctionalInterface
public interface Strategy {

    public int doOperation(int num1, int num2);

}
