package com.viniciusanholeto.aplicometro.domains.users.usecases;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import com.viniciusanholeto.aplicometro.domains.users.inputs.ModifyUserInput;
import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;
import com.viniciusanholeto.aplicometro.domains.users.ports.UserDatabasePort;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ModifyUserImplTest {

  @InjectMocks
  private ModifyUserImpl modifyUser;

  @Mock
  private UserDatabasePort database;

  @Test
  void executeReturnsUserModelWhenEmailAndRequestAreValid() {
    ModifyUserInput input = ModifyUserInput.builder().build();
    UserModel userModel = UserModel.builder().build();
    when(database.findUserByEmail(any(String.class))).thenReturn(Optional.of(userModel));
    when(database.saveUser(userModel)).thenReturn(Optional.of(userModel));

    UserModel result = modifyUser.execute("user@aplicometro.com", input);

    assertNotNull(result);
  }
}
