package com.example.springbootrabbitmq.entity;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "user")
@DynamicInsert
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @ColumnDefault(value = "1")
    private Integer active;
    @CreationTimestamp
    private Date createdAt;

    public User() {
    }

    public User(Long id, String firstName, String lastName, Integer active, Date createdAt) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.active = active;
        this.createdAt = createdAt;
    }

    public User(String firstName, String lastName, Integer active, Date createdAt) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.active = active;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Integer getActive() {
        return active;
    }

    public User setActive(Integer active) {
        this.active = active;
        return this;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public User setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

}
