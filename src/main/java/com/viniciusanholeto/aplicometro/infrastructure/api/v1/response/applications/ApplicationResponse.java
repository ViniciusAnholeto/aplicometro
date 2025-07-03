package com.viniciusanholeto.aplicometro.infrastructure.api.v1.response.applications;

import com.viniciusanholeto.aplicometro.domains.applications.models.ApplicationModel;
import com.viniciusanholeto.aplicometro.domains.applications.models.RecruiterDetailsModel;
import java.time.LocalDate;
import java.util.List;
import lombok.Data;

@Data
public class ApplicationResponse {

  private String id;
  private String jobTitle;
  private String companyName;
  private String source;
  private String jobUrl;
  private LocalDate applicationDate;
  private String location;
  private String salary;
  private String recruitmentStage;
  private String notes;
  private RecruiterDetailsModel recruiterDetails;
  private List<String> tags;

  public ApplicationResponse(ApplicationModel model) {
    this.id = model.getId();
    this.jobTitle = model.getJobTitle();
    this.companyName = model.getCompanyName();
    this.source = model.getSource();
    this.jobUrl = model.getJobUrl();
    this.applicationDate = model.getApplicationDate();
    this.location = model.getLocation();
    this.salary = model.getSalary();
    this.recruitmentStage = model.getRecruitmentStage();
    this.notes = model.getNotes();
    this.recruiterDetails = model.getRecruiterDetails();
    this.tags = model.getTags();
  }

}
