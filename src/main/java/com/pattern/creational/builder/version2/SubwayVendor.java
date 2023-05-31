package com.pattern.creational.builder.version2;

import com.pattern.creational.builder.*;

public class SubwayVendor {

    public static void main(String[] args) {

        //Get the SubwaySub builder and build the Sub
        SubwaySub sub = SubwaySub.SubBuilder.getBuilder()
                .bread(Bread.MULTIGRAIN)
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
