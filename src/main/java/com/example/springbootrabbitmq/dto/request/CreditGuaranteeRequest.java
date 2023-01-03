package com.example.springbootrabbitmq.dto.request;

import com.example.springbootrabbitmq.entity.Customer;
import lombok.*;

@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditGuaranteeRequest {
    private Customer guarantee;
}
