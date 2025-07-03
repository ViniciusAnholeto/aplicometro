package com.viniciusanholeto.aplicometro.domains.applications.exceptions;

import com.viniciusanholeto.aplicometro.infrastructure.errors.AplicometroException.SynchronousException;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ApplicationsExceptions {

  public static class ApplicationNotFoundException extends SynchronousException {

    public ApplicationNotFoundException(String applicationId) {
      super("APL-APL-001", "Application not found with ID: " + applicationId, applicationId);
    }
  }

  public static class ApplicationSaveException extends SynchronousException {

    public ApplicationSaveException(String applicationId) {
      super("APL-APL-002", "Failed to save application with ID: " + applicationId, applicationId);
    }
  }

}
