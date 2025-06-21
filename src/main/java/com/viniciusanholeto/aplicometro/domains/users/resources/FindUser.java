package com.viniciusanholeto.aplicometro.domains.users.resources;

import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;

public interface FindUser {

  /**
   * Finds a user by their ID.
   *
   * @param id the ID of the user to find
   * @return the found user
   */
  UserModel execute(Long id);

}
