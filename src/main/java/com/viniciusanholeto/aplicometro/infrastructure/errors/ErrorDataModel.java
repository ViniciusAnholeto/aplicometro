package com.viniciusanholeto.aplicometro.infrastructure.errors;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorDataModel {

  private String field;
  private String message;
}
