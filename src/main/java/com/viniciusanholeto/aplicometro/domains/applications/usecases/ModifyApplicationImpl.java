package com.viniciusanholeto.aplicometro.domains.applications.usecases;

import com.viniciusanholeto.aplicometro.domains.applications.models.ApplicationModel;
import com.viniciusanholeto.aplicometro.domains.applications.models.ModifyApplicationInput;
import com.viniciusanholeto.aplicometro.domains.applications.resources.ModifyApplication;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ModifyApplicationImpl implements ModifyApplication {

  @Override
  public ApplicationModel execute(String id, ModifyApplicationInput input) {
    // Implementation logic for modifying an application
    // This could involve updating the application details in a database or performing other business logic
    return ApplicationModel.builder().build();
  }
}
