package com.viniciusanholeto.aplicometro.domains.applications.ports;

import com.viniciusanholeto.aplicometro.domains.applications.models.ApplicationModel;

public interface ApplicationDatabasePort {

  /**
   * Saves a new application to the database.
   *
   * @param applicationModel the application model to save
   * @return the saved application model
   */
  ApplicationModel saveNewApplication(ApplicationModel applicationModel);

  /**
   * Updates an existing application in the database.
   *
   * @param applicationModel the application model with updated information
   * @return the updated application model
   */
  ApplicationModel updateApplication(ApplicationModel applicationModel);

  /**
   * Finds an application by its ID.
   *
   * @param applicationId the ID of the application to find
   * @return the found application model, or null if not found
   */
  ApplicationModel findApplicationById(String applicationId);

  /**
   * Deletes an application by its ID.
   *
   * @param applicationId the ID of the application to delete
   */
  void deleteApplicationById(String applicationId);

}
