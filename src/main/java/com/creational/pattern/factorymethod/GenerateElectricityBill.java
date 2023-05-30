package com.creational.pattern.factorymethod;

public class GenerateElectricityBill {
    public static void main(String[] args) {

        //Instantiate the Factory
        PlanFactory planFactory = new ElectricityPlanFactory();

        //Call the factory method to get the Product
        ElectricityPlan domesticPlan = planFactory.getPlan("domestic");
        //Run specific method in the Product to do the operation
        domesticPlan.calculateEbill(100);

        ElectricityPlan commercialPlan = planFactory.getPlan("commercial");
        commercialPlan.calculateEbill(100);

    }
}
