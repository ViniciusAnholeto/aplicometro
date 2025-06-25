package com.viniciusanholeto.aplicometro.infrastructure.database.adapters;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.viniciusanholeto.aplicometro.domains.users.fixtures.UserModelFixture;
import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;
import com.viniciusanholeto.aplicometro.infrastructure.database.entities.UserCredentialsEntity;
import com.viniciusanholeto.aplicometro.infrastructure.database.entities.UserEntity;
import com.viniciusanholeto.aplicometro.infrastructure.database.repositories.UserCredentialsRepository;
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
  private UserRepository userRepository;

  @Mock
  private UserCredentialsRepository credentialsRepository;

  @InjectMocks
  private UserDatabaseAdapter adapter;

  @Test
  void deleteUserDoesNotThrowExceptionWhenEmailIsValid() {
    String email = "valid@email.com";
    doNothing().when(userRepository).deleteByEmail(email);

    adapter.deleteUser(email);

    verify(userRepository, times(1)).deleteByEmail(email);
  }

  @Test
  void findUserByEmailReturnsEmptyWhenEmailDoesNotExist() {
    String email = "nonexistent@example.com";
    when(userRepository.findByEmail(email)).thenReturn(Optional.empty());

    Optional<UserModel> result = adapter.findUserByEmail(email);

    assertTrue(result.isEmpty());
  }

  @Test
  void saveUserReturnsSavedUserModelWhenUserIsValid() {
    UserModel user = createUserModel();
    UserEntity entity = new UserEntity(user);
    when(userRepository.save(any(UserEntity.class))).thenReturn(entity);

    Optional<UserModel> result = adapter.saveUser(user);

    assertTrue(result.isPresent());
  }

  @Test
  void saveUserCredentialsSavesCredentialsWhenEmailExists() {
    String email = "valid@email.com";
    String passwordHash = "hashedPassword";
    UserEntity userEntity = new UserEntity();
    UserCredentialsEntity credentialsEntity = new UserCredentialsEntity(email, passwordHash);
    when(userRepository.findByEmail(email)).thenReturn(Optional.of(userEntity));
    when(credentialsRepository.save(any(UserCredentialsEntity.class))).thenReturn(
        credentialsEntity);

    adapter.saveUserCredentials(email, passwordHash);

    verify(credentialsRepository, times(1)).save(any(UserCredentialsEntity.class));
  }

  @Test
  void saveUserCredentialsDoesNotSaveCredentialsWhenEmailDoesNotExist() {
    String email = "nonexistent@email.com";
    String passwordHash = "hashedPassword";
    when(userRepository.findByEmail(email)).thenReturn(Optional.empty());

    adapter.saveUserCredentials(email, passwordHash);

    verify(credentialsRepository, times(0)).save(any(UserCredentialsEntity.class));
  }

  private UserModel createUserModel() {
    return UserModelFixture.create();
  }
}
