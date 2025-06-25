package com.viniciusanholeto.aplicometro.infrastructure.api.v1.request.users;

import com.viniciusanholeto.aplicometro.domains.users.inputs.CreateUserInput;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import lombok.Data;

@Data
public class CreateUserRequest {

    @Email
    private String email;

    @NotBlank
    private String name;

    @NotNull
    private LocalDate birthdate;

    @NotBlank
    private String password;

    private String jobTitle;
    private String jobLevel;
    private Boolean jobHunting;

    public CreateUserInput toInput() {
        return CreateUserInput.builder()
                .email(email)
                .name(name)
                .birthdate(birthdate)
                .password(password)
                .jobTitle(jobTitle)
                .jobLevel(jobLevel)
                .jobHunting(jobHunting != null ? jobHunting : false)
                .build();
    }
}
