package com.pattern.behavioral.templatemethod;

public abstract class OrderProcessTemplate {
    private boolean isGift;
    private boolean needDelivery;

    //This methods are implemented by the extending class
    public abstract void doSelect();

    public abstract void doPayment();

    public abstract void doDelivery();

    //This is a private method controlled by the state isGift
    private void doGiftWrap() {
        System.out.println("Gift wrap of the product completed!");
    }

    //These are hooks which will control whether the product has to be gift wrapped or delivered
    //These are available to the extending class to modify the flow of the final method processOrder()
    public void setGift(boolean gift) {
        isGift = gift;
    }

    public void setNeedDelivery(boolean needDelivery) {
        this.needDelivery = needDelivery;
    }

    //This is a final method and not available to the extending class to implement
    public final void processOrder() {
        doSelect();
        doPayment();
        if(isGift) {
            doGiftWrap();
        }
        if(needDelivery) {
            doDelivery();
        }
    }
}
