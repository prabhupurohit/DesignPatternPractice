package com.pattern.creational.builder;

public class SubwayVendor {

    public static void main(String[] args) {

        //Get the SubwaySub builder
        SubBuilder subBuilder = new SubBuilder();

        //Build the sub
        SubwaySub sub = subBuilder.length(6).bread(Bread.MULTIGRAIN)
                .cheese(Cheese.AMERICAN)
                .meat(Meat.CHICKEN)
                .veggy(Veggies.ONION)
                .veggy(Veggies.LETTUCE)
                .sauce(Sauce.MUSTARD)
                .sauce(Sauce.MAYONESE)
                .build();

        //Print the Sub
        System.out.println(sub);
    }
}
