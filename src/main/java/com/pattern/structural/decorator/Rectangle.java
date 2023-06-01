package com.pattern.structural.decorator;

public class Rectangle implements Shape {

    private int length;
    private int height;

    public Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with length: " + length + " and height: " + height);
    }
}
