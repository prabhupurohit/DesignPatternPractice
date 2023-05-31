package com.pattern.creational.abstractfactory;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class AmexPlatinumCreditCard extends CreditCard {

    public AmexPlatinumCreditCard(String name) {
        super(name,11, 4, CardType.PLATINUM);
        Random random = new Random();
        super.setCardNum(random.nextInt(10)*10000000000l);
        Calendar cal = Calendar.getInstance();
        Date today = cal.getTime();
        cal.add(Calendar.YEAR, 5); // to get previous year add -1
        Date expiry = cal.getTime();
        super.setExpiry(String.valueOf(expiry));
    }
}
