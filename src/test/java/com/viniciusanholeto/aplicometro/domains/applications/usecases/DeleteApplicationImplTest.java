package com.viniciusanholeto.aplicometro.domains.applications.usecases;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import com.viniciusanholeto.aplicometro.domains.applications.ports.ApplicationDatabasePort;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DeleteApplicationImplTest {

  @InjectMocks
  private DeleteApplicationImpl deleteApplication;

  @Mock
  private ApplicationDatabasePort databasePort;

  @Test
  void deleteApplication() {
//    when(databasePort.deleteApplicationById("123")).thenReturn(true);
    assertDoesNotThrow(() -> deleteApplication.execute("123"));
  }

}
