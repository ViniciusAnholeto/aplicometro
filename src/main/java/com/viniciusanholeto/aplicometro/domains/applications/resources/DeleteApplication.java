package com.viniciusanholeto.aplicometro.domains.applications.resources;

public interface DeleteApplication {

  /**
   * Deletes an application by its ID.
   *
   * @param id the ID of the application to delete
   */
  void execute(String id);

}
