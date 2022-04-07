package com.capgemini.tutorialsapplication.entities.dto;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class TutorialDTO {

    private Long tutorialId;

    @NotNull
    @Size(max = 100)
    private String tutorialTitle;

    @NotNull
    @Size(max = 2000)
    private String tutorialDescription;

    private Integer timeToComplete;
}
