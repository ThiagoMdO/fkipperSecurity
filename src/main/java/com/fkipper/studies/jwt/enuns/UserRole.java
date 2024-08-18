package com.fkipper.studies.jwt.enuns;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum UserRole {

    USER("user"),

    ADMIN("admin");

    private final String role;
}
