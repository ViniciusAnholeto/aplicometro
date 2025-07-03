package com.viniciusanholeto.aplicometro.infrastructure.api.v1.request.applications;

import com.viniciusanholeto.aplicometro.domains.applications.inputs.CreateApplicationInput;
import com.viniciusanholeto.aplicometro.domains.applications.models.RecruiterDetailsModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
import lombok.Data;

@Data
public class CreateApplicationRequest {

  @NotBlank
  private String jobTitle;

  @NotBlank
  private String companyName;

  @NotBlank
  private String source;

  private String jobUrl;
  private LocalDate applicationDate = LocalDate.now();
  private String location;
  private String salary;

  private String recruitmentStage;
  private String notes;

  @NotNull
  private RecruiterDetailsModel recruiterDetails;

  private List<String> tags;

  public CreateApplicationInput toInput() {
    return CreateApplicationInput.builder()
        .jobTitle(jobTitle)
        .companyName(companyName)
        .source(source)
        .jobUrl(jobUrl)
        .applicationDate(applicationDate)
        .location(location)
        .salary(salary)
        .recruitmentStage(recruitmentStage)
        .notes(notes)
        .recruiterDetails(recruiterDetails)
        .tags(tags)
        .build();
  }
}
