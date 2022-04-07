package com.capgemini.tutorialsapplication.entities.dto;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CategoryDTO {

    private Long categoryId;

    @NotNull
    @Size(max = 100)
    private String categoryName;
}
