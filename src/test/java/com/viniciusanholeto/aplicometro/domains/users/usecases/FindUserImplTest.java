package com.viniciusanholeto.aplicometro.domains.users.usecases;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
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
class FindUserImplTest {

  @InjectMocks
  private FindUserImpl findUser;

  @Mock
  private UserDatabasePort databasePort;

  @Test
  void executeReturnsUserModelWhenEmailIsValid() {
    String email = "user@aplicometro.com";
    UserModel mockUser = UserModel.builder()
        .email(email)
        .build();
    when(databasePort.findUserByEmail(email)).thenReturn(Optional.of(mockUser));

    UserModel result = findUser.execute(email);

    assertNotNull(result);
    assertNotNull(result.getEmail());
  }

  @Test
  void executeThrowsExceptionWhenNotFound() {
    String email = "user@aplicometro.com";
    when(databasePort.findUserByEmail(email)).thenReturn(Optional.empty());

    assertThrows(RuntimeException.class, () -> findUser.execute(email));
  }

}
