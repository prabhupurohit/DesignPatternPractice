package com.pattern.behavioral.strategy;

public class MathOperationContext {

    Strategy strategy;

    public MathOperationContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public int doMathOperation(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
