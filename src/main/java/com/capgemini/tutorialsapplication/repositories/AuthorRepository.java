package com.capgemini.tutorialsapplication.repositories;

import com.capgemini.tutorialsapplication.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
