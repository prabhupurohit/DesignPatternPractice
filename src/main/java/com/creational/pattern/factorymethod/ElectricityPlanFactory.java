package com.creational.pattern.factorymethod;

public class ElectricityPlanFactory {
    public static ElectricityPlan getPlan(String planType) {
        switch (planType) {
            case "domestic": {
                return new DomesticPlan();
            }
            case "commercial": {
                return new CommercialPlan();
            }
            default: {
                return null;
            }
        }
    }
}
