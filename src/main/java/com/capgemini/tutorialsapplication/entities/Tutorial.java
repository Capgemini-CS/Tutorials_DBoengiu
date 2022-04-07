package com.capgemini.tutorialsapplication.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "tutorials")
public class Tutorial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tutorial_id")
    private Long tutorialId;

    @Column(name = "tutorial_title", nullable = false, length = 150)
    private String tutorialTitle;

    @Column(name = "tutorial_description", nullable = false, length = 2000)
    private String tutorialDescription;

    @Column(name = "time_to_complete")
    private Integer timeToComplete;

    @Column(name = "date_published")
    private Long datePublished;

    @Column(name = "last_updated")
    private Long lastUpdated;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "tutorials")
    private List<User> users = new ArrayList<>();

    @ManyToOne(fetch = FetchType.EAGER)
    private Category category;

    @ManyToOne(fetch = FetchType.EAGER)
    private Author author;


}
