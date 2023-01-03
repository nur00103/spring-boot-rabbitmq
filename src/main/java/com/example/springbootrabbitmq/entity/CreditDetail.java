package com.example.springbootrabbitmq.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "credit_detail")
public class CreditDetail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double amount;
    private Double comission;
    private String currency;
    private Integer interestRate;
    private Integer terms;
    private Integer active=1;
    private Date createdAt=java.sql.Date.valueOf(LocalDate.now());
    private Date updatedAt=java.sql.Date.valueOf(LocalDate.now());

    public CreditDetail() {
    }

    public CreditDetail(Long id, Double amount, Double comission, String currency, Integer interestRate, Integer terms, Integer active, Date createdAt, Date updatedAt) {
        this.id = id;
        this.amount = amount;
        this.comission = comission;
        this.currency = currency;
        this.interestRate = interestRate;
        this.terms = terms;
        this.active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public CreditDetail setId(Long id) {
        this.id = id;
        return this;
    }

    public Double getAmount() {
        return amount;
    }

    public CreditDetail setAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    public Double getComission() {
        return comission;
    }

    public CreditDetail setComission(Double comission) {
        this.comission = comission;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public CreditDetail setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public Integer getInterestRate() {
        return interestRate;
    }

    public CreditDetail setInterestRate(Integer interestRate) {
        this.interestRate = interestRate;
        return this;
    }

    public Integer getTerms() {
        return terms;
    }

    public CreditDetail setTerms(Integer terms) {
        this.terms = terms;
        return this;
    }

    public Integer getActive() {
        return active;
    }

    public CreditDetail setActive(Integer active) {
        this.active = active;
        return this;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public CreditDetail setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public CreditDetail setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
