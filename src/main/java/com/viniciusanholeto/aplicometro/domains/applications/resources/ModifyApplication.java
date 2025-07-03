package com.viniciusanholeto.aplicometro.domains.applications.resources;

import com.viniciusanholeto.aplicometro.domains.applications.models.ApplicationModel;
import com.viniciusanholeto.aplicometro.domains.applications.models.ModifyApplicationInput;

public interface ModifyApplication {

  /**
   * Modifies an existing application with the provided input.
   *
   * @param id    the ID of the application to modify
   * @param input the input containing updated application details
   * @return the modified application model
   */
  ApplicationModel execute(String id, ModifyApplicationInput input);

}
