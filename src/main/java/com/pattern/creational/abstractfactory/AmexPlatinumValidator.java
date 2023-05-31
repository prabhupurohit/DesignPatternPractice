package com.pattern.creational.abstractfactory;

public class AmexPlatinumValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        if (creditCard.getCardNumLength() == 11 &&
                creditCard.getCscLength() == 4 &&
                creditCard.getCardType() == CardType.PLATINUM) {
            return true;
        } else {
            return false;
        }
    }
}
