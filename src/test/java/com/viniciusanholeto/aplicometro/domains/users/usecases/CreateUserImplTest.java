package com.viniciusanholeto.aplicometro.domains.users.usecases;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.viniciusanholeto.aplicometro.domains.users.inputs.CreateUserInput;
import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;
import org.junit.jupiter.api.Test;

class CreateUserImplTest {

  @Test
  void executeReturnsUserModelWithDefaultValuesWhenInputIsValid() {
    CreateUserImpl createUser = new CreateUserImpl();

    UserModel result = createUser.execute(CreateUserInput.builder().build());

    assertNotNull(result);
    assertNull(result.getId());
    assertNull(result.getName());
  }

  @Test
  void executeReturnsEmptyUserModelWhenInputIsNull() {
    CreateUserImpl createUser = new CreateUserImpl();

    UserModel result = createUser.execute(null);

    assertNotNull(result);
    assertNull(result.getId());
    assertNull(result.getName());
  }

}
