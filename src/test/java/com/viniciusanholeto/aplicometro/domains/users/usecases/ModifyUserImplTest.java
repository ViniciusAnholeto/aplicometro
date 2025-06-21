package com.viniciusanholeto.aplicometro.domains.users.usecases;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.viniciusanholeto.aplicometro.domains.users.inputs.ModifyUserInput;
import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;
import org.junit.jupiter.api.Test;

public class ModifyUserImplTest {

  @Test
  void executeReturnsUserModelWhenIdAndRequestAreValid() {
    ModifyUserImpl modifyUser = new ModifyUserImpl();
    ModifyUserInput input = ModifyUserInput.builder().build();

    UserModel result = modifyUser.execute(1L, input);

    assertNotNull(result);
  }
}
