package com.pattern.behavioral.command;

public class Stock {

    private String name;
    private int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    //Sell Stock

    public void sellStock(int nos) {
        if (quantity > 0) {
            quantity = quantity - nos;
            System.out.println("Successfully sold " + nos + " no. of " + name + " stocks!");
            System.out.println("Current balance of stocks: " + quantity);
        } else {
            System.out.println("Not having sufficient " + name + " Stock!");
        }
    }

    public void buyStock(int nos) {
        quantity = quantity + nos;
        System.out.println("Successfully bought " + nos + " no. of " + name + " stocks!");
        System.out.println("Current balance of " + name + " stocks: " + quantity);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

}
