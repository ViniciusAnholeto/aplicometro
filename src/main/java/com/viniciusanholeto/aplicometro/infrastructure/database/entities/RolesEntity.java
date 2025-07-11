package com.viniciusanholeto.aplicometro.infrastructure.database.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "roles")
public class RolesEntity {

  @Id
  private Integer id;

  private String name;
  private String description;

  public RolesEntity() {
    // Default constructor for JPA
  }

}
