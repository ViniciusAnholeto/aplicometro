package com.viniciusanholeto.aplicometro.infrastructure.database.adapters;

import com.viniciusanholeto.aplicometro.domains.users.models.UserModel;
import com.viniciusanholeto.aplicometro.domains.users.ports.UserDatabasePort;
import com.viniciusanholeto.aplicometro.infrastructure.database.entities.UserEntity;
import com.viniciusanholeto.aplicometro.infrastructure.database.repositories.UserRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
public class UserDatabaseAdapter implements UserDatabasePort {

  private final UserRepository repository;

  @Override
  public Optional<UserModel> findUserById(Long userId) {
    return Optional.empty();
  }

  @Override
  public Optional<UserModel> saveUser(UserModel user) {
    log.info("Saving user: {}", user);

    Optional<UserModel> savedUser = Optional.ofNullable(
        repository.save(new UserEntity(user)).toModel());

    log.info("User saved: {}", savedUser);

    return savedUser;
  }

  @Override
  public void deleteUser(Long userId) {

  }
}
