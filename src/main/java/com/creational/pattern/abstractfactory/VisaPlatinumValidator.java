package com.creational.pattern.abstractfactory;

public class VisaPlatinumValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        if (creditCard.getCardNumLength() == 12 &&
                creditCard.getCscLength() == 3 &&
                creditCard.getCardType() == CardType.PLATINUM) {
            return true;
        } else {
            return false;
        }
    }
}
