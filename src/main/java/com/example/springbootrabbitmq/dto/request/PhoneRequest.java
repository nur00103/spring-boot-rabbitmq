package com.example.springbootrabbitmq.dto.request;

import com.example.springbootrabbitmq.entity.Phone;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class PhoneRequest implements Serializable {
    private String phoneNumber;
    private String description;


}
