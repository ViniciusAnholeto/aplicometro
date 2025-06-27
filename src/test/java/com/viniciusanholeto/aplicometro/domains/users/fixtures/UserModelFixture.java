package com.viniciusanholeto.aplicometro.domains.users.fixtures;

import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;
import com.viniciusanholeto.aplicometro.domains.users.models.enums.UserRolesEnum;
import java.sql.Date;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserModelFixture {

  private String email;
  private String name;
  private String password;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private Date birthdate;
  private String accountStatus;
  private UserRolesEnum role;
  private LocalDateTime lastLogin;
  private String jobTitle;
  private String jobLevel;
  private boolean jobHunting;

  public static UserModel create() {
    return UserModel.builder()
        .name("Test User")
        .email("user@aplicometro.com")
        .role(UserRolesEnum.valueOf("USER"))
        .createdAt(LocalDateTime.now())
        .updatedAt(LocalDateTime.now())
        .birthdate(Date.valueOf("1990-01-01").toLocalDate())
        .accountStatus("active")
        .role(UserRolesEnum.valueOf("USER"))
        .lastLogin(LocalDateTime.now())
        .jobTitle("Software Engineer")
        .jobLevel("Mid-Level")
        .jobHunting(false)
        .build();
  }
}
