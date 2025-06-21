package com.viniciusanholeto.aplicometro.domains.users.usecases;

import com.viniciusanholeto.aplicometro.domains.users.inputs.CreateUserInput;
import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;
import com.viniciusanholeto.aplicometro.domains.users.resources.CreateUser;

public class CreateUserImpl implements CreateUser {

  @Override
  public UserModel execute(CreateUserInput request) {
    return UserModel.builder().build();
  }
}
