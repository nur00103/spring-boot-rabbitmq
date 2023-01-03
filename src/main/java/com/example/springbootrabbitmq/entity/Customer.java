package com.example.springbootrabbitmq.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "customer")
@DynamicInsert
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long id;
    private String firstName;
    private String lastName;
    private String middleName;

    @Column(length = 7,unique = true)
    private String fin;
    private String address;
    private int familyMemberCount;
    private Double income;
    private Double otherIncome;
    private String workPlace;
    private String position;
    private Double workExperience;
    private Integer active=1;
    private Date createdAt=java.sql.Date.valueOf(LocalDate.now());
    private Date updatedAt=java.sql.Date.valueOf(LocalDate.now());

    @OneToMany(mappedBy = "customer")
    @JsonManagedReference
    private List<Phone> phoneList;

    public Customer() {
    }

    public Customer(Long id, String firstName, String lastName, String middleName, String fin, String address, int familyMemberCount, Double income, Double otherIncome, String workPlace, String position, Double workExperience, Integer active, Date createdAt, Date updatedAt, List<Phone> phoneList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.fin = fin;
        this.address = address;
        this.familyMemberCount = familyMemberCount;
        this.income = income;
        this.otherIncome = otherIncome;
        this.workPlace = workPlace;
        this.position = position;
        this.workExperience = workExperience;
        this.active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.phoneList = phoneList;
    }

    public Long getId() {
        return id;
    }

    public Customer setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Customer setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Customer setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Customer setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public String getFin() {
        return fin;
    }

    public Customer setFin(String fin) {
        this.fin = fin;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Customer setAddress(String address) {
        this.address = address;
        return this;
    }

    public int getFamilyMemberCount() {
        return familyMemberCount;
    }

    public Customer setFamilyMemberCount(int familyMemberCount) {
        this.familyMemberCount = familyMemberCount;
        return this;
    }

    public Double getIncome() {
        return income;
    }

    public Customer setIncome(Double income) {
        this.income = income;
        return this;
    }

    public Double getOtherIncome() {
        return otherIncome;
    }

    public Customer setOtherIncome(Double otherIncome) {
        this.otherIncome = otherIncome;
        return this;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public Customer setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
        return this;
    }

    public String getPosition() {
        return position;
    }

    public Customer setPosition(String position) {
        this.position = position;
        return this;
    }

    public Double getWorkExperience() {
        return workExperience;
    }

    public Customer setWorkExperience(Double workExperience) {
        this.workExperience = workExperience;
        return this;
    }

    public Integer getActive() {
        return active;
    }

    public Customer setActive(Integer active) {
        this.active = active;
        return this;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Customer setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public Customer setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public Customer setPhoneList(List<Phone> phoneList) {
        this.phoneList = phoneList;
        return this;
    }
}
