package com.viniciusanholeto.aplicometro.infrastructure.database.repositories;

import com.viniciusanholeto.aplicometro.infrastructure.database.entities.UserEntity;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {

  UserEntity save(UserEntity user);

}
