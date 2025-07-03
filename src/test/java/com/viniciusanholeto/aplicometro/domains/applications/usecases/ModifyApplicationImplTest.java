package com.viniciusanholeto.aplicometro.domains.applications.usecases;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import com.viniciusanholeto.aplicometro.domains.applications.models.ModifyApplicationInput;
import com.viniciusanholeto.aplicometro.domains.applications.ports.ApplicationDatabasePort;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ModifyApplicationImplTest {

  @InjectMocks
  private ModifyApplicationImpl modifyApplication;

  @Mock
  private ApplicationDatabasePort databasePort;

  @Test
  void modifyApplication() {
    // when(databasePort.modifyApplication(any(ApplicationModel.class))).thenReturn(true);
    assertDoesNotThrow(
        () -> modifyApplication.execute("123", ModifyApplicationInput.builder().build()));
  }

}
