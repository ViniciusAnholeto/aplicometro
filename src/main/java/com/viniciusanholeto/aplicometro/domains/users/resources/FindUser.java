package com.viniciusanholeto.aplicometro.domains.users.resources;

import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;

public interface FindUser {

  /**
   * Finds a user by their email address. If the user is not found, an exception will be thrown.
   *
   * @param email the ID of the user to find
   * @return the found user
   */
  UserModel execute(String email);
}
