package com.pattern.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class SubBuilder {

    private SubwaySub sub;

    //    public SubBuilder(SubwaySub sub) {
    //        this.sub = sub;
    //    }

    public SubBuilder() {
        this.sub = new SubwaySub();
    }

    public SubBuilder length(int length) {
        this.sub.setSubLength(length);
        return this;
    }

    public SubBuilder bread(Bread bread) {
        this.sub.setBread(bread);
        return this;
    }

    public SubBuilder cheese(Cheese cheese) {
        this.sub.setCheese(cheese);
        return this;
    }

    public SubBuilder meat(Meat meat) {
        this.sub.setMeat(meat);
        return this;
    }

    public SubBuilder veggy(Veggies veg) {
        List<Veggies> veggies = this.sub.getVeggies();
        if (veggies == null) {
            veggies = new ArrayList<>();
        }
        veggies.add(veg);
        this.sub.setVeggies(veggies);
        return this;
    }

    public SubBuilder sauce(Sauce sauce) {
        List<Sauce> sauces = this.sub.getSauces();
        if (sauces == null) {
            sauces = new ArrayList<>();
        }
        sauces.add(sauce);
        this.sub.setSauces(sauces);
        return this;
    }

    public SubwaySub build() {
        return this.sub;
    }
}
