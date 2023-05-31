package com.pattern.creational.abstractfactory;

public abstract class CreditCardFactory {
    public static CreditCardFactory getCreditCardFactory (int creditScore) {
        if (creditScore > 650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType, String name);
    public abstract Validator getValidator(CardType cardType);
}
