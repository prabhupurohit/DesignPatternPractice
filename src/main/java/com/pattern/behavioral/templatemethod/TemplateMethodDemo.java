package com.pattern.behavioral.templatemethod;

public class TemplateMethodDemo {
    public static void main(String[] args) {

        //Create a template for Store Order
        System.out.println("-----Buy from Store-----");
        OrderProcessTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();

        //Create a template for Online Order
        System.out.println("-----Buy from Online-----");
        OrderProcessTemplate onlineOrder = new OnlineOrder();
        onlineOrder.processOrder();

        //Create a template for Buy from Store Deliver to Home Order
        System.out.println("-----Buy from Store Deliver at Home-----");
        OrderProcessTemplate buyAtStoreDeliverToHome = new BuyAtStoreDeliverToHomeOrder();
        buyAtStoreDeliverToHome.processOrder();

    }
}
