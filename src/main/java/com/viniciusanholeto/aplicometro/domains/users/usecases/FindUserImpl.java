package com.viniciusanholeto.aplicometro.domains.users.usecases;

import com.viniciusanholeto.aplicometro.domains.users.exceptions.UsersExceptions.UserNotFoundException;
import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;
import com.viniciusanholeto.aplicometro.domains.users.ports.UserDatabasePort;
import com.viniciusanholeto.aplicometro.domains.users.resources.FindUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FindUserImpl implements FindUser {

  private final UserDatabasePort database;

  @Override
  public UserModel execute(String email) {
    return database.findUserByEmail(email)
        .orElseThrow(() -> new UserNotFoundException(email));
  }
}
