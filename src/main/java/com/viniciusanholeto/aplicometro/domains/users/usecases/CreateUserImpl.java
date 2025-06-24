package com.viniciusanholeto.aplicometro.domains.users.usecases;

import com.viniciusanholeto.aplicometro.domains.users.inputs.CreateUserInput;
import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;
import com.viniciusanholeto.aplicometro.domains.users.ports.UserDatabasePort;
import com.viniciusanholeto.aplicometro.domains.users.resources.CreateUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUserImpl implements CreateUser {

  private final UserDatabasePort database;

  @Override
  public UserModel execute(CreateUserInput request) {

    database.findUserByEmail(request.getEmail())
        .ifPresent(user -> {
          throw new IllegalArgumentException("User with this email already exists");
        });

    UserModel user = UserModel.builder()
        .name(request.getName())
        .email(request.getEmail())
        .password(request.getPassword())
        .active(true)
        .build();

    return database.saveUser(user).orElseThrow();
  }
}
