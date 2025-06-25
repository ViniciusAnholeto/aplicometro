package com.viniciusanholeto.aplicometro.infrastructure.database.entities;

import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class UserEntity {

  @Id
  private String email;

  private String name;
  private String password;

  @Column(name = "created_at")
  private LocalDateTime createdAt;

  @Column(name = "updated_at")
  private LocalDateTime updatedAt;

  public UserEntity(UserModel userModel) {
    this.name = userModel.getName();
    this.email = userModel.getEmail();
    this.password = userModel.getPassword();
    this.createdAt = userModel.getCreatedAt();
    this.updatedAt = userModel.getUpdatedAt();
  }

  public UserModel toModel() {
    return UserModel.builder()
        .name(this.name)
        .email(this.email)
        .password(this.password)
        .createdAt(this.createdAt)
        .updatedAt(this.updatedAt)
        .build();
  }
}
