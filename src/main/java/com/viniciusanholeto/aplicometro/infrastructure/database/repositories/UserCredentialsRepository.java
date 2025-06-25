package com.viniciusanholeto.aplicometro.infrastructure.database.repositories;

import com.viniciusanholeto.aplicometro.infrastructure.database.entities.UserCredentialsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCredentialsRepository extends JpaRepository<UserCredentialsEntity, String> {

}
