package com.viniciusanholeto.aplicometro.domains.users.usecases;

import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;
import com.viniciusanholeto.aplicometro.domains.users.resources.FindUser;
import org.springframework.stereotype.Service;

@Service
public class FindUserImpl implements FindUser {

  @Override
  public UserModel execute(Long id) {
    return UserModel.builder().build();
  }

}
