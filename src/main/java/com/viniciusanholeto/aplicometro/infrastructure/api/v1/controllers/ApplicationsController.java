package com.viniciusanholeto.aplicometro.infrastructure.api.v1.controllers;

import com.viniciusanholeto.aplicometro.infrastructure.api.v1.request.applications.CreateApplicationRequest;
import com.viniciusanholeto.aplicometro.infrastructure.api.v1.request.applications.ModifyApplicationRequest;
import com.viniciusanholeto.aplicometro.infrastructure.api.v1.response.applications.ApplicationResponse;
import com.viniciusanholeto.aplicometro.infrastructure.api.v1.swagger.ApplicationsDoc;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/applications")
public class ApplicationsController implements ApplicationsDoc {

  @Override
  public ApplicationResponse createApplication(CreateApplicationRequest request) {
    // Logic to create an application
  }

  @Override
  public ApplicationResponse modifyApplication(String id, ModifyApplicationRequest request) {
    // Logic to modify an application
  }

  @Override
  public ApplicationResponse findApplicationById(String id) {
    // Logic to find an application by ID
  }

  @Override
  public void deleteApplicationById(String id) {
    // Logic to delete an application by ID
  }
}
