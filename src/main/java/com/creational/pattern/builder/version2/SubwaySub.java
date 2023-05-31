package com.creational.pattern.builder.version2;

import com.creational.pattern.builder.*;

import java.util.ArrayList;
import java.util.List;

public class SubwaySub {

    private int subLength;
    private Bread bread;
    private Cheese cheese;
    private Meat meat;
    private List<Veggies> veggies;
    private List<Sauce> sauces;

    public SubwaySub(SubBuilder subBuilder) {
        this.bread = subBuilder.bread;
        this.subLength = subBuilder.subLength;
        this.cheese = subBuilder.cheese;
        this.meat = subBuilder.meat;
        this.veggies = subBuilder.veggies;
        this.sauces = subBuilder.sauces;
    }

    public static class SubBuilder {
        private int subLength;
        private Bread bread;
        private Cheese cheese;
        private Meat meat;
        private List<Veggies> veggies;
        private List<Sauce> sauces;

        public static SubBuilder getBuilder() {
            return new SubBuilder();
        }

        public SubBuilder length(int length) {
            this.subLength = length;
            return this;
        }

        public SubBuilder bread(Bread bread) {
            this.bread = bread;
            return this;
        }

        public SubBuilder cheese(Cheese cheese) {
            this.cheese = cheese;
            return this;
        }

        public SubBuilder meat(Meat meat) {
            this.meat = meat;
            return this;
        }

        public SubBuilder veggy(Veggies veg) {
            List<Veggies> veggies = this.veggies;
            if (veggies == null) {
                veggies = new ArrayList<>();
            }
            veggies.add(veg);
            this.veggies = veggies;
            return this;
        }

        public SubBuilder sauce(Sauce sauce) {
            List<Sauce> sauces = this.sauces;
            if (sauces == null) {
                sauces = new ArrayList<>();
            }
            sauces.add(sauce);
            this.sauces = sauces;
            return this;
        }

        public SubwaySub build() {
            return new SubwaySub(this);
        }

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
