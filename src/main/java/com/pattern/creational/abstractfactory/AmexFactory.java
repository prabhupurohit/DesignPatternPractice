package com.pattern.creational.abstractfactory;

public class AmexFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType, String name) {
        switch (cardType) {
            case GOLD:
                return new AmexGoldCreditCard(name);
            case PLATINUM:
                return new AmexPlatinumCreditCard(name);
            default:
                return null;
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new AmexGoldValidator();
            case PLATINUM:
                return new AmexPlatinumValidator();
            default:
                return null;
        }
    }
}
