package com.pattern.structural.decorator;

//This is a behaviour decorator which adds new behaviour
public class BoarderDecorator extends ShapeDecorator {

    public BoarderDecorator(Shape shape) {
        super(shape);
    }

    //Override draw method to add behaviour
    @Override
    public void draw() {
        super.draw();
        setBoarder();
    }

    private void setBoarder() {
        System.out.println("Boarder added to the Shape");
    }

}
