package com.pattern.structural.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        //Instantiate 2 shapes first
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(20, 30);

        //Instantiate the Decorators
        ShapeDecorator boarderDecorator1 = new BoarderDecorator(circle);
        boarderDecorator1.draw();

        //Pass the Boarder decorator to the FillColourDecorator as an argument
        ShapeDecorator fillColourDecorator1 = new FillColourDecorator(boarderDecorator1, "red");
        fillColourDecorator1.draw();


        //Chaining the decorators
        ShapeDecorator fillColourDecorator2 = new FillColourDecorator(new BoarderDecorator(new Rectangle(20, 15)), "blue");
        fillColourDecorator2.draw();
    }
}
