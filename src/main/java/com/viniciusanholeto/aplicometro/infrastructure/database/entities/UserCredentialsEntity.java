package com.viniciusanholeto.aplicometro.infrastructure.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
@IdClass(UserCredentialsId.class)
@Table(name = "user_credentials")
public class UserCredentialsEntity {

  @Id
  @Column(name = "user_email", nullable = false, unique = true)
  private String userEmail;

  @Id
  @Column(name = "password_hash", nullable = false)
  private String passwordHash;

  public UserCredentialsEntity() {
    // Default constructor for JPA
  }

}
