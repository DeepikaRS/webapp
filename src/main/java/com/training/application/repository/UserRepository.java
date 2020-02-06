package com.training.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.application.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
