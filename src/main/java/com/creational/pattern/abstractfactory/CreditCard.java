package com.creational.pattern.abstractfactory;

import java.util.Random;

public class CreditCard {

    private long cardNum;
    private String name;
    private String expiry;
    private int cardNumLength;
    private int cscLength;

    private CardType cardType;

    public CreditCard(String name, int cardNumLength, int cscLength, CardType cardType) {
        this.name = name;
        this.cardNumLength = cardNumLength;
        this.cscLength = cscLength;
        this.cardType = cardType;
    }

    public int getCardNumLength() {
        return cardNumLength;
    }

    public void setCardNumLength(int cardNumLength) {
        this.cardNumLength = cardNumLength;
    }

    public int getCscLength() {
        return cscLength;
    }

    public void setCscLength(int cscLength) {
        this.cscLength = cscLength;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public long getCardNum() {
        return cardNum;
    }

    public void setCardNum(long cardNum) {
        this.cardNum = cardNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNum=" + cardNum +
                ", name='" + name + '\'' +
                ", expiry='" + expiry + '\'' +
                ", cardNumLength=" + cardNumLength +
                ", cscLength=" + cscLength +
                ", cardType=" + cardType +
                '}';
    }
}
