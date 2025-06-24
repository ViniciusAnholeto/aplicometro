package com.viniciusanholeto.aplicometro.domains.users.usecases;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class FindUserImplTest {

  @InjectMocks
  private FindUserImpl findUser;

  @Test
  void executeReturnsUserModelWhenIdIsValid() {
    UserModel result = findUser.execute("user@aplicometro.com");

    assertNotNull(result);
    assertNull(result.getName());
  }

  @Test
  void executeReturnsEmptyUserModelWhenIdIsNull() {
    UserModel result = findUser.execute(null);

    assertNotNull(result);
    assertNull(result.getName());
  }

}
