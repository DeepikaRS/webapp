package com.training.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.training.application.model.User;

@Service
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
