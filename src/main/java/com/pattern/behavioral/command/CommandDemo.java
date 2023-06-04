package com.pattern.behavioral.command;

public class CommandDemo {

    public static void main(String[] args) {

        //Create few Stocks

        Stock asianPaints = new Stock("AsianPaints", 0);
        Stock tataMotors = new Stock("TataMotors", 0);
        Stock hindustanLever = new Stock("HindustanLever", 0);
        Stock infosys = new Stock("Infosys", 0);


        //Create few orders

        Order order1 = new BuyStock(50, asianPaints);
        Order order2 = new SellStock(250, tataMotors);
        Order order3 = new BuyStock(10, hindustanLever);
        Order order4 = new BuyStock(100, infosys);
        Order order5 = new SellStock(45, infosys);
        Order order6 = new BuyStock(25, asianPaints);



        //Create a Broker and ask him to take the orders
        Broker broker = new Broker();
        broker.takeOrders(order1);
        broker.takeOrders(order2);
        broker.takeOrders(order3);
        broker.takeOrders(order4);
        broker.takeOrders(order5);
        broker.takeOrders(order6);

        //Place the orders through the broker
        broker.placeOrder();

    }



}
