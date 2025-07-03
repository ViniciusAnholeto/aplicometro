package com.viniciusanholeto.aplicometro.infrastructure.api.v1.swagger;

import com.viniciusanholeto.aplicometro.infrastructure.api.v1.request.applications.CreateApplicationRequest;
import com.viniciusanholeto.aplicometro.infrastructure.api.v1.request.applications.ModifyApplicationRequest;
import com.viniciusanholeto.aplicometro.infrastructure.api.v1.response.applications.ApplicationResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Applications Management")
public interface ApplicationsDoc {

  @Operation(summary = "Create a new application",
      description = "Creates a new application in the system with the provided details.")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "201", description = "Application created successfully"),
      @ApiResponse(responseCode = "400", description = "Invalid input data")
  })
  ApplicationResponse createApplication(CreateApplicationRequest request);

  @Operation(summary = "Modify application details",
      description = "Updates the details of an existing application.")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Application updated successfully"),
      @ApiResponse(responseCode = "404", description = "Application not found"),
      @ApiResponse(responseCode = "400", description = "Invalid input data")
  })
  ApplicationResponse modifyApplication(String id, ModifyApplicationRequest request);

  @Operation(summary = "Find application by ID",
      description = "Retrieves an application by its unique identifier.")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Application found"),
      @ApiResponse(responseCode = "404", description = "Application not found")
  })
  ApplicationResponse findApplicationById(String id);

  @Operation(summary = "Delete application by ID",
      description = "Deletes an application from the system using its unique identifier.")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "204", description = "Application deleted successfully"),
      @ApiResponse(responseCode = "404", description = "Application not found")
  })
  void deleteApplicationById(String id);

}
