package com.viniciusanholeto.aplicometro.domains.users.fixtures;

import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserModelFixture {

  private String id;
  private String name;
  private String email;
  private String password;
  private String role;
  private boolean active;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

  public static UserModel create() {
    return UserModel.builder()
        .name("Test User")
        .email("user@aplicometro.com")
        .password("password")
        .role("USER")
        .active(true)
        .createdAt(LocalDateTime.now())
        .updatedAt(LocalDateTime.now())
        .build();
  }

  public static UserModel create(String id) {
    return UserModel.builder()
        .id(id)
        .name("Test User")
        .email("user@aplicometro.com")
        .password("password")
        .role("USER")
        .active(true)
        .createdAt(LocalDateTime.now())
        .updatedAt(LocalDateTime.now())
        .build();
  }
}
