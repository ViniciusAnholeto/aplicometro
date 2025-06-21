package com.viniciusanholeto.aplicometro.infrastructure.api.v1.request.users;

import lombok.Data;

@Data
public class CreateUserRequest {
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String country;
    private String postalCode;
}
