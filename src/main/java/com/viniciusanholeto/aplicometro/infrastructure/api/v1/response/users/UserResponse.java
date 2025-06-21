package com.viniciusanholeto.aplicometro.infrastructure.api.v1.response.users;

import lombok.Data;

@Data
public class UserResponse {

  private Long id;
  private String name;
  private String email;
  private String password;
  private String phoneNumber;
}
