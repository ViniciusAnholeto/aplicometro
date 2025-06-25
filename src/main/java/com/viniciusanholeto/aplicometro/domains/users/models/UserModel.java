package com.viniciusanholeto.aplicometro.domains.users.models;

import com.viniciusanholeto.aplicometro.domains.users.models.enums.UserRolesEnum;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserModel {

  private String email;
  private String name;
  private LocalDate birthdate;
  private String accountStatus;
  private LocalDateTime lastLogin;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private String jobTitle;
  private String jobLevel;
  private boolean jobHunting;
  private UserRolesEnum role;
}
