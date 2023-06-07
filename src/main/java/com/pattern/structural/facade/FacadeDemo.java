package com.pattern.structural.facade;

public class FacadeDemo {

    public static void main(String[] args) {
        //First instantiate the facade

        CarEngineFacade carEngine = new CarEngineFacade();

        //Start the Car Engine
        System.out.println("-----Starting the Engine-----");
        carEngine.startEngine();

        //Stop the Car Engine
        System.out.println("-----Stopping the Engine-----");
        carEngine.stopEngine();

    }
}
