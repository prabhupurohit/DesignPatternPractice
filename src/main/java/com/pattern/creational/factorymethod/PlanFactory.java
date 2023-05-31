package com.pattern.creational.factorymethod;

public interface PlanFactory {
    public ElectricityPlan getPlan(String planType);
}
