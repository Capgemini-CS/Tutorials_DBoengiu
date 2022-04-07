package com.capgemini.tutorialsapplication.entities.dto;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AuthorDTO {

    private Long authorId;

    @NotNull
    @Size(max = 100)
    private String firstName;

    @NotNull
    @Size(max = 100)
    private String lastName;

    @NotNull
    @Email
    @Size(max = 320)
    private String email;

    @Size(max = 255)
    private String jobTitle;

    @Size(max = 1000)
    private String about;
}
