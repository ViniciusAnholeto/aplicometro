package com.viniciusanholeto.aplicometro.domains.users.usecases;

import com.viniciusanholeto.aplicometro.domains.users.ports.UserDatabasePort;
import com.viniciusanholeto.aplicometro.domains.users.resources.DeleteUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteUserImpl implements DeleteUser {

  private final UserDatabasePort database;

  @Override
  public void execute(String userEmail) {
    database.findUserByEmail(userEmail)
            .ifPresent(user -> database.deleteUser(userEmail));
  }

}
