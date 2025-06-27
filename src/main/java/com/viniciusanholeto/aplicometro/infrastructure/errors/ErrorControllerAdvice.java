package com.viniciusanholeto.aplicometro.infrastructure.errors;

import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
@RequiredArgsConstructor
public class ErrorControllerAdvice {


  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  @ExceptionHandler(Exception.class)
  SynchronousErrorModel handleException(Exception exception) {
    SynchronousErrorModel errorModel = SynchronousErrorModel.builder()
        .code("APL-GEN-999")
        .message("An unexpected error occurred.")
        .httpStatus(HttpStatus.INTERNAL_SERVER_ERROR.name())
        .timestamp(LocalDateTime.now())
        .build();

    log.error("An unexpected error occurred: {}", errorModel);

    return errorModel;
  }
}
