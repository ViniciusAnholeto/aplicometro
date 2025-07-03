package com.viniciusanholeto.aplicometro.domains.applications.resources;

import com.viniciusanholeto.aplicometro.domains.applications.models.ApplicationModel;

public interface FindApplication {

  /**
   * Finds an application by its ID.
   *
   * @param id the ID of the application to find
   * @return the found application
   */
  ApplicationModel execute(String id);
}
