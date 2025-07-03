package com.viniciusanholeto.aplicometro.domains.applications.usecases;

import com.viniciusanholeto.aplicometro.domains.applications.inputs.CreateApplicationInput;
import com.viniciusanholeto.aplicometro.domains.applications.models.ApplicationModel;
import com.viniciusanholeto.aplicometro.domains.applications.resources.CreateApplication;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateApplicationImpl implements CreateApplication {

  @Override
  public ApplicationModel execute(CreateApplicationInput input) {
    // Implementation logic for creating an application
    // This could involve saving the application details to a database or performing other business logic
    return ApplicationModel.builder().build();
  }

}
