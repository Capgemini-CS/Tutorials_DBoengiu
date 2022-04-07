package com.capgemini.tutorialsapplication.repositories;

import com.capgemini.tutorialsapplication.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

