package com.viniciusanholeto.aplicometro.domains.users.resources;

import com.viniciusanholeto.aplicometro.domains.users.inputs.CreateUserInput;
import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;

public interface CreateUser {

  /**
   * Executes the user creation process.
   *
   * @param request the input data for creating a user
   * @return the created user model
   */
  UserModel execute(CreateUserInput request);
}
