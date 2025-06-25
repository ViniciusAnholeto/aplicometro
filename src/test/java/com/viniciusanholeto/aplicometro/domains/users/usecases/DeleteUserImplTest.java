package com.viniciusanholeto.aplicometro.domains.users.usecases;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.when;

import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;
import com.viniciusanholeto.aplicometro.domains.users.ports.UserDatabasePort;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DeleteUserImplTest {

  @InjectMocks
  private DeleteUserImpl deleteUser;

  @Mock
  private UserDatabasePort database;

  @Test
  void executeDoesNotThrowExceptionWhenUserIdIsValid() {
    String email = "user@aplicometro.com";
    when(database.findUserByEmail(email)).thenReturn(Optional.of(UserModel.builder().build()));
    assertDoesNotThrow(() -> deleteUser.execute(email));
  }
}
