package com.creational.pattern.factorymethod;

public class GenerateElectricityBill {
    public static void main(String[] args) {
        //Instantiate the Factory or/and call the factory method to get the Product
        ElectricityPlan domesticPlan = ElectricityPlanFactory.getPlan("domestic");
        //Run specific method in the Product to do the operation
        domesticPlan.calculateEbill(100);

        ElectricityPlan commercialPlan = ElectricityPlanFactory.getPlan("commercial");
        commercialPlan.calculateEbill(100);

    }
}
