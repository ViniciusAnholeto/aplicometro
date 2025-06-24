package com.viniciusanholeto.aplicometro.domains.users.usecases;

import com.viniciusanholeto.aplicometro.domains.users.inputs.ModifyUserInput;
import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;
import com.viniciusanholeto.aplicometro.domains.users.resources.ModifyUser;
import org.springframework.stereotype.Service;

@Service
public class ModifyUserImpl implements ModifyUser {

  @Override
  public UserModel execute(Long id, ModifyUserInput request) {
    return UserModel.builder().build();
  }
}
