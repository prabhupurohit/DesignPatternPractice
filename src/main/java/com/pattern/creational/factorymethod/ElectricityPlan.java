package com.pattern.creational.factorymethod;

import java.util.Arrays;

public abstract class ElectricityPlan {
    protected double rate;

    //Constructor to set the rate as per different Electricity Plan

    public ElectricityPlan(double rate) {
        this.rate = rate;
    }

    public void calculateEbill(int units) {
        double ebill = rate * units;
        String[] str = this.getClass().getName().split("\\.");
        System.out.println("Electricity Bill for plan " +
                 str[str.length - 1] +
                " is: " + ebill);
    }
}
