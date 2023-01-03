package com.example.springbootrabbitmq.dto.request;

import lombok.*;

import javax.persistence.Column;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CustomerRequest {

    private String firstName;
    private String lastName;
    private String middleName;
    private String fin;
    private String address;
    private int familyMemberCount;
    private Double income;
    private Double otherIncome;
    private String workPlace;
    private String position;
    private Double workExperience;
    private List<PhoneRequest> phoneList;
}
