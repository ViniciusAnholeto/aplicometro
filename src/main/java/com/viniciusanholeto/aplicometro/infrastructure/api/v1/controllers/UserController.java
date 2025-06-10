package com.viniciusanholeto.aplicometro.infrastructure.api.v1.controllers;

import com.viniciusanholeto.aplicometro.infrastructure.api.v1.swagger.UserDoc;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class UserController implements UserDoc {

  @Override
  @GetMapping("/users")
  public Object getAllUsers() {

    return null;
  }

  @PostMapping("/users")
  public Object createUser(@RequestBody Object user) {

    return null;
  }

  @GetMapping("/users/{id}")
  public Object getUserById(@PathVariable Long id) {

    return null;
  }
}
