package me.dio.lab.api_rest_railway.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String number;
    @Column(name = "available_limit",precision = 13, scale = 2)
    private BigDecimal limit;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
