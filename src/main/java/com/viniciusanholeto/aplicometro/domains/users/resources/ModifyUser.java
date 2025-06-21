package com.viniciusanholeto.aplicometro.domains.users.resources;

import com.viniciusanholeto.aplicometro.domains.users.inputs.ModifyUserInput;
import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;

public interface ModifyUser {

  /**
   * Modifies a user with the given ID using the provided input.
   *
   * @param id the ID of the user to modify
   * @param input the input containing the new user data
   * @return the modified user
   */
  UserModel execute(Long id, ModifyUserInput input);

}
