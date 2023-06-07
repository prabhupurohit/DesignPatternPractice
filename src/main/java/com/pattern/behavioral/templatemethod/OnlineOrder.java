package com.pattern.behavioral.templatemethod;

public class OnlineOrder extends OrderProcessTemplate {

    public OnlineOrder() {
        super.setGift(true);
        super.setNeedDelivery(true);
    }

    @Override
    public void doSelect() {
        System.out.println("Product selected from Online Catalogue!");
    }

    @Override
    public void doPayment() {
        System.out.println("Payment done through Online Payment Gateway!");
    }

    @Override
    public void doDelivery() {
        System.out.println("Product delivered through courier!");
    }
}
