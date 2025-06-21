package com.viniciusanholeto.aplicometro.domains.users.inputs;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateUserInput {

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
