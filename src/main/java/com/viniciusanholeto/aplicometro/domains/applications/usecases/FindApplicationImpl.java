package com.viniciusanholeto.aplicometro.domains.applications.usecases;

import com.viniciusanholeto.aplicometro.domains.applications.models.ApplicationModel;
import com.viniciusanholeto.aplicometro.domains.applications.resources.FindApplication;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FindApplicationImpl implements FindApplication {

  @Override
  public ApplicationModel execute(String applicationId) {
    // Logic to retrieve the application details from the database or any other source
    // For now, returning a dummy ApplicationDetailsModel
    return ApplicationModel.builder().build();
  }

}
