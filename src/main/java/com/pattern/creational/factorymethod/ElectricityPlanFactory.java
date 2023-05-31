package com.pattern.creational.factorymethod;

public class ElectricityPlanFactory implements PlanFactory {

    @Override
    public ElectricityPlan getPlan(String planType) {
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
