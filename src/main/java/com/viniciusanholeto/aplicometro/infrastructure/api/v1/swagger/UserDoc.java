package com.viniciusanholeto.aplicometro.infrastructure.api.v1.swagger;

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
   Object getAllUsers();

}
