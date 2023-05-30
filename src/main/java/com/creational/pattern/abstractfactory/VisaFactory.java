package com.creational.pattern.abstractfactory;

public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType, String name) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldCreditCard(name);
            case PLATINUM:
                return new VisaPlatinumCreditCard(name);
            default:
                return null;
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldValidator();
            case PLATINUM:
                return new VisaPlatinumValidator();
            default:
                return null;
        }
    }
}
