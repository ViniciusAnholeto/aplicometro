package com.viniciusanholeto.aplicometro.infrastructure.database.repositories;

import com.viniciusanholeto.aplicometro.infrastructure.database.entities.UserEntity;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {

  Optional<UserEntity> findByEmail(String email);

  void deleteByEmail(String email);
}
