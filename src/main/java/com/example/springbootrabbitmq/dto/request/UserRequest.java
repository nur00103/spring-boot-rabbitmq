package com.example.springbootrabbitmq.dto.request;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserRequest implements Serializable {

    private Long id;
}
