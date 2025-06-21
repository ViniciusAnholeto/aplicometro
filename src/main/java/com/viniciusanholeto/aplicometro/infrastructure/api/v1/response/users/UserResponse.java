package com.viniciusanholeto.aplicometro.infrastructure.api.v1.response.users;

import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;
import lombok.Data;

@Data
public class UserResponse {

  private Long id;
  private String name;
  private String email;
  private String password;
  private String phoneNumber;

  public UserResponse(UserModel model) {
    this.id = model.getId();
    this.name = model.getName();
    this.email = model.getEmail();
    this.password = model.getPassword();
  }
}
