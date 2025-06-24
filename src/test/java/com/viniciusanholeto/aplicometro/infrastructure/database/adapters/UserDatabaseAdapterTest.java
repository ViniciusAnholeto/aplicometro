package com.viniciusanholeto.aplicometro.infrastructure.database.adapters;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.viniciusanholeto.aplicometro.domains.users.fixtures.UserModelFixture;
import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;
import com.viniciusanholeto.aplicometro.infrastructure.database.entities.UserEntity;
import com.viniciusanholeto.aplicometro.infrastructure.database.repositories.UserRepository;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserDatabaseAdapterTest {

  @Mock
  private UserRepository repository;

  @InjectMocks
  private UserDatabaseAdapter adapter;

  @Test
  void deleteUserDoesNotThrowExceptionWhenEmailIsValid() {
    String email = "valid@email.com";
    doNothing().when(repository).deleteByEmail(email);

    adapter.deleteUser(email);

    verify(repository, times(1)).deleteByEmail(email);
  }

  @Test
  void findUserByEmailReturnsEmptyWhenEmailDoesNotExist() {
    String email = "nonexistent@example.com";
    when(repository.findByEmail(email)).thenReturn(Optional.empty());

    Optional<UserModel> result = adapter.findUserByEmail(email);

    assertTrue(result.isEmpty());
  }

  @Test
  void saveUserReturnsSavedUserModelWhenUserIsValid() {
    UserModel user = createUserModel();
    UserEntity entity = new UserEntity(user);
    when(repository.save(entity)).thenReturn(entity);

    Optional<UserModel> result = adapter.saveUser(user);

    assertTrue(result.isPresent());
  }

  private UserModel createUserModel() {
    return UserModelFixture.create();
  }
}
