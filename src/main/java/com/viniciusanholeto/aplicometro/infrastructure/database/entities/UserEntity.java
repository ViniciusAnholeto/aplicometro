package com.viniciusanholeto.aplicometro.infrastructure.database.entities;

import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;
import java.time.LocalDateTime;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class UserEntity {

  @Id
  private String email;

  private String name;
  private Date birthdate;
  private String accountStatus = "active"; // Default value

  @Column(name = "role_id")
  private Integer roleId = 1; // Default role ID

  @Column(name = "last_login")
  private LocalDateTime lastLogin;

  @Column(name = "created_at")
  private LocalDateTime createdAt;

  @Column(name = "updated_at")
  private LocalDateTime updatedAt;

  @Column(name = "job_title")
  private String jobTitle;

  @Column(name = "job_level")
  private String jobLevel;

  @Column(name = "job_hunting")
  private boolean jobHunting = false; // Default value

  public UserEntity() {
    // Default constructor for JPA
  }

  public UserEntity(UserModel userModel) {
    this.email = userModel.getEmail();
    this.name = userModel.getName();
    this.createdAt = userModel.getCreatedAt();
    this.updatedAt = userModel.getUpdatedAt();
    this.birthdate = Date.valueOf(userModel.getBirthdate());
    this.jobTitle = userModel.getJobTitle();
    this.jobLevel = userModel.getJobLevel();
    this.jobHunting = userModel.isJobHunting();
    this.lastLogin = userModel.getLastLogin();
    this.accountStatus = userModel.getAccountStatus();
  }

  public UserModel toModel() {
    return UserModel.builder()
        .name(this.name)
        .email(this.email)
        .birthdate(this.birthdate.toLocalDate())
        .accountStatus(this.accountStatus)
        .lastLogin(this.lastLogin)
        .createdAt(this.createdAt)
        .updatedAt(this.updatedAt)
        .jobTitle(this.jobTitle)
        .jobLevel(this.jobLevel)
        .jobHunting(this.jobHunting)
        .build();
  }
}
