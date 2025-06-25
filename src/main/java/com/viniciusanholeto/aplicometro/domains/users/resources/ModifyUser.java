package com.viniciusanholeto.aplicometro.domains.users.resources;

import com.viniciusanholeto.aplicometro.domains.users.inputs.ModifyUserInput;
import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;

public interface ModifyUser {

  /**
   * Modifies a user with the given email using the provided input.
   * If the user does not exist, it will throw an exception.
   *
   * @param email the email of the user to modify
   * @param input the input containing the new user data
   * @return the modified user
   */
  UserModel execute(String email, ModifyUserInput input);

}
