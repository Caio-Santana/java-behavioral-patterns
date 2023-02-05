package com.caio.behavioralpatterns.strategy;

public class CreditCard {

    private String number;
    private String Date;
    private String cvv;

    private ValidationStrategy validationStrategy;

    public CreditCard(ValidationStrategy validationStrategy) {
        this.validationStrategy = validationStrategy;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public boolean isValid() {
        return validationStrategy.isValid(this);
    }

}
