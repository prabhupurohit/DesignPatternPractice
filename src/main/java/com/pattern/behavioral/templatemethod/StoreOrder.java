package com.pattern.behavioral.templatemethod;

public class StoreOrder extends OrderProcessTemplate {

    public StoreOrder() {
        super.setGift(true);
        super.setNeedDelivery(false);
    }
    @Override
    public void doSelect() {
        System.out.println("Product selected from Store collection!");
    }

    @Override
    public void doPayment() {
        System.out.println("Payment done at the store POS!");
    }

    @Override
    public void doDelivery() {
        System.out.println("Product delivered through courier!");
    }
}
