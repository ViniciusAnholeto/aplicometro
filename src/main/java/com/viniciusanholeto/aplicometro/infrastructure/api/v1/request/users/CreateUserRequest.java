package com.viniciusanholeto.aplicometro.infrastructure.api.v1.request.users;

import com.viniciusanholeto.aplicometro.domains.users.inputs.CreateUserInput;
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

    public CreateUserInput toInput() {
        return CreateUserInput.builder()
                .name(name)
                .email(email)
                .password(password)
                .phoneNumber(phoneNumber)
                .address(address)
                .city(city)
                .state(state)
                .country(country)
                .postalCode(postalCode)
                .build();
    }
}
