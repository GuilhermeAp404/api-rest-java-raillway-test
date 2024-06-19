package me.dio.lab.api_rest_railway.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(unique = true)
    private String number;
    private String agency;
    @Column(precision = 13, scale = 2)
    private BigDecimal  balance;
    @Column(name ="additional_limit", precision = 13, scale = 2)
    private BigDecimal limit;


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

    public BigDecimal  getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal  balance) {
        this.balance = balance;
    }

    public BigDecimal  getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal  limit) {
        this.limit = limit;
    }
}
