package com.viniciusanholeto.aplicometro.domains.users.resources;

public interface DeleteUser {

  /**
   * Deletes a user by its ID.
   *
   * @param id the ID of the user to delete
   */
  void execute(Long id);
}
