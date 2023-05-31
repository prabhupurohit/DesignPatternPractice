package com.pattern.creational.factorymethod;

public class CommercialPlan extends ElectricityPlan {

    //Use Constructor to set the rate in the super class
    public CommercialPlan() {
        super(Constants.COMMERCIAL_RATE);
    }
}
