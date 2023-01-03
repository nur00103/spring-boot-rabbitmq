package com.example.springbootrabbitmq.dto.request;

import com.example.springbootrabbitmq.entity.CreditDetail;
import com.example.springbootrabbitmq.entity.CreditGuarantee;
import com.example.springbootrabbitmq.entity.Customer;
import com.example.springbootrabbitmq.entity.User;
import lombok.*;

import javax.persistence.OneToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class OrderRequest {

    private CreditDetailRequest creditDetail;
    private CustomerRequest customerDetail;
    private CreditGuaranteeRequest guarantee;
    private UserRequest user;
}
