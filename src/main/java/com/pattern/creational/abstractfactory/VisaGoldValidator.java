package com.pattern.creational.abstractfactory;

public class VisaGoldValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        if (creditCard.getCardNumLength() == 12 &&
                creditCard.getCscLength() == 3 &&
                creditCard.getCardType() == CardType.GOLD) {
            return true;
        } else {
            return false;
        }
    }
}
