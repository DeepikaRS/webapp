package com.training.application.service;

import com.training.application.model.User;

public interface UserService {

	void save(User user);

	User findByUsername(String username);

}
