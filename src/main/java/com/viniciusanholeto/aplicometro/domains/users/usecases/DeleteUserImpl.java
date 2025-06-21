package com.viniciusanholeto.aplicometro.domains.users.usecases;

import com.viniciusanholeto.aplicometro.domains.users.resources.DeleteUser;

public class DeleteUserImpl implements DeleteUser {

  @Override
  public void execute(Long userId) {
    // Placeholder for actual deletion logic
    System.out.println("User with ID " + userId + " has been deleted.");
  }

}
