package com.tabler.programming.dmaker.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DeveloperSkillType {
    BACK_END("Back end"),
    FRONT_END("Front end"),
    FULL_STACK("Full-Stack");

    private final  String description;
}
