package com.pattern.behavioral.command;

public class SellStock implements Order {

    int unit;
    Stock stock;

    public SellStock(int unit, Stock stock) {
        this.unit = unit;
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sellStock(unit);
    }
}
