package com.example.Reto2.service;

import java.util.Optional;

import com.example.Reto2.model.User;

public interface UserService {
	User create(User user);
	Iterable<User> findAll();
	Optional<User> findBy(Integer id);
	User update(User user);
}
