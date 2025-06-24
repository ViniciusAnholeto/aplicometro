package com.viniciusanholeto.aplicometro.domains.users.usecases;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DeleteUserImplTest {

  @InjectMocks
  private DeleteUserImpl deleteUser;

  @Test
  void executeDoesNotThrowExceptionWhenUserIdIsValid() {
    assertDoesNotThrow(() -> deleteUser.execute(1L));
  }
}
