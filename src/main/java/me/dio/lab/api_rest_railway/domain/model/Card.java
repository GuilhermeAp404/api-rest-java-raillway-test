package me.dio.lab.api_rest_railway.domain.model;

public class Card {
    private String number;
    private float limit;

    public Card() {
    }

    public Card(String number, float limit) {
        this.number = number;
        this.limit = limit;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public float getLimit() {
        return limit;
    }

    public void setLimit(float limit) {
        this.limit = limit;
    }
}
