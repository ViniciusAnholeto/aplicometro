package com.viniciusanholeto.aplicometro.domains.users.usecases;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import com.viniciusanholeto.aplicometro.domains.users.inputs.CreateUserInput;
import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;
import com.viniciusanholeto.aplicometro.domains.users.ports.UserDatabasePort;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CreateUserImplTest {

  @InjectMocks
  private CreateUserImpl createUser;

  @Mock
  private UserDatabasePort databasePort;

  @Test
  void executeReturnsUserModelWithDefaultValuesWhenInputIsValid() {
    UserModel mockUser = UserModel.builder().build();
    when(databasePort.findUserByEmail(any(String.class))).thenReturn(Optional.empty());
    when(databasePort.saveUser(any(UserModel.class))).thenReturn(Optional.of(mockUser));

    UserModel result = createUser.execute(CreateUserInput.builder()
        .email("user@aplicometro.com")
        .password("pass")
        .build());

    assertNotNull(result);
    assertNull(result.getName());
  }
}
