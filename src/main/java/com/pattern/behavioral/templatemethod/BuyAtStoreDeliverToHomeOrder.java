package com.pattern.behavioral.templatemethod;

public class BuyAtStoreDeliverToHomeOrder extends OrderProcessTemplate {

    public BuyAtStoreDeliverToHomeOrder() {
        super.setGift(false);
        super.setNeedDelivery(true);
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
