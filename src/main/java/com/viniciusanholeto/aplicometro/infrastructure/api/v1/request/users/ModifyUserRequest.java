package com.viniciusanholeto.aplicometro.infrastructure.api.v1.request.users;

import com.viniciusanholeto.aplicometro.domains.users.inputs.ModifyUserInput;
import lombok.Data;

@Data
public class ModifyUserRequest {

  private Long id;
  private String name;
  private String email;
  private String password;
  private String phoneNumber;
  private String address;
  private String city;
  private String state;
  private String country;
  private String postalCode;

  public ModifyUserInput toInput() {
    return ModifyUserInput.builder()
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
