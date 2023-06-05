package com.pattern.behavioral.strategy;

public class StrategyDemo {

    public static void main(String[] args) {

        //Create a MathOperation Context

        MathOperationContext mathAddContext = new MathOperationContext(new AddOperation());
        System.out.println((mathAddContext.doMathOperation(15, 20)));

        //Using Functional Interface and Lambda Expression
        MathOperationContext mathAddContext1 = new MathOperationContext((a, b) -> a + b);
        System.out.println((mathAddContext1.doMathOperation(15, 20)));

        MathOperationContext mathSubContext = new MathOperationContext(new SubstractOperation());
        System.out.println(mathSubContext.doMathOperation(50, 20));

        MathOperationContext mathSubContext1 = new MathOperationContext((a, b) -> a - b);
        System.out.println(mathSubContext1.doMathOperation(50, 20));

        MathOperationContext mathMulContext = new MathOperationContext(new MultiplyOperation());
        System.out.println(mathMulContext.doMathOperation(30, 10));

        MathOperationContext mathMulContext1 = new MathOperationContext((a, b) -> a * b);
        System.out.println(mathMulContext1.doMathOperation(30, 10));

    }
}
