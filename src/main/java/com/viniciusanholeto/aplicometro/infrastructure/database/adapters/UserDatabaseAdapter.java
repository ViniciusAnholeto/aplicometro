package com.viniciusanholeto.aplicometro.infrastructure.database.adapters;

import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;
import com.viniciusanholeto.aplicometro.domains.users.ports.UserDatabasePort;
import com.viniciusanholeto.aplicometro.infrastructure.database.entities.UserCredentialsEntity;
import com.viniciusanholeto.aplicometro.infrastructure.database.entities.UserEntity;
import com.viniciusanholeto.aplicometro.infrastructure.database.repositories.UserCredentialsRepository;
import com.viniciusanholeto.aplicometro.infrastructure.database.repositories.UserRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
public class UserDatabaseAdapter implements UserDatabasePort {

  private final UserRepository userRepository;
  private final UserCredentialsRepository userCredentialsRepository;

  @Override
  public Optional<UserModel> findUserByEmail(String email) {
    log.info("Finding user by email: {}", email);

    Optional<UserModel> userData = userRepository.findByEmail(email)
        .map(UserEntity::toModel);

    log.info("User found by email: {}", userData);

    return userData;
  }

  @Override
  public Optional<UserModel> saveUser(UserModel user) {
    log.info("Saving user: {}", user);

    Optional<UserModel> savedUser = Optional.ofNullable(
        userRepository.save(new UserEntity(user)).toModel());

    log.info("User saved: {}", savedUser);

    return savedUser;
  }

  @Override
  public void deleteUser(String email) {
    log.info("Deleting user with email: {}", email);

    userRepository.deleteByEmail(email);

    log.info("User with email {} deleted successfully", email);
  }

  @Override
  public void saveUserCredentials(String email, String passwordHash) {
    log.info("Saving user credentials for email: {}", email);

    userRepository.findByEmail(email).ifPresent(userEntity -> {
      userCredentialsRepository.save(new UserCredentialsEntity(email, passwordHash));
      log.info("User credentials saved for email: {}", email);
    });
  }
}
