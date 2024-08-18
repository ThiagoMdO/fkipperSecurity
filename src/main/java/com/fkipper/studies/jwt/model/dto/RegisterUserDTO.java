package com.fkipper.studies.jwt.model.dto;

import com.fkipper.studies.jwt.enuns.UserRole;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RegisterUserDTO (
//    @NotBlank @NotNull
    String login,

//    @NotBlank @NotNull
    String password,

//    @NotBlank @NotNull
    UserRole role) {
}
