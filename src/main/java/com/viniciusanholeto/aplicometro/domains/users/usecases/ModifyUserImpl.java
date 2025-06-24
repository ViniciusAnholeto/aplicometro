package com.viniciusanholeto.aplicometro.domains.users.usecases;

import com.viniciusanholeto.aplicometro.domains.users.inputs.ModifyUserInput;
import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;
import com.viniciusanholeto.aplicometro.domains.users.ports.UserDatabasePort;
import com.viniciusanholeto.aplicometro.domains.users.resources.ModifyUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ModifyUserImpl implements ModifyUser {

  private final UserDatabasePort database;

  @Override
  public UserModel execute(String email, ModifyUserInput input) {
    UserModel userToUpdate = UserModel.builder()
        .name(input.getName())
        .build();

    return database.findUserByEmail(email)
        .map(user -> database.saveUser(userToUpdate)
            .orElseThrow(() -> new RuntimeException("Failed to save user")))
        .orElseThrow(() -> new RuntimeException("User not found"));
  }
}
