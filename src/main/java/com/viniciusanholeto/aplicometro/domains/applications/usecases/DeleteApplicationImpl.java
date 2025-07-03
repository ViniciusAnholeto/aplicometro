package com.viniciusanholeto.aplicometro.domains.applications.usecases;

import com.viniciusanholeto.aplicometro.domains.applications.resources.DeleteApplication;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteApplicationImpl implements DeleteApplication {

  @Override
  public void execute(String applicationId) {
    // Logic to delete the application by its ID
    // This could involve calling a repository or service to perform the deletion
    // For example:
    // applicationRepository.deleteById(applicationId);
  }

}
