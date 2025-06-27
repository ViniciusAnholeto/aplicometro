package com.viniciusanholeto.aplicometro.infrastructure.errors;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.time.LocalDateTime;
import java.util.Set;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(Include.NON_NULL)
public class SynchronousErrorModel {

  private String code;
  private String path;
  private String httpStatus;
  private LocalDateTime timestamp;
  private String message;

  @JsonInclude(Include.NON_ABSENT)
  private Set<ErrorDataModel> errors;
}
