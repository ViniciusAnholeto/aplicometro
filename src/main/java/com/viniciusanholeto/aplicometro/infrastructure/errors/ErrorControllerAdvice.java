package com.viniciusanholeto.aplicometro.infrastructure.errors;

import com.viniciusanholeto.aplicometro.domains.users.exceptions.UsersExceptions.UserNotFoundException;
import com.viniciusanholeto.aplicometro.infrastructure.errors.AplicometroException.SynchronousException;
import jakarta.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
@RequiredArgsConstructor
public class ErrorControllerAdvice {

  @ResponseStatus(HttpStatus.NOT_FOUND)
  @ExceptionHandler(UserNotFoundException.class)
  SynchronousErrorModel handleUserNotFoundException(UserNotFoundException exception,
      HttpServletRequest request) {
    SynchronousErrorModel errorModel = SynchronousErrorModel.builder()
        .code(exception.getCode())
        .path(request.getServletPath())
        .message(exception.getMessage())
        .httpStatus(HttpStatus.NOT_FOUND.toString())
        .timestamp(LocalDateTime.now())
        .build();

    if (exception.getCode() != null && !exception.getCode().isEmpty()) {
      errorModel.setErrors(ErrorDataModel.fromSynchronousException(exception));
    }

    log.error("User Not Found Exception: {}", ExceptionUtils.getStackTrace(exception));

    return errorModel;
  }

  @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
  @ExceptionHandler(SynchronousException.class)
  SynchronousErrorModel handleSynchronousException(SynchronousException exception,
      HttpServletRequest request) {
    SynchronousErrorModel errorModel = SynchronousErrorModel.builder()
        .code(exception.getCode())
        .path(request.getServletPath())
        .message(exception.getMessage())
        .httpStatus(HttpStatus.UNPROCESSABLE_ENTITY.toString())
        .timestamp(LocalDateTime.now())
        .build();

    if (exception.getCode() != null && !exception.getCode().isEmpty()) {
      errorModel.setErrors(ErrorDataModel.fromSynchronousException(exception));
    }

    log.error("Synchronous Exception: {}", ExceptionUtils.getStackTrace(exception));

    return errorModel;
  }

  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  @ExceptionHandler(Exception.class)
  SynchronousErrorModel handleException(Exception exception, HttpServletRequest request) {
    SynchronousErrorModel errorModel = SynchronousErrorModel.builder()
        .code("APL-GEN-999")
        .path(request.getServletPath())
        .message(exception.getMessage())
        .httpStatus(HttpStatus.INTERNAL_SERVER_ERROR.toString())
        .timestamp(LocalDateTime.now())
        .build();

    log.error("Exception: {}", ExceptionUtils.getStackTrace(exception));

    return errorModel;
  }
}
