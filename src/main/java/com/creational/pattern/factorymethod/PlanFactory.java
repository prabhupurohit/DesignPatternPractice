package com.creational.pattern.factorymethod;

public interface PlanFactory {
    public ElectricityPlan getPlan(String planType);
}
