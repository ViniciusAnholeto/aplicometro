package com.viniciusanholeto.aplicometro.infrastructure.api.v1.controllers;

import com.viniciusanholeto.aplicometro.infrastructure.api.v1.request.users.CreateUserRequest;
import com.viniciusanholeto.aplicometro.infrastructure.api.v1.request.users.ModifyUserRequest;
import com.viniciusanholeto.aplicometro.infrastructure.api.v1.response.users.UserResponse;
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
@RequiredArgsConstructor
@RequestMapping("/v1/users")
public class UserController implements UserDoc {

  @Override
  @PostMapping("/create")
  public UserResponse createUser(CreateUserRequest request) {
    return null;
  }

  @Override
  @PostMapping("/modify/{id}")
  public UserResponse modifyUser(
      @PathVariable Long id,
      @RequestBody ModifyUserRequest user
  ) {
    return null;
  }

  @Override
  @GetMapping("/{id}")
  public UserResponse findUserById(Long id) {
    return null;
  }

  @Override
  @GetMapping("/delete/{id}")
  public void deleteUserById(Long id) {

  }
}
