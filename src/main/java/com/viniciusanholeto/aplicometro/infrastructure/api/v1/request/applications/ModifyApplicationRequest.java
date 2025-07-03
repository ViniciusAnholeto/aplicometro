package com.viniciusanholeto.aplicometro.infrastructure.api.v1.request.applications;

import com.viniciusanholeto.aplicometro.domains.applications.models.ModifyApplicationInput;
import lombok.Data;

@Data
public class ModifyApplicationRequest {

  public ModifyApplicationInput toInput() {
    return ModifyApplicationInput.builder()
        .build();
  }

}
