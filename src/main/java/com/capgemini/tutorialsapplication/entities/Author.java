package com.capgemini.tutorialsapplication.entities;

import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    private Long authorId;

    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;

    @Column(name = "email", length = 320, unique = true)
    private String email;

    @Column(name = "job_title", length = 255)
    private String jobTitle;

    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    @Column(name = "profile_picture")
    private byte[] profilePicture;

    @Column(name = "about", length = 2000)
    private String about;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    private List<Tutorial> tutorials;
}
