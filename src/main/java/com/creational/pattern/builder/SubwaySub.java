package com.creational.pattern.builder;

import java.util.List;

public class SubwaySub {

    private int subLength;
    private Bread bread;
    private Cheese cheese;
    private Meat meat;
    private List<Veggies> veggies;
    private List<Sauce> sauces;

    public int getSubLength() {
        return subLength;
    }

    public void setSubLength(int subLength) {
        this.subLength = subLength;
    }

    public Bread getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Meat getMeat() {
        return meat;
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    public List<Veggies> getVeggies() {
        return veggies;
    }

    public void setVeggies(List<Veggies> veggies) {
        this.veggies = veggies;
    }

    public List<Sauce> getSauces() {
        return sauces;
    }

    public void setSauces(List<Sauce> sauces) {
        this.sauces = sauces;
    }

    @Override
    public String toString() {
        return "SubwaySub {" +
                "subLength=" + subLength +
                ", bread=" + bread +
                ", cheese=" + cheese +
                ", meat=" + meat +
                ", veggies=" + veggies +
                ", sauces=" + sauces +
                '}';
    }
}
