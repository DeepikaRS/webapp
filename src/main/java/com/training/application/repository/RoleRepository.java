package com.training.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.application.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
