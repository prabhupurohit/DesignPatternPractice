package com.creational.pattern.factorymethod;

public class DomesticPlan extends ElectricityPlan {

    //Use Constructor to set the rate in the super class
    public DomesticPlan() {
        super(Constants.DOMESTIC_RATE);
    }
}
