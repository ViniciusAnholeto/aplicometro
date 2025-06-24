package com.viniciusanholeto.aplicometro.domains.users.models;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserModel {

  private String id;
  private String name;
  private String email;
  private String password;
  private String role;
  private boolean active;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
}
