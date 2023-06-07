package com.pattern.structural.facade;

public class FuelInjector {
    public void on() {
        System.out.println("Engine Fuel Injector: Started!");
    }

    public void inject() {
        System.out.println("Engine Fuel Injector: Injecting fuel now!");
    }

    public void off() {
        System.out.println("Engine Fuel Injector: Stopped!");
    }
}
