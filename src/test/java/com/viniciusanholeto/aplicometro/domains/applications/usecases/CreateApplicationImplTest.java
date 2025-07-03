package com.viniciusanholeto.aplicometro.domains.applications.usecases;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.viniciusanholeto.aplicometro.domains.applications.inputs.CreateApplicationInput;
import com.viniciusanholeto.aplicometro.domains.applications.models.ApplicationModel;
import com.viniciusanholeto.aplicometro.domains.applications.ports.ApplicationDatabasePort;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CreateApplicationImplTest {

  @Mock
  private ApplicationDatabasePort databasePort;

  @InjectMocks
  private CreateApplicationImpl createApplication;

  @Test
  void createsApplicationSuccessfullyWithValidInput() {
    CreateApplicationInput input = CreateApplicationInput.builder().build();

    ApplicationModel result = createApplication.execute(input);

    assertNotNull(result);
  }

  @Test
  void createsApplicationWithEmptyFields() {
    CreateApplicationInput input = CreateApplicationInput.builder().build();

    ApplicationModel result = createApplication.execute(input);

    assertNotNull(result);
  }

}
