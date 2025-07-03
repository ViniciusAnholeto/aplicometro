package com.viniciusanholeto.aplicometro.domains.applications.models;

import java.time.LocalDate;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApplicationModel {

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

}
