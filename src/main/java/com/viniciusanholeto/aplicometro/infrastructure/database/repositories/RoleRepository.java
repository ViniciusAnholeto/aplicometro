package com.viniciusanholeto.aplicometro.infrastructure.database.repositories;

import com.viniciusanholeto.aplicometro.infrastructure.database.entities.RolesEntity;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RolesEntity, UUID> {

  Optional<RolesEntity> findByName(String name);

  void deleteByName(String name);
}
