package com.viniciusanholeto.aplicometro.infrastructure.api.v1.controllers;

import com.viniciusanholeto.aplicometro.domains.users.resources.CreateUser;
import com.viniciusanholeto.aplicometro.domains.users.resources.DeleteUser;
import com.viniciusanholeto.aplicometro.domains.users.resources.FindUser;
import com.viniciusanholeto.aplicometro.domains.users.resources.ModifyUser;
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

  private final CreateUser createUser;
  private final ModifyUser modifyUser;
  private final FindUser findUser;
  private final DeleteUser deleteUser;

  @Override
  @PostMapping("/create")
  public UserResponse createUser(CreateUserRequest request) {
    log.info("Creating user with request: {}", request);
    return new UserResponse(createUser.execute(request.toInput()));
  }

  @Override
  @PostMapping("/modify/{email}")
  public UserResponse modifyUser(
      @PathVariable String email,
      @RequestBody ModifyUserRequest user
  ) {
    return new UserResponse(modifyUser.execute(email, user.toInput()));
  }

  @Override
  @GetMapping("/{email}")
  public UserResponse findUserByEmail(String email) {
    log.info("Finding user by email: {}", email);
    return new UserResponse(findUser.execute(email));
  }

  @Override
  @GetMapping("/delete/{email}")
  public void deleteUserByEmail(String email) {
    log.info("Deleting user by email: {}", email);
    deleteUser.execute(email);
  }
}
