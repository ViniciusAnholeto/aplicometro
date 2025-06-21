package com.viniciusanholeto.aplicometro.domains.users.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserModel {

  private Long id;
  private String name;
  private String email;
  private String password;
  private String role;
  private boolean active;
  private String createdAt;
  private String updatedAt;
}
