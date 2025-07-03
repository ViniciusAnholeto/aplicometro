package com.viniciusanholeto.aplicometro.infrastructure.api.v1.controllers;

import com.viniciusanholeto.aplicometro.domains.applications.resources.CreateApplication;
import com.viniciusanholeto.aplicometro.domains.applications.resources.DeleteApplication;
import com.viniciusanholeto.aplicometro.domains.applications.resources.FindApplication;
import com.viniciusanholeto.aplicometro.domains.applications.resources.ModifyApplication;
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

  private final CreateApplication createApplication;
  private final ModifyApplication modifyApplication;
  private final FindApplication findApplication;
  private final DeleteApplication deleteApplication;

  @Override
  public ApplicationResponse createApplication(CreateApplicationRequest request) {
    log.info("Creating application with request: {}", request);
    return new ApplicationResponse(createApplication.execute(request.toInput()));
  }

  @Override
  public ApplicationResponse modifyApplication(String id, ModifyApplicationRequest request) {
    log.info("Modifying application with ID: {} and request: {}", id, request);
    return new ApplicationResponse(modifyApplication.execute(id, request.toInput()));
  }

  @Override
  public ApplicationResponse findApplicationById(String id) {
    log.info("Finding application with ID: {}", id);
    return new ApplicationResponse(findApplication.execute(id));
  }

  @Override
  public void deleteApplicationById(String id) {
    log.info("Deleting application with ID: {}", id);
    deleteApplication.execute(id);
  }
}
