package com.viniciusanholeto.aplicometro.domains.applications.resources;

import com.viniciusanholeto.aplicometro.domains.applications.inputs.CreateApplicationInput;
import com.viniciusanholeto.aplicometro.domains.applications.models.ApplicationModel;

public interface CreateApplication {

  /**
   * Creates a new application with the provided input.
   *
   * @param input the input containing application details
   * @return the created application model
   */
  ApplicationModel execute(CreateApplicationInput input);

}
