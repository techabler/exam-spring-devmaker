package com.tabler.programming.dmaker.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DeveloperLevel {
    NEW("New Developer"),
    JUNIOR("Junior Developer"),
    JUNGNIOR("Jungnior Developer"),
    SENIOR("Senior Developer");

    private final String description;
}
