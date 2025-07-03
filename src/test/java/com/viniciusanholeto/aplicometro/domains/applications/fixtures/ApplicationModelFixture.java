package com.viniciusanholeto.aplicometro.domains.applications.fixtures;

import com.viniciusanholeto.aplicometro.domains.applications.models.RecruiterDetailsModel;
import java.time.LocalDate;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApplicationModelFixture {

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

  public static ApplicationModelFixture create() {
    return ApplicationModelFixture.builder()
        .id("1")
        .jobTitle("Software Engineer")
        .companyName("Tech Company")
        .source("LinkedIn")
        .jobUrl("https://example.com/job")
        .applicationDate(LocalDate.now())
        .location("Remote")
        .salary("$100,000")
        .recruitmentStage("Interview")
        .notes("Looking forward to the interview.")
        .recruiterDetails(new RecruiterDetailsModel())
        .tags(List.of("Java", "Spring", "Remote"))
        .build();
  }

}
