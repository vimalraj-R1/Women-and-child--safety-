package com.rabo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rabo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}