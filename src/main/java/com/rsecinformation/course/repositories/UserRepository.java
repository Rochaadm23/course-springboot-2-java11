package com.rsecinformation.course.repositories;

import com.rsecinformation.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
