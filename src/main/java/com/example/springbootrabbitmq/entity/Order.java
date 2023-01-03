package com.example.springbootrabbitmq.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "order")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private CreditDetail creditDetailId;
    @OneToOne
    private Customer customerId;
    @OneToOne
    private CreditGuarantee guaranteeId;
    @OneToOne
    private User userId;
    public Integer orderStatus;
    private Integer active=1;
    private Date createdAt=java.sql.Date.valueOf(LocalDate.now());
    private Date updatedAt=java.sql.Date.valueOf(LocalDate.now());



}
