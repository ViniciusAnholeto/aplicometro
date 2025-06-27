package com.viniciusanholeto.aplicometro.infrastructure.errors;

import java.util.Optional;
import lombok.Getter;

@Getter
public abstract class AplicometroException extends RuntimeException {

  protected final String code;
  protected final String message;

  public AplicometroException(String code, String message, Throwable cause) {
    super(message, cause);
    this.code = code;
    this.message = message;
  }

  public AplicometroException(String code, String message) {
    super(message);
    this.code = code;
    this.message = message;
  }

  @Getter
  public abstract static class SynchronousException extends AplicometroException {

    private final Optional<String> userEmail;

    public SynchronousException(String code, String message, Throwable cause) {
      super(code, message, cause);
      this.userEmail = Optional.empty();
    }

    public SynchronousException(String code, String message) {
      super(code, message);
      this.userEmail = Optional.empty();
    }

    public SynchronousException(String code, String message, String userEmail) {
      super(code, message);
      this.userEmail = Optional.of(userEmail);
    }
  }
}
