package com.creational.pattern.builder;

public class SubwayVendor {

    public static void main(String[] args) {

        //Get the SubwaySub builder by providing a new SubwaySub
        SubBuilder subBuilder = new SubBuilder(new SubwaySub());
        SubwaySub sub = subBuilder.length(6).bread(Bread.MULTIGRAIN)
                .cheese(Cheese.AMERICAN)
                .meat(Meat.CHICKEN)
                .veggy(Veggies.ONION)
                .veggy(Veggies.LETTUCE)
                .sauce(Sauce.MUSTARD)
                .sauce(Sauce.MAYONESE)
                .build();
        System.out.println(sub);
    }
}
