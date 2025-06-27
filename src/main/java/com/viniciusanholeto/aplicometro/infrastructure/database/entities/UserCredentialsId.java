package com.viniciusanholeto.aplicometro.infrastructure.database.entities;

import java.io.Serializable;

public class UserCredentialsId implements Serializable {

  private String userEmail;
  private String passwordHash;

  public UserCredentialsId() {
  }

  public UserCredentialsId(String userEmail, String passwordHash) {
    this.userEmail = userEmail;
    this.passwordHash = passwordHash;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof UserCredentialsId that)) {
      return false;
    }
    return userEmail.equals(that.userEmail) &&
        passwordHash.equals(that.passwordHash);
  }

  @Override
  public int hashCode() {
    return 31 * userEmail.hashCode() + passwordHash.hashCode();
  }

}
