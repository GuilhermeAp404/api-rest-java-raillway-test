package me.dio.lab.api_rest_railway.domain.model;

public class Account {
    private String number;
    private String agency;
    private float balance;
    private float limit;

    public Account() {
    }

    public Account(String number, String agency, float balance, float limit) {
        this.number = number;
        this.agency = agency;
        this.balance = balance;
        this.limit = limit;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getLimit() {
        return limit;
    }

    public void setLimit(float limit) {
        this.limit = limit;
    }
}
