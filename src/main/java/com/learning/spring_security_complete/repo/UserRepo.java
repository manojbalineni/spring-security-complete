package com.learning.spring_security_complete.repo;

import com.learning.spring_security_complete.Entity.Users;
import com.learning.spring_security_complete.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Integer> {

    Users findByName(String username);
}
