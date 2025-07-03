package com.viniciusanholeto.aplicometro.domains.users.exceptions;

import com.viniciusanholeto.aplicometro.infrastructure.errors.AplicometroException.SynchronousException;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UsersExceptions {

  public static class UserNotFoundException extends SynchronousException {

    public UserNotFoundException(String userEmail) {
      super("APL-USR-001", "User not found with email: " + userEmail, userEmail);
    }
  }

  public static class UserAlreadyExistsException extends SynchronousException {

    public UserAlreadyExistsException(String userEmail) {
      super("APL-USR-002", "User already exists with email: " + userEmail, userEmail);
    }
  }

  public static class UserSaveException extends SynchronousException {

    public UserSaveException(String userEmail) {
      super("APL-USR-003", "Failed to save user informations with email: " + userEmail, userEmail);
    }
  }

}
