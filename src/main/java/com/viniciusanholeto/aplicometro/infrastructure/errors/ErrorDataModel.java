package com.viniciusanholeto.aplicometro.infrastructure.errors;

import com.viniciusanholeto.aplicometro.infrastructure.errors.AplicometroException.SynchronousException;
import java.util.Collections;
import java.util.Set;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorDataModel {

  private String field;
  private String message;

  public static Set<ErrorDataModel> fromSynchronousException(SynchronousException exception) {
    return Collections.singleton(ErrorDataModel.builder()
        .field(exception.getCode())
        .message(exception.getMessage())
        .build());
  }
}
