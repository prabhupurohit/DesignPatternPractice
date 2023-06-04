package com.pattern.behavioral.strategy;

public class StrategyDemo {

    public static void main(String[] args) {

        //Create a MathOperation Context

        MathOperationContext mathAddContext = new MathOperationContext(new AddOperation());

        System.out.println((mathAddContext.doMathOperation(15, 20)));

        MathOperationContext mathSubContext = new MathOperationContext(new AddOperation());
        System.out.println(mathSubContext.doMathOperation(50, 20));

        MathOperationContext mathMulContext = new MathOperationContext(new AddOperation());
        System.out.println(mathMulContext.doMathOperation(30, 10));
        
    }
}
