package com.pattern.behavioral.command;

public class BuyStock implements Order {

    int unit;
    Stock stock;

    public BuyStock(int unit, Stock stock) {
        this.unit = unit;
        this.stock=stock;
    }

    @Override
    public void execute() {
        stock.buyStock(unit);
    }
}
