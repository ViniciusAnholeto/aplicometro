package com.viniciusanholeto.aplicometro.infrastructure.api.v1.response.users;

import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class UserResponse {

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

  public UserResponse(UserModel model) {
    this.email = model.getEmail();
    this.name = model.getName();
    this.birthdate = model.getBirthdate();
    this.accountStatus = model.getAccountStatus();
    this.lastLogin = model.getLastLogin();
    this.createdAt = model.getCreatedAt();
    this.updatedAt = model.getUpdatedAt();
    this.jobTitle = model.getJobTitle();
    this.jobLevel = model.getJobLevel();
    this.jobHunting = model.isJobHunting();
  }
}
