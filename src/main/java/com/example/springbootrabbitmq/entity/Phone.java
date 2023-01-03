package com.example.springbootrabbitmq.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "phone")
public class Phone implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String phoneNumber;
    private String description;
    private Integer active=1;
    private Date createdAt=java.sql.Date.valueOf(LocalDate.now());
    private Date updatedAt=java.sql.Date.valueOf(LocalDate.now());
    @ManyToOne
    @JoinColumn(name = "customer_id")
    @JsonBackReference
    private Customer customer;

    public Phone() {
    }

    public Phone(Long id, String phoneNumber, String description, Integer active, Date createdAt, Date updatedAt, Customer customer) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.description = description;
        this.active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public Phone setId(Long id) {
        this.id = id;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Phone setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Phone setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getActive() {
        return active;
    }

    public Phone setActive(Integer active) {
        this.active = active;
        return this;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Phone setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public Phone setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Phone setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }
}
