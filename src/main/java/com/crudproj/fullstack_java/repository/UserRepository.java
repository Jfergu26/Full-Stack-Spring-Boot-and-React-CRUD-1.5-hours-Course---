package com.crudproj.fullstack_java.repository;

import com.crudproj.fullstack_java.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
