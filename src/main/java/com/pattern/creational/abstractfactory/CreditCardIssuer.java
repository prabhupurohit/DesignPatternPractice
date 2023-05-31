package com.pattern.creational.abstractfactory;

public class CreditCardIssuer {
    public static void main(String[] args) {
        CreditCardFactory amexGoldCreditCardFactory = CreditCardFactory.getCreditCardFactory(775);
        CreditCard amexGoldCreditCard = amexGoldCreditCardFactory
                .getCreditCard(CardType.GOLD, "Prabhu Purohit");
        System.out.println(amexGoldCreditCard);
        Validator amexGoldValidator = amexGoldCreditCardFactory.getValidator(CardType.GOLD);
        System.out.println(amexGoldValidator.isValid(amexGoldCreditCard));

        CreditCardFactory amexPlatinumCreditCardFactory = CreditCardFactory.getCreditCardFactory(775);
        CreditCard amexPlatinumCreditCard = amexPlatinumCreditCardFactory
                .getCreditCard(CardType.PLATINUM, "Prabhu Purohit");
        System.out.println(amexPlatinumCreditCard);
        Validator amexPlatinumValidator = amexPlatinumCreditCardFactory.getValidator(CardType.PLATINUM);
        System.out.println(amexPlatinumValidator.isValid(amexPlatinumCreditCard));

        CreditCardFactory visaGoldCreditCardFactory = CreditCardFactory.getCreditCardFactory(620);
        CreditCard visaGoldCreditCard = visaGoldCreditCardFactory
                .getCreditCard(CardType.GOLD, "Prabhu Purohit");
        System.out.println(visaGoldCreditCard);
        Validator visaGoldValidator = visaGoldCreditCardFactory.getValidator(CardType.GOLD);
        System.out.println(visaGoldValidator.isValid(visaGoldCreditCard));

        CreditCardFactory visaPlatinumCreditCardFactory = CreditCardFactory.getCreditCardFactory(620);
        CreditCard visaPlatinumCreditCard = visaPlatinumCreditCardFactory
                .getCreditCard(CardType.PLATINUM, "Prabhu Purohit");
        System.out.println(visaPlatinumCreditCard);
        Validator validator = visaPlatinumCreditCardFactory.getValidator(CardType.PLATINUM);
        System.out.println(validator.isValid(visaPlatinumCreditCard));
    }
}
