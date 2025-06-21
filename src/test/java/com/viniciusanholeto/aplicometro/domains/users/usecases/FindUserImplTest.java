package com.viniciusanholeto.aplicometro.domains.users.usecases;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;
import org.junit.jupiter.api.Test;

public class FindUserImplTest {

  @Test
  void executeReturnsUserModelWhenIdIsValid() {
    FindUserImpl findUser = new FindUserImpl();

    UserModel result = findUser.execute(1L);

    assertNotNull(result);
    assertNull(result.getId());
    assertNull(result.getName());
  }

  @Test
  void executeReturnsEmptyUserModelWhenIdIsNull() {
    FindUserImpl findUser = new FindUserImpl();

    UserModel result = findUser.execute(null);

    assertNotNull(result);
    assertNull(result.getId());
    assertNull(result.getName());
  }

}
