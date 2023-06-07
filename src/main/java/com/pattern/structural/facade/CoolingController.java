package com.pattern.structural.facade;

public class CoolingController {
    public void setTemperatureUpperLimit(int defaultCoolingTemp) {
        System.out.println("Engine Colling Controller: Setting upper temperature limit to: " + defaultCoolingTemp + " degrees!");
    }

    public void run() {
        System.out.println("Engine Cooling Controller: Running!");
    }

    public void cool(int maxAllowedTemp) {
        System.out.println("Engine Cooling Controller: Cooling upto: " + maxAllowedTemp + " degrees!");
    }

    public void stop() {
        System.out.println("Engine Colling Controller: Is stopped!");
    }
}
