package com.example.springbootrabbitmq.dto.request;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CreditDetailRequest {

    private Double amount;
    private Double comission;
    private String currency;
    private Integer interestRate;
    private Integer terms;
}
