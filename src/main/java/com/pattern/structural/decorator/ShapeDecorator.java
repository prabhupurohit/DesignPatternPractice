package com.pattern.structural.decorator;

//Define the ShapeDecorator abstract so that it can't be instantiated
public abstract class ShapeDecorator implements Shape {

    //The ShapeDecorator has a Shape

    Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
