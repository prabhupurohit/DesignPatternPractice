package com.pattern.structural.decorator;

//This is a State decorator. This also adds a State to the Shape
public class FillColourDecorator extends ShapeDecorator {
    private String colour;

    public FillColourDecorator(Shape shape, String colour) {
        super(shape);
        this.colour = colour;
    }

    @Override
    public void draw() {
        super.draw();
        fillColour(colour);
    }

    private void fillColour(String colour) {
        System.out.println("Filled the shape with colour: " + colour);
    }
}
