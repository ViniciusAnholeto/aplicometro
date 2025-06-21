package com.viniciusanholeto.aplicometro.domains.users.usecases;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class DeleteUserImplTest {

  @Test
  void executeDoesNotThrowExceptionWhenUserIdIsValid() {
    DeleteUserImpl deleteUser = new DeleteUserImpl();

    assertDoesNotThrow(() -> deleteUser.execute(1L));
  }
}
