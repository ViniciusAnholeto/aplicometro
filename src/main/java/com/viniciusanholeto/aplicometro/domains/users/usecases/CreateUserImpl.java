package com.viniciusanholeto.aplicometro.domains.users.usecases;

import com.viniciusanholeto.aplicometro.domains.users.inputs.CreateUserInput;
import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;
import com.viniciusanholeto.aplicometro.domains.users.ports.UserDatabasePort;
import com.viniciusanholeto.aplicometro.domains.users.resources.CreateUser;
import com.viniciusanholeto.aplicometro.domains.users.rules.PasswordCodec;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CreateUserImpl implements CreateUser {

  private final UserDatabasePort database;

  @Override
  @Transactional
  public UserModel execute(CreateUserInput input) {

    database.findUserByEmail(input.getEmail())
        .ifPresent(user -> {
          throw new IllegalArgumentException("User with this email already exists");
        });

    UserModel createdUser = database.saveUser(input.toModel()).orElseThrow();

    database.saveUserCredentials(createdUser.getEmail(), PasswordCodec.encode(input.getPassword()));

    return createdUser;
  }
}
