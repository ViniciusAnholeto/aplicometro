package com.viniciusanholeto.aplicometro.infrastructure.api.v1.swagger;

import com.viniciusanholeto.aplicometro.infrastructure.api.v1.request.users.CreateUserRequest;
import com.viniciusanholeto.aplicometro.infrastructure.api.v1.request.users.ModifyUserRequest;
import com.viniciusanholeto.aplicometro.infrastructure.api.v1.response.users.UserResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "User Management")
public interface UserDoc {

   @Operation(summary = "Create a new user",
       description = "Creates a new user in the system with the provided details.")
   @ApiResponses(value = {
       @ApiResponse(responseCode = "201", description = "User created successfully"),
       @ApiResponse(responseCode = "400", description = "Invalid input data")
    })
   UserResponse createUser(CreateUserRequest user);

   @Operation(summary = "Modify user details",
       description = "Updates the details of an existing user.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "User updated successfully"),
        @ApiResponse(responseCode = "404", description = "User not found"),
        @ApiResponse(responseCode = "400", description = "Invalid input data")
    })
   UserResponse modifyUser(Long id, ModifyUserRequest user);

   @Operation(summary = "Find user by ID",
       description = "Retrieves a user by their unique identifier.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "User found"),
        @ApiResponse(responseCode = "404", description = "User not found")
    })
   UserResponse findUserById(Long id);

   @Operation(summary = "Delete user by ID",
       description = "Deletes a user from the system using their unique identifier.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "204", description = "User deleted successfully"),
        @ApiResponse(responseCode = "404", description = "User not found")
    })
   void deleteUserById(Long id);

}
