package com.viniciusanholeto.aplicometro.domains.applications.usecases;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import com.viniciusanholeto.aplicometro.domains.applications.ports.ApplicationDatabasePort;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class FindApplicationImplTest {

  @InjectMocks
  private FindApplicationImpl findApplication;

  @Mock
  private ApplicationDatabasePort databasePort;

  @Test
  void findApplication() {
    // when(databasePort.findApplicationById("123")).thenReturn(new ApplicationModel());
     assertDoesNotThrow(() -> findApplication.execute("123"));
  }

}
