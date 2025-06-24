package com.viniciusanholeto.aplicometro.domains.users.usecases;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.viniciusanholeto.aplicometro.domains.users.inputs.ModifyUserInput;
import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ModifyUserImplTest {

  @InjectMocks
  private ModifyUserImpl modifyUser;

  @Test
  void executeReturnsUserModelWhenIdAndRequestAreValid() {
    ModifyUserInput input = ModifyUserInput.builder().build();

    UserModel result = modifyUser.execute(1L, input);

    assertNotNull(result);
  }
}
