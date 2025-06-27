package com.viniciusanholeto.aplicometro.domains.users.rules;

import lombok.experimental.UtilityClass;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@UtilityClass
public class PasswordCodec {

  public String encode(String password) {
    return new BCryptPasswordEncoder().encode(password);
  }

  public boolean matches(String rawPassword, String encodedPassword) {
    return new BCryptPasswordEncoder().matches(rawPassword, encodedPassword);
  }
}
