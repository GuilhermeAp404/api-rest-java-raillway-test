package me.dio.lab.api_rest_railway.domain.model;

import java.util.List;

public class User {
    private String name;
    private  Account account;
    private Card card;
    private List<Feature> features;
    private List<News> news;

    public User() {
    }

    public User(String name, Account account, Card card, List<Feature> features, List<News> news) {
        this.name = name;
        this.account = account;
        this.card = card;
        this.features = features;
        this.news = news;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }
}
