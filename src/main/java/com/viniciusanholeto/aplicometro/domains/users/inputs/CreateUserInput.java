package com.viniciusanholeto.aplicometro.domains.users.inputs;

import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateUserInput {

  private String email;
  private String name;
  private LocalDate birthdate;
  private String password;
  private String jobTitle;
  private String jobLevel;
  private Boolean jobHunting;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private LocalDateTime lastLogin;

  public UserModel toModel() {
    return UserModel.builder()
        .email(email)
        .name(name)
        .birthdate(birthdate)
        .accountStatus("active") // Default account status
        .jobTitle(jobTitle)
        .jobLevel(jobLevel)
        .jobHunting(jobHunting != null && jobHunting)
        .build();
  }
}
